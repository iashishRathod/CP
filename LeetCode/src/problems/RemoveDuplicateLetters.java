package problems;

import java.util.Stack;

public class RemoveDuplicateLetters {

	public static void main(String[] args) {

		System.out.println(removeDuplicateLetters("cbacdcbc"));
	}

	private static String removeDuplicateLetters(String S) {
		Stack<Character> stack = new Stack<>();
		int[] count = new int[26];
		for (int i = 0; i < S.length(); i++)
			count[S.charAt(i) - 'a']++;
		
		boolean[] visited = new boolean[26];
		
		for (int i = 0; i < S.length(); i++) {
			count[S.charAt(i) - 'a']--;
			if(visited[S.charAt(i) - 'a']) continue;
			while (!stack.isEmpty() && stack.peek() > S.charAt(i) &&  0 < count[stack.peek()-'a'])
				visited[stack.pop()-'a'] = false;
			stack.push(S.charAt(i));
			visited[S.charAt(i)-'a'] = true;
		}
		StringBuilder sb = new StringBuilder();
		for (Character b : stack) sb.append(b);
		return sb.toString();}

}
