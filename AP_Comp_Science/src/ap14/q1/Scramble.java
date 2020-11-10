package ap14.q1;

import java.util.*;

public class Scramble {
	
	public static String scrambleWord(String word){
		int current = 0;
		String result="";
		while (current < word.length()-1){
			if (word.substring(current,current+1).equals("A") &&
			!word.substring(current+1,current+2).equals("A")){
				result += word.substring(current+1,current+2);
				result += "A";
				current += 2;
			}
			else {
				result += word.substring(current,current+1);
				current++;
			}
		}
		
		if (current < word.length()){
			result += word.substring(current);
		}
		
		return result;
	}
	
	public static void scrambleOrRemove(List<String> wordList){
		int index = 0;
		while (index < wordList.size()){
			String word=wordList.get(index);
			String scrambled=scrambleWord(word);
			
			if (word.equals(scrambled)){
				wordList.remove(index);
			}
			else {
				wordList.set(index,scrambled);
				index++;
			}
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(scrambleWord("TAN"));
		System.out.println(scrambleWord("WHOA"));
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("TAN");
		ar.add("WHOA");		
		scrambleOrRemove(ar);
		System.out.println(ar);
	}

}
