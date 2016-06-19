package setup;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import utils.GameCheck;

import mainWindow.MainWindow;

/**
 * This class creates the setup window
 * 
 * @author Brogrammers
 */
@SuppressWarnings("serial")
public class SetupWindow extends JFrame {

	private TitlePanel titlePanel;
	private InputPanel inputPanel;
	private static MainWindow mainWindow;

	/**
	 * This constructor creates the setup window
	 */
	public SetupWindow() {
		
		setupFrame();

		initialisePanels();

		addPanels();

		setupStartButtonActionListener();

		validate();
		revalidate();
		repaint();
	}

	/**
	 * This method sets up the frame, giving the default options for it
	 */
	private void setupFrame() {
		setSize(600, 400);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		ImageIcon windowIcon = new ImageIcon("images/windowIcon.jpg");
		setIconImage(windowIcon.getImage());
	}

	/**
	 * This method initilises the panels for the window
	 */
	private void initialisePanels() {
		titlePanel = new TitlePanel();
		inputPanel = new InputPanel();
	}

	/**
	 * This method adds the panels to the window
	 */
	private void addPanels() {
		setLayout(new BorderLayout());
		add(titlePanel, BorderLayout.PAGE_START);
		add(inputPanel, BorderLayout.CENTER);
	}

	/**
	 * This method adds an action listener to the start button
	 */
	private void setupStartButtonActionListener() {
	
		inputPanel.getStartButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				if (checkForDuplicateCharacters()) {
					JOptionPane
							.showMessageDialog(
									null,
									"Two Players cannot choose the same Character. \nSelect Again",
									"Character Selection",
									JOptionPane.INFORMATION_MESSAGE);
				} else {
					dispose();
					launchGame();
					//GameCheck.setUpGameOverScreen();
				}
			}
		});
	}

	/**
	 * This method returns true or false depending on whether two or more players select the
	 * same character to play as
	 * @return - True or false depending on the above
	 */
	private boolean checkForDuplicateCharacters() {
		Set<String> dupsCheck = new HashSet<String>();

		for (int i = 0; i < inputPanel.getNameArray().size(); i++) {
			if (dupsCheck.contains(inputPanel.getCharacterArray().get(i))) {
				return true;
			} else {
				dupsCheck.add(inputPanel.getCharacterArray().get(i));
			}
		}
		return false;
	}
	public static JFrame getWindow()
	{
		return mainWindow;
	}
	
	private void launchGame()
	{
		mainWindow = new MainWindow(inputPanel
				.getNameArray(), inputPanel.getCharacterArray());
	}
}
