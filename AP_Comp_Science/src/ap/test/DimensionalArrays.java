package ap.test;

public class DimensionalArrays {
	
	public static void main(String args[]) {	
		
		int [][] twoDim = new int [5][5];

		int a = (twoDim.length);//5
		int b = (twoDim[0].length);//5

		for(int i = 0; i < a; i++){ // 1 2 3 4 5
		    for(int j = 0; j <b; j++) { // 1 2 3 4 5
		        int x = (i+1)*(j+1);
		        twoDim[i][j] = x;
		        if (x<10) {
		            System.out.print(" " + x + " ");
		        } else {
		            System.out.print(x + " ");
		        }
		    }//end of for J
		    System.out.println();
		}//end of for i
	}

}

/*
1  2  3  4  5 
2  4  6  8 10 
3  6  9 12 15 
4  8 12 16 20 
5 10 15 20 25
*/ 
