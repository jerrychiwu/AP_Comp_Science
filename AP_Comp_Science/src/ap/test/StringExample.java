package ap.test;

public class StringExample {
	
	public static void main(String args[]) {
		
		// Deleting a character
		String str = "this is Java";
	    System.out.println(removeCharAt(str, 3));
	    
	    // How to search the last position of a substring ?
	    searchlastString("Hello world ,Hello Reader","Hello");		
	}
	
	// How to remove a character from a particular position from a string with the help of 
	// removeCharAt(string,position) method.
	public static String removeCharAt(String s, int pos) {
		
		return s.substring(0, pos) + s.substring(pos + 1);
	}
	
	public static void searchlastString (String strOrig, String str) {

		int lastIndex = strOrig.lastIndexOf(str);
		if(lastIndex == - 1){
			System.out.println("Hello not found");
		}else{
			System.out.println("Last occurrence of Hello is at index "+ lastIndex);
		}
	}
}

/*
Constructing an Employee
Constructing an Employee
Call mailCheck using Salary reference --
Call mailCheck using Employee reference--
*/
