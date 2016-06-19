package mainGame;

import javax.swing.JOptionPane;

import mainWindow.LeftPanel;
import mainWindow.RightPanel;

/**
 * This class is used to pay the rent/loan if a player lands on either space
 * 
 * @author Brogrammers
 */
public class RentAndLoans {

	// the rent/loan money to be added to the pool of money for PEC parking
	static int parkingPoolMoney = 0;
	
	/**
	 * This method returns the parking pool money
	 * @return - parkingPoolMoney
	 */
	public static int getParkingPoolMoney() {
		return parkingPoolMoney;
	}
	
	/**
	 * This method sets a new value for the parking pool money
	 * @param newMoney - new parking pool money value
	 */
	public static void setParkingPoolMoney(int newMoney) {
		parkingPoolMoney = newMoney;
	}
	
	/**
	 * This method is used to pay rent when a player lands on the rent space. The rent value is
	 * taken away from the player money and added to the parking pool money
	 */
	public static void payRent()
	{
		
		if((LeftPanel.getPlayer1().getPlayerNum() == RightPanel.getCurrentPlayer()) &&
				(LeftPanel.getPlayer1().getPlayerPos() == PropertySetup.getMonthlyRent().getPropPos()))
		{
			LeftPanel.getPlayer1().setPlayerMoney(LeftPanel.getPlayer1().getPlayerMoney()-200);
			LeftPanel.getPlayer1Label().setText(LeftPanel.getPlayer1().getPlayerName() + " £"
					+ LeftPanel.getPlayer1().getPlayerMoney());
			parkingPoolMoney +=200;
			JOptionPane.showMessageDialog(null, "Paid £200 rent to live in your house");
		}
		
		if((LeftPanel.getPlayer2().getPlayerNum() == RightPanel.getCurrentPlayer()) &&
				(LeftPanel.getPlayer2().getPlayerPos() == PropertySetup.getMonthlyRent().getPropPos()))
		{
			LeftPanel.getPlayer2().setPlayerMoney(LeftPanel.getPlayer2().getPlayerMoney()-200);
			LeftPanel.getPlayer2Label().setText(LeftPanel.getPlayer2().getPlayerName() + " £"
					+ LeftPanel.getPlayer2().getPlayerMoney());
			parkingPoolMoney +=200;
			JOptionPane.showMessageDialog(null, "Paid £200 rent to live in your house");
		}
		
		if((LeftPanel.getPlayer3().getPlayerNum() == RightPanel.getCurrentPlayer()) &&
				(LeftPanel.getPlayer3().getPlayerPos() == PropertySetup.getMonthlyRent().getPropPos()))
		{
			LeftPanel.getPlayer3().setPlayerMoney(LeftPanel.getPlayer3().getPlayerMoney()-200);
			LeftPanel.getPlayer3Label().setText(LeftPanel.getPlayer3().getPlayerName() + " £"
					+ LeftPanel.getPlayer3().getPlayerMoney());
			parkingPoolMoney +=200;
			JOptionPane.showMessageDialog(null, "Paid £200 rent to live in your house");
		}
		
		if((LeftPanel.getPlayer4().getPlayerNum() == RightPanel.getCurrentPlayer()) &&
				(LeftPanel.getPlayer4().getPlayerPos() == PropertySetup.getMonthlyRent().getPropPos()))
		{
			LeftPanel.getPlayer4().setPlayerMoney(LeftPanel.getPlayer4().getPlayerMoney()-200);
			LeftPanel.getPlayer4Label().setText(LeftPanel.getPlayer4().getPlayerName() + " £"
					+ LeftPanel.getPlayer4().getPlayerMoney());
			parkingPoolMoney +=200;
			JOptionPane.showMessageDialog(null, "Paid £200 rent to live in your house");
		}
	}
	
	/**
	 * This method is used to pay loans if a player lands on the loan space. The loan value is
	 * taken away from the player money and added to the parking pool money
	 */
	public static void payLoan()
	{
		
		if((LeftPanel.getPlayer1().getPlayerNum() == RightPanel.getCurrentPlayer()) &&
				(LeftPanel.getPlayer1().getPlayerPos() == PropertySetup.getLoan().getPropPos()))
		{
			LeftPanel.getPlayer1().setPlayerMoney(LeftPanel.getPlayer1().getPlayerMoney()-100);
			LeftPanel.getPlayer1Label().setText(LeftPanel.getPlayer1().getPlayerName() + " £"
					+ LeftPanel.getPlayer1().getPlayerMoney());
			parkingPoolMoney +=100;
			JOptionPane.showMessageDialog(null, "Paid £100 back to Student Finance");
		}
		
		if((LeftPanel.getPlayer2().getPlayerNum() == RightPanel.getCurrentPlayer()) &&
				(LeftPanel.getPlayer2().getPlayerPos() == PropertySetup.getLoan().getPropPos()))
		{
			LeftPanel.getPlayer2().setPlayerMoney(LeftPanel.getPlayer2().getPlayerMoney()-100);
			LeftPanel.getPlayer2Label().setText(LeftPanel.getPlayer2().getPlayerName() + " £"
					+ LeftPanel.getPlayer2().getPlayerMoney());
			parkingPoolMoney +=100;
			JOptionPane.showMessageDialog(null, "Paid £100 back to Student Finance");
		}
		
		if((LeftPanel.getPlayer3().getPlayerNum() == RightPanel.getCurrentPlayer()) &&
				(LeftPanel.getPlayer3().getPlayerPos() == PropertySetup.getLoan().getPropPos()))
		{
			LeftPanel.getPlayer3().setPlayerMoney(LeftPanel.getPlayer3().getPlayerMoney()-100);
			LeftPanel.getPlayer3Label().setText(LeftPanel.getPlayer3().getPlayerName() + " £"
					+ LeftPanel.getPlayer3().getPlayerMoney());
			parkingPoolMoney +=100;
			JOptionPane.showMessageDialog(null, "Paid £100 back to Student Finance");
		}
		
		if((LeftPanel.getPlayer4().getPlayerNum() == RightPanel.getCurrentPlayer()) &&
				(LeftPanel.getPlayer4().getPlayerPos() == PropertySetup.getLoan().getPropPos()))
		{
			LeftPanel.getPlayer4().setPlayerMoney(LeftPanel.getPlayer4().getPlayerMoney()-100);
			LeftPanel.getPlayer4Label().setText(LeftPanel.getPlayer4().getPlayerName() + " £"
					+ LeftPanel.getPlayer4().getPlayerMoney());
			parkingPoolMoney +=100;
			JOptionPane.showMessageDialog(null, "Paid £100 back to Student Finance");
		}
	}
}