package tests;

import static org.junit.Assert.*;
import mainGame.Dice;

import org.junit.Before;
import org.junit.Test;

/**
 * This class is used to test the Dice class
 * 
 * @author Brogrammers
 */
public class DiceTest {
	private Dice dice;

	@Before
	public void setup() {
		dice = new Dice();
	}

	@SuppressWarnings("static-access")
	@Test
	public void testThrow() {
		int max = 12;
		int min = 2;

		int result = dice.throwDice();

		System.out.println("dice1: " + dice.getDiceOne());
		System.out.println("dice2: " + dice.getDiceTwo());
		System.out.println("total: " + result);
		assertTrue(result <= max && result >= min);

	}

	@Test
	public void testCheckDoubles() {
		dice.setDice(1, 2);
		assertFalse(dice.checkDoubles());
		assertEquals(0, dice.getNumOfRolls());
		dice.setDice(3, 3);
		assertTrue(dice.checkDoubles());
		assertEquals(1, dice.getNumOfRolls());
		dice.setDice(4, 6);
		assertFalse(dice.checkDoubles());
		assertEquals(0, dice.getNumOfRolls());
		dice.setDice(1, 1);
		assertTrue(dice.checkDoubles());
		assertEquals(1, dice.getNumOfRolls());
		dice.setDice(2, 2);
		assertTrue(dice.checkDoubles());
		assertEquals(2, dice.getNumOfRolls());
		dice.setDice(3, 5);
		assertFalse(dice.checkDoubles());
		assertEquals(0, dice.getNumOfRolls());
		dice.setDice(4, 4);
		assertTrue(dice.checkDoubles());
		assertEquals(1, dice.getNumOfRolls());
		dice.setDice(5, 5);
		assertTrue(dice.checkDoubles());
		assertEquals(2, dice.getNumOfRolls());
		dice.setDice(6,6);
	}
	
	@Test
	public void testPlayersInLecture() {
		assertFalse(dice.isPl1InLecture());
		assertFalse(dice.isPl2InLecture());
		assertFalse(dice.isPl3InLecture());
		assertFalse(dice.isPl4InLecture());
		dice.setPl1InLecture(true);
		assertTrue(dice.isPl1InLecture());
		assertFalse(dice.isPl2InLecture());
		assertFalse(dice.isPl3InLecture());
		assertFalse(dice.isPl4InLecture());
		dice.setPl2InLecture(true);
		assertTrue(dice.isPl1InLecture());
		assertTrue(dice.isPl2InLecture());
		assertFalse(dice.isPl3InLecture());
		assertFalse(dice.isPl4InLecture());
		dice.setPl3InLecture(true);
		assertTrue(dice.isPl1InLecture());
		assertTrue(dice.isPl2InLecture());
		assertTrue(dice.isPl3InLecture());
		assertFalse(dice.isPl4InLecture());
		dice.setPl4InLecture(true);
		assertTrue(dice.isPl1InLecture());
		assertTrue(dice.isPl2InLecture());
		assertTrue(dice.isPl3InLecture());
		assertTrue(dice.isPl4InLecture());
	}
	
	
	
}


