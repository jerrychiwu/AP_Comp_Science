package ap13.q2;

public class TokenPass {
	
	private int[] board;
	private int currentPlayer;
	
	public TokenPass(int playerCount) {
		
		board = new int[playerCount];
		
		for (int i = 0; i < playerCount; i++) {
			board[i] = (int)(Math.random() * 10) + 1;
		}
		
		currentPlayer = (int)(Math.random() * playerCount);
	}
	
	public void distributeCurrentPlayerTokens() {
		
		int n = board[currentPlayer];
		board[currentPlayer] = 0;
		
		for (int i = currentPlayer+1; i<board.length; i++) {
			if (n > 0) {
				board[i] = board[i] + 1;
				n--;
			}
		}
		
	}

}
