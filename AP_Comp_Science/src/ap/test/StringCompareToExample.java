package ap.test;

public class StringCompareToExample {

	   public static void main(String args[]) {
	      String str1 = "Strings are immutable";
		  String str2 = "Strings are immutable";
	      String str3 = "Integers are not immutable";

	      int result = str1.compareTo( str2 );
	      System.out.println(result); // 0
		  
	      result = str2.compareTo( str3 );
	      System.out.println(result); // 10
		 
	      result = str3.compareTo( str1 );
	      System.out.println(result); // -10
	   }
	}
