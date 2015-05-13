package motus.iutvalence.tp3F;

import java.util.*;

public class GameRound 
{
	private static Scanner scanner;
	
	public static String proposeWord()
	{
		scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("Proposez un mot");
		String wordProposed = scanner.nextLine();
		return wordProposed;
	}
	
	public static Letter[] gridsComparison(Grid grid, String proposedWord)
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
	public static boolean isWordFound(Grid grid, String proposedWord)
	{
		for(int counterGridComparison = 0; counterGridComparison < proposedWord.length(); counterGridComparison++)
		{
			if(grid.getCharacterFromGameGrid(counterGridComparison) != proposedWord.charAt(counterGridComparison))return false;	
		}
		return true;
	}
	
	
	
}
