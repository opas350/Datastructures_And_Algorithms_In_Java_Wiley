/** Demo using the Scoreboard and GameEntry classes */
import java.util.Scanner;
class ScoreBoardDemo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);		// Initialize the scanner

		// Variables init
		String player;		// String var to use as the player name for GameEntry constructor
		int game_score = 0;	// int var to use as the player score for GameEntry constructor
		int index = 1;		// int var to contruct different names for the obj GameEntry
		int board_length = 0;	// var to save the length the board will have

		// Start of the Console UI
		System.out.println("---- Main ----\n");
		System.out.print("Enter the # of entries for Scoreboard: ");
		board_length = s.nextInt();		//  use the scanner to catch the # used as length for the SB
		Scoreboard Sb = new Scoreboard(board_length); // Construct the Scoreboard with length board_length

		System.out.println("9 = quit, 1 = New Score, 2 = Show Scoreboard");
		System.out.print("Enter next action : ");

		int choice = s.nextInt();	// variable to use to control the flow of the program
		System.out.println();

		while( choice != 9){		// while loop that exits on 9 (escape command)

			if(choice == 1){	// choice 1 = Enter new score

				System.out.print("Enter the player name: ");
				player = s.next();
				System.out.print("Enter the game score: ");
				game_score = s.nextInt();
				String Entry = "GE" + index;	// concat the string that will be used as GameEntry obj
				index++;			// index to concat and create differnt GameEntry obj

				GameEntry entry = new GameEntry(player, game_score);	// Construct a new obj with the user input
				Sb.add(entry);		// add the new GameEntry to the Scoreboard
			}

			if(choice == 2){		// Choice 2 = Show Scoreboard
				Sb.ShowScoreBoard();	// call the method
				System.out.println();
			}


			System.out.println();
			System.out.print("Enter next action: ");
			choice = s.nextInt();

		}

	}
}

