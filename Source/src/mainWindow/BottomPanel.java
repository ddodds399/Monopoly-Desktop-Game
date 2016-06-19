package mainWindow;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import utils.SwingUtils;
import mainGame.Dice;

/**
 * This class creates a bottom panel for the game
 * 
 * @author Brogrammers
 */
@SuppressWarnings("serial")
public class BottomPanel extends JPanel {

	private JButton rollDiceButton, buildPropertyButton;
	private JLabel diceImageLabel1, diceImageLabel2;
	private Dice dice = new Dice();
	private ImageIcon[] diceArray = new ImageIcon[6];

	/**
	 * This constructor creates the bottom panel
	 */
	public BottomPanel() {

		setLayout(new GridBagLayout());

		setupButtons();

		loadDice();

		setupLabels();

		addComponents();

		super.setBackground(Color.orange);
	}

	/**
	 * This method adds action listeners to the JButtons
	 */
	private void addListeners() {
		// I want this to be a custom listener class

		rollDiceButton.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent sleep) {
				dice.throwDice();

				diceImageLabel1.setIcon(diceArray[dice.getDiceOne() - 1]);
				diceImageLabel2.setIcon(diceArray[dice.getDiceTwo() - 1]);

				if (dice.checkDoubles()) {
					JOptionPane.showMessageDialog(null, "Doubles roll Again");
				}
			}
		});
	}

	/**
	 * This method adds the components to the bottom panel
	 */
	private void addComponents() {
		GridBagConstraints c = new GridBagConstraints();

		c.insets = new Insets(10, 10, 10, 10);

		c.gridy = 0;

		c.gridx = 0;
		add(rollDiceButton, c);

		c.gridx = 1;
		add(diceImageLabel1, c);

		c.gridx = 2;
		add(diceImageLabel2, c);

		c.gridx = 3;
		add(buildPropertyButton, c);
	}

	/**
	 * This method sets up the JButtons and adds the action listeners to them
	 */
	private void setupButtons() {
		rollDiceButton = new JButton("Roll Dice");

		buildPropertyButton = new JButton("Build Property");

		addListeners();
	}

	/**
	 * This method prepares the dice images for the game
	 */
	private void loadDice() {
		SwingUtils utils = new SwingUtils();

		ImageIcon dice1 = utils.scaleDownByFactor(new ImageIcon(
				"images/dice/one.gif"), 2);
		ImageIcon dice2 = utils.scaleDownByFactor(new ImageIcon(
				"images/dice/two.gif"), 2);
		ImageIcon dice3 = utils.scaleDownByFactor(new ImageIcon(
				"images/dice/three.gif"), 2);
		ImageIcon dice4 = utils.scaleDownByFactor(new ImageIcon(
				"images/dice/four.gif"), 2);
		ImageIcon dice5 = utils.scaleDownByFactor(new ImageIcon(
				"images/dice/five.gif"), 2);
		ImageIcon dice6 = utils.scaleDownByFactor(new ImageIcon(
				"images/dice/six.gif"), 2);

		diceArray[0] = dice1;
		diceArray[1] = dice2;
		diceArray[2] = dice3;
		diceArray[3] = dice4;
		diceArray[4] = dice5;
		diceArray[5] = dice6;
	}

	/**
	 * This method sets up the labels with the dice images
	 */
	private void setupLabels() {
		diceImageLabel1 = new JLabel(diceArray[0]);
		diceImageLabel2 = new JLabel(diceArray[0]);
	}
}
