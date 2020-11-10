package ap.test;

public class Exam_3 {
	
	public static void main(String args[]) {
		
		mystery(0,16); // 0 5 10 15
	}
	
	public static void mystery(int a, int b) {
		
		System.out.print(a + " "); 
		if (a <= b) {
			mystery(a+5,b-1);
		}
		
	}
	
	

}
