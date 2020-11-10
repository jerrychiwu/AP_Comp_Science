package ap08.q4;

public class SubstringChecker implements Checker
{
	private String goalString;
	
	public SubstringChecker(String goal)
	{
		goalString = goal;
	}
	
	public boolean accept(String text)
	{
		return (text.indexOf(goalString) != -1);
	}
}
