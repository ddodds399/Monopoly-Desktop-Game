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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import utils.GameCheck;
import utils.SwingUtils;
import mainGame.Dice;
import mainGame.PECParking;
import mainGame.PropertySetup;
import mainGame.Questions;
import mainGame.RentAndLoans;
import mainGame.RideTrain;
import mainGame.ShotCards;
import mainGame.Warping;

/**
 * This class creates a right panel for the game
 * 
 * @author Brogrammers
 */
@SuppressWarnings("serial")
public class RightPanel extends JPanel {

	private JLabel logTitle;
	private static JTextArea logArea;
	private JScrollPane scrollPane;

	private JButton rollDiceButton, buildPropertyButton,surrenderButton,questionButton;
	private JLabel diceImageLabel1, diceImageLabel2;
	private static Dice dice = new Dice();
	private ImageIcon[] diceArray = new ImageIcon[6];
	static int currentPlayer = 1;
	static int nextPlayer = 2;

	/**
	 * This constructor creates the right panel
	 */
	public RightPanel() {
		
		GameCheck.setupSurrenderCounter();
		setLayout(new GridBagLayout());

		setupPanel();

		setupButtons();

		loadDice();

		setupLabels();

		addComponents();

		setBackground(Color.darkGray);
	}

	/**
	 * This method sets up the panel
	 */
	private void setupPanel() {
		SwingUtils swingUtils = new SwingUtils();

		logTitle = new JLabel("Log Window");
		swingUtils.setJLabelFont(logTitle, 40.0f);
		logTitle.setForeground(Color.white);

		logArea = new JTextArea(0, 0);
		logArea.setEditable(false);

		scrollPane = new JScrollPane(logArea);
		// logArea.append("\nI appended it also");
	}

	/**
	 * This method sets up the JButtons and adds listeners to them
	 */
	private void setupButtons() {
		rollDiceButton = new JButton("Roll Dice");

		buildPropertyButton = new JButton("Build Property");
		
		surrenderButton = new JButton("Drop Out!");
		
		questionButton = new JButton ("????");

		addListeners();
	}

	/**
	 * This method adds action listeners to the JButtons
	 */
	private void addListeners() {
		// I want this to be a custom listener class

		questionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {
				Questions.chooseQuestion();
				questionButton.setEnabled(false);
			}
		});
		
		buildPropertyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {
				PropertySetup.buildProperty();
			}
		});

		rollDiceButton.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent sleep) {
			
				getCurrentPlayer();
				dice.throwDice();
				
				diceImageLabel1.setIcon(diceArray[dice.getDiceOne() - 1]);
				diceImageLabel2.setIcon(diceArray[dice.getDiceTwo() - 1]);

				if (LeftPanel.getPlayer1().getPlayerNum() == currentPlayer
						&& dice.isPl1InLecture() == false && LeftPanel.getPlayer1().getSurrender()==false) {

					// if lecture boolean is true and doubles is not achieved dont
					// change pos
					logArea.append("\n"
							+ LeftPanel.getPlayer1().getPlayerName() + ""
							+ " rolled "
							+ (dice.getDiceOne() + dice.getDiceTwo()));
					LeftPanel.getPlayer1().setPlayerPos(
							LeftPanel.getPlayer1().getPlayerPos()
									+ dice.getDiceOne() + dice.getDiceTwo());

					MiddlePanel.setPlayerCharLocation(1, LeftPanel.getPlayer1()
							.getPlayerPos());
					logArea.append("\n"
							+ LeftPanel.getPlayer1().getPlayerName()
							+ "'s position is "
							+ PropertySetup.getProps()
									.get(LeftPanel.getPlayer1().getPlayerPos())
									.getPropertyName());
					logArea.setCaretPosition(logArea.getDocument().getLength());
					LeftPanel.getPlayer1Label().setText(
							LeftPanel.getPlayer1().getPlayerName() + " £"
									+ LeftPanel.getPlayer1().getPlayerMoney());
					PropertySetup.buyProperty();
					if ((LeftPanel.getPlayer1().getPlayerNum() == RightPanel
							.getCurrentPlayer() && ((LeftPanel.getPlayer1()
							.getPlayerPos() == (PropertySetup
							.getAdelaideTrain().getPropPos()))
							|| (LeftPanel.getPlayer1().getPlayerPos() == (PropertySetup
									.getCityHospitalTrain().getPropPos()))
							|| (LeftPanel.getPlayer1().getPlayerPos() == (PropertySetup
									.getBotanicTrain().getPropPos())) || (LeftPanel
							.getPlayer1().getPlayerPos() == (PropertySetup
							.getCentralTrain().getPropPos()))))) {
						RideTrain.rideTrain();
						
					} 
					else
					{
						PropertySetup.rent();
						RentAndLoans.payLoan();
						RentAndLoans.payRent();
						PECParking.collectParkingPoolMoney();
						Warping.warp();
						ShotCards.selectCard();
					}
					LeftPanel.getPlayer1().checkMoney();
				}

				else if (LeftPanel.getPlayer2().getPlayerNum() == currentPlayer
						&& dice.isPl2InLecture() == false && LeftPanel.getPlayer2().getSurrender()==false) {

					logArea.append("\n"
							+ LeftPanel.getPlayer2().getPlayerName() + ""
							+ " rolled "
							+ (dice.getDiceOne() + dice.getDiceTwo()));
					LeftPanel.getPlayer2().setPlayerPos(
							LeftPanel.getPlayer2().getPlayerPos()
									+ dice.getDiceOne() + dice.getDiceTwo());
					MiddlePanel.setPlayerCharLocation(2, LeftPanel.getPlayer2()
							.getPlayerPos());
					logArea.append("\n"
							+ LeftPanel.getPlayer2().getPlayerName()
							+ "'s position is "
							+ PropertySetup.getProps()
									.get(LeftPanel.getPlayer2().getPlayerPos())
									.getPropertyName());
					logArea.setCaretPosition(logArea.getDocument().getLength());
					LeftPanel.getPlayer2Label().setText(
							LeftPanel.getPlayer2().getPlayerName() + " £"
									+ LeftPanel.getPlayer2().getPlayerMoney());
					PropertySetup.buyProperty();

					if ((LeftPanel.getPlayer2().getPlayerNum() == RightPanel
							.getCurrentPlayer() && ((LeftPanel.getPlayer2()
							.getPlayerPos() == (PropertySetup
							.getAdelaideTrain().getPropPos()))
							|| (LeftPanel.getPlayer2().getPlayerPos() == (PropertySetup
									.getCityHospitalTrain().getPropPos()))
							|| (LeftPanel.getPlayer2().getPlayerPos() == (PropertySetup
									.getBotanicTrain().getPropPos())) || (LeftPanel
							.getPlayer2().getPlayerPos() == (PropertySetup
							.getCentralTrain().getPropPos()))))) {
						RideTrain.rideTrain();
					} 
					else
					{
						RentAndLoans.payLoan();
						RentAndLoans.payRent();
						PECParking.collectParkingPoolMoney();
						PropertySetup.rent();
						Warping.warp();
						ShotCards.selectCard();
					}
					LeftPanel.getPlayer2().checkMoney();
				} else if (LeftPanel.getPlayer3().getPlayerNum() == currentPlayer
						&& dice.isPl3InLecture() == false && LeftPanel.getPlayer3().getSurrender()==false) {

					logArea.append("\n"
							+ LeftPanel.getPlayer3().getPlayerName() + ""
							+ " rolled "
							+ (dice.getDiceOne() + dice.getDiceTwo()));
					LeftPanel.getPlayer3().setPlayerPos(
							LeftPanel.getPlayer3().getPlayerPos()
									+ dice.getDiceOne() + dice.getDiceTwo());
					MiddlePanel.setPlayerCharLocation(3, LeftPanel.getPlayer3()
							.getPlayerPos());
					logArea.append("\n"
							+ LeftPanel.getPlayer3().getPlayerName()
							+ "'s position is "
							+ PropertySetup.getProps()
									.get(LeftPanel.getPlayer3().getPlayerPos())
									.getPropertyName());
					logArea.setCaretPosition(logArea.getDocument().getLength());
					LeftPanel.getPlayer3Label().setText(
							LeftPanel.getPlayer3().getPlayerName() + " £"
									+ LeftPanel.getPlayer3().getPlayerMoney());
					PropertySetup.buyProperty();
					if ((LeftPanel.getPlayer3().getPlayerNum() == RightPanel
							.getCurrentPlayer() && ((LeftPanel.getPlayer3()
							.getPlayerPos() == (PropertySetup
							.getAdelaideTrain().getPropPos()))
							|| (LeftPanel.getPlayer3().getPlayerPos() == (PropertySetup
									.getCityHospitalTrain().getPropPos()))
							|| (LeftPanel.getPlayer3().getPlayerPos() == (PropertySetup
									.getBotanicTrain().getPropPos())) || (LeftPanel
							.getPlayer3().getPlayerPos() == (PropertySetup
							.getCentralTrain().getPropPos()))))) {
						RideTrain.rideTrain();
					} 
					else {
						PropertySetup.rent();
						RentAndLoans.payLoan();
						RentAndLoans.payRent();
						PECParking.collectParkingPoolMoney();
						Warping.warp();
						ShotCards.selectCard();
					}
					LeftPanel.getPlayer3().checkMoney();
				} else if (LeftPanel.getPlayer4().getPlayerNum() == currentPlayer
						&& dice.isPl4InLecture() == false && LeftPanel.getPlayer4().getSurrender()==false) {

					logArea.append("\n"
							+ LeftPanel.getPlayer4().getPlayerName() + ""
							+ " rolled "
							+ (dice.getDiceOne() + dice.getDiceTwo()));
					
					LeftPanel.getPlayer4().setPlayerPos(
							LeftPanel.getPlayer4().getPlayerPos()
									+ dice.getDiceOne() + dice.getDiceTwo());
					MiddlePanel.setPlayerCharLocation(4, LeftPanel.getPlayer4()
							.getPlayerPos());
					logArea.append("\n"
							+ LeftPanel.getPlayer4().getPlayerName()
							+ "'s position is "
							+ PropertySetup.getProps()
									.get(LeftPanel.getPlayer4().getPlayerPos())
									.getPropertyName());
					logArea.setCaretPosition(logArea.getDocument().getLength());
					LeftPanel.getPlayer4Label().setText(
							LeftPanel.getPlayer4().getPlayerName() + " £"
									+ LeftPanel.getPlayer4().getPlayerMoney());
					PropertySetup.buyProperty();
					if ((LeftPanel.getPlayer4().getPlayerNum() == RightPanel
							.getCurrentPlayer() && ((LeftPanel.getPlayer4()
							.getPlayerPos() == (PropertySetup
							.getAdelaideTrain().getPropPos()))
							|| (LeftPanel.getPlayer4().getPlayerPos() == (PropertySetup
									.getCityHospitalTrain().getPropPos()))
							|| (LeftPanel.getPlayer4().getPlayerPos() == (PropertySetup
									.getBotanicTrain().getPropPos())) || (LeftPanel
							.getPlayer4().getPlayerPos() == (PropertySetup
							.getCentralTrain().getPropPos()))))) {
						RideTrain.rideTrain();
					} 
					else {
						PropertySetup.rent();
						RentAndLoans.payLoan();
						RentAndLoans.payRent();
						PECParking.collectParkingPoolMoney();
						Warping.warp();
						ShotCards.selectCard();
					}
					LeftPanel.getPlayer4().checkMoney();
				}

				if (dice.checkDoubles()) {
					if (dice.getNumOfRolls() != 3) {
						logArea.append("\nDoubles roll again");
						logArea.setCaretPosition(logArea.getDocument()
								.getLength());
						if (LeftPanel.getPlayer1().getPlayerNum() == currentPlayer
								&& dice.isPl1InLecture() == true) {
							dice.setPl1InLecture(false);
							logArea.append("\n"
									+ LeftPanel.getPlayer1().getPlayerName()
									+ " is free!");
						} else if (LeftPanel.getPlayer2().getPlayerNum() == currentPlayer
								&& dice.isPl2InLecture() == true) {
							dice.setPl2InLecture(false);
							logArea.append("\n"
									+ LeftPanel.getPlayer2().getPlayerName()
									+ " is free!");
						} else if (LeftPanel.getPlayer3().getPlayerNum() == currentPlayer
								&& dice.isPl3InLecture() == true) {
							dice.setPl3InLecture(false);
							logArea.append("\n"
									+ LeftPanel.getPlayer3().getPlayerName()
									+ " is free!");
						} else if (LeftPanel.getPlayer4().getPlayerNum() == currentPlayer
								&& dice.isPl4InLecture() == true) {
							dice.setPl4InLecture(false);
							logArea.append("\n"
									+ LeftPanel.getPlayer4().getPlayerName()
									+ " is free!");
						}

					} 
					currentPlayer -= 1;
				}

				

				if (currentPlayer < LeftPanel.getTotalPlayers()) {
					currentPlayer++;
				} else {
					currentPlayer = 1;
					
				}
				

				if (currentPlayer == LeftPanel.getPlayer1().getPlayerNum()) {
					LeftPanel.getPlayer1Panel().setBorder(
							LeftPanel.getHighlightTurnBorder());
				} else {
					LeftPanel.getPlayer1Panel().setBorder(null);
				}

				if (currentPlayer == LeftPanel.getPlayer2().getPlayerNum()) {
					LeftPanel.getPlayer2Panel().setBorder(
							LeftPanel.getHighlightTurnBorder());
				} else {
					LeftPanel.getPlayer2Panel().setBorder(null);
				}

				if (currentPlayer == LeftPanel.getPlayer3().getPlayerNum()) {
					LeftPanel.getPlayer3Panel().setBorder(
							LeftPanel.getHighlightTurnBorder());
				} else {
					LeftPanel.getPlayer3Panel().setBorder(null);
				}

				if (currentPlayer == LeftPanel.getPlayer4().getPlayerNum()) {
					LeftPanel.getPlayer4Panel().setBorder(
							LeftPanel.getHighlightTurnBorder());
				} else {
					LeftPanel.getPlayer4Panel().setBorder(null);
				}
				landOnLecture();
				checkNextPlayer();
				
				GameCheck.balanceCheck();
				GameCheck.gameOverCheck();
				revalidate();
				if(currentPlayer == nextPlayer)
				{
					questionButton.setEnabled(true);
					if(nextPlayer <LeftPanel.getTotalPlayers())
					{
						nextPlayer++;
					}
					else
					{
						nextPlayer = 1;
					}
				}
			}
			
		});
		
		surrenderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {
		
				
				if (currentPlayer == LeftPanel.getPlayer1().getPlayerNum()) {
					LeftPanel.getPlayer1().setSurrender(true);
					JOptionPane.showMessageDialog(null, "" + 
					LeftPanel.getPlayer1().getPlayerName() +" has dropped out of uni!");
					LeftPanel.getPlayer1().endGame();
					
				}
				else if (currentPlayer == LeftPanel.getPlayer2().getPlayerNum()){
					LeftPanel.getPlayer2().setSurrender(true);
					JOptionPane.showMessageDialog(null, "" + 
					LeftPanel.getPlayer2().getPlayerName() +" has dropped out of uni!");
					LeftPanel.getPlayer2().endGame();
				}
				else if (currentPlayer == LeftPanel.getPlayer3().getPlayerNum()){
					LeftPanel.getPlayer3().setSurrender(true);
					JOptionPane.showMessageDialog(null, "" + 
					LeftPanel.getPlayer3().getPlayerName() +" has dropped out of uni!");
					LeftPanel.getPlayer3().endGame();
				}
				else if (currentPlayer == LeftPanel.getPlayer4().getPlayerNum()){
					LeftPanel.getPlayer4().setSurrender(true);
					JOptionPane.showMessageDialog(null, "" + 
					LeftPanel.getPlayer4().getPlayerName() +" has dropped out of uni!");
					LeftPanel.getPlayer4().endGame();
				}
				
				
				
				
				
				GameCheck.surrenderCheck();
				
				GameCheck.gameOverCheck();
				revalidate();
				
				if (currentPlayer == LeftPanel.getPlayer1().getPlayerNum()) {
					LeftPanel.getPlayer1Panel().setBorder(
							LeftPanel.getHighlightTurnBorder());
				} else {
					LeftPanel.getPlayer1Panel().setBorder(null);
				}

				if (currentPlayer == LeftPanel.getPlayer2().getPlayerNum()) {
					LeftPanel.getPlayer2Panel().setBorder(
							LeftPanel.getHighlightTurnBorder());
				} else {
					LeftPanel.getPlayer2Panel().setBorder(null);
				}

				if (currentPlayer == LeftPanel.getPlayer3().getPlayerNum()) {
					LeftPanel.getPlayer3Panel().setBorder(
							LeftPanel.getHighlightTurnBorder());
				} else {
					LeftPanel.getPlayer3Panel().setBorder(null);
				}

				if (currentPlayer == LeftPanel.getPlayer4().getPlayerNum()) {
					LeftPanel.getPlayer4Panel().setBorder(
							LeftPanel.getHighlightTurnBorder());
				} else {
					LeftPanel.getPlayer4Panel().setBorder(null);
				}
				
			}
			
				
		});
		
	}

	/**
	 * This method loads the dice images for the panel
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
	 * This method sets the dice images labels with their default images
	 */
	private void setupLabels() {
		diceImageLabel1 = new JLabel(diceArray[0]);
		diceImageLabel2 = new JLabel(diceArray[0]);
	}

	/**
	 * This method adds the components to the panel
	 */
	private void addComponents() {
		GridBagConstraints c = new GridBagConstraints();

		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.insets = new Insets(5, 10, 10, 10);
		c.weightx = 1;
		c.anchor = GridBagConstraints.NORTHEAST;

		c.gridy = 0;
		add(logTitle, c);

		c.weighty = 1;

		c.gridy = 1;
		add(scrollPane, c);

		c.weighty = 0;

		c.gridy = 2;
		add(diceImageLabel1, c);

		c.gridy = 3;
		add(diceImageLabel2, c);

		c.gridy = 4;
		add(rollDiceButton, c);

		c.gridy = 5;
		add(buildPropertyButton, c);
		
		c.gridy=6;
		add(surrenderButton,c);

		c.gridy = 7;
		add(questionButton,c);
	}

	/**
	 * This method returns the log area on the right panel
	 * @return - log Area
	 */
	public static JTextArea getLogArea() {
		return logArea;
	}

	/**
	 * This method returns the current player
	 * @return - current player
	 */
	public static int getCurrentPlayer() {
		return currentPlayer;
	}

	/**
	 * This method sets the new current player
	 * @param currentPlayer - new current player
	 */
	public static void setCurrentPlayer(int currentPlayer) {
		RightPanel.currentPlayer = currentPlayer;
	}

	/**
	 * This method sends the current player to lecture if they land on the go to lecture space
	 */
	public static void landOnLecture() {
		if (LeftPanel.getPlayer1().getPlayerPos() == 30) {
			Dice.playLectureSound();
			LeftPanel.getPlayer1().setPlayerPos(10);
			MiddlePanel.setPlayerCharLocation(1, 40);
			dice.setPl1InLecture(true);
			JOptionPane.showMessageDialog(null, "Go to Lecture!");
			logArea.append("\nGo to Lecture");
		} else if (LeftPanel.getPlayer2().getPlayerPos() == 30) {
			Dice.playLectureSound();
			LeftPanel.getPlayer2().setPlayerPos(10);
			MiddlePanel.setPlayerCharLocation(2, 40);
			dice.setPl2InLecture(true);
			JOptionPane.showMessageDialog(null, "Go to Lecture!");
			logArea.append("\nGo to Lecture");
		} else if (LeftPanel.getPlayer3().getPlayerPos() == 30) {
			Dice.playLectureSound();
			LeftPanel.getPlayer3().setPlayerPos(10);
			MiddlePanel.setPlayerCharLocation(3, 40);
			dice.setPl3InLecture(true);
			JOptionPane.showMessageDialog(null, "Go to Lecture!");
			logArea.append("\nGo to Lecture");
		} else if (LeftPanel.getPlayer4().getPlayerPos() == 30) {
			Dice.playLectureSound();
			LeftPanel.getPlayer4().setPlayerPos(10);
			MiddlePanel.setPlayerCharLocation(4, 40);
			dice.setPl4InLecture(true);
			JOptionPane.showMessageDialog(null, "Go to Lecture!");
			logArea.append("\nGo to Lecture");
		}
	}
	
	/**
	 * This method keeps the current player value limited to the range of the number of players
	 */
	public static  void checkNextPlayer(){
		
		
	if(LeftPanel.getPlayer1().getPlayerNum() == currentPlayer && 
			LeftPanel.getPlayer1().getSurrender()==true){
		if (currentPlayer < LeftPanel.getTotalPlayers()) {
			currentPlayer=currentPlayer+1;
		} else {
			currentPlayer = 1;
		}
		checkNextPlayer();	
	}
	
	else if (LeftPanel.getPlayer2().getPlayerNum() == currentPlayer&&
			LeftPanel.getPlayer2().getSurrender()==true){
		if (currentPlayer < LeftPanel.getTotalPlayers()) {
			currentPlayer=currentPlayer+1;
		} else {
			currentPlayer = 1;
		}
		checkNextPlayer();
		
	}
	else if(LeftPanel.getPlayer3().getPlayerNum() == currentPlayer && LeftPanel.getPlayer3().getSurrender()==true){
		if (currentPlayer < LeftPanel.getTotalPlayers()) {
			currentPlayer=currentPlayer+1;
		} else {
			currentPlayer = 1;
		}
		checkNextPlayer();
	}
	
	else if(LeftPanel.getPlayer4().getPlayerNum() == currentPlayer && LeftPanel.getPlayer4().getSurrender()==true){
		if (currentPlayer < LeftPanel.getTotalPlayers()) {
			currentPlayer=currentPlayer+1;
		} else {
			currentPlayer = 1;
		}
		checkNextPlayer();
	}
	
	if (currentPlayer == LeftPanel.getPlayer1().getPlayerNum()) {
		LeftPanel.getPlayer1Panel().setBorder(
				LeftPanel.getHighlightTurnBorder());
	} else {
		LeftPanel.getPlayer1Panel().setBorder(null);
	}

	if (currentPlayer == LeftPanel.getPlayer2().getPlayerNum()) {
		LeftPanel.getPlayer2Panel().setBorder(
				LeftPanel.getHighlightTurnBorder());
	} else {
		LeftPanel.getPlayer2Panel().setBorder(null);
	}

	if (currentPlayer == LeftPanel.getPlayer3().getPlayerNum()) {
		LeftPanel.getPlayer3Panel().setBorder(
				LeftPanel.getHighlightTurnBorder());
	} else {
		LeftPanel.getPlayer3Panel().setBorder(null);
	}

	if (currentPlayer == LeftPanel.getPlayer4().getPlayerNum()) {
		LeftPanel.getPlayer4Panel().setBorder(
				LeftPanel.getHighlightTurnBorder());
	} else {
		LeftPanel.getPlayer4Panel().setBorder(null);
	}
	}}