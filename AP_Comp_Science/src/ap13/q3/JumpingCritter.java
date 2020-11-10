package ap13.q3;

import java.util.ArrayList;

public class JumpingCritter extends Critter {
	
	public ArrayList<Location> getMoveLocations() {
		
		Grid<Actor> grid = getGrid();
		
		ArrayList<Location> locs = new ArrayList<Location>();
		
		locs = GridWorldUtilities.getEmptyLocations(grid);
		
		return locs;
	}
	
	public void getMoveLocations(Location loc) {
		
		if (loc == null) {
			
			removeSelfFromGrid();
		}
		else {
			
			moveTo(loc);
		}
		
	}

}
