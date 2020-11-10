package ap13.q4;

public class SkyView {
	
	private double[][] view;
	
	public SkyView(int numRows, int numCols, double[] scanned) {
		
		view = new double[numRows][numCols];
		
		int k = 0; // scanned index
		
		for (int i = 0; i < numRows; i++) {
			
			if (i % 2 == 0) {
				
				for (int j = 0; j < numCols; j++) {
					
					view[i][j] = scanned[k];
					
					k++;
				}				
			}
			else {
				
				for (int j = numCols -1 ; j <= 0; j--) {
					
					view[i][j] = scanned[k];
					
					k++;
				}
			}
			
		}
	}
	
	public double getAverage(int startRow, int endRow, int startCol, int endCol) {
		
		int width = endCol - startCol + 1;
		int height = endCol - startCol + 1;
		int numValues = width * height;
		int sum = 0;
		
		for (int i = startRow; i <= endRow; i++) {
			
			for (int j = startCol; j <= endCol; j++) {
				
				sum += view[i][j];
			}
		}
		
		return sum/numValues;		
	}
}
