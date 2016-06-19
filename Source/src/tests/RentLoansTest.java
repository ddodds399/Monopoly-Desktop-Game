package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import mainGame.RentAndLoans;
import mainWindow.LeftPanel;
import mainWindow.RightPanel;

import org.junit.Before;
import org.junit.Test;

/**
 * This class is used to test the rent and loans class
 * 
 * @author Brogrammers
 */
public class RentLoansTest {
	private ArrayList<String> players;
	LeftPanel leftPanel;
	RightPanel rightPanel;
	
	@Before
	public void setup() {
		players = new ArrayList<String>();
		players.add("player1");
		players.add("player2");
		players.add("player3");
		players.add("player4");
		leftPanel = new LeftPanel(players);
		rightPanel = new RightPanel();
	}
	
	@Test
	public void testSetPoolMoney() {
		RentAndLoans.setParkingPoolMoney(0);
		assertEquals(0, RentAndLoans.getParkingPoolMoney());
		RentAndLoans.setParkingPoolMoney(100);
		assertEquals(100, RentAndLoans.getParkingPoolMoney());
	}
	
	@Test
	public void testPayRent() {
		RentAndLoans.setParkingPoolMoney(0);
		int monthlyRentPos=4;
		RightPanel.setCurrentPlayer(1);
		assertEquals(0,RentAndLoans.getParkingPoolMoney());
		assertEquals(1000,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RentAndLoans.payRent();
		assertEquals(0,RentAndLoans.getParkingPoolMoney());
		assertEquals(1000,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		LeftPanel.getPlayer1().setPlayerPos(monthlyRentPos);
		RentAndLoans.payRent();
		assertEquals(200,RentAndLoans.getParkingPoolMoney());
		assertEquals(800,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		LeftPanel.getPlayer2().setPlayerPos(monthlyRentPos);
		RentAndLoans.payRent();
		assertEquals(400,RentAndLoans.getParkingPoolMoney());
		assertEquals(600,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(2);
		RentAndLoans.payRent();
		assertEquals(600,RentAndLoans.getParkingPoolMoney());
		assertEquals(600,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(800,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(3);
		LeftPanel.getPlayer3().setPlayerPos(monthlyRentPos);
		RentAndLoans.payRent();
		assertEquals(800,RentAndLoans.getParkingPoolMoney());
		assertEquals(600,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(800,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(800,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(4);
		LeftPanel.getPlayer4().setPlayerPos(monthlyRentPos);
		RentAndLoans.payRent();
		assertEquals(1000,RentAndLoans.getParkingPoolMoney());
		assertEquals(600,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(800,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(800,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(800,LeftPanel.getPlayer4().getPlayerMoney());
	}
	
	@Test
	public void testPayLoan() {
		RentAndLoans.setParkingPoolMoney(0);
		int loanPos=38;
		RightPanel.setCurrentPlayer(1);
		assertEquals(0,RentAndLoans.getParkingPoolMoney());
		assertEquals(1000,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RentAndLoans.payLoan();
		assertEquals(0,RentAndLoans.getParkingPoolMoney());
		assertEquals(1000,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		LeftPanel.getPlayer1().setPlayerPos(loanPos);
		RentAndLoans.payLoan();
		assertEquals(100,RentAndLoans.getParkingPoolMoney());
		assertEquals(900,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(2);
		LeftPanel.getPlayer2().setPlayerPos(loanPos);
		RentAndLoans.payLoan();
		assertEquals(200,RentAndLoans.getParkingPoolMoney());
		assertEquals(900,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(900,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(3);
		LeftPanel.getPlayer3().setPlayerPos(loanPos);
		RentAndLoans.payLoan();
		assertEquals(300,RentAndLoans.getParkingPoolMoney());
		assertEquals(900,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(900,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(900,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(4);
		LeftPanel.getPlayer4().setPlayerPos(loanPos);
		RentAndLoans.payLoan();
		assertEquals(400,RentAndLoans.getParkingPoolMoney());
		assertEquals(900,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(900,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(900,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(900,LeftPanel.getPlayer4().getPlayerMoney());
	}
}