package mainGame;

/**
 * This class is used to create properties for the game
 * 
 * @author Brogrammers
 */
public class Properties {

	private String propertyName, propColour;
	private int propertyCost, mortgageValue, rent, propPos;
	// flats is equivalent of houses, halls equivalent of hotel
	private int flats, halls, costBuyFlat, costBuyHall;
	private boolean buyable;
	//private int first;
	private int originalRent;
	//private int startRent;

	/**
	 * This constructor creates a property
	 * @param pPropertyName - the name of the property
	 * @param pPropPos - the position of the property
	 * @param pPropertyCost - the cost of the property
	 * @param pMortgageValue - the mortgage value of the property
	 * @param pRent - the rent value of the property
	 * @param pBuyable - whether the property is buyable
	 * @param pCostBuyFlat - the cost to buy flats for the property
	 * @param pCostBuyHall - the cost to buy halls for the property
	 * @param pPropColour - the colour of the property
	 */
	public Properties(String pPropertyName, int pPropPos, int pPropertyCost,
			int pMortgageValue, int pRent, boolean pBuyable, int pCostBuyFlat,
			int pCostBuyHall, String pPropColour) {

		propertyName = pPropertyName;
		propertyCost = pPropertyCost;
		mortgageValue = pMortgageValue;
		rent = pRent;
		buyable = pBuyable;
		costBuyFlat = pCostBuyFlat;
		costBuyHall = pCostBuyHall;
		propPos = pPropPos;
		propColour = pPropColour;
		
		originalRent = pRent;

		flats = 0;
		halls = 0;
	}

	/**
	 * This method returns the property name
	 * @return - property name
	 */
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * This method sets a new name for the property
	 * @param propertyName - new property name
	 */
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	/**
	 * This method returns the property cost
	 * @return - propert cost
	 */
	public int getPropertyCost() {
		return propertyCost;
	}

	/**
	 * This method sets a new property cost
	 * @param propertyCost - new property cost
	 */
	public void setPropertyCost(int propertyCost) {
		this.propertyCost = propertyCost;
	}

	/**
	 * This method returns the mortgage value of the property
	 * @return - the property mortgage value
	 */
	public int getMortgageValue() {
		return mortgageValue;
	}

	/**
	 * This method sets the mortgage value of the property
	 * @param - the new mortgaeg value
	 */
	public void setMortgageValue(int mortgageValue) {
		this.mortgageValue = mortgageValue;
	}

	/**
	 * This method returns the rent of the property and also includes a formula to change the
	 * rent depending on the number of flats and halls on the property
	 * @return - the rent value of the property
	 */
	public int getRent() {
	
		rent = originalRent + (getFlats() * getCostBuyFlat()) 
				+ (getHalls() *(2*getCostBuyHalls()));
			
		return rent;
	}

	/**
	 * This method returns the cost to buy halls on a property
	 * @return - the cost to buy halls value
	 */
	public int getCostBuyHalls() {
		return costBuyHall;
	}

	/**
	 * This method returns the cost to buy flats on a property
	 * @return - the cost to buy flats property
	 */
	public int getCostBuyFlat() {
		return costBuyFlat;
	}

	/**
	 * This method sets a new value for the cost to buy flats
	 * @param costBuyFlat - new cost to buy flats value
	 */
	public void setCostBuyFlat(int costBuyFlat) {
		this.costBuyFlat = costBuyFlat;
	}

	/**
	 * This method sets a new value for the cost to buy halls
	 * @param costBuyHall - new cost to buy halls value
	 */
	public void setCostBuyHall(int costBuyHall) {
		this.costBuyHall = costBuyHall;
	}

	/**
	 * This method sets a new rent value
	 * @param rent - the new rent value
	 */
	public void setRent(int rent) {
		this.originalRent = rent;
	}
	
	/**
	 * This method returns the number of flats on a property
	 * @return - the number of flats on the property
	 */
	public int getFlats() {
		return flats;
	}

	/**
	 * This method sets a new number of flats on a property
	 * @param flats - the new number of flats on the property
	 */
	public void setFlats(int flats) {
		this.flats = flats;
	}
	
	/**
	 * This method returns the number of halls on a property
	 * @return - the number of halls on the property
	 */
	public int getHalls() {
		return halls;
	}
	
	/**
	 * This method sets a new number of halls on the property
	 * @param halls - the new number of halls on the property
	 */
	public void setHalls(int halls) {
		this.halls = halls;
	}

	/**
	 * This method returns the buyable status of the property
	 * @return - true or false depending if property is buyable
	 */
	public boolean isBuyable() {
		return buyable;
	}

	/**
	 * This method sets whether the property is buyable or not
	 * @param buyable - true or false if property is buyable
	 */
	public void setBuyable(boolean buyable) {
		this.buyable = buyable;
	}

	/**
	 * This method returns the property position
	 * @return - Position of the property
	 */
	public int getPropPos() {
		return propPos;
	}

	/**
	 * This method sets a new property position
	 * @param propPos - new position of the property
	 */
	public void setPropPos(int propPos) {
		this.propPos = propPos;
	}

	/**
	 * This method returns the colour of the property
	 * @return - the property colour
	 */
	public String getPropColour() {
		return propColour;
	}

	/**
	 * This method sets a new property colour for the property
	 * @param propColour - the new property colour
	 */
	public void setPropColour(String propColour) {
		this.propColour = propColour;
	}
}