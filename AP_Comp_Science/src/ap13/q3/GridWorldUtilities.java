package ap13.q3;

import java.util.ArrayList;

public class GridWorldUtilities {
	
	public static ArrayList<Location> getEmptyLocations(Grid<Actor> grid) {
		
		ArrayList<Location> emptyLocs = new ArrayList<Location>();
		
		for (int i = 0; i < grid.getNumRows(); i++) {
			
			for (int j = 0; j < grid.getNumCols(); j++) {
				
				Location c = new Location(i,j);
				
				if (grid.get(c) == null) {
					
					emptyLocs.add(c);
				}
			}
			
		}
		
		return emptyLocs;		
	}
}
