package motus.iutvalence.tp3F;

import java.util.*;

public class Grid 
{
	private char[] gameGrid;
	private int gridSize;

	public Grid()
	{
		this.gridSize = randomGridSizeChoice();
		this.gameGrid = randomLetterChoice(this.gridSize);
	}
	
	public char[] getGameGrid()
	{
		return this.gameGrid;
	}
	
	public boolean isInTheGrid(char characterToCompare, char[] gridToCover)
	{
		for(int gridCover = 0 ; gridCover < gridToCover.length ; gridCover++)
		{
			if(gridToCover[gridCover] == characterToCompare)return true;
			
		}
		return false;
	}
	
	public char getCharacterFromGameGrid(int characterNumero)
	{
		return this.gameGrid[characterNumero];
	}
	
	public static void displayHiddenGrid(Grid grilleDeJeu)
	{
		System.out.println("Grille : ");
		for(int starsToDisplayCounter = 0; starsToDisplayCounter < grilleDeJeu.getGameGrid().length; starsToDisplayCounter++)
		{
			System.out.print(" * ");
		}
		System.out.println();
	}

	public int randomGridSizeChoice() 
	{
		Random randomSizeChoice = new Random();
		int choixTaille = (randomSizeChoice.nextInt(8)+1);
		return choixTaille;
	}

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
