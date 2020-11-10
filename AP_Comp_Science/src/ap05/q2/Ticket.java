package ap05.q2;

public abstract class Ticket {
	
	private int serialNumber;
	
	public Ticket() {
		
		serialNumber =  getNextSerialNumber();
	}
	
	public abstract double getPrice() ;
	
	
	public String toString() {
		
		return "Numner: " + serialNumber + " Price:" + getPrice();
		
	}

	private int getNextSerialNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

}
