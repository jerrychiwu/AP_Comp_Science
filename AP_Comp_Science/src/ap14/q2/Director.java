package ap14.q2;

import java.util.ArrayList;

public class Director extends Rock
{
	public Director()
	{
		super(Color.RED);
	}
	
	public void act()
	{
		if (getColor().equals(Color.GREEN))
		{
			ArrayList<Actor> neighbors = getGrid().getNeighbors(getLocation());
			for (Actor actor : neighbors)
			{
				actor.setDirection(actor.getDirection() + Location.RIGHT);
			}
			setColor(Color.RED);
		}
		else
		{
			setColor(Color.GREEN);
		}
	}

	private void setColor(Color red) {
		// TODO Auto-generated method stub
		
	}

	private Object getColor() {
		// TODO Auto-generated method stub
		return null;
	}
}
