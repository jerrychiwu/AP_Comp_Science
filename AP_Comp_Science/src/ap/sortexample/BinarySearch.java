package ap.sortexample;

public class BinarySearch {
	
	public int countZeroes (String s) {
		
		int i = 0, j = 30;
		
		int count = 0;
		
		while (i <= j) {
			
			count++;
			
			System.out.println("C=" + count);
			
			int k = (i + j)/2;
			if (s.substring(k, k+1).endsWith("0")) 
				i = k + 1 ;
			else 
				j = k + 1 ;
		}
		
		return count;		
	}
	
	public static void main(String args[]) {
		
		BinarySearch bs = new BinarySearch();
		
		//bs.countZeroes("0000000000000000000000000000000");
		
		//System.out.println("A=" + bs.countZeroes("0000000000000000000000000000000")); // -10
		
		//bs.countZeroes("1111111111111111111111111111111");
		
		System.out.println("B=" + bs.countZeroes("1111111111111111111111111111111")); // -10
	}
}
