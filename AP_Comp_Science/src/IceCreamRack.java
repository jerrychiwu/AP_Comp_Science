import java.util.ArrayList;
import java.util.Arrays;

public class IceCreamRack
{
    private ArrayList<IceCream> IceCreamTray = new ArrayList<IceCream>();
    
    public IceCreamRack()
    {
    	IceCreamTray.add(new IceCream());
    }
    
    public IceCreamRack(String flavor)
    { 
    	if (!hasFlavor(flavor)) {
    		flavor = "Mint Chocolate Chip";
		}
    	IceCreamTray.add(new IceCream(flavor));
    }   
    
    public IceCreamRack(int howMany, String flavor)
    {  
    	if (!hasFlavor(flavor)) {
    		flavor = "Mint Chocolate Chip";
		}
    	
    	for(int i = 0; i < howMany; i++) {
    		
    		IceCreamTray.add(new IceCream(flavor));
    	}          
    }
    
    public IceCreamRack(int howMany, ArrayList<String> validFlavors)
    {
    	for(int i = 0; i < howMany; i++) {
    		
    		for (String flavor : validFlavors) {
    			IceCreamTray.add(new IceCream(flavor));
    		}    		
    	} 
    }
    
    private boolean hasFlavor(String flavor) {
    	
    	if (IceCream.validFlavors.contains(flavor)) {
    		return true;
    	}
		else
			return false;
    }
    
    private boolean checkArrayBoundary(int i) {
    	
    	// check if the user has gone beyond the boundary of the array.
    	if (i < IceCreamTray.size()) {
    		return true;
    	}
    	else {
    		// OutOfBoundsException
    		System.out.println("ERROR !! user has gone beyond the boundary of the array");
    		return false;
    	}
    }
    
    public void AddIceCream(String flavor)
    {
    	if (!hasFlavor(flavor)) {
    		flavor = "Mint Chocolate Chip";
		}
    	IceCreamTray.add(new IceCream(flavor));
    }
    
    public void Eaten(int i)
    {
    	// check if the user has gone beyond the boundary of the array.
    	if (checkArrayBoundary(i)) {
    		IceCream ic = IceCreamTray.get(i);
        	ic.EatenByStudent();
    	}    	
    }
    
    public void Stolen(int i)
    {
    	// check if the user has gone beyond the boundary of the array.
    	if (checkArrayBoundary(i)) {
    		IceCream ic = IceCreamTray.get(i);
        	ic.StolenByFaculty();
    	}    	
    }
    
    public void Replace(int i, String flavor)
    {
    	// check if the user has gone beyond the boundary of the array.
    	if (checkArrayBoundary(i)) {
    		IceCream ic = IceCreamTray.get(i);
        	ic.NewIceCream(flavor);
    	}    	
    }
    
    public void Print(int i)
    {
    	// check if the user has gone beyond the boundary of the array.
    	if (checkArrayBoundary(i)) {
    		IceCream ic = IceCreamTray.get(i);
        	System.out.println(ic);
    	}
    	
    }
    
    public void Print()
    {
        for (IceCream ic : IceCreamTray) {
        	System.out.println(ic);
        }
    }
    
    public static void main(String args[]) {
    	
    	/*IceCreamRack sophomoreIceCreamRack1 = new IceCreamRack();    	
    	sophomoreIceCreamRack1.AddIceCream("Chocolate Fudge Brownie");    	
    	sophomoreIceCreamRack1.AddIceCream("Ryan");
    	sophomoreIceCreamRack1.Print();
    	sophomoreIceCreamRack1.Replace(2, "Chocolate Chip Cookie Dough");
    	sophomoreIceCreamRack1.Print();*/
    	
    	/*IceCreamRack sophomoreIceCreamRack2 = new IceCreamRack("Chunky Monkey");    	
    	sophomoreIceCreamRack2.AddIceCream("Chocolate Fudge Brownie");    	
    	sophomoreIceCreamRack2.AddIceCream("Ryan");
    	sophomoreIceCreamRack2.Print();
    	sophomoreIceCreamRack2.Replace(2, "Chocolate Chip Cookie Dough");
    	sophomoreIceCreamRack2.Print();*/
    	
    	/*IceCreamRack sophomoreIceCreamRack3 = new IceCreamRack(3,"Chocolate Fudge Brownie");
    	sophomoreIceCreamRack3.Replace(3, "Chocolate Chip Cookie Dough");    	
    	sophomoreIceCreamRack3.Print();
    	sophomoreIceCreamRack3.Stolen(3);*/
    	
    	/*sophomoreIceCreamRack.Stolen(0);
    	sophomoreIceCreamRack.Print();*/
    	
    	/*sophomoreIceCreamRack.Eaten(0);
    	sophomoreIceCreamRack.Print();*/
    	
    	ArrayList<String> flavorList = new ArrayList<String>(Arrays.asList
        		("Chunky Monkey", "Chocolate Chip Cookie Dough"));
    	IceCreamRack sophomoreIceCreamRack4 = new IceCreamRack(1,flavorList);
    	sophomoreIceCreamRack4.AddIceCream("Ryan");
    	//sophomoreIceCreamRack4.Eaten(1);
    	sophomoreIceCreamRack4.Stolen(1);
    	sophomoreIceCreamRack4.Print();
    	
    }      
  
}

