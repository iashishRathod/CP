package problems;

import java.util.HashSet;

public class LongestDupSubstring {

	private static String S;

	public static void main(String[] args) {

		String s = "banana";

		System.out.print(longestDupSubstring(s));
		System.out.print(optimized(s));

	}

	private static String longestDupSubstring(String s) {

		String result = "";

		int start = 1,end = s.length()-1;

		while(start <= end) {

			int mid = start + (end - start)/2;

			String val  = isDuplicate(mid,s);

			if(val != null) {
				result = val;
				start = mid +1;
			}
			else 
				end = mid -1;

		}
		return result;

	}

	private static String isDuplicate(int mid, String s) {

		HashSet<Long> set = new HashSet<>();

		long hash = findHashCode(s.substring(0, mid));

		set.add(hash);

		long power = 1;

		for (int i = 1; i < mid; i++) 
			power *=  31;

		for(int i=mid;i < s.length();i++){
			hash = nextHash(mid, power, hash, s.charAt(i-mid), s.charAt(i));
			if(!set.add(hash)){
				return s.substring(i-mid+1, i+1);
			}
		}		

		return null;

	}

	private static long findHashCode(String s) {

		long hash = 0, a=1;

		for (int i = s.length(); i >= 1; i--) {
			char c = s.charAt(i-1);
			hash += (c - 'a' +1)*a;
			a *= 31;
		}
		return hash;
	}

	private static long nextHash(int mid, long power, long hash, char left, char right) {
		return (hash - (left - 'a' + 1) * power) * 31 + (right - 'a' + 1);
	}

	private static String optimized(String s) {
		S = s;
		int maxLo = 0, maxLength = 0;
		TrieNode root = new TrieNode(0, 0);
		for (int i = 1; i + maxLength < S.length(); i++) {
			int len = addNew(root, i);
			if (len > maxLength) {
				maxLength = len;
				maxLo = i;
			}
		}
		return S.substring(maxLo, maxLo + maxLength);
	}

	private static int addNew(TrieNode node, int i) {
		int depth = node.depth;
		if (i + depth == S.length()) return depth;
		if (isLeaf(node)) {
			node.next = new TrieNode[26];
			node.next[getIndex(node.i + node.depth)] = new TrieNode(node.i, depth + 1);
		}
		int c = getIndex(i+node.depth);
		TrieNode x = node.next[c];
		if (x == null) {
			node.next[c] = new TrieNode(i, depth + 1);
			return depth;
		}
		return addNew(x, i);
	}

	private static boolean isLeaf(TrieNode node) {
		return node.next == null;
	}

	private static int getIndex(int totalLength) {
		return S.charAt(totalLength) - 'a';
	}
	private static class TrieNode {
		private TrieNode[] next;
		private int i;
		private int depth;

		public TrieNode(int i, int depth) {
			this.i = i;
			this.depth = depth;
		}
	}

}
