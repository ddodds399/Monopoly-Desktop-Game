package mainGame;

import javax.swing.JOptionPane;

import mainWindow.LeftPanel;
import mainWindow.RightPanel;

/**
 * This class is used to collect the pool of rent/loan money that has been collected for the
 * duration of the game when a player lands on the PEC parking space
 * 
 * @author Brogrammers
 */
public class PECParking {

	/**
	 * This method adds the rent/loan money to the player's money who lands on the PEC parking space.
	 * The parking pool money is reset to 0 when the money is collected.
	 */
	public static void collectParkingPoolMoney() {
		
		if((LeftPanel.getPlayer1().getPlayerNum() == RightPanel.getCurrentPlayer()) &&
				(LeftPanel.getPlayer1().getPlayerPos() == PropertySetup.getParking().getPropPos()))
		{
			if(RentAndLoans.getParkingPoolMoney()>0)
			{
				LeftPanel.getPlayer1().setPlayerMoney(LeftPanel.getPlayer1().getPlayerMoney()+RentAndLoans.getParkingPoolMoney());
				LeftPanel.getPlayer1Label().setText(LeftPanel.getPlayer1().getPlayerName() + " £"
								+ LeftPanel.getPlayer1().getPlayerMoney());
				JOptionPane.showMessageDialog(null, "Collected £"+RentAndLoans.getParkingPoolMoney());
				RentAndLoans.setParkingPoolMoney(0);
			}
		}
		
		if((LeftPanel.getPlayer2().getPlayerNum() == RightPanel.getCurrentPlayer()) &&
				(LeftPanel.getPlayer2().getPlayerPos() == PropertySetup.getParking().getPropPos()))
		{
			if(RentAndLoans.getParkingPoolMoney()>0)
			{
				LeftPanel.getPlayer2().setPlayerMoney(LeftPanel.getPlayer2().getPlayerMoney()+RentAndLoans.getParkingPoolMoney());
				LeftPanel.getPlayer2Label().setText(LeftPanel.getPlayer2().getPlayerName() + " £"
								+ LeftPanel.getPlayer2().getPlayerMoney());
				JOptionPane.showMessageDialog(null, "Collected £"+RentAndLoans.getParkingPoolMoney());
				RentAndLoans.setParkingPoolMoney(0);
			}
		}
		
		if((LeftPanel.getPlayer3().getPlayerNum() == RightPanel.getCurrentPlayer()) &&
				(LeftPanel.getPlayer3().getPlayerPos() == PropertySetup.getParking().getPropPos()))
		{
			if(RentAndLoans.getParkingPoolMoney()>0)
			{
				LeftPanel.getPlayer3().setPlayerMoney(LeftPanel.getPlayer3().getPlayerMoney()+RentAndLoans.getParkingPoolMoney());
				LeftPanel.getPlayer3Label().setText(LeftPanel.getPlayer3().getPlayerName() + " £"
								+ LeftPanel.getPlayer3().getPlayerMoney());
				JOptionPane.showMessageDialog(null, "Collected £"+RentAndLoans.getParkingPoolMoney());
				RentAndLoans.setParkingPoolMoney(0);
			}
		}
		
		if((LeftPanel.getPlayer4().getPlayerNum() == RightPanel.getCurrentPlayer()) &&
				(LeftPanel.getPlayer4().getPlayerPos() == PropertySetup.getParking().getPropPos()))
		{
			if(RentAndLoans.getParkingPoolMoney()>0)
			{
				LeftPanel.getPlayer4().setPlayerMoney(LeftPanel.getPlayer4().getPlayerMoney()+RentAndLoans.getParkingPoolMoney());
				LeftPanel.getPlayer4Label().setText(LeftPanel.getPlayer4().getPlayerName() + " £"
								+ LeftPanel.getPlayer4().getPlayerMoney());
				JOptionPane.showMessageDialog(null, "Collected £"+RentAndLoans.getParkingPoolMoney());
				RentAndLoans.setParkingPoolMoney(0);
			}
		}
	}
}
