package motus.iutvalence.tp3F;

import java.util.*;

public class Player 
{
	private String nickname = "";
	private Scanner scanner;
 
	public String getNickname() 
    {
	return nickname;
    }
 
	public void askForNickname()
    {
	scanner = new Scanner(System.in);
	System.out.println("Entrez votre pseudonyme s'il vous plait.");
	this.nickname = scanner.nextLine();
	System.out.println("Le pseudonyme que vous avez choisi sera : " + nickname);
    }
}
