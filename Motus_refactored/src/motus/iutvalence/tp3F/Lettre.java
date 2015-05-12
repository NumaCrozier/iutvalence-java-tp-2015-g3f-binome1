package motus.iutvalence.tp3F;

public class Lettre 
{
	private char lettre;
	private Etats etat;
	
	public Lettre(char lettre, Etats etat)
	{
		this.lettre = lettre;
		this.etat = etat;
	}

	@Override
	public String toString() 
	{
		return "[ " + lettre + " ] " + etat + " ]" ;
	}
	
}
