package ap.test;

// http://www.tutorialspoint.com/java/java_polymorphism.htm

public class PolymorphismExample {
	
	public static void main(String [] args) {
		  Salary s = new Salary("Mohd Mohtashim", 3, 3600.00);
		  Employee e = new Salary("John Adams", 2, 2400.00);
		  System.out.println("Call mailCheck using Salary reference --");
		  System.out.println("Call mailCheck using Employee reference--");
	}
}

class Employee
{
   private String name;
   private int number;
   public Employee(String name, int number)
   {
      System.out.println("Constructing an Employee");
      this.name = name;
      this.number = number;
   }

   public String toString()
   {
      return name + " " + number;
   }
   public String getName()
   {
      return name;
   }
   public int getNumber()
   {
     return number;
   }
}

class Salary extends Employee
{
   private double salary; //Annual salary
   public Salary(String name, int number, double salary)
   {
       super(name, number);
       setSalary(salary);
   }
   public double getSalary()
   {
       return salary;
   }
   public void setSalary(double newSalary)
   {
       if(newSalary >= 0.0)
       {
          salary = newSalary;
       }
   }
   public double computePay()
   {
      System.out.println("Computing salary pay for " + getName());
      return salary/52;
   }
}

/*
Constructing an Employee
Constructing an Employee
Call mailCheck using Salary reference --
Call mailCheck using Employee reference--
*/
