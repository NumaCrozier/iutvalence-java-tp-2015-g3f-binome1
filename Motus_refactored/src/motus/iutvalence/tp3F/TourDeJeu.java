package motus.iutvalence.tp3F;

import java.util.*;

public class TourDeJeu 
{
	private int nbrTours;
	private static Scanner scanner;
	
	public void setNbrTours(int nbrTours)
	{
		this.nbrTours = nbrTours;
	}
	public static String proposerMot()
	{
		scanner = new Scanner(System.in);
		System.out.println("Proposez un mot");
		String motPropose = scanner.nextLine();
		return motPropose;
	}
	
	public static Lettre[] comparaisonGrilles(Grille grille, String motPropose)
	{
		Lettre[] motCompare = new Lettre[grille.obtenirGrilleDeJeu().length];
		for(int compteurLettreAComparer = 0; compteurLettreAComparer < motPropose.length() ; compteurLettreAComparer++)
		{
			if(grille.obtenirCaractereDeGrilleDeJeu(compteurLettreAComparer) == motPropose.charAt(compteurLettreAComparer))
				{
				motCompare[compteurLettreAComparer] = new Lettre(motPropose.charAt(compteurLettreAComparer),Etats.RED);
				}
			if(grille.obtenirCaractereDeGrilleDeJeu(compteurLettreAComparer) != motPropose.charAt(compteurLettreAComparer))
				{
				if(grille.estDansGrille(motPropose.charAt(compteurLettreAComparer), grille.obtenirGrilleDeJeu()))
					{
					motCompare[compteurLettreAComparer] = new Lettre(motPropose.charAt(compteurLettreAComparer), Etats.YELLOW);
					}
					else motCompare[compteurLettreAComparer] = new Lettre(motPropose.charAt(compteurLettreAComparer),Etats.BLUE);
				}
		}
		return motCompare;
	}
}
