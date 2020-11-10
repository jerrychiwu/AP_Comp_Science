package ap05.q2;

public class StudentAdvance extends Advance {
	
	private double price;

	public StudentAdvance(int daysInAdvance) {
		
		super(daysInAdvance);
		
		price = (super.getPrice())/2;
	}
	
	public String toString() {
		
		return super.toString() + " (Student ID Required)";
	}

}
