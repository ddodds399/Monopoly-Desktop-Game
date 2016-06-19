package setup;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * This class sets up the JButtons and adds action listeners to them for the setup window
 * 
 * @author Brogrammers
 */
@SuppressWarnings("serial")
public class ButtonPanel extends JPanel {

	private JButton startGameButton;

	// private MainWindow mainWindow;

	// private String[] playerNames;

	/**
	 * This constructor creates the button panel for the setup window
	 */
	public ButtonPanel() {

		setLayout(new GridBagLayout());

		setupButtons();

		// getNameArray();

		addComponents();
	}

	/**
	 * This method sets up the JButtons
	 */
	private void setupButtons() {
		startGameButton = new JButton("Start the Game");

		startGameButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				// mainWindow = new MainWindow(playerNames);
			}
		});
	}

	private void addComponents() {

	}
}