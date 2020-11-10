package ap05.q2;

public class Advance extends Ticket {
	
	private double price;
	
	public Advance (int daysInAdvance) {
		
		if (daysInAdvance > 9) {
			
			price = 30;
		}		
		else
			
			price = 40;		
	}

	
	public double getPrice() {
		
		return price;
	}

}
