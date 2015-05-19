package motus.iutvalence.tp3F;

/**
 * Class defining what a letter is (a character and a state) and allowing to display it correctly.
 * @author Antonin Metzler/Numa Crozier
 *
 */
public class Letter 
{
	/**
	 * Attribute that represents a letter (that will be merged with a state to form a Letter).
	 */
	private char letter;
	
	/**
	 * Attribute that represents the state of a character (it will be merged with a character to form a Letter)
	 */
	private States state;
	
	/**
	 * Constructor forming a Letter with a character and it's state.
	 * @param letter
	 * @param state
	 */
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
