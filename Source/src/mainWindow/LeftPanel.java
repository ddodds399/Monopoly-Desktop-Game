package mainWindow;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

import utils.SwingUtils;
import mainGame.Player;
import mainGame.PropertySetup;

/**
 * This class is used to create a left panel for the game
 * 
 * @author Brogrammers
 */
@SuppressWarnings("serial")
public class LeftPanel extends JPanel implements MouseListener {
	private JLabel leftTitle;
	private static JLabel player1Label;
	private static JLabel player2Label;
	private static JLabel player3Label;
	private static JLabel player4Label;
	private static JPanel player1Panel;
	private static JPanel player2Panel;
	private static JPanel player3Panel;
	private static JPanel player4Panel;
	private ImageIcon player1Image, player2Image, player3Image, player4Image;
	private static Player player1, player2, player3, player4;
	private static Border highlightTurnBorder;
	private static int totalPlayers;

	/**
	 * This constructor creates the left panel
	 * @param nameArray - names to be used on the panel
	 * @param characterArray - images to be used on the panel
	 */
	public LeftPanel(ArrayList<String> nameArray, List<String> characterArray) {

		player1 = new Player("P1", 0, 1000, 1);
		player2 = new Player("P2", 0, 1000, 2);
		player3 = new Player("P3", 0, 1000, 3);
		player4 = new Player("P4", 0, 1000, 4);

		highlightTurnBorder = BorderFactory.createStrokeBorder(new BasicStroke(
				5.0f), Color.RED);

		totalPlayers = nameArray.size();

		setLayout(new GridBagLayout());

		setupCharacterImages(characterArray);

		setupLabels(nameArray);

		setupPanels();

		addComponents();

		super.setBackground(Color.darkGray);
	}
	
	/**
	 * This constructor is for test purposes only
	 */
	public LeftPanel(ArrayList<String> nameArray) {

		player1 = new Player("P1", 0, 1000, 1);
		player2 = new Player("P2", 0, 1000, 2);
		player3 = new Player("P3", 0, 1000, 3);
		player4 = new Player("P4", 0, 1000, 4);

		highlightTurnBorder = BorderFactory.createStrokeBorder(new BasicStroke(
				5.0f), Color.RED);

		totalPlayers = nameArray.size();

		setLayout(new GridBagLayout());

		setupLabels(nameArray);

		setupPanels();

		addComponents();

		super.setBackground(Color.darkGray);
	}

	/**
	 * This method sets up the JLabels on the panel
	 * @param nameArray - the array of names to set on the labels
	 */
	private void setupLabels(ArrayList<String> nameArray) {
		SwingUtils swingUtils = new SwingUtils();

		leftTitle = new JLabel("Players");
		leftTitle.setHorizontalAlignment(JLabel.CENTER);
		swingUtils.setJLabelFont(leftTitle, 40.0f);
		leftTitle.setForeground(Color.white);

		// player1Image = new ImageIcon("images/player.png");
		player1Label = new JLabel(nameArray.get(0) + " £"
				+ player1.getPlayerMoney(), player1Image, JLabel.CENTER);
		player1Label.setHorizontalTextPosition(JLabel.CENTER);
		player1Label.setVerticalTextPosition(JLabel.TOP);
		player1.setPlayerName(nameArray.get(0));
		swingUtils.setJLabelFont(player1Label, 20.0f);

		// player2Image = new ImageIcon("images/player.png");
		player2Label = new JLabel(nameArray.get(1) + " £"
				+ player2.getPlayerMoney(), player2Image, JLabel.CENTER);
		player2Label.setHorizontalTextPosition(JLabel.CENTER);
		player2Label.setVerticalTextPosition(JLabel.TOP);
		player2.setPlayerName(nameArray.get(1));
		swingUtils.setJLabelFont(player2Label, 20.0f);

		if (totalPlayers >= 3) {
			// player3Image = new ImageIcon("images/player.png");
			player3Label = new JLabel(nameArray.get(2) + " £"
					+ player3.getPlayerMoney(), player3Image, JLabel.CENTER);
			player3Label.setHorizontalTextPosition(JLabel.CENTER);
			player3Label.setVerticalTextPosition(JLabel.TOP);
			player3.setPlayerName(nameArray.get(2));
			swingUtils.setJLabelFont(player3Label, 20.0f);
		}

		if (totalPlayers >= 4) {
			// player4Image = new ImageIcon("images/player.png");
			player4Label = new JLabel(nameArray.get(3) + " £"
					+ player4.getPlayerMoney(), player4Image, JLabel.CENTER);
			player4Label.setHorizontalTextPosition(JLabel.CENTER);
			player4Label.setVerticalTextPosition(JLabel.TOP);
			player4.setPlayerName(nameArray.get(3));
			swingUtils.setJLabelFont(player4Label, 20.0f);
		}
	}

	/**
	 * This method returns player 1
	 * @return - Player 1
	 */
	public static Player getPlayer1() {
		return player1;
	}

	/**
	 * This method returns player 2
	 * @return - Player 2
	 */
	public static Player getPlayer2() {
		return player2;
	}

	/**
	 * This method returns player 3
	 * @return - Player 3
	 */
	public static Player getPlayer3() {
		return player3;
	}

	/**
	 * This method returns player 4
	 * @return - Player 4
	 */
	public static Player getPlayer4() {
		return player4;
	}

	/**
	 * This method returns player 1's label
	 * @return - Player 1 label
	 */
	public static JLabel getPlayer1Label() {
		return player1Label;
	}

	/**
	 * This method returns player 2's label
	 * @return - Player 2 label
	 */
	public static JLabel getPlayer2Label() {
		return player2Label;
	}

	/**
	 * This method returns player 3's label
	 * @return - Player 3 label
	 */
	public static JLabel getPlayer3Label() {
		return player3Label;
	}

	/**
	 * This method returns player 4's label
	 * @return - Player 4 label
	 */
	public static JLabel getPlayer4Label() {
		return player4Label;
	}

	/**
	 * This method returns player 1's panel
	 * @return - Player 1 panel
	 */
	public static JPanel getPlayer1Panel() {
		return player1Panel;
	}

	/**
	 * This method returns player 2's panel
	 * @return - Player 2 panel
	 */
	public static JPanel getPlayer2Panel() {
		return player2Panel;
	}

	/**
	 * This method returns player 3's panel
	 * @return - Player 3 panel
	 */
	public static JPanel getPlayer3Panel() {
		return player3Panel;
	}

	/**
	 * This method returns player 4's panel
	 * @return - Player 4 panel
	 */
	public static JPanel getPlayer4Panel() {
		return player4Panel;
	}

	/**
	 * This method returns the turn border
	 * @return - highlight turn border
	 */
	public static Border getHighlightTurnBorder() {
		return highlightTurnBorder;
	}

	/**
	 * This method returns the number of players
	 * @return - number of players
	 */
	public static int getTotalPlayers() {
		return totalPlayers;
	}

	/**
	 * This method sets up the character images for the players
	 * @param characterArray - array of images for the players
	 */
	private void setupCharacterImages(List<String> characterArray) {
		SwingUtils utils = new SwingUtils();

		player1Image = utils.scaleDownByFactor(new ImageIcon(
				"images/characters/" + characterArray.get(0).toLowerCase()
						+ ".png"), 6);
		player2Image = utils.scaleDownByFactor(new ImageIcon(
				"images/characters/" + characterArray.get(1).toLowerCase()
						+ ".png"), 6);
		player3Image = utils.scaleDownByFactor(new ImageIcon(
				"images/characters/" + characterArray.get(2).toLowerCase()
						+ ".png"), 6);
		player4Image = utils.scaleDownByFactor(new ImageIcon(
				"images/characters/" + characterArray.get(3).toLowerCase()
						+ ".png"), 6);
	}

	/**
	 * This method sets up the player panels
	 */
	private void setupPanels() {
		player1Panel = new JPanel();
		player1Panel.add(player1Label);
		player1Panel.setBackground(Color.LIGHT_GRAY);
		player1Panel.setBorder(highlightTurnBorder);
		player1Panel.addMouseListener(this);

		player2Panel = new JPanel();
		player2Panel.add(player2Label);
		player2Panel.setBackground(Color.LIGHT_GRAY);
		player2Panel.addMouseListener(this);

		if (totalPlayers >= 3) {
			player3Panel = new JPanel();
			player3Panel.add(player3Label);
			player3Panel.setBackground(Color.LIGHT_GRAY);
			player3Panel.addMouseListener(this);
		} else {
			player3Panel = new JPanel();
			player3Panel.setBackground(Color.DARK_GRAY);
		}

		if (totalPlayers >= 4) {
			player4Panel = new JPanel();
			player4Panel.add(player4Label);
			player4Panel.setBackground(Color.LIGHT_GRAY);
			player4Panel.addMouseListener(this);
		} else {
			player4Panel = new JPanel();
			player4Panel.setBackground(Color.DARK_GRAY);
		}
	}

	/**
	 * This method adds the components to the LeftPanel
	 */
	private void addComponents() {
		GridBagConstraints c = new GridBagConstraints();

		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.insets = new Insets(10, 10, 5, 10);
		c.anchor = GridBagConstraints.NORTHWEST;

		c.gridy = 0;
		add(leftTitle, c);

		c.weighty = 1;
		c.insets = new Insets(5, 10, 5, 10);

		c.gridy = 1;
		add(player1Panel, c);

		c.gridy = 2;
		add(player2Panel, c);

		c.gridy = 3;
		add(player3Panel, c);

		c.insets = new Insets(5, 10, 10, 10);

		c.gridy = 4;
		add(player4Panel, c);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	/**
	 * This method is used to open a display to show the player's status when their panel is clicked
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == player1Panel) {
			String properties = "";
			for (int j = 0; j < LeftPanel.getPlayer1().getPropertiesArray()
					.size(); j++) {
				properties += player1.getPropertiesArray().get(j)
						.getPropertyName()
						+ ":  Rent £"
						+ player1.getPropertiesArray().get(j).getRent() + "\n";
			}
			JOptionPane.showMessageDialog(
					null,
					player1.getPlayerName()
							+ " is on "
							+ PropertySetup.getProps()
									.get(player1.getPlayerPos())
									.getPropertyName() + "\n"
							+ player1.getPlayerName() + " owns: \n"
							+ properties, "Player 1",
					JOptionPane.INFORMATION_MESSAGE);
		}

		if (e.getSource() == player2Panel) {
			String properties = "";
			for (int j = 0; j < LeftPanel.getPlayer2().getPropertiesArray()
					.size(); j++) {
				properties += player2.getPropertiesArray().get(j)
						.getPropertyName()
						+ ":  Rent £"
						+ player2.getPropertiesArray().get(j).getRent() + "\n";
			}
			JOptionPane.showMessageDialog(
					null,
					player2.getPlayerName()
							+ " is on "
							+ PropertySetup.getProps()
									.get(player2.getPlayerPos())
									.getPropertyName() + "\n"
							+ player2.getPlayerName() + " owns: \n"
							+ properties, "Player 2",
					JOptionPane.INFORMATION_MESSAGE);
		}

		if (e.getSource() == player3Panel) {
			String properties = "";
			for (int j = 0; j < LeftPanel.getPlayer3().getPropertiesArray()
					.size(); j++) {
				properties += player3.getPropertiesArray().get(j)
						.getPropertyName()
						+ ":  Rent £"
						+ player3.getPropertiesArray().get(j).getRent() + "\n";
			}
			JOptionPane.showMessageDialog(
					null,
					player3.getPlayerName()
							+ " is on "
							+ PropertySetup.getProps()
									.get(player3.getPlayerPos())
									.getPropertyName() + "\n"
							+ player3.getPlayerName() + " owns: \n"
							+ properties, "Player 3",
					JOptionPane.INFORMATION_MESSAGE);
		}

		if (e.getSource() == player4Panel) {
			String properties = "";
			for (int j = 0; j < LeftPanel.getPlayer4().getPropertiesArray()
					.size(); j++) {
				properties += player4.getPropertiesArray().get(j)
						.getPropertyName()
						+ ":  Rent £"
						+ player4.getPropertiesArray().get(j).getRent() + "\n";
			}
			JOptionPane.showMessageDialog(
					null,
					player4.getPlayerName()
							+ " is on "
							+ PropertySetup.getProps()
									.get(player4.getPlayerPos())
									.getPropertyName() + "\n"
							+ player4.getPlayerName() + " owns: \n"
							+ properties, "Player 4",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	/**
	 * This method sets the total number of players
	 * @param totalPlayers - total players playing
	 */
	public static void setTotalPlayers(int totalPlayers) {
		LeftPanel.totalPlayers = totalPlayers;
	}
}