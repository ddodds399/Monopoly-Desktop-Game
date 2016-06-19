package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;



import mainGame.PropertySetup;
import mainGame.ShotCards;
import mainWindow.LeftPanel;
import mainWindow.RightPanel;

import org.junit.Before;
import org.junit.Test;

/**
 * This class is used to test the shot card class. The reason for the test advance methods is
 * because of the middle panel throwing up null pointer exceptions for moving the player images.
 * The test methods are exactly the same as the normal method except with no reference to the 
 * middle panel
 * 
 * @author Brogrammers
 */
public class ShotCardTest {
	
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
	public void testBoojum() {
		int boojumPos = 21;
		RightPanel.setCurrentPlayer(1);
		assertEquals(0,LeftPanel.getPlayer1().getPlayerPos());
		assertEquals(0,LeftPanel.getPlayer2().getPlayerPos());
		assertEquals(0,LeftPanel.getPlayer3().getPlayerPos());
		assertEquals(0,LeftPanel.getPlayer4().getPlayerPos());
		ShotCards.testAdvanceBoojum();
		assertEquals(boojumPos,LeftPanel.getPlayer1().getPlayerPos());
		assertEquals(0,LeftPanel.getPlayer2().getPlayerPos());
		assertEquals(0,LeftPanel.getPlayer3().getPlayerPos());
		assertEquals(0,LeftPanel.getPlayer4().getPlayerPos());
		RightPanel.setCurrentPlayer(2);
		ShotCards.testAdvanceBoojum();
		assertEquals(boojumPos,LeftPanel.getPlayer1().getPlayerPos());
		assertEquals(boojumPos,LeftPanel.getPlayer2().getPlayerPos());
		assertEquals(0,LeftPanel.getPlayer3().getPlayerPos());
		assertEquals(0,LeftPanel.getPlayer4().getPlayerPos());
		LeftPanel.getPlayer1().setPlayerPos(0);
		RightPanel.setCurrentPlayer(3);
		ShotCards.testAdvanceBoojum();
		assertEquals(0,LeftPanel.getPlayer1().getPlayerPos());
		assertEquals(boojumPos,LeftPanel.getPlayer2().getPlayerPos());
		assertEquals(boojumPos,LeftPanel.getPlayer3().getPlayerPos());
		assertEquals(0,LeftPanel.getPlayer4().getPlayerPos());
		RightPanel.setCurrentPlayer(4);
		ShotCards.testAdvanceBoojum();
		assertEquals(0,LeftPanel.getPlayer1().getPlayerPos());
		assertEquals(boojumPos,LeftPanel.getPlayer2().getPlayerPos());
		assertEquals(boojumPos,LeftPanel.getPlayer3().getPlayerPos());
		assertEquals(boojumPos,LeftPanel.getPlayer4().getPlayerPos());	
	}
	
	@Test
	public void testAdvanceGo() {
		int goPos = PropertySetup.getGo().getPropPos();
		assertEquals(0,goPos);
		
		RightPanel.setCurrentPlayer(1);
		LeftPanel.getPlayer1().setPlayerPos(10);
		assertEquals(10,LeftPanel.getPlayer1().getPlayerPos());
		ShotCards.testAdvanceGo();
		assertEquals(goPos,LeftPanel.getPlayer1().getPlayerPos());
		
		RightPanel.setCurrentPlayer(2);
		LeftPanel.getPlayer1().setPlayerPos(17);
		assertEquals(17,LeftPanel.getPlayer1().getPlayerPos());
		ShotCards.testAdvanceGo();
		assertEquals(goPos,LeftPanel.getPlayer2().getPlayerPos());
		
		RightPanel.setCurrentPlayer(3);
		LeftPanel.getPlayer1().setPlayerPos(20);
		assertEquals(20,LeftPanel.getPlayer1().getPlayerPos());
		ShotCards.testAdvanceGo();
		assertEquals(goPos,LeftPanel.getPlayer3().getPlayerPos());
		
		RightPanel.setCurrentPlayer(4);
		LeftPanel.getPlayer1().setPlayerPos(34);
		assertEquals(34,LeftPanel.getPlayer1().getPlayerPos());
		ShotCards.testAdvanceGo();
		assertEquals(goPos,LeftPanel.getPlayer4().getPlayerPos());

	}
	
	@Test
	public void testAdvanceBotanic() {
		int botPos = PropertySetup.getBotanicTrain().getPropPos();
		assertEquals(25, botPos);
		
		RightPanel.setCurrentPlayer(1);
		assertEquals(0,LeftPanel.getPlayer1().getPlayerPos());
		ShotCards.testAdvanceBotanic();
		assertEquals(botPos,LeftPanel.getPlayer1().getPlayerPos());
		
		RightPanel.setCurrentPlayer(2);
		assertEquals(0,LeftPanel.getPlayer2().getPlayerPos());
		ShotCards.testAdvanceBotanic();
		assertEquals(botPos,LeftPanel.getPlayer2().getPlayerPos());
		
		RightPanel.setCurrentPlayer(3);
		assertEquals(0,LeftPanel.getPlayer3().getPlayerPos());
		ShotCards.testAdvanceBotanic();
		assertEquals(botPos,LeftPanel.getPlayer3().getPlayerPos());
		
		RightPanel.setCurrentPlayer(4);
		assertEquals(0,LeftPanel.getPlayer4().getPlayerPos());
		ShotCards.testAdvanceBotanic();
		assertEquals(botPos,LeftPanel.getPlayer4().getPlayerPos());
	}

	@Test
	public void testAdvanceLanyon() {
		int lanyonPos = PropertySetup.getLanyonBuilding().getPropPos();
		assertEquals(39, lanyonPos);
		RightPanel.setCurrentPlayer(1);
		assertEquals(0,LeftPanel.getPlayer1().getPlayerPos());
		ShotCards.testAdvanceLanyon();
		assertEquals(lanyonPos,LeftPanel.getPlayer1().getPlayerPos());
		
		RightPanel.setCurrentPlayer(2);
		assertEquals(0,LeftPanel.getPlayer2().getPlayerPos());
		ShotCards.testAdvanceLanyon();
		assertEquals(lanyonPos,LeftPanel.getPlayer2().getPlayerPos());
		
		RightPanel.setCurrentPlayer(3);
		assertEquals(0,LeftPanel.getPlayer3().getPlayerPos());
		ShotCards.testAdvanceLanyon();
		assertEquals(lanyonPos,LeftPanel.getPlayer3().getPlayerPos());
		
		RightPanel.setCurrentPlayer(4);
		assertEquals(0,LeftPanel.getPlayer4().getPlayerPos());
		ShotCards.testAdvanceLanyon();
		assertEquals(lanyonPos,LeftPanel.getPlayer4().getPlayerPos());
	}
	
	@Test
	public void testAdvanceJail(){
		int jailPos = PropertySetup.getGotoLecture().getPropPos();
		assertEquals(30,jailPos);
		
		RightPanel.setCurrentPlayer(1);
		assertEquals(0,LeftPanel.getPlayer1().getPlayerPos());
		ShotCards.testAdvanceJail();
		assertEquals(jailPos,LeftPanel.getPlayer1().getPlayerPos());
		
		RightPanel.setCurrentPlayer(2);
		assertEquals(0,LeftPanel.getPlayer2().getPlayerPos());
		ShotCards.testAdvanceJail();
		assertEquals(jailPos,LeftPanel.getPlayer2().getPlayerPos());
		
		RightPanel.setCurrentPlayer(3);
		assertEquals(0,LeftPanel.getPlayer3().getPlayerPos());
		ShotCards.testAdvanceJail();
		assertEquals(jailPos,LeftPanel.getPlayer3().getPlayerPos());
		
		RightPanel.setCurrentPlayer(4);
		assertEquals(0,LeftPanel.getPlayer4().getPlayerPos());
		ShotCards.testAdvanceJail();
		assertEquals(jailPos,LeftPanel.getPlayer4().getPlayerPos());
	}
	
	@Test
	public void testBackThreeSpaces() {
		int back3fromGo = PropertySetup.getBotanicGardens().getPropPos();
		assertEquals(37, back3fromGo);
		
		RightPanel.setCurrentPlayer(1);
		assertEquals(0,LeftPanel.getPlayer1().getPlayerPos());
		ShotCards.testBackThreeSpaces();
		assertEquals(back3fromGo, LeftPanel.getPlayer1().getPlayerPos());
		
		RightPanel.setCurrentPlayer(2);
		assertEquals(0,LeftPanel.getPlayer2().getPlayerPos());
		ShotCards.testBackThreeSpaces();
		assertEquals(back3fromGo,LeftPanel.getPlayer2().getPlayerPos());
		
		RightPanel.setCurrentPlayer(3);
		assertEquals(0,LeftPanel.getPlayer3().getPlayerPos());
		ShotCards.testBackThreeSpaces();
		assertEquals(back3fromGo,LeftPanel.getPlayer3().getPlayerPos());
		
		RightPanel.setCurrentPlayer(4);
		assertEquals(0,LeftPanel.getPlayer4().getPlayerPos());
		ShotCards.testBackThreeSpaces();
		assertEquals(back3fromGo,LeftPanel.getPlayer4().getPlayerPos());
	}
	
	@Test
	public void testCollectBursary() {
		RightPanel.setCurrentPlayer(1);
		assertEquals(1000,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		ShotCards.collectBursary();
		assertEquals(1100,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(2);
		ShotCards.collectBursary();
		assertEquals(1100,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1100,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(3);
		ShotCards.collectBursary();
		assertEquals(1100,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1100,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1100,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(4);
		ShotCards.collectBursary();
		assertEquals(1100,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1100,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1100,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1100,LeftPanel.getPlayer4().getPlayerMoney());
	}
	
	@Test
	public void testCollectPlacement() {
		RightPanel.setCurrentPlayer(1);
		assertEquals(1000,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		ShotCards.collectPlacement();
		assertEquals(1400,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(2);
		ShotCards.collectPlacement();
		assertEquals(1400,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1400,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(3);
		ShotCards.collectPlacement();
		assertEquals(1400,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1400,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1400,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(4);
		ShotCards.collectPlacement();
		assertEquals(1400,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1400,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1400,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1400,LeftPanel.getPlayer4().getPlayerMoney());
	}

	@Test
	public void testCollectQuiz() {
		RightPanel.setCurrentPlayer(1);
		assertEquals(1000,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		ShotCards.collectQuiz();
		assertEquals(1025,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(2);
		ShotCards.collectQuiz();
		assertEquals(1025,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1025,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(3);
		ShotCards.collectQuiz();
		assertEquals(1025,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1025,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1025,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(4);
		ShotCards.collectQuiz();
		assertEquals(1025,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1025,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1025,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1025,LeftPanel.getPlayer4().getPlayerMoney());
	}
	
	@Test
	public void testSubtractSpeeding() {
		RightPanel.setCurrentPlayer(1);
		assertEquals(1000,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		ShotCards.subtractSpeeding();
		assertEquals(985,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(2);
		ShotCards.subtractSpeeding();
		assertEquals(985,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(985,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(3);
		ShotCards.subtractSpeeding();
		assertEquals(985,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(985,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(985,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(4);
		ShotCards.subtractSpeeding();
		assertEquals(985,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(985,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(985,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(985,LeftPanel.getPlayer4().getPlayerMoney());
	}
	
	@Test
	public void testSubtractTextbooks() {
		RightPanel.setCurrentPlayer(1);
		assertEquals(1000,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		ShotCards.subtractTextbooks();
		assertEquals(900,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(2);
		ShotCards.subtractTextbooks();
		assertEquals(900,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(900,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(3);
		ShotCards.subtractTextbooks();
		assertEquals(900,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(900,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(900,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(4);
		ShotCards.subtractTextbooks();
		assertEquals(900,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(900,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(900,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(900,LeftPanel.getPlayer4().getPlayerMoney());
	}

	@Test
	public void testSubtractBills() {
		RightPanel.setCurrentPlayer(1);
		assertEquals(1000,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		ShotCards.subtractBills();
		assertEquals(850,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(2);
		ShotCards.subtractBills();
		assertEquals(850,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(850,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(3);
		ShotCards.subtractBills();
		assertEquals(850,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(850,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(850,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(4);
		ShotCards.subtractBills();
		assertEquals(850,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(850,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(850,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(850,LeftPanel.getPlayer4().getPlayerMoney());
	}
	
	@Test
	public void testSubtractDrinks() {
		RightPanel.setCurrentPlayer(1);
		assertEquals(1000,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		ShotCards.subtractDrinks();
		assertEquals(980,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(2);
		ShotCards.subtractDrinks();
		assertEquals(980,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(980,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(3);
		ShotCards.subtractDrinks();
		assertEquals(980,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(980,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(980,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(1000,LeftPanel.getPlayer4().getPlayerMoney());
		RightPanel.setCurrentPlayer(4);
		ShotCards.subtractDrinks();
		assertEquals(980,LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(980,LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(980,LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(980,LeftPanel.getPlayer4().getPlayerMoney());
	}
}
