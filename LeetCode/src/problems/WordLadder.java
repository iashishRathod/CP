package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class WordLadder {

	public static void main(String[] args) {
		
		System.out.println(ladderLength("hit", "cog" , new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log","cog"))));
		System.out.println(ladderLength("hit", "cog" , new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log"))));
		System.out.println(ladderLength("a", "c" , new ArrayList<>(Arrays.asList("a","b","c"))));

	}

	private static int ladderLength(String beginWord, String endWord, List<String> wordList) {
		
		if(wordList.isEmpty() || wordList.indexOf(endWord) < 0) return 0;
		
		Queue<obj> queue = new LinkedList<>();
		
		queue.offer(new obj(beginWord, 1));
		
		while(!queue.isEmpty()) {
			
			obj curr = queue.poll();
			
			ListIterator<String> itreator = wordList.listIterator();
		
			while(itreator.hasNext()) {
				
				String temp = itreator.next();
				
				if(isAdjecent(curr.word, temp)) {
					queue.add(new obj(temp, curr.length + 1));
					itreator.remove();
					if(temp.equals(endWord)) {
						return curr.length + 1;
					}
				}
			}
		}
		
		return 0;
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

class obj {
	String word;
	int length;
	
	public obj(String word , int length) {
		this.length = length;
		this.word = word;
	}
}
