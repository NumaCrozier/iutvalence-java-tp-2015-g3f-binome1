package motus.iutvalence.tp3F;

import java.util.*;

/**
 * Class that represents the player of the game.
 * @author Antonin Metzler/Numa Crozier
 *
 */
public class Player 
{
	/**
	 * Attribute naming a player.
	 */
	private String nickname;
	
	/**
	 * Attribute that scan the player nickname enter by the player
	 */
	private Scanner scanner;
 
	/**
	 * Method that allows to ask the player to type his nickname and then display it.
	 */
	public void askForNickname()
    {
	scanner = new Scanner(System.in);
	System.out.println("Please type your nickname");
	this.nickname = scanner.nextLine();
	System.out.println("The nickname you've chosen is : " + nickname);
    }
}
