package motus.iutvalence.tp3F;

import java.util.*;

/**
 * Class that contains all the tools used to play a game.
 * @author Antonin Metzler/Numa Crozier
 *
 */
public class GameRound 
{
	/**
	 * Attribute that will allow the program to capture the proposed word typed on the keyboard.
	 */
	private static Scanner scanner;

	public GameRound() 
	{
		scanner = new Scanner(System.in);
	}
	
	/**
	 * Method that returns the proposed word typed by the player on the keyboard.
	 * @return String
	 */
	public String proposeWord()
	{
		System.out.println();
		System.out.println("Propose a word");
		String wordProposed = scanner.nextLine();
		return wordProposed;
	}

	/**
	 * Method that compares the proposed word to the word to find and returns a letter board (which contains the characters proposed and the state determined).
	 * @param grid
	 * @param proposedWord
	 * @return Letter[]
	 * @throws ProposedWordException
	 */
	public Letter[] gridsComparison(Grid grid, String proposedWord)
			throws ProposedWordException
	{
		if(grid.getGameGrid().length > proposedWord.length())throw new ProposedWordException("The proposed word is too short.");

		else
		{
			Letter[] comparedWord = new Letter[grid.getGameGrid().length];
			for(int letterToCompareCounter = 0; letterToCompareCounter < proposedWord.length() ; letterToCompareCounter++)
			{
				if(grid.getCharacterFromGameGrid(letterToCompareCounter) == proposedWord.charAt(letterToCompareCounter))
				{
					comparedWord[letterToCompareCounter] = new Letter(proposedWord.charAt(letterToCompareCounter),States.RED);
				}
				if(grid.getCharacterFromGameGrid(letterToCompareCounter) != proposedWord.charAt(letterToCompareCounter))
				{
					if(grid.isInTheGrid(proposedWord.charAt(letterToCompareCounter), grid.getGameGrid()))
					{
						comparedWord[letterToCompareCounter] = new Letter(proposedWord.charAt(letterToCompareCounter), States.YELLOW);
					}
					else comparedWord[letterToCompareCounter] = new Letter(proposedWord.charAt(letterToCompareCounter),States.BLUE);
				}
			}
			if(isWordFound(grid , proposedWord))System.out.println("You found the word ! Congrats !");
			return comparedWord;
		}
	}
	/**
	 * Method that returns "true" if the word proposed is equal to the word to find. It returns false instead.
	 * @param grid
	 * @param proposedWord
	 * @return boolean
	 */
	public boolean isWordFound(Grid grid, String proposedWord)
	{
		for(int counterGridComparison = 0; counterGridComparison < proposedWord.length(); counterGridComparison++)
		{
			if(grid.getCharacterFromGameGrid(counterGridComparison) != proposedWord.charAt(counterGridComparison))return false;	
		}
		return true;
	}



}
