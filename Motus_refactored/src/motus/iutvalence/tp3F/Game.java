package motus.iutvalence.tp3F;

public class Game 
{
	public static void start()
	{
		// creation of the game's player
		Player currentPlayer = new Player();
		// asking the player's nickname
		currentPlayer.askForNickname();
		//building the game grid (with, for now, random letters)
		Grid gameGrid = new Grid();
		/* TODO Debug - displays the gamegrid */
		Grid.displayHiddenGrid(gameGrid);
		// displays the star composed grid
		System.out.println(gameGrid);
		// displays the grid after having compared it to the player's entry
		try 
		{
		
		Letter[] gridToDisplay = GameRound.gridsComparison(gameGrid, GameRound.proposeWord());
		for(int counter = 0; counter < gameGrid.getGameGrid().length ; counter++)
		{
		System.out.print(gridToDisplay[counter]);
		}
		// Now catching the case the player tries to enter more letters than the number of stars displayed
		} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Entrez un mot ayant le même nombre de lettres que le mot à trouver s'il vous plait.");
		}
		
		
		
	}
	
}
