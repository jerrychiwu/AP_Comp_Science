import java.util.Arrays;
import java.util.ArrayList;

public class IceCream
{
    private Boolean iceCreamCone;
    private String  iceCreamFlavor;
    private Boolean iceCreamStolen;
    
    public static ArrayList<String> validFlavors = new ArrayList<String>(Arrays.asList
    		("Chunky Monkey", "Chocolate Chip Cookie Dough", "Mint Chocolate Chip", "Chocolate Fudge Brownie"));
     
    public IceCream()
    {
		this.iceCreamCone = true;
		this.iceCreamStolen = false;
		this.iceCreamFlavor = "Chunky Monkey";
    }
    
    public IceCream(String iceCreamFlavor)
    {
    	this.iceCreamCone = true;
		this.iceCreamStolen = false;
    	AddIceCreamFlavor(iceCreamFlavor);    	
    }
    
    public IceCream(Boolean iceCreamCone, String iceCreamFlavor, Boolean iceCreamStolen)
    {
    	this.iceCreamCone = iceCreamCone;
    	this.iceCreamStolen = iceCreamStolen;
    	
    	if (iceCreamCone && !iceCreamStolen) {  
    		
    		AddIceCreamFlavor(iceCreamFlavor);
    	}
    	else
    		this.iceCreamFlavor = "Mint Chocolate Chip";
    }
    
    private void AddIceCreamFlavor(String iceCreamFlavor) {
    	if (!validFlavors.contains(iceCreamFlavor)) {
    		this.iceCreamFlavor = "Mint Chocolate Chip";
    	}
		else
    		this.iceCreamFlavor = iceCreamFlavor;
    }
    
    public void EatenByStudent()
    {
        if (this.iceCreamCone && !this.iceCreamStolen) {        	
        	this.iceCreamCone = false;
        	this.iceCreamFlavor = null;
        }
    }
    
    public void StolenByFaculty()
    {
    	if (this.iceCreamCone && !this.iceCreamStolen) {
    		this.iceCreamFlavor = null;
    		this.iceCreamStolen = true;
    	}
    }
    
    public void NewIceCream(String iceCreamFlavor)
    {
    	if (!this.iceCreamCone && this.iceCreamFlavor == null && !this.iceCreamStolen) {
    		this.iceCreamCone = true;
    		this.iceCreamStolen = false;
    		AddIceCreamFlavor(iceCreamFlavor);
    	}
    }
    
    public String toString()
    {
    	if (this.iceCreamCone && this.iceCreamFlavor != null) {
    		return "Ice cream cone with the flavor " + this.iceCreamFlavor;
    	}
    	else if (!this.iceCreamCone && this.iceCreamFlavor != null) {
    		return "There is no ice cream cone in the holder.";
    	}
    	else if (this.iceCreamStolen) {
    		return "Faculty stole the ice cream cone." ;
    	}
    	else
    		return "";
    }
    
    public static void main(String args[]) {
    	
    	/*IceCream icecream = new IceCream();
    	//System.out.println(icecream); 
    	icecream.EatenByStudent();
    	//icecream.StolenByFaculty();
    	icecream.NewIceCream("Jerry");
    	System.out.println(icecream);*/
    	
    	/*IceCream icecream2 = new IceCream("Chocolate Fudge Brownie");
    	System.out.println(icecream2);
    	icecream2.EatenByStudent();
    	//icecream2.StolenByFaculty();
    	icecream2.NewIceCream("Jerry");
    	System.out.println(icecream2);*/
    	
    	IceCream icecream3 = new IceCream(true,"Chocolate Fudge Brownie", false);
    	//icecream3.EatenByStudent();
    	//icecream3.StolenByFaculty();
    	icecream3.NewIceCream("Jerry");
    	System.out.println(icecream3);
    }
    
}