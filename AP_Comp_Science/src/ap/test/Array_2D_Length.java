package ap.test;

import java.util.ArrayList;
import java.util.List;

public class Array_2D_Length {
	
	public static void main(String args[])
    {
		  int[][] test; 
		  test = new int[5][10];
		
		  int row = test.length;
		  
		  int col = test[0].length;
		
		  System.out.println(row); // 5
		  
		  System.out.println(col); // 10		  
		  
		  // Integer division results in an int, the truncated result 2
		  double x = 5/2;
		  System.out.println(x); // 2.0
		  
		  double y = (double)5/2;
		  System.out.println(y); // 2.5
		  
		  double z = 5*4/2 - 5/2*4;
		  System.out.println(z); // 2.0
		  
		  //----------------------------------
		  
		  String band = "anamanaguchi";
		  System.out.println(band.substring(1,4)); // nam
		  System.out.println(band.substring(5,8)); // nag
		  System.out.println(band.substring(1,4).compareTo(band.substring(5,8))); // 6
		  
		  //----------------------------------
		  
		  String[] names = {"Pat","Joe","Ann","Cal","Amy"};
		  printVals(names, names.length-1);
		  
		  //----------------------------------
		  
		  List<String> list = new ArrayList<String>();
		  list.add("A");
		  list.add("B");
		  list.add("C");
		  for (String s : list) {
			  String t = list.get(list.size()-1);
			  list.set(list.size()-1, s);
			  s = t;
		  }
		  System.out.println(list); // [A, B, B]
		
    }
	
	public static void printVals(String[] items, int k) {
		if (k > 1) {
			printVals(items, k-1);
			System.out.print(items[k] + " "); // Ann Cal Amy Ann
			printVals(items, k-2);
		}
	}

}
