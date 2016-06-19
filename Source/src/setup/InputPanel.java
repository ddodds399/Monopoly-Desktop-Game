package setup;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.Border;

import utils.SwingUtils;
import mainWindow.MainWindow;

/**
 * This class is used to create the input panel for the setup window
 * 
 * @author Brogrammers
 */
@SuppressWarnings("serial")
public class InputPanel extends JPanel {

	private JLabel playerInputLabel;
	private JTextField player1InputBox, player2InputBox, player3InputBox,
			player4InputBox;
	private JButton startGameButton;
	private JToggleButton player3RemoveButton, player4RemoveButton;
	private JComboBox<Object> player1Character, player2Character,
			player3Character, player4Character;
	private List<String> availableCharacters = new ArrayList<String>();
	private List<String> selectedCharacters = new ArrayList<String>();

	@SuppressWarnings("unused")
	private MainWindow mainWindow;

	/**
	 * This constructor creates the input panel for the setup window
	 */
	public InputPanel() {
		setLayout(new GridBagLayout());

		setupLabels();

		setupNameInputBoxes();

		setupComboInputBoxes();

		setupButtons();

		setupActionListeners();

		addComponents();
	}

	/**
	 * This method sets up the JLabels for the panel
	 */
	private void setupLabels() {
		SwingUtils swingUtils = new SwingUtils();

		playerInputLabel = new JLabel("Player Names");
		playerInputLabel.setForeground(Color.red);
		swingUtils.setJLabelFont(playerInputLabel, 20.0f);
	}

	/**
	 * This method sets up the Text fields for the panel
	 */
	private void setupNameInputBoxes() {
		SwingUtils utils = new SwingUtils();

		player1InputBox = new JTextField("Player 1 Name");
		player2InputBox = new JTextField("Player 2 Name");
		player3InputBox = new JTextField("Player 3 Name");
		player4InputBox = new JTextField("Player 4 Name");

		utils.setJTextFieldCharacterLimit(player1InputBox, 15);
		utils.setJTextFieldCharacterLimit(player2InputBox, 15);
		utils.setJTextFieldCharacterLimit(player3InputBox, 15);
		utils.setJTextFieldCharacterLimit(player4InputBox, 15);

		player1InputBox.setText("P1 Name");
		player2InputBox.setText("P2 Name");
		player3InputBox.setText("P3 Name");
		player4InputBox.setText("P4 Name");

		utils.setJTextFieldFocusListener(player1InputBox);
		utils.setJTextFieldFocusListener(player2InputBox);
		utils.setJTextFieldFocusListener(player3InputBox);
		utils.setJTextFieldFocusListener(player4InputBox);

		player1InputBox.setHorizontalAlignment(JTextField.CENTER);
		player2InputBox.setHorizontalAlignment(JTextField.CENTER);
		player3InputBox.setHorizontalAlignment(JTextField.CENTER);
		player4InputBox.setHorizontalAlignment(JTextField.CENTER);

		Border border = BorderFactory.createLineBorder(Color.BLUE, 1);
		Border emptyBorder = BorderFactory.createEmptyBorder(2, 2, 2, 2);

		player1InputBox.setBorder(BorderFactory.createCompoundBorder(border,
				emptyBorder));
		player2InputBox.setBorder(BorderFactory.createCompoundBorder(border,
				emptyBorder));
		player3InputBox.setBorder(BorderFactory.createCompoundBorder(border,
				emptyBorder));
		player4InputBox.setBorder(BorderFactory.createCompoundBorder(border,
				emptyBorder));
	}

	/**
	 * This method sets up the combo boxes for the panel
	 */
	private void setupComboInputBoxes() {
		selectedCharacters.add("Book");
		selectedCharacters.add("Laptop");
		selectedCharacters.add("Notepad");
		selectedCharacters.add("Pencil");

		availableCharacters.add("Book");
		availableCharacters.add("Laptop");
		availableCharacters.add("Notepad");
		availableCharacters.add("Pencil");
		availableCharacters.add("Shotglass");

		player1Character = new JComboBox<>(availableCharacters.toArray());
		player2Character = new JComboBox<>(availableCharacters.toArray());
		player3Character = new JComboBox<>(availableCharacters.toArray());
		player4Character = new JComboBox<>(availableCharacters.toArray());

		player1Character.setSelectedIndex(0);
		player2Character.setSelectedIndex(1);
		player3Character.setSelectedIndex(2);
		player4Character.setSelectedIndex(3);

		player1Character.addActionListener(new ActionListener() {

			@SuppressWarnings("unchecked")
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>) e.getSource();

				selectedCharacters.set(0, (String) cb.getSelectedItem());
			}
		});

		player2Character.addActionListener(new ActionListener() {

			@SuppressWarnings("unchecked")
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>) e.getSource();

				selectedCharacters.set(1, (String) cb.getSelectedItem());
			}
		});

		player3Character.addActionListener(new ActionListener() {

			@SuppressWarnings("unchecked")
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>) e.getSource();

				selectedCharacters.set(2, (String) cb.getSelectedItem());
			}
		});

		player4Character.addActionListener(new ActionListener() {

			@SuppressWarnings("unchecked")
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>) e.getSource();

				selectedCharacters.set(3, (String) cb.getSelectedItem());
			}
		});
	}

	/**
	 * This method sets up the JButtons for the setup window
	 */
	private void setupButtons() {
		startGameButton = new JButton("Start the Game");

		player3RemoveButton = new JToggleButton("Remove Player 3");

		// This is disabled so that you cannot remove player 3 before removing
		// player 4
		player3RemoveButton.setEnabled(false);

		player4RemoveButton = new JToggleButton("Remove Player 4");
	}

	/**
	 * This method adds action listeners to the JButtons
	 */
	private void setupActionListeners() {

		player3RemoveButton.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					player3InputBox.setEnabled(false);
					player3Character.setEnabled(false);
					player4RemoveButton.setEnabled(false);
					repaint();
				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					player3InputBox.setEnabled(true);
					player3Character.setEnabled(true);
					player4RemoveButton.setEnabled(true);
					repaint();
				}
			}
		});

		player4RemoveButton.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					player4InputBox.setEnabled(false);
					player4Character.setEnabled(false);
					player3RemoveButton.setEnabled(true);
					repaint();
				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					player4InputBox.setEnabled(true);
					player4Character.setEnabled(true);
					player3RemoveButton.setEnabled(false);
					repaint();
				}
			}
		});
	}

	/**
	 * This method adds the components for the input panel
	 */
	private void addComponents() {
		GridBagConstraints c = new GridBagConstraints();

		c.insets = new Insets(10, 10, 10, 10);
		c.gridy = 0;
		c.gridx = 0;
		c.weightx = 1;
		c.weighty = 1;
		c.gridwidth = 4;

		add(playerInputLabel, c);

		c.gridwidth = 1;

		c.gridy = 1;
		add(player1InputBox, c);

		c.gridx = 1;
		add(player1Character, c);

		c.gridx = 2;
		add(player2InputBox, c);

		c.gridx = 3;
		add(player2Character, c);

		c.gridy = 2;
		c.gridx = 0;
		add(player3InputBox, c);

		c.gridx = 1;
		add(player3Character, c);

		c.gridx = 2;
		add(player4InputBox, c);

		c.gridx = 3;
		add(player4Character, c);

		c.gridy = 3;
		c.gridx = 0;
		c.gridwidth = 2;
		add(player3RemoveButton, c);

		c.gridx = 2;
		add(player4RemoveButton, c);

		c.gridy = 4;
		c.gridx = 0;
		c.gridwidth = 4;
		add(startGameButton, c);

	}

	/**
	 * This method returns the name array
	 * @return - name array
	 */
	public ArrayList<String> getNameArray() {
		// return new String[] {player1InputBox.getText(),
		// player2InputBox.getText(),
		// player3InputBox.getText(),
		// player4InputBox.getText()};

		ArrayList<String> currentPlayers = new ArrayList<String>();

		currentPlayers.add(player1InputBox.getText());
		currentPlayers.add(player2InputBox.getText());

		if (player3Character.isEnabled() == true) {
			currentPlayers.add(player3InputBox.getText());
		}

		if (player4Character.isEnabled() == true) {
			currentPlayers.add(player4InputBox.getText());
		}

		return currentPlayers;
	}

	/**
	 * This method returns the character array
	 * @return - the character array
	 */
	public List<String> getCharacterArray() {
		return selectedCharacters;
	}

	/**
	 * This method returns the start button
	 * @return - start button
	 */
	public JButton getStartButton() {
		return startGameButton;
	}
}