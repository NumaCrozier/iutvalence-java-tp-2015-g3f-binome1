package motus.iutvalence.tp3F;

import java.util.*;

public class Grille 
{
	private char[] grilleDeJeu;
	private int tailleGrille;

	public Grille()
	{
		this.tailleGrille = choixRandomDeTailleGrille();
		this.grilleDeJeu = choixRandomDeLettres(this.tailleGrille);
	}
	
	public char[] obtenirGrilleDeJeu()
	{
		return this.grilleDeJeu;
	}
	
	public boolean estDansGrille(char caractereAComparer, char[] grilleAParcourir)
	{
		for(int parcoursDeGrille = 0 ; parcoursDeGrille < grilleAParcourir.length ; parcoursDeGrille++)
		{
			if(grilleAParcourir[parcoursDeGrille] == caractereAComparer)return true;
			
		}
		return false;
	}
	
	public char obtenirCaractereDeGrilleDeJeu(int numeroCaractere)
	{
		return this.grilleDeJeu[numeroCaractere];
	}
	
	public static void afficherGrilleCachee(Grille grilleDeJeu)
	{
		for(int compteurEtoilesAAfficher = 0; compteurEtoilesAAfficher < grilleDeJeu.obtenirGrilleDeJeu().length; compteurEtoilesAAfficher++)
		{
			System.out.print(" * ");
		}
	}

	public int choixRandomDeTailleGrille() 
	{
		Random choixRandomTaille = new Random();
		int choixTaille = (choixRandomTaille.nextInt(8)+1);
		return choixTaille;
	}

	public char[] choixRandomDeLettres(int length) 
	{
		char grilleDeJeuAleatoire[] = new char[length] ;
		for(int nbrLettresCreees = 0; nbrLettresCreees < length ; nbrLettresCreees++)
		{
			Random newRandomLetter = new Random();
			char caractereChoisi = (char)(newRandomLetter.nextInt(25) + 'a');
			grilleDeJeuAleatoire[nbrLettresCreees] = caractereChoisi;
		}
		return grilleDeJeuAleatoire;
	}

	@Override
	public String toString() 
	{
		String chaineIntermediaire = new String();
		for(int compteurGenerateurCaracteres = 0 ; compteurGenerateurCaracteres < this.tailleGrille ; compteurGenerateurCaracteres++)
		{
			chaineIntermediaire = chaineIntermediaire + grilleDeJeu[compteurGenerateurCaracteres];
		}
		return "Grille : "+ chaineIntermediaire;
	}
	
}
