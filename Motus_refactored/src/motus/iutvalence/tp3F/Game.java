package motus.iutvalence.tp3F;

public class Game {
	/**
	 * Constant value that represents the number of turns allowed for a game session.
	 */
	private static final int TURN_NUMBER = 10;

	/**
	 * Method that allows to start the game.
	 */
	public void start() {
		// creation of the game's player
		Player currentPlayer = new Player();
		// asking the player's nickname
		currentPlayer.askForNickname();
		// building the game grid (with, for now, random letters)
		Grid gameGrid = new Grid();
		// displays the star composed grid
		gameGrid.displayHiddenGrid();
		// displays the grid after having compared it to the player's entry
		for(int turnCounter = 0; turnCounter < TURN_NUMBER ; turnCounter++)
		{
			try {
				GameRound gameRound = new GameRound();
				String proposedWord = "";
				proposedWord = gameRound.proposeWord();
				Letter[] gridToDisplay = gameRound.gridsComparison(gameGrid,proposedWord);
				for (int counter = 0; counter < gameGrid.getGameGrid().length; counter++) 
				{
					System.out.print(gridToDisplay[counter]);
				}
				// Now catching the case the player tries to enter more or less letters than
				// the number of stars displayed
				if(gameRound.isWordFound(gameGrid , proposedWord))break;
				System.out.println();
				System.out.println("The number of turns left is "+ ((TURN_NUMBER-turnCounter)-1) +" turns.");
			} 
			catch (ArrayIndexOutOfBoundsException e) 
			{
				System.err.println("The proposed word is too long.");
				turnCounter--;
				System.out.println();
				System.out.println("The number of turns left is "+ ((TURN_NUMBER-turnCounter)-1) +" turns.");
			}
			catch (ProposedWordException e) 
			{
				System.err.println(e.getMessage());
				turnCounter--;
				System.out.println();
				System.out.println("The number of turns left is "+ ((TURN_NUMBER-turnCounter)-1) +" turns.");
			}
		}
		System.out.println();
		/* TODO Debug - displays the gamegrid */
		System.out.println(gameGrid);
		System.out.println("End of the game !");
	}
}
