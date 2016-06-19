package tests;

import static org.junit.Assert.*;
import mainGame.Player;
import mainGame.Properties;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is used to test the Player class
 * 
 * @author Brogrammers
 */
public class PlayerTest {

	private Player player;

	@Before
	public void setup() {
		player = new Player("John", 0, 1000, 1);
	}

	@Test
	public void testSetPos() {
		Assert.assertEquals(0, player.getPlayerPos());
		int diceRoll = 10;
		int diceRoll2 = 7;
		player.setPlayerPos(player.getPlayerPos() + diceRoll);
		Assert.assertEquals(10, player.getPlayerPos());
		Assert.assertEquals(1000, player.getPlayerMoney());
		player.setPlayerPos(player.getPlayerPos() + diceRoll);
		Assert.assertEquals(20, player.getPlayerPos());
		Assert.assertEquals(1000, player.getPlayerMoney());
		player.setPlayerPos(player.getPlayerPos() + diceRoll);
		Assert.assertEquals(30, player.getPlayerPos());
		Assert.assertEquals(1000, player.getPlayerMoney());
		player.setPlayerPos(player.getPlayerPos() + diceRoll);
		Assert.assertEquals(0, player.getPlayerPos());
		Assert.assertEquals(1200, player.getPlayerMoney());
		player.setPlayerPos(player.getPlayerPos() + diceRoll2);
		Assert.assertEquals(7, player.getPlayerPos());
		Assert.assertEquals(1200, player.getPlayerMoney());
	}
	
	@Test
	public void testSetName() {
		Assert.assertEquals("John",player.getPlayerName());
		player.setPlayerName("Bill");
		Assert.assertEquals("Bill",player.getPlayerName());
	}
	
	@Test
	public void testSetNum() {
		Assert.assertEquals(1,player.getPlayerNum());
		player.setPlayerNum(2);
		Assert.assertEquals(2, player.getPlayerNum());
	}

	@Test
	public void testSetMoney() {
		assertEquals(1000, player.getPlayerMoney());
		player.setPlayerMoney(1500);
		assertEquals(1500, player.getPlayerMoney());
		player.setPlayerMoney(-200);
		assertEquals(-200,player.getPlayerMoney());
	}
	
	/*@Test 
	public void testBuyProp() {
		Properties testProp1 = new Properties("Test1", 0, 200, 0, 0, true, 0, 0, "Black");
		assertTrue(testProp1.isBuyable());
		Properties testProp2 = new Properties("Test2", 1, 500, 0, 0, true, 0,0, "Brown");
		assertTrue(testProp2.isBuyable());
		assertEquals(1000, player.getPlayerMoney());
		assertEquals(0,player.getPropertiesArray().size());
		player.buyProperty(testProp1);
		assertEquals(800, player.getPlayerMoney());
		assertEquals(1,player.getPropertiesArray().size());
		player.buyProperty(testProp1);
		assertFalse(testProp1.isBuyable());
		assertEquals(800, player.getPlayerMoney());
		assertEquals(1,player.getPropertiesArray().size());
		assertFalse(testProp1.isBuyable());
		assertTrue(testProp2.isBuyable());
		player.buyProperty(testProp2);
		assertEquals(300, player.getPlayerMoney());
		assertEquals(2,player.getPropertiesArray().size());
		assertFalse(testProp2.isBuyable());
	}
	
	@Test
	public void endGameTest() {
		
	}*/
	
	
}
