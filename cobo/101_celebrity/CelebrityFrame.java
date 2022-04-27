import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * GUI Frame class for the Celebrity Game
 * @author cody.henrichsen
 * @version 2.1 17/09/2018
 */
public class CelebrityFrame extends JFrame
{
    //Data members for the JFrame subclass instance

    /**
     * The instance of the panel used for playing the game.
     */
    private CelebrityPanel gamePanel;

    /**
     * Blank panel used for the CardLayout switching screens feature.
     */
    private JPanel panelCards;

    /**
     * The instance variable used to add a celebrity to the game.
     */
    private StartPanel startPanel;

    /**
     * A reference to the CelebrityGame instance to allow for minimized coupling in the object structure.
     */
    private CelebrityGame controller;


    /**
     * Builds an instance of the CelebFrame with a reference to the CelebrityGame instance.
     * @param controller A reference to a CelebrityGame to share with the CelebPanel instance.
     */
    public CelebrityFrame(CelebrityGame controllerRef)
    {
        super();
	controller = controllerRef;
	gamePanel = new CelebrityPanel(controller);
	startPanel = new StartPanel(controller);
	panelCards = new JPanel(new CardLayout());
	panelCards.add(startPanel, "Start");
	panelCards.add(gamePanel, "Game");
    }

    /**
     * Configures the JFrame window subclass to add the panel and set size based information.
     */
    private void setupFrame()
    {
	setContentPane(panelCards);
	setSize(500, 500);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Swaps the screen between the existing panels based on the String parameter.
     * @param screen The name of the screen to open.
     */
    public void replaceScreen(String screen)
    {
	CardLayout cl = (CardLayout)(panelCards.getLayout());
	cl.show(panelCards, screen);
    }
}
