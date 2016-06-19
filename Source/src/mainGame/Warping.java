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
 * This class to used for the warp spaces on the board to warp to a random location on the board
 * @author Brogrammers
 *
 */
public class Warping {
	
	/**
	 * This method warps the current player to a random location on the board, ensuring that they
	 * don't land on another warp location. It also lets the player buy, rent, ride trains etc
	 * depending on where they land
	 */
	public static void warp()
	{
		Random randomNumber = new Random();
		int randomPos = randomNumber.nextInt(40);
		
		if((randomPos == 7)||(randomPos == 22) || (randomPos == 36))
		{
			warp();
		}
		
		if((LeftPanel.getPlayer1().getPlayerNum() == RightPanel.getCurrentPlayer()) &&
				(LeftPanel.getPlayer1().getPlayerPos() == PropertySetup.getWarp().getPropPos() ||
				LeftPanel.getPlayer1().getPlayerPos() == PropertySetup.getWarp2().getPropPos() ||
				LeftPanel.getPlayer1().getPlayerPos() == PropertySetup.getWarp3().getPropPos()))
		{
			LeftPanel.getPlayer1().setPlayerPos(randomPos);
			MiddlePanel.setPlayerCharLocation(1, LeftPanel.getPlayer1().getPlayerPos());
			playWarpSound();
			JOptionPane.showMessageDialog(null, LeftPanel.getPlayer1().getPlayerName()+" has warped to "+PropertySetup.getProps().get(LeftPanel.getPlayer1().getPlayerPos()).getPropertyName());
			RightPanel.getLogArea().append("\n"+LeftPanel.getPlayer1().getPlayerName()+ " has warped to "+PropertySetup.getProps().get(LeftPanel.getPlayer1().getPlayerPos()).getPropertyName());
			PropertySetup.buyProperty();
			PropertySetup.rent();
			RightPanel.landOnLecture();
			RideTrain.rideTrain();
			RentAndLoans.payLoan();
			RentAndLoans.payRent();
			PECParking.collectParkingPoolMoney();
			ShotCards.selectCard();
		}
		
		if((LeftPanel.getPlayer2().getPlayerNum() == RightPanel.getCurrentPlayer()) &&
				(LeftPanel.getPlayer2().getPlayerPos() == PropertySetup.getWarp().getPropPos() ||
				LeftPanel.getPlayer2().getPlayerPos() == PropertySetup.getWarp2().getPropPos() ||
				LeftPanel.getPlayer2().getPlayerPos() == PropertySetup.getWarp3().getPropPos()))
		{
			LeftPanel.getPlayer2().setPlayerPos(randomPos);
			MiddlePanel.setPlayerCharLocation(2, LeftPanel.getPlayer2().getPlayerPos());
			playWarpSound();
			JOptionPane.showMessageDialog(null, LeftPanel.getPlayer2().getPlayerName()+" has warped to "+PropertySetup.getProps().get(LeftPanel.getPlayer2().getPlayerPos()).getPropertyName());
			RightPanel.getLogArea().append("\n"+LeftPanel.getPlayer2().getPlayerName()+ " has warped to "+PropertySetup.getProps().get(LeftPanel.getPlayer2().getPlayerPos()).getPropertyName());
			PropertySetup.buyProperty();
			PropertySetup.rent();
			RightPanel.landOnLecture();
			RideTrain.rideTrain();
			RentAndLoans.payLoan();
			RentAndLoans.payRent();
			PECParking.collectParkingPoolMoney();
			ShotCards.selectCard();
		}
		
		if((LeftPanel.getPlayer3().getPlayerNum() == RightPanel.getCurrentPlayer()) &&
				(LeftPanel.getPlayer3().getPlayerPos() == PropertySetup.getWarp().getPropPos() ||
				LeftPanel.getPlayer3().getPlayerPos() == PropertySetup.getWarp2().getPropPos() ||
				LeftPanel.getPlayer3().getPlayerPos() == PropertySetup.getWarp3().getPropPos()))
		{
			LeftPanel.getPlayer3().setPlayerPos(randomPos);
			MiddlePanel.setPlayerCharLocation(3, LeftPanel.getPlayer3().getPlayerPos());
			playWarpSound();
			JOptionPane.showMessageDialog(null, LeftPanel.getPlayer3().getPlayerName()+" has warped to "+PropertySetup.getProps().get(LeftPanel.getPlayer3().getPlayerPos()).getPropertyName());
			RightPanel.getLogArea().append("\n"+LeftPanel.getPlayer3().getPlayerName()+ " has warped to "+PropertySetup.getProps().get(LeftPanel.getPlayer3().getPlayerPos()).getPropertyName());
			PropertySetup.buyProperty();
			PropertySetup.rent();
			RightPanel.landOnLecture();
			RideTrain.rideTrain();
			RentAndLoans.payLoan();
			RentAndLoans.payRent();
			PECParking.collectParkingPoolMoney();
			ShotCards.selectCard();
		}
		
		if((LeftPanel.getPlayer4().getPlayerNum() == RightPanel.getCurrentPlayer()) &&
				(LeftPanel.getPlayer4().getPlayerPos() == PropertySetup.getWarp().getPropPos() ||
				LeftPanel.getPlayer4().getPlayerPos() == PropertySetup.getWarp2().getPropPos() ||
				LeftPanel.getPlayer4().getPlayerPos() == PropertySetup.getWarp3().getPropPos()))
		{
			LeftPanel.getPlayer4().setPlayerPos(randomPos);
			MiddlePanel.setPlayerCharLocation(4, LeftPanel.getPlayer4().getPlayerPos());
			playWarpSound();
			JOptionPane.showMessageDialog(null, LeftPanel.getPlayer4().getPlayerName()+" has warped to "+PropertySetup.getProps().get(LeftPanel.getPlayer4().getPlayerPos()).getPropertyName());
			RightPanel.getLogArea().append("\n"+LeftPanel.getPlayer4().getPlayerName()+ " has warped to "+PropertySetup.getProps().get(LeftPanel.getPlayer4().getPlayerPos()).getPropertyName());
			PropertySetup.buyProperty();
			PropertySetup.rent();
			RightPanel.landOnLecture();
			RideTrain.rideTrain();
			RentAndLoans.payLoan();
			RentAndLoans.payRent();
			PECParking.collectParkingPoolMoney();
			ShotCards.selectCard();
		}
	}

	/**
	 * This method plays a sound effect for the warp space
	 */
	public static void playWarpSound()
	 {
		Clip clip;
		try 
		{
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("audio/Warp.wav").getAbsoluteFile( ));
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
	
	/**
	 * This method is for test purposes only
	 */
	public static void testWarp()
	{
		Random randomNumber = new Random();
		int randomPos = randomNumber.nextInt(40);
		
		if((randomPos == 7)||(randomPos == 22) || (randomPos == 36))
		{
			testWarp();
		}
		
		if((LeftPanel.getPlayer1().getPlayerNum() == RightPanel.getCurrentPlayer()) &&
				(LeftPanel.getPlayer1().getPlayerPos() == PropertySetup.getWarp().getPropPos() ||
				LeftPanel.getPlayer1().getPlayerPos() == PropertySetup.getWarp2().getPropPos() ||
				LeftPanel.getPlayer1().getPlayerPos() == PropertySetup.getWarp3().getPropPos()))
		{
			LeftPanel.getPlayer1().setPlayerPos(randomPos);
			playWarpSound();
		}
		
		if((LeftPanel.getPlayer2().getPlayerNum() == RightPanel.getCurrentPlayer()) &&
				(LeftPanel.getPlayer2().getPlayerPos() == PropertySetup.getWarp().getPropPos() ||
				LeftPanel.getPlayer2().getPlayerPos() == PropertySetup.getWarp2().getPropPos() ||
				LeftPanel.getPlayer2().getPlayerPos() == PropertySetup.getWarp3().getPropPos()))
		{
			LeftPanel.getPlayer2().setPlayerPos(randomPos);
			playWarpSound();
		}
		
		if((LeftPanel.getPlayer3().getPlayerNum() == RightPanel.getCurrentPlayer()) &&
				(LeftPanel.getPlayer3().getPlayerPos() == PropertySetup.getWarp().getPropPos() ||
				LeftPanel.getPlayer3().getPlayerPos() == PropertySetup.getWarp2().getPropPos() ||
				LeftPanel.getPlayer3().getPlayerPos() == PropertySetup.getWarp3().getPropPos()))
		{
			LeftPanel.getPlayer3().setPlayerPos(randomPos);
			playWarpSound();
		}
		
		if((LeftPanel.getPlayer4().getPlayerNum() == RightPanel.getCurrentPlayer()) &&
				(LeftPanel.getPlayer4().getPlayerPos() == PropertySetup.getWarp().getPropPos() ||
				LeftPanel.getPlayer4().getPlayerPos() == PropertySetup.getWarp2().getPropPos() ||
				LeftPanel.getPlayer4().getPlayerPos() == PropertySetup.getWarp3().getPropPos()))
		{
			LeftPanel.getPlayer4().setPlayerPos(randomPos);
			playWarpSound();
		}
	}
}
