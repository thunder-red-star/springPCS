import java.util.ArrayList;

/**
 * The framework for the Celebrity Game project
 *
 * @author cody.henrichsen
 * @version 2.3 25/09/2018 refactored the prepareGame and play methods
 */
public class CelebrityGame
{
    /**
     * A reference to a Celebrity or subclass instance.
     */
    private Celebrity celebrity;
    /**
     * The GUI frame for the Celebrity game.
     */
    private CelebrityFrame frame;
    /**
     * The ArrayList of Celebrity values that make up the game
     */
    private ArrayList<Celebrity> celebrities;
    /**
     * The game window
     */
    private CelebrityFrame gameWindow;

    /**
     * Builds the game and starts the GUI
     */
    public CelebrityGame()
    {
	celebrities = new ArrayList<Celebrity>();
	gameWindow = new CelebrityFrame(this);
	gameWindow.replaceScreen("START");
    }

    /**
     * Prepares the game to start by re-initializing the celebGameList and having the gameFrame open the start screen.
     */
    public void prepareGame()
    {
	celebrities.clear();
	gameWindow.replaceScreen("Celebrities");
    }

    /**
     * Determines if the supplied guess is correct.
     *
     * @param guess
     *            The supplied String
     * @return Whether it matches regardless of case or extraneous external
     *         spaces.
     */
    public boolean processGuess(String guess)
    {
        return celebrity.getAnswer().equalsIgnoreCase(guess.trim());
    }

    /**
     * Asserts that the list is initialized and contains at least one Celebrity.
     * Sets the current celebrity as the first item in the list. Opens the game
     * play screen.
     */
    public void play()
    {
	if (celebrities != null && celebrities.size() > 0 )
	{
	    this.celebrity = celebrities.get(0);
            gameWindow.replaceScreen("GAME");
        }	
    }

    /**
     * Adds a Celebrity of specified type to the game list
     *
     * @param name
     *            The name of the celebrity
     * @param guess
     *            The clue(s) for the celebrity
     * @param type
     *            What type of celebrity
     */
    public void addCelebrity(String name, String clue, String type)
    {
	celebrities.add(new Celebrity(name, clue, type));
    }

    /**
     * Validates the name of the celebrity. It must have at least 4 characters.
     * @param name The name of the Celebrity
     * @return If the supplied Celebrity is valid
     */
    public boolean validateCelebrity(String name)
    {
        return name.length() >= 4;
    }

    /**
     * Checks that the supplied clue has at least 10 characters or is a series of clues
     * This method would be expanded based on your subclass of Celebrity.
     * @param clue The text of the clue(s)
     * @param type Supports a subclass of Celebrity
     * @return If the clue is valid.
     */
    public boolean validateClue(String clue, String type)
    {
        String [] types = {"Faculty", "Student", "Actor", "Politician"};
	int[] lengths = {10, 20, 30, 30};

	for (int i = 0; i < types.length; i++)
	{
	    if (type.equalsIgnoreCase(types[i]))
	    {
		return clue.length() >= lengths[i];
	    }
	}
	return false;
    }

    /**
     * Accessor method for the current size of the list of celebrities
     *
     * @return Remaining number of celebrities
     */
    public int getCelebrityGameSize()
    {
        return celebrities.size();
    }

    /**
     * Accessor method for the games clue to maintain low coupling between
     * classes
     *
     * @return The String clue from the current celebrity.
     */
    public String sendClue()
    {
        return celebrity.getClue();
    }

    /**
     * Accessor method for the games answer to maintain low coupling between
     * classes
     *
     * @return The String answer from the current celebrity.
     */
    public String sendAnswer()
    {
        return celebrity.getAnswer();
    }
}
