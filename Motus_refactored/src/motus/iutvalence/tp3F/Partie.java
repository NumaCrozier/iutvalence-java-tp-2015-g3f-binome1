package motus.iutvalence.tp3F;

public class Partie 
{
	public static void start()
	{
		// creation of the game's player
		Joueur joueurActuel = new Joueur();
		// asking the player's nickname
		joueurActuel.askForNickname();
		//building the game grid (with, for now, random letters)
		Grille grilleDeJeu = new Grille();
		/* TODO Debug - displays the gamegrid */
		Grille.afficherGrilleCachee(grilleDeJeu);
		// displays the star composed grid
		System.out.println(grilleDeJeu);
		// displays the grid after having compared it to the player's entry
		try 
		{
		
		Lettre[] grilleAAfficher = TourDeJeu.comparaisonGrilles(grilleDeJeu, TourDeJeu.proposerMot());
		for(int compteur = 0; compteur < grilleDeJeu.obtenirGrilleDeJeu().length ; compteur++)
		{
		System.out.print(grilleAAfficher[compteur]);
		}
		// Now catching the case the player tries to enter more letters than the number of stars displayed
		} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Entrez un mot ayant le même nombre de lettres que le mot à trouver s'il vous plait.");
		}
		
		
		
	}
	
}
