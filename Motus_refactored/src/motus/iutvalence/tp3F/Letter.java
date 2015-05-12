package motus.iutvalence.tp3F;

public class Letter 
{
	private char letter;
	private States state;
	
	public Letter(char letter, States state)
	{
		this.letter = letter;
		this.state = state;
	}

	@Override
	public String toString() 
	{
		return "[ " + letter + " ] " + state + " ]" ;
	}
	
}
