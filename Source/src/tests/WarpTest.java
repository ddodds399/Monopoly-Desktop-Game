package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import mainGame.PropertySetup;
import mainGame.Warping;
import mainWindow.LeftPanel;
import mainWindow.RightPanel;

/**
 * This class is used to test the warp class
 * 
 * @author Brogrammers
 */
public class WarpTest {
	
	ArrayList<String> playerNames = new ArrayList<String>();

	private LeftPanel leftPanel;
	private RightPanel rightPanel;
	
	@Before
	public void setup() {
		
		playerNames.add("Player1");
		playerNames.add("Player2");
		playerNames.add("Player3");
		playerNames.add("Player4");

		setLeftPanel(new LeftPanel(playerNames));
		setRightPanel(new RightPanel());
	}
	
	@Test
	public void testWarpP1() {
		RightPanel.setCurrentPlayer(1);
		assertEquals(1, RightPanel.getCurrentPlayer());
		
		LeftPanel.getPlayer1().setPlayerPos(PropertySetup.getWarp().getPropPos());
		Warping.testWarp();
		assertNotSame(PropertySetup.getWarp().getPropPos(), LeftPanel.getPlayer1().getPlayerPos());
		assertNotSame(PropertySetup.getWarp2().getPropPos(), LeftPanel.getPlayer1().getPlayerPos());
		assertNotSame(PropertySetup.getWarp3().getPropPos(), LeftPanel.getPlayer1().getPlayerPos());
		
		LeftPanel.getPlayer1().setPlayerPos(PropertySetup.getWarp2().getPropPos());
		Warping.testWarp();
		assertNotSame(PropertySetup.getWarp().getPropPos(), LeftPanel.getPlayer1().getPlayerPos());
		assertNotSame(PropertySetup.getWarp2().getPropPos(), LeftPanel.getPlayer1().getPlayerPos());
		assertNotSame(PropertySetup.getWarp3().getPropPos(), LeftPanel.getPlayer1().getPlayerPos());
		
		LeftPanel.getPlayer1().setPlayerPos(PropertySetup.getWarp3().getPropPos());
		Warping.testWarp();
		assertNotSame(PropertySetup.getWarp().getPropPos(), LeftPanel.getPlayer1().getPlayerPos());
		assertNotSame(PropertySetup.getWarp2().getPropPos(), LeftPanel.getPlayer1().getPlayerPos());
		assertNotSame(PropertySetup.getWarp3().getPropPos(), LeftPanel.getPlayer1().getPlayerPos());
	}
	
	@Test
	public void testWarpP2() {
		RightPanel.setCurrentPlayer(2);
		assertEquals(2, RightPanel.getCurrentPlayer());
		
		LeftPanel.getPlayer2().setPlayerPos(PropertySetup.getWarp().getPropPos());
		Warping.testWarp();
		assertNotSame(PropertySetup.getWarp().getPropPos(), LeftPanel.getPlayer2().getPlayerPos());
		assertNotSame(PropertySetup.getWarp2().getPropPos(), LeftPanel.getPlayer2().getPlayerPos());
		assertNotSame(PropertySetup.getWarp3().getPropPos(), LeftPanel.getPlayer2().getPlayerPos());
		
		LeftPanel.getPlayer2().setPlayerPos(PropertySetup.getWarp2().getPropPos());
		Warping.testWarp();
		assertNotSame(PropertySetup.getWarp().getPropPos(), LeftPanel.getPlayer2().getPlayerPos());
		assertNotSame(PropertySetup.getWarp2().getPropPos(), LeftPanel.getPlayer2().getPlayerPos());
		assertNotSame(PropertySetup.getWarp3().getPropPos(), LeftPanel.getPlayer2().getPlayerPos());
		
		LeftPanel.getPlayer2().setPlayerPos(PropertySetup.getWarp3().getPropPos());
		Warping.testWarp();
		assertNotSame(PropertySetup.getWarp().getPropPos(), LeftPanel.getPlayer2().getPlayerPos());
		assertNotSame(PropertySetup.getWarp2().getPropPos(), LeftPanel.getPlayer2().getPlayerPos());
		assertNotSame(PropertySetup.getWarp3().getPropPos(), LeftPanel.getPlayer2().getPlayerPos());
	}
	
	@Test
	public void testWarpP3() {
		RightPanel.setCurrentPlayer(3);
		assertEquals(3, RightPanel.getCurrentPlayer());
		
		LeftPanel.getPlayer3().setPlayerPos(PropertySetup.getWarp().getPropPos());
		Warping.testWarp();
		assertNotSame(PropertySetup.getWarp().getPropPos(), LeftPanel.getPlayer3().getPlayerPos());
		assertNotSame(PropertySetup.getWarp2().getPropPos(), LeftPanel.getPlayer3().getPlayerPos());
		assertNotSame(PropertySetup.getWarp3().getPropPos(), LeftPanel.getPlayer3().getPlayerPos());
		
		LeftPanel.getPlayer3().setPlayerPos(PropertySetup.getWarp2().getPropPos());
		Warping.testWarp();
		assertNotSame(PropertySetup.getWarp().getPropPos(), LeftPanel.getPlayer3().getPlayerPos());
		assertNotSame(PropertySetup.getWarp2().getPropPos(), LeftPanel.getPlayer3().getPlayerPos());
		assertNotSame(PropertySetup.getWarp3().getPropPos(), LeftPanel.getPlayer3().getPlayerPos());
		
		LeftPanel.getPlayer3().setPlayerPos(PropertySetup.getWarp3().getPropPos());
		Warping.testWarp();
		assertNotSame(PropertySetup.getWarp().getPropPos(), LeftPanel.getPlayer3().getPlayerPos());
		assertNotSame(PropertySetup.getWarp2().getPropPos(), LeftPanel.getPlayer3().getPlayerPos());
		assertNotSame(PropertySetup.getWarp3().getPropPos(), LeftPanel.getPlayer3().getPlayerPos());
	}
	
	@Test
	public void testWarpP4() {
		RightPanel.setCurrentPlayer(4);
		assertEquals(4, RightPanel.getCurrentPlayer());
		
		LeftPanel.getPlayer4().setPlayerPos(PropertySetup.getWarp().getPropPos());
		Warping.testWarp();
		assertNotSame(PropertySetup.getWarp().getPropPos(), LeftPanel.getPlayer4().getPlayerPos());
		assertNotSame(PropertySetup.getWarp2().getPropPos(), LeftPanel.getPlayer4().getPlayerPos());
		assertNotSame(PropertySetup.getWarp3().getPropPos(), LeftPanel.getPlayer4().getPlayerPos());
		
		LeftPanel.getPlayer4().setPlayerPos(PropertySetup.getWarp2().getPropPos());
		Warping.testWarp();
		assertNotSame(PropertySetup.getWarp().getPropPos(), LeftPanel.getPlayer4().getPlayerPos());
		assertNotSame(PropertySetup.getWarp2().getPropPos(), LeftPanel.getPlayer4().getPlayerPos());
		assertNotSame(PropertySetup.getWarp3().getPropPos(), LeftPanel.getPlayer4().getPlayerPos());
		
		LeftPanel.getPlayer4().setPlayerPos(PropertySetup.getWarp3().getPropPos());
		Warping.testWarp();
		assertNotSame(PropertySetup.getWarp().getPropPos(), LeftPanel.getPlayer4().getPlayerPos());
		assertNotSame(PropertySetup.getWarp2().getPropPos(), LeftPanel.getPlayer4().getPlayerPos());
		assertNotSame(PropertySetup.getWarp3().getPropPos(), LeftPanel.getPlayer4().getPlayerPos());
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
