package ap.test;

public class StringIndexOfExample {
	
	public static void main(String args[]) {
		
		String str = "Here there everywhere";

		int a = str.indexOf("there");  // a is 5
		int b = str.indexOf("er");     // b is 1
		int c = str.indexOf("eR");     // c is -1, "eR" is not found
		
		System.out.println(findOOP("asjdhjk OOP asdjkhsklOOP")); 
		
		System.out.println(parsingString("It was hot (so hot!) I'm telling you."));
		
		System.out.println(repeat("Ryan",5));
		
		System.out.println(countExclaim("aaaa! hh!!"));
		
		System.out.println(oopPair("sdfhOOPabcdeOOP"));	
		
		printNames("name:angelina: and a man name:tony: their friend name:jane:");
		
	}
	
	// Example using indexOf() to find all the instances of "OOP" in a string
	public static int findOOP(String str) {
		
	  int start = 0;
	  int count = 0;
	  
	  while (true) {
	    int found = str.indexOf("OOP", start);
	    //System.out.println("found=" + found); 
	    if (found != -1) {
	    	// Found one -- do whatever here
	    	count++;
	    }
	    
	    if (found == -1) break;
	    
	    start = found + 2;  // move start up for next iteration
	  }
	  
	  return count;
	  
	}
	
	public static String parsingString(String string) {
		
		int left = string.indexOf("(");
		int right = string.indexOf(")");

		// pull out the text inside the parens
		String sub = string.substring(left+1, right); // sub is "so hot!"

		sub = sub.toUpperCase();  // sub is "SO HOT!"

		// Put together a new string
		String result = 
		  string.substring(0, left+1) +   // It was hot (
		  sub +                           // SO HOT!
		  string.substring(right);        // ) I'm telling you.

		// result is "It was hot (SO HOT!) I'm telling you."
		return result;	
		
	}
	
	// Given a string, returns a string made of repetitions of that string. 
	// This code demonstrates using + to assemble a larger string in a loop:
	public static String repeat(String string, int count) {
		
		String result = "";
		for (int i=0; i<count; i++) {
			result = result + string;
		}
		  
		return result;		
	}
	
	// Given a string, returns how many '!' chars it contains. 
	// This code demonstrates using a for loop, calling length(), substring()/charAt(), and equals() 
	// to look at all the chars in a string: 
	public static int countExclaim(String string) {
		
		int count = 0;
		for (int i=0; i<string.length(); i++) {
			if (string.substring(i, i+1).equals("!")) count++;
			// if (string.charAt(i) == '!') count++;  // or with charAt()
		}
		
		return count;		
	}
	
	// Given a string where the string "OOP" appears at least two times, 
	// find the first and last OOP in the whole string. Return the text from between the two OOP. 
	// Demonstrates using indexOf() and substring(): 
	public static String oopPair(String string) {
		
		int start = string.indexOf("OOP");
		int end = string.lastIndexOf("OOP");
		
		return string.substring(start+3, end);

	}
	
	// Suppose you have a string like this:"Once there was a woman name:angelina: and a man name:tony: 
	// and their friend name:jane: and ...". Inside of a long text there are little "name:" 
	// sections. Write code to find and print all the names. Demonstrates a more complex use of 
	// indexOf() and substring() in a loop to parse a string: 
	public static void printNames(String string) {
		
		int i = 0;
		while (true) {
			int found = string.indexOf("name:", i);
			if (found == -1) break;
			int start = found + 5; // start of actual name
			int end = string.indexOf(":", start);
			System.out.println(string.substring(start, end));
			i = end + 1;  // advance i to start the next iteration
		}
	}
}

/*
2
It was hot (SO HOT!) I'm telling you.
RyanRyanRyanRyanRyan
3
abcde
angelina
tony
jane
*/
