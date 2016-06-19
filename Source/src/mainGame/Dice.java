package mainGame;

import java.io.File;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

import mainWindow.LeftPanel;
import mainWindow.MiddlePanel;
import mainWindow.RightPanel;

/**
 * This class is used for the dice in the game. It can check for doubles and check if players
 * are in jail/lecture
 *
 * @author Brogrammers
 */
public class Dice {

	private static int diceOne;
	private static int diceTwo;
	private int numOfRolls = 0;
	private boolean pl1InLecture = false;
	private boolean pl2InLecture = false;
	private boolean pl3InLecture = false;
	private boolean pl4InLecture = false;

	/**
	 * This constructor creates a dice object
	 */
	public Dice() {

	}

	/**
	 * This method 'throws' the dice by generating a random number for both dice and returns
	 * both values
	 * @return - both values of diceOne and diceTwo
	 */
	public int throwDice() {
		Random random = new Random();
		int Low = 1;
		int High = 6;
		diceOne = random.nextInt(High) + Low;
		diceTwo = random.nextInt(High) + Low;
		// System.out.println(diceOne+diceTwo + " diceOne: " + diceOne +
		// " diceTwo: " + diceTwo);
		// checkDoubles();
		return diceOne + diceTwo;
	}

	/**
	 * This method gets diceOne
	 * @return - The value of diceOne
	 */
	public static int getDiceOne() {
		return diceOne;
	}

	/**
	 * This method gets diceTwo
	 * @return - the value of diceTwo
	 */
	public static int getDiceTwo() {
		return diceTwo;
	}

	/**
	 * This method sets the values of both diceOne and diceTwo
	 * @param dice1 - the new value of diceOne
	 * @param dice2 - the new value of diceTwo
	 */
	public void setDice(int dice1, int dice2) {
		diceOne = dice1;
		diceTwo = dice2;
	}

	/**
	 * This method checks if diceOne is equal to diceTwo and if it is, lets the current player
	 * be able to roll again. If the number of rolls for a player is equal to 3, then the player
	 * goes to lecture
	 * @return - True or false if doubles is achieved
	 */
	public boolean checkDoubles() {
		if (diceOne == diceTwo) {
			// System.out.println("Doubles ... Roll Again");
			numOfRolls++;
			if (numOfRolls == 3) {
				playLectureSound();
				if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
						.getCurrentPlayer() && pl1InLecture == false) {
					LeftPanel.getPlayer1().setPlayerPos(10);
					MiddlePanel.setPlayerCharLocation(1, 40);
					JOptionPane.showMessageDialog(null, "Go to Lecture");
					pl1InLecture = true;

				} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
						.getCurrentPlayer() && pl2InLecture == false) {
					LeftPanel.getPlayer2().setPlayerPos(10);
					MiddlePanel.setPlayerCharLocation(2, 40);
					JOptionPane.showMessageDialog(null, "Go to Lecture");
					pl2InLecture = true;
				} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
						.getCurrentPlayer() && pl3InLecture == false) {
					LeftPanel.getPlayer3().setPlayerPos(10);
					MiddlePanel.setPlayerCharLocation(3, 40);
					JOptionPane.showMessageDialog(null, "Go to Lecture");
					pl3InLecture = true;

				} else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
						.getCurrentPlayer() && pl4InLecture == false) {
					LeftPanel.getPlayer4().setPlayerPos(10);
					MiddlePanel.setPlayerCharLocation(4, 40);
					JOptionPane.showMessageDialog(null, "Go to Lecture");
					pl4InLecture = true;
				}

			}
			return true;
		}

		else {
			numOfRolls = 0;
			return false;
		}
	}

	/**
	 * This method returns true or false depending on whether player 1 is in lecture or not
	 * @return - pl1InLecture value
	 */
	public boolean isPl1InLecture() {
		return pl1InLecture;
	}

	/**
	 * This method sets a true or false value for player 1 being in lecture or not
	 * @param pl1InLecture - true or false
	 */
	public void setPl1InLecture(boolean pl1InLecture) {
		this.pl1InLecture = pl1InLecture;
	}

	/**
	 * This method returns true or false depending on whether player 2 is in lecture or not
	 * @return - pl2InLecture value
	 */
	public boolean isPl2InLecture() {
		return pl2InLecture;
	}

	/**
	 * This method sets a true or false value for player 2 being in lecture or not
	 * @param pl2InLecture - true or false
	 */
	public void setPl2InLecture(boolean pl2InLecture) {
		this.pl2InLecture = pl2InLecture;
	}

	/**
	 * This method returns true or false depending on whether player 3 is in lecture or not
	 * @return - pl3InLecture value
	 */
	public boolean isPl3InLecture() {
		return pl3InLecture;
	}

	/**
	 * This method sets a true or false value for player 3 being in lecture or not
	 * @param pl3InLecture - true or false
	 */
	public void setPl3InLecture(boolean pl3InLecture) {
		this.pl3InLecture = pl3InLecture;
	}

	/**
	 * This method returns true or false depending on whether player 4 is in lecture or not
	 * @return - pl4InLecture value
	 */
	public boolean isPl4InLecture() {
		return pl4InLecture;
	}

	/**
	 * This method sets a true or false value for player 4 being in lecture or not
	 * @param pl4InLecture - true or false
	 */
	public void setPl4InLecture(boolean pl4InJail) {
		this.pl4InLecture = pl4InJail;
	}

	/**
	 * This method returns the number of rolls
	 * @return - number of rolls
	 */
	public int getNumOfRolls() {
		return numOfRolls;
	}
	
	/**
	 * This method plays a sound effect for going to a lecture
	 */
	public static void playLectureSound()
	 {
		Clip clip;
		try 
		{
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("audio/Lecture.wav").getAbsoluteFile( ));
			clip = AudioSystem.getClip( );
			clip.open(audioInputStream);
			clip.start();
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "Error with playing sound.");
			ex.printStackTrace( );
		}
	 }
}