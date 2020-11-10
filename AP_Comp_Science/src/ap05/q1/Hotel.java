package ap05.q1;

import java.util.ArrayList;

public class Hotel {
	
	private Reservation[] rooms;
	
	private ArrayList waitList;
	
	public Reservation requestRoom(String guestName) {
		
		for (int i = 0; i < rooms.length; i ++) {
			
			if (rooms[i] == null) {
				
				rooms[i] = new Reservation(guestName, i);
				
				waitList.add(rooms[i]);
				
				return rooms[i];
			}
			
		}
		
		return null;
		
	}
	
	public Reservation cancelAndReassign(Reservation res) {
		
		rooms[res.getRoomNumber()] = null;
		
		if (waitList.size() > 0) {
			
			return new Reservation((String)waitList.remove(0), 0);
		}
		else		
			return res;		
	}

}
