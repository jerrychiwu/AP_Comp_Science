package ap14.q4;

public class Trio implements MenuItem {
	private Sandwich sandwich;
	private Salad salad;
	private Drink drink;
	
	public Trio(Sandwich s, Salad sal, Drink d){
		sandwich = s;
		salad = sal;
		drink = d;
	}
	
	public String getName(){
		return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
	}
	
	public double getPrice(){
		double sandwichPrice = sandwich.getPrice();
		double saladPrice = salad.getPrice();
		double drinkPrice = drink.getPrice();
		if (sandwichPrice <= saladPrice && sandwichPrice <= drinkPrice)
			return saladPrice + drinkPrice;
		else if (saladPrice <= sandwichPrice && saladPrice <= drinkPrice)
			return sandwichPrice + drinkPrice;
		else
			return sandwichPrice + saladPrice;
	}
}
