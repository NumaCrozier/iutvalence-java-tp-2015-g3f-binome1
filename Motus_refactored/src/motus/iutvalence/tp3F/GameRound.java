package motus.iutvalence.tp3F;

import java.util.*;

public class GameRound 
{
	private int numberOfRounds;
	private static Scanner scanner;
	
	public void setNbrTours(int nbrTours)
	{
		this.numberOfRounds = nbrTours;
	}
	public static String proposeWord()
	{
		scanner = new Scanner(System.in);
		System.out.println("Proposez un mot");
		String wordProposed = scanner.nextLine();
		return wordProposed;
	}
	
	public static Letter[] gridsComparison(Grid grid, String proposedWord)
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
		return comparedWord;
	}
}
