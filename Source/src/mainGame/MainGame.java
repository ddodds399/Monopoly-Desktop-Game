package mainGame;

import setup.SetupWindow;

/**
 * This class runs the game
 * 
 * @author Brogrammers
 */
public class MainGame {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		// Add setup window
		SetupWindow setupWindow = new SetupWindow();
		// MainWindow mainWindow = new MainWindow();

		// //Setting up new player
		// Player player1 = new Player("Nathan", 200 , 1);
		//
		// //Setting up new property
		// Properties property1 = new Properties("OldKent", 50, 30, 5, true, 50,
		// 200);
		//
		// //Setting up new Dice
		// Dice dice = new Dice();
		//
		// //Adding property 1 to the array
		// player1.getPropertiesArray().add(property1);
		//
		// //Return name should be Nathan
		// System.out.println("Player1 Name: "+ player1.getPlayerName());
		//
		// //Should return 1
		// System.out.println("Player Number" + player1.getPlayerNum());
		//
		// //should return 200
		// System.out.println(player1.getPlayerMoney());
		//
		// //changing the values
		// player1.setPlayerName("Niall");
		// player1.setPlayerNum(2);
		// player1.setPlayerMoney(500);
		//
		// //should now return niall
		// System.out.println("Player1 Name: "+ player1.getPlayerName());
		//
		// //Should return 2
		// System.out.println("Player Number" + player1.getPlayerNum());
		//
		// //should return 500
		// System.out.println(player1.getPlayerMoney());
		//
		// //player 1 is buying the property so it should be no longer available
		// player1.buyProperty(property1);
		//
		// //return old kent
		// System.out.println("Properties Name: " +
		// player1.getPropertiesArray().get(0).getPropertyName());
		//
		// //return 50
		// System.out.println("Properties Cost: " +
		// player1.getPropertiesArray().get(0).getPropertyCost());
		//
		// //return 200
		// System.out.println("Properties Hotel Cost: " +
		// property1.getCostBuyHotel());
		//
		// //return new kent
		// player1.getPropertiesArray().get(0).setPropertyName("NewKent");
		// System.out.println("Properties Name: " +
		// player1.getPropertiesArray().get(0).getPropertyName());
		// //return 30
		// player1.getPropertiesArray().get(0).setPropertyCost(30);
		// System.out.println("Properties Cost: " +
		// player1.getPropertiesArray().get(0).getPropertyCost());
		// //return 300
		// player1.getPropertiesArray().get(0).setCostBuyHotel(300);
		// System.out.println("Properties Hotel: " +
		// player1.getPropertiesArray().get(0).getCostBuyHotel());
		//
		// System.out.println(player1.getPropertiesArray().get(0).isBuyable());
		//
		// //Testing the dice
		// System.out.println("Total Value: " + dice.throwDice() +
		// "\nDice1 Val: " +
		// dice.getDiceOne() + "\nDice2 Val: " + dice.getDiceTwo());
	}
}