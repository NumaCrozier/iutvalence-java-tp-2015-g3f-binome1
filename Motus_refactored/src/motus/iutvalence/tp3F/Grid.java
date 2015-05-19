package motus.iutvalence.tp3F;

import java.util.*;

public class Grid 
{
	/**
	 * The grid that will be created and in which will be placed letters
	 */
	private char[] gameGrid;

	/**
	 * The size of the game grid (in number of characters).
	 */
	private int gridSize;

	/**
	 * Constructor for the Grid class.
	 */
	public Grid()
	{
		this.gridSize = randomGridSizeChoice();
		this.gameGrid = randomLetterChoice(this.gridSize);
	}

	/**
	 * Method to get the game grid.
	 * @return char[]
	 */
	public char[] getGameGrid()
	{
		return this.gameGrid;
	}

	/**
	 * Method that compare a character to the gamegrid, to know if it's in or not.
	 * @param characterToCompare ( char )
	 * @param gridToCover ( char[] )
	 * @return boolean
	 */
	public boolean isInTheGrid(char characterToCompare, char[] gridToCover)
	{
		for(int gridCover = 0 ; gridCover < gridToCover.length ; gridCover++)
		{
			if(gridToCover[gridCover] == characterToCompare)return true;

		}
		return false;
	}

	/**
	 * Method returning a character from it's position in the game grid.
	 * @param characterNumero ( int )
	 * @return char
	 */
	public char getCharacterFromGameGrid(int characterNumero)
	{
		return this.gameGrid[characterNumero];
	}

	/**
	 * Method that displays the game grid, but where letters are replaced by stars so the player can't see the word he has to find.
	 * @param grilleDeJeu ( Grid )
	 */
	public static void displayHiddenGrid(Grid grilleDeJeu)
	{
		System.out.println("Grille : ");
		for(int starsToDisplayCounter = 0; starsToDisplayCounter < grilleDeJeu.getGameGrid().length; starsToDisplayCounter++)
		{
			System.out.print(" * ");
		}
		System.out.println();
	}

	/**
	 * Method that will chose the game grid's size randomly (between 3 and 8)
	 * @return int
	 */
	public int randomGridSizeChoice() 
	{
		Random randomSizeChoice = new Random();
		int choixTaille = (randomSizeChoice.nextInt(8)+3);
		return choixTaille;
	}

	/**
	 * Method that returns a game grid completed with random letters. Makes the game harder, that's fun.
	 * @param length
	 * @return char[]
	 */
	public char[] randomLetterChoice(int length) 
	{
		char randomGameGrid[] = new char[length] ;
		for(int numberOfLettersCreated = 0; numberOfLettersCreated < length ; numberOfLettersCreated++)
		{
			Random newRandomLetter = new Random();
			char chosenCharacter = (char)(newRandomLetter.nextInt(25) + 'a');
			randomGameGrid[numberOfLettersCreated] = chosenCharacter;
		}
		return randomGameGrid;
	}

	@Override
	public String toString() 
	{
		String intermediateString = new String();
		for(int characterGeneratorCounter = 0 ; characterGeneratorCounter < this.gridSize ; characterGeneratorCounter++)
		{
			intermediateString = intermediateString + gameGrid[characterGeneratorCounter];
		}
		return "Grille : "+ intermediateString;
	}

}
