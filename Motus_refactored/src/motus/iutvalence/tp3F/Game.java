package motus.iutvalence.tp3F;

public class Game {
	private static final int TURN_NUMBER = 20;

	public static void start() {
		// creation of the game's player
		Player currentPlayer = new Player();
		// asking the player's nickname
		currentPlayer.askForNickname();
		// building the game grid (with, for now, random letters)
		Grid gameGrid = new Grid();
		// displays the star composed grid
		Grid.displayHiddenGrid(gameGrid);
		/* TODO Debug - displays the gamegrid */
		System.out.println(gameGrid);
		// displays the grid after having compared it to the player's entry
		for(int turnCounter = 0; turnCounter < TURN_NUMBER ; turnCounter++)
		{
		try {
			String proposedWord = "";
			proposedWord = GameRound.proposeWord();
			Letter[] gridToDisplay = GameRound.gridsComparison(gameGrid,proposedWord);
			for (int counter = 0; counter < gameGrid.getGameGrid().length; counter++) 
				{
				System.out.print(gridToDisplay[counter]);
				}
			// Now catching the case the player tries to enter more or less letters than
			// the number of stars displayed
			if(GameRound.isWordFound(gameGrid , proposedWord))break;
			} 
		catch (ArrayIndexOutOfBoundsException e) 
			{
			System.err.println("The proposed word is too long.");
			}
		catch (ProposedWordException e) 
			{
			System.err.println(e.getMessage());
			}
		}
	}
}
