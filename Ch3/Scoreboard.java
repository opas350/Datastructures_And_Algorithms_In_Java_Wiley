/** Class for storing high scores in an array in nondecreasing order. */
public class Scoreboard {

	private int numEntries = 0;		// number of actual entries
	private GameEntry[] board;		// array of game entries (names & scores)
	/** Constructs and empty scoreboard with the given capacity for
	 * storing entries. */

	public Scoreboard(int capacity) {
		board = new GameEntry[capacity];
	}

	// more methods will go here
	
	/** Attempt to add a new score to the collection(if it is high enough). */
	public void add(GameEntry e) {
		int newScore = e.getScore();
		// is the new entry e really a high score?
		if(numEntries < board.length || newScore > board[numEntries-1].getScore()) {
			if(numEntries < board.length)		// No score drops from the board
				numEntries++;			// So overall number increases
			// Shift any lower scores rightward to make room for the new entry
			int j = numEntries - 1;
			while(j > 0 && board[j-1].getScore() < newScore) {
				board[j] = board[j-1];		// Shift entry for j-1 to j
				j--;				// and decrement j
			}
			board[j] = e;				// when done, add new entry
		}
	}
	/** Remove and return the high score a index i. */
	public GameEntry remove(int i) throws IndexOutOfBoundsException {
		if(i < 0 || i >= numEntries)
			throw new IndexOutOfBoundsException("Invalid index: " + i);
		GameEntry temp = board[i];		// save the object to be removed
		for(int j = i; j < numEntries - 1; j++) // count up from i (not down)
			board[j] = board[j+1];		// move one cell to the left
		board[numEntries - 1] = null;		// null out the old last score
		numEntries--;
		return temp;				// return the removed object
	}

	public void ShowScoreBoard() {

		int index = 1;
		System.out.println("------ Scoreboard ------");

		for(GameEntry n : board) {
			if (n != null){
			System.out.println("player[" + index + "] = " + n.toString());
			}
			else System.out.println("player[" + index + "] = ");
		       index++;	
		}
	}
}
