package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import mainGame.Dice;
import mainWindow.LeftPanel;
import mainWindow.RightPanel;

import org.junit.Before;
import org.junit.Test;

public class LectureTest {
	
	private ArrayList<String> players;
	LeftPanel leftPanel;
	RightPanel rightPanel;
	private Dice dice = new Dice();
	
	@Before
	public void setup() {
		players = new ArrayList<String>();
		players.add("player1");
		players.add("player2");
		players.add("player3");
		players.add("player4");
		leftPanel = new LeftPanel(players);
		rightPanel = new RightPanel();
		RightPanel.setCurrentPlayer(1);
		dice.setPl1InLecture(false);
		dice.setPl2InLecture(false);
		dice.setPl3InLecture(false);
		dice.setPl4InLecture(false);
	}

	@Test
	public void testRoll3Times() {
		assertFalse(dice.isPl1InLecture());
		dice.setDice(1,5);
		dice.checkDoubles();
		assertFalse(dice.isPl1InLecture());
		assertEquals(0,dice.getNumOfRolls());
		dice.checkDoubles();
		assertFalse(dice.isPl1InLecture());
		assertEquals(0,dice.getNumOfRolls());
		dice.checkDoubles();
		assertFalse(dice.isPl1InLecture());
		assertEquals(0,dice.getNumOfRolls());
	}
	
	@Test
	public void getOutOfLecture() {
		dice.setPl1InLecture(true);
		assertTrue(dice.isPl1InLecture());
		dice.setDice(1,4);
		if (dice.isPl1InLecture()){
			if (dice.checkDoubles()) {
				dice.setPl1InLecture(false);
			}
		}
		assertTrue(dice.isPl1InLecture());
		dice.setDice(4,4);
		if (dice.isPl1InLecture()){
			if (dice.checkDoubles()) {
				dice.setPl1InLecture(false);
			}
		}
		assertFalse(dice.isPl1InLecture());
	}

}








