/**
 * Celebrity base class for the Celebrity game.
 * @author cody.henrichsen
 * @version 1.4 17/09/2018
 */
public class Celebrity
{
    /**
     * The clue to determine the celebrity
     */
    private String clue;

    /**
     * The answer or name of the celebrity.
     */
    private String answer;

    /**
     * The type of the celebrity.
     */

    private String type;
    /**
     * Creates a Celebrity instance with the supplied answer and clue
     * @param answer
     * @param clue
     */
    public Celebrity(String answer, String clue)
    {
	this.answer = answer;
	this.clue = clue;
	this.type = "None";
    }

    /**
     * Creates a Celebrity instance with the supplied answer, clue, and type
     * @param answer
     * @param clue
     * @param type
     */
    public Celebrity(String answer, String clue, String type)
    {
	this.answer = answer;
	this.clue = clue;
	this.type = type;
    }


    /**
     * Supplies the clue for the celebrity
     * @return
     */
    public String getClue()
    {
        String retClue = null;
	if (clue != null)
	{
	    retClue = clue;
	}
	return retClue;
    }

    /**
     * Supplies the answer for the celebrity.
     * @return
     */
    public String getAnswer()
    {
        String retAnswer = null;
	if (answer != null)
	{
	    retAnswer = answer;
	}
	return retAnswer;
    }

    /**
     * Updates the clue to the provided String.
     * @param clue The new clue.
     */
    public void setClue(String clue)
    {
	if (clue != null)
	{
	    this.clue = clue;
	}
    }

    /**
     * Updates the answer to the provided String.
     * @param answer The new answer.
     */
    public void setAnswer(String answer)
    {
	if (answer != null)
	{
	    this.answer = answer;
	}
    }

    /**
     * Updates the type to the provided String.
     * @param type The new type.
     */
    public void setType(String type)
    {
	if (type != null)
	{
	    this.type = type;
	}
    }

    /**
     * Supplies the type of the celebrity.
     * @return
     */
    public String getType()
    {
	String retType = null;
	if (type != null)
	{
	    retType = type;
	}
	return retType;
    }

    /**
     * Provides a String representation of the Celebrity.
     */
    @Override
    public String toString()
    {
        return this.answer + " (" + this.clue + ")";
    }
}
