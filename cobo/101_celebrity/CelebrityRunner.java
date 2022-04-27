/**
 * Starts the Celebrity Game application
 * @author cody.henrichsen
 *
 */
public class CelebrityRunner
{
    /**
     * The entry point of the Java application.
     * @param args Unused parameter as it is a GUI based program.
     */
    public static void main(String [] args)
    {
	CelebrityGame game = new CelebrityGame();
	game.prepareGame();
	game.addCelebrity("Tom Cruise", "A famous actor known for his role in Mission Impossible.", "Actor");
	game.addCelebrity("Jennifer Aniston", "A famous actress known for her role in Friends.", "Actress");
	game.addCelebrity("Brad Pitt", "A famous actor known for his role in Fight Club.", "Actor");
	game.play();
    }
}
