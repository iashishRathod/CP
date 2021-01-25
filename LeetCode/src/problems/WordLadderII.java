package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;

public class WordLadderII {
	
	static List<List<String>> result;

	public static void main(String[] args) {
		
		System.out.println(findLadders("hit", "cog" , new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log","cog"))).toString());

	}

	private static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
		
		result = new ArrayList<>();
		
		if(beginWord.length() == 0 || endWord.length() == 0 || beginWord.length() != endWord.length() ||
				wordList.isEmpty() || wordList.indexOf(endWord) < 0) return result;
		
		Queue<String> queue = new LinkedList<>();
		Map<String,List<String>> map = new HashMap<>();
		
		queue.add(endWord);
		
		while(!queue.isEmpty()) {

			String curr = queue.poll();

			ListIterator<String> iterator = wordList.listIterator();
			
			while(iterator.hasNext()) {
				
				String temp = iterator.next();
				
				if(isAdjecent(curr, temp)) {
					iterator.remove();
					queue.add(temp);
					List<String> list = map.getOrDefault(temp, new ArrayList<>());
					list.add(curr);
					map.put(temp, list);
					
					if(temp.equals(beginWord)) {
						result.add(list);
						return result;
					}
				}
			}
		}
		
		return result;
	}

	private static boolean isAdjecent(String curr, String temp) {
		int count = 0;
		for(int i = 0 ; i < curr.length() ; i++) {
			if(curr.charAt(i) != temp.charAt(i)) {
				count++;
				if(count > 1) return false;
			}
		}
		return true;
	}

}
