package mainGame;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import mainWindow.LeftPanel;
import mainWindow.RightPanel;

/**
 * This class creates a player object to represent the users playing the game
 * 
 * @author Brogrammers
 */
public class Player {

	private String playerName;
	private int playerMoney, playerNum, playerPos;
	private ArrayList<Properties> propertiesOwned;
	private boolean surrender=false;

	/**
	 * This constructor creates a player object
	 * @param pPlayerName - The player's name
	 * @param pPlayerPos - The player's position on the board
	 * @param pPlayerMoney - The player's money on the board
	 * @param pPlayerNum - The players number for the player order
	 */
	public Player(String pPlayerName, int pPlayerPos, int pPlayerMoney, int pPlayerNum) {

		playerName = pPlayerName;
		playerMoney = pPlayerMoney;
		playerNum = pPlayerNum;
		playerPos = pPlayerPos;

		propertiesOwned = new ArrayList<Properties>();
	}

	/**
	 * This method returns the player position
	 * @return - the player position
	 */
	public int getPlayerPos() {
		return playerPos;
	}

	/**
	 * This method sets the player position and adds £200 if the player passes the Go space
	 * @param playerPos - the new player position
	 */
	public void setPlayerPos(int playerPos) {
		this.playerPos = playerPos;
		if (getPlayerPos() > 39) {
			setPlayerPos(getPlayerPos() - 40);
			setPlayerMoney(getPlayerMoney() + 200);
		}
		else if(getPlayerPos() < 0) {
			setPlayerPos(getPlayerPos() + 40);
		}
	}

	/**
	 * This method returns the player name
	 * @return - the player name
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * This method sets a new player name
	 * @param playerName - the new player name of the player
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	/**
	 * This method returns the player number
	 * @return - the player's number
	 */
	public int getPlayerNum() {
		return playerNum;
	}

	/**
	 * This method sets a new player number for the player
	 * @param playerNum - the new player number
	 */
	public void setPlayerNum(int playerNum) {
		this.playerNum = playerNum;
	}

	/**
	 * This method returns the player's money for the player
	 * @return - the player's money
	 */
	public int getPlayerMoney() {
		return playerMoney;
	}

	/**
	 * This method sets the player's money making sure it doesn't go below 0
	 * @param playerMoney - the new money amount for the player
	 */
	public void setPlayerMoney(int playerMoney) {
		this.playerMoney = playerMoney;
	
	}

	/**
	 * This method returns the array of properties a player owns
	 * @return - the properties owned array
	 */
	public ArrayList<Properties> getPropertiesArray() {
		return propertiesOwned;
	}

	/**
	 * This method adds a property to the players property array if a player buys a property.
	 * The method also changes the players money to reflect them buying the property
	 * @param index - the index of the property in the properties array that is added to the player's array
	 */
	public void buyProperty(Properties index) {
		if (index.isBuyable() == true) {
			getPropertiesArray().add(index);
			index.setBuyable(false);
			setPlayerMoney(getPlayerMoney() - index.getPropertyCost());
		}
	}
	
	/**
	 * This method ends the players game if their money falls below 0 and they have no properties
	 * left to sell
	 */
	public void endGame(){
		
	
		if(getPlayerMoney()<=0 && getPropertiesArray().isEmpty() || getSurrender()==true ){
			
			if(getPlayerNum() == RightPanel.getCurrentPlayer()){
				
				for(int i = 0; i< getPropertiesArray().size();i++)
				{
					getPropertiesArray().get(i).setFlats(0);
					getPropertiesArray().get(i).setHalls(0);
					getPropertiesArray().get(i).setBuyable(true);
				}
				
				getPropertiesArray().clear();
				
				
				
			}
//			if(getPlayerNum()==RightPanel.getCurrentPlayer()&& getSurrender()==true){
//				if (RightPanel.getCurrentPlayer() < LeftPanel.getTotalPlayers()) {
//					RightPanel.setCurrentPlayer(RightPanel.getCurrentPlayer()+1);
//				} else {
//					RightPanel.setCurrentPlayer(1);					
//				}
//			}
//			JOptionPane.showMessageDialog(null, "Out of game");
		}
		
		
	}

	/**
	 * This method sets the surrender value for the player
	 * @param surrender - true or false
	 */
	public void setSurrender(boolean surrender) {
		this.surrender = surrender;
	}

	/**
	 * This method returns the surrender value for the player
	 * @return
	 */
	public boolean getSurrender() {
		return surrender;
	}
	
	/**
	 * This method checks that if the money falls below 0, then the end game is called
	 */
	public void checkMoney(){
		if (getPlayerMoney()<=0){
			autoMortgage();
			endGame();
		}
	}
	
	public void autoMortgage(){
		for (int i = 0; i<getPropertiesArray().size() && getPlayerMoney()<0 ;){
			JOptionPane.showMessageDialog(null,"" + getPropertiesArray().get(i).getPropertyName() + " has been automatically sold");
			//the problem
			setPlayerMoney(getPlayerMoney() + getPropertiesArray().get(i).getMortgageValue());
			getPropertiesArray().get(i).setBuyable(true);
			getPropertiesArray().get(i).setFlats(0);
			getPropertiesArray().get(i).setHalls(0);
			System.out.println(" HAS BEEN REMOVED: " + getPropertiesArray().remove(i).getPropertyName());
			
			if(LeftPanel.getTotalPlayers() == 2){
				LeftPanel.getPlayer1Label().setText(
						LeftPanel.getPlayer1().getPlayerName() + " £"
								+ LeftPanel.getPlayer1().getPlayerMoney());
				LeftPanel.getPlayer2Label().setText(
						LeftPanel.getPlayer2().getPlayerName() + " £"
								+ LeftPanel.getPlayer2().getPlayerMoney());
			}
			else if(LeftPanel.getTotalPlayers() == 3){
				LeftPanel.getPlayer1Label().setText(
						LeftPanel.getPlayer1().getPlayerName() + " £"
								+ LeftPanel.getPlayer1().getPlayerMoney());
				LeftPanel.getPlayer2Label().setText(
						LeftPanel.getPlayer2().getPlayerName() + " £"
								+ LeftPanel.getPlayer2().getPlayerMoney());
				LeftPanel.getPlayer3Label().setText(
						LeftPanel.getPlayer3().getPlayerName() + " £"
								+ LeftPanel.getPlayer3().getPlayerMoney());
			}
			else if(LeftPanel.getTotalPlayers() == 4){
				LeftPanel.getPlayer1Label().setText(
						LeftPanel.getPlayer1().getPlayerName() + " £"
								+ LeftPanel.getPlayer1().getPlayerMoney());
				LeftPanel.getPlayer2Label().setText(
						LeftPanel.getPlayer2().getPlayerName() + " £"
								+ LeftPanel.getPlayer2().getPlayerMoney());
				LeftPanel.getPlayer3Label().setText(
						LeftPanel.getPlayer3().getPlayerName() + " £"
								+ LeftPanel.getPlayer3().getPlayerMoney());
				LeftPanel.getPlayer4Label().setText(
						LeftPanel.getPlayer4().getPlayerName() + " £"
								+ LeftPanel.getPlayer4().getPlayerMoney());
			}	
		}
	}
}