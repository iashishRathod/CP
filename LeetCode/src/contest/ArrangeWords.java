package contest;

import java.util.Arrays;
import java.util.Comparator;

public class ArrangeWords {

	public static void main(String[] args) {
		
		String text  ="Keep calm and code on";
		
		System.out.print(arrangeWords(text));

	}

	private static String arrangeWords(String text) {
		
		String[] words = text.split(" ");
		
		Arrays.sort(words, new Comparator<String>() {
		    @Override
		    public int compare(String s1, String s2) {
		        return s1.length() - s2.length();
		    }
		});
		
		StringBuilder sb = new StringBuilder();;
		for(int i=0;i<words.length;i++)
			sb.append(words[i]+" ");
		return sb.substring(0, 1).toUpperCase() + sb.substring(1, sb.length()-1).toLowerCase();
	}
}
