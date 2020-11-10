package ap.test;

class SequentialSearch {
	
	  public static boolean contains(int[] a, int b){
	    for (int i : a) {
	      if (i==b){
	        return true;
	      }
	    }
	    return false; 
	  }
} 


class BinarySearch {
	
	  public static boolean contains(int[] a, int b) {
	    if (a.length == 0) {
	      return false;
	    }
	    int low = 0;
	    int high = a.length-1;

	    while(low <= high) {
	      int middle = (low+high) /2; 
	      if (b> a[middle]){
	        low = middle +1;
	      } else if (b< a[middle]){
	        high = middle -1;
	      } else { // The element has been found
	        return true; 
	      }
	    }
	    return false;
	  }
} 



