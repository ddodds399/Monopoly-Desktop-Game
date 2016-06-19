package tests;

import static org.junit.Assert.*;
import mainGame.Properties;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is used to test the property class
 * 
 * @author Brogrammers
 */
public class PropertyTest {

	private Properties myProperty;
	
	@Before
	public void setup() {
		myProperty = new Properties("Belfast", 5, 100, 50, 25, true, 50, 50, "Black");
	}
	
	@Test
	public void testSetName() {
		Assert.assertEquals("Belfast", myProperty.getPropertyName());
		myProperty.setPropertyName("Dublin");
		Assert.assertEquals("Dublin", myProperty.getPropertyName());
	}
	
	@Test
	public void testSetPropCost() {
		Assert.assertEquals(100, myProperty.getPropertyCost());
		myProperty.setPropertyCost(150);
		Assert.assertEquals(150, myProperty.getPropertyCost());
	}
	
	@Test
	public void testSetMortgage() {
		Assert.assertEquals(50, myProperty.getMortgageValue());
		myProperty.setMortgageValue(75);
		Assert.assertEquals(75, myProperty.getMortgageValue());
	}
	
	@Test
	public void testSetCostFlat() {
		Assert.assertEquals(50, myProperty.getCostBuyFlat());
		myProperty.setCostBuyFlat(85);
		Assert.assertEquals(85, myProperty.getCostBuyFlat());
	}
	
	@Test
	public void testSetCostHall() {
		Assert.assertEquals(50, myProperty.getCostBuyHalls());
		myProperty.setCostBuyHall(90);
		Assert.assertEquals(90, myProperty.getCostBuyHalls());
	}

	@Test
	public void testSetRent() {
		Assert.assertEquals(25, myProperty.getRent());
		myProperty.setRent(10);
		Assert.assertEquals(10, myProperty.getRent());
	}
	
	@Test
	public void testSetFlats() {
		Assert.assertEquals(0, myProperty.getFlats());
		myProperty.setFlats(10);
		Assert.assertEquals(10, myProperty.getFlats());
	}
	
	@Test
	public void testsetHalls() {
		Assert.assertEquals(0, myProperty.getHalls());
		myProperty.setHalls(17);
		Assert.assertEquals(17, myProperty.getHalls());
	}
	
	@Test
	public void testSetColor() {
		Assert.assertEquals("Black", myProperty.getPropColour());
		myProperty.setPropColour("Blue");
		Assert.assertEquals("Blue", myProperty.getPropColour());
	}
	
	@Test
	public void testPropPos() {
		Assert.assertEquals(5, myProperty.getPropPos());
		myProperty.setPropPos(1);
		Assert.assertEquals(1, myProperty.getPropPos());
	}
	
	@Test
	public void testGetRent() {
		assertEquals(25, myProperty.getRent());
		myProperty.setFlats(3);
		assertEquals(175, myProperty.getRent());
		myProperty.setFlats(0);
		assertEquals(25, myProperty.getRent());
		myProperty.setHalls(4);
		assertEquals(425, myProperty.getRent());
		myProperty.setHalls(0);
		assertEquals(25, myProperty.getRent());
		myProperty.setFlats(2);
		myProperty.setHalls(2);
		assertEquals(325, myProperty.getRent());
	}
}
