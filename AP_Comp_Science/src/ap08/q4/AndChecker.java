package ap08.q4;

public class AndChecker implements Checker
{
	private Checker checker1;
	private Checker checker2;
	
	public AndChecker(Checker chk1, Checker chk2)
	{
		checker1 = chk1;
		checker2 = chk2;
	}
	
	public boolean accept(String text)
	{
		return checker1.accept(text) && checker2.accept(text);
	}
}
