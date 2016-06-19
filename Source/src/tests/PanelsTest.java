package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import mainWindow.LeftPanel;
import mainWindow.RightPanel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is used to test the panels in the mainGame
 * 
 * @author Brogrammers
 *
 */
public class PanelsTest {
	
	ArrayList<String> playerNames = new ArrayList<String>();

	private LeftPanel leftPanel;
	private RightPanel rightPanel;

	@Before
	public void setup() {
		
		playerNames.add("1234");
		playerNames.add("Norman");
		playerNames.add("John Doe");
		playerNames.add("");

		setLeftPanel(new LeftPanel(playerNames));
		setRightPanel(new RightPanel());
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testNumberPlayers() {
		Assert.assertEquals(4, getLeftPanel().getTotalPlayers());
	}
	
	@Test
	public void testPlayers(){
		assertEquals("1234", LeftPanel.getPlayer1().getPlayerName());
		assertEquals(0,LeftPanel.getPlayer1().getPlayerPos());
		assertEquals(1000, LeftPanel.getPlayer1().getPlayerMoney());
		assertEquals(1,LeftPanel.getPlayer1().getPlayerNum());
		assertEquals("Norman", LeftPanel.getPlayer2().getPlayerName());
		assertEquals(0,LeftPanel.getPlayer2().getPlayerPos());
		assertEquals(1000, LeftPanel.getPlayer2().getPlayerMoney());
		assertEquals(2,LeftPanel.getPlayer2().getPlayerNum());
		assertEquals("John Doe", LeftPanel.getPlayer3().getPlayerName());
		assertEquals(0,LeftPanel.getPlayer3().getPlayerPos());
		assertEquals(1000, LeftPanel.getPlayer3().getPlayerMoney());
		assertEquals(3,LeftPanel.getPlayer3().getPlayerNum());
		assertEquals("", LeftPanel.getPlayer4().getPlayerName());
		assertEquals(0,LeftPanel.getPlayer4().getPlayerPos());
		assertEquals(1000, LeftPanel.getPlayer4().getPlayerMoney());
		assertEquals(4,LeftPanel.getPlayer4().getPlayerNum());
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testLabels() {
		Assert.assertEquals("1234 £1000", getLeftPanel().getPlayer1Label().getText());
		Assert.assertEquals("Norman £1000", getLeftPanel().getPlayer2Label().getText());
		Assert.assertEquals("John Doe £1000", getLeftPanel().getPlayer3Label().getText());
		Assert.assertEquals(" £1000", LeftPanel.getPlayer4Label().getText());

	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testLogArea() {
		Assert.assertEquals("", getRightPanel().getLogArea().getText());
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testGetCurrentPlayer() {
		Assert.assertEquals(1, getRightPanel().getCurrentPlayer());
		getRightPanel().setCurrentPlayer(3);
		Assert.assertEquals(3, getRightPanel().getCurrentPlayer());
	}

	public LeftPanel getLeftPanel() {
		return leftPanel;
	}

	public void setLeftPanel(LeftPanel leftPanel) {
		this.leftPanel = leftPanel;
	}

	public RightPanel getRightPanel() {
		return rightPanel;
	}

	public void setRightPanel(RightPanel rightPanel) {
		this.rightPanel = rightPanel;
	}
}
