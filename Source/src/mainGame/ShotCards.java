package mainGame;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import mainWindow.Building;
import mainWindow.LeftPanel;
import mainWindow.MiddlePanel;
import mainWindow.RightPanel;

/**
 * This class is used for the shot cards in our board game
 *
 * @author Brogrammers
 */
public class ShotCards {
	
	static ImageIcon advanceBoojumCard = new ImageIcon("images/PropertyCards/AgincourtAvenue-PropertyCard.jpg");
	static ImageIcon advanceGoCard = new ImageIcon("images/PropertyCards/AgincourtAvenue-PropertyCard.jpg");
	static ImageIcon advanceBotanicCard = new ImageIcon("images/PropertyCards/AgincourtAvenue-PropertyCard.jpg");
	static ImageIcon advanceLanyonCard = new ImageIcon("images/PropertyCards/AgincourtAvenue-PropertyCard.jpg");
	static ImageIcon advanceJailCard = new ImageIcon("images/PropertyCards/AgincourtAvenue-PropertyCard.jpg");
	static ImageIcon back3SpacesCard = new ImageIcon("images/PropertyCards/AgincourtAvenue-PropertyCard.jpg");
	static ImageIcon collectBursaryCard = new ImageIcon("images/PropertyCards/AgincourtAvenue-PropertyCard.jpg");
	static ImageIcon collectPlacementCard = new ImageIcon("images/PropertyCards/AgincourtAvenue-PropertyCard.jpg");
	static ImageIcon collectQuizCard = new ImageIcon("images/PropertyCards/AgincourtAvenue-PropertyCard.jpg");
	static ImageIcon subtractSpeedingCard = new ImageIcon("images/PropertyCards/AgincourtAvenue-PropertyCard.jpg");
	static ImageIcon subtractTextBooksCard = new ImageIcon("images/PropertyCards/AgincourtAvenue-PropertyCard.jpg");
	static ImageIcon subtractBillsCard = new ImageIcon("images/PropertyCards/AgincourtAvenue-PropertyCard.jpg");
	static ImageIcon subtractDrinksCard = new ImageIcon("images/PropertyCards/AgincourtAvenue-PropertyCard.jpg");

	/**
	 * This method advances the player to Boojum
	 */
	public static void advanceBoojum(){
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer1().setPlayerPos(
					PropertySetup.getBoojum().getPropPos());
			MiddlePanel.setPlayerCharLocation(1, LeftPanel.getPlayer1()
					.getPlayerPos());
		} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer2().setPlayerPos(
					PropertySetup.getBoojum().getPropPos());
			MiddlePanel.setPlayerCharLocation(2, LeftPanel.getPlayer1()
					.getPlayerPos());
		} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer3().setPlayerPos(
					PropertySetup.getBoojum().getPropPos());
			MiddlePanel.setPlayerCharLocation(3, LeftPanel.getPlayer1()
					.getPlayerPos());
		} else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer4().setPlayerPos(
					PropertySetup.getBoojum().getPropPos());
			MiddlePanel.setPlayerCharLocation(4, LeftPanel.getPlayer1()
					.getPlayerPos());
		}
		Warping.warp();
		PropertySetup.buyProperty();
		PropertySetup.rent();
		RightPanel.landOnLecture();
		RideTrain.rideTrain();
		RentAndLoans.payLoan();
		RentAndLoans.payRent();
		PECParking.collectParkingPoolMoney();
	}
	
	/**
	 * This method advances the player to Go
	 */
	public static void advanceGo(){
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer1().setPlayerPos(
					PropertySetup.getGo().getPropPos());
			MiddlePanel.setPlayerCharLocation(1, LeftPanel.getPlayer1()
					.getPlayerPos());
			LeftPanel.getPlayer1().setPlayerMoney(
					LeftPanel.getPlayer1().getPlayerMoney() + 200);
		} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer2().setPlayerPos(
					PropertySetup.getGo().getPropPos());
			MiddlePanel.setPlayerCharLocation(2, LeftPanel.getPlayer1()
					.getPlayerPos());
			LeftPanel.getPlayer2().setPlayerMoney(
					LeftPanel.getPlayer2().getPlayerMoney() + 200);
		} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer3().setPlayerPos(
					PropertySetup.getGo().getPropPos());
			MiddlePanel.setPlayerCharLocation(3, LeftPanel.getPlayer1()
					.getPlayerPos());
			LeftPanel.getPlayer3().setPlayerMoney(
					LeftPanel.getPlayer3().getPlayerMoney() + 200);
		} else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer4().setPlayerPos(
					PropertySetup.getGo().getPropPos());
			MiddlePanel.setPlayerCharLocation(4, LeftPanel.getPlayer1()
					.getPlayerPos());
			LeftPanel.getPlayer4().setPlayerMoney(
					LeftPanel.getPlayer4().getPlayerMoney() + 200);
		}
		Building.updateLabels();
	}
	
	/**
	 * This method advances the player to Botanic station
	 */
	public static void advanceBotanic(){
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer1().setPlayerPos(
					PropertySetup.getBotanicTrain().getPropPos());
			MiddlePanel.setPlayerCharLocation(1, LeftPanel.getPlayer1()
					.getPlayerPos());
		} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer2().setPlayerPos(
					PropertySetup.getBotanicTrain().getPropPos());
			MiddlePanel.setPlayerCharLocation(2, LeftPanel.getPlayer1()
					.getPlayerPos());
		} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer3().setPlayerPos(
					PropertySetup.getBotanicTrain().getPropPos());
			MiddlePanel.setPlayerCharLocation(3, LeftPanel.getPlayer1()
					.getPlayerPos());
		} else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer4().setPlayerPos(
					PropertySetup.getBotanicTrain().getPropPos());
			MiddlePanel.setPlayerCharLocation(4, LeftPanel.getPlayer1()
					.getPlayerPos());
		}
		Warping.warp();
		PropertySetup.buyProperty();
		PropertySetup.rent();
		RightPanel.landOnLecture();
		RideTrain.rideTrain();
		RentAndLoans.payLoan();
		RentAndLoans.payRent();
		PECParking.collectParkingPoolMoney();
	}
	
	/**
	 * This method advances the player to the Lanyon Building
	 */
	public static void advanceLanyon(){
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer1().setPlayerPos(
					PropertySetup.getLanyonBuilding().getPropPos());
			MiddlePanel.setPlayerCharLocation(1, LeftPanel.getPlayer1()
					.getPlayerPos());
		} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer2().setPlayerPos(
					PropertySetup.getLanyonBuilding().getPropPos());
			MiddlePanel.setPlayerCharLocation(2, LeftPanel.getPlayer1()
					.getPlayerPos());
		} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer3().setPlayerPos(
					PropertySetup.getLanyonBuilding().getPropPos());
			MiddlePanel.setPlayerCharLocation(3, LeftPanel.getPlayer1()
					.getPlayerPos());
		} else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer4().setPlayerPos(
					PropertySetup.getLanyonBuilding().getPropPos());
			MiddlePanel.setPlayerCharLocation(4, LeftPanel.getPlayer1()
					.getPlayerPos());
		}
		Warping.warp();
		PropertySetup.buyProperty();
		PropertySetup.rent();
		RightPanel.landOnLecture();
		RideTrain.rideTrain();
		RentAndLoans.payLoan();
		RentAndLoans.payRent();
		PECParking.collectParkingPoolMoney();
	}
	
	/**
	 * This method advances the player to a lecture
	 */
	public static void advanceJail(){
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer1().setPlayerPos(
					PropertySetup.getGotoLecture().getPropPos());
			MiddlePanel.setPlayerCharLocation(1, LeftPanel.getPlayer1()
					.getPlayerPos());
		} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer2().setPlayerPos(
					PropertySetup.getGotoLecture().getPropPos());
			MiddlePanel.setPlayerCharLocation(2, LeftPanel.getPlayer1()
					.getPlayerPos());
		} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer3().setPlayerPos(
					PropertySetup.getGotoLecture().getPropPos());
			MiddlePanel.setPlayerCharLocation(3, LeftPanel.getPlayer1()
					.getPlayerPos());
		} else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer4().setPlayerPos(
					PropertySetup.getGotoLecture().getPropPos());
			MiddlePanel.setPlayerCharLocation(4, LeftPanel.getPlayer1()
					.getPlayerPos());
		}
	}
	
	/**
	 * This method moves the player back three spaces
	 */
	public static void backThreeSpaces() {
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer1().setPlayerPos(
					LeftPanel.getPlayer1().getPlayerPos() - 3);
			MiddlePanel.setPlayerCharLocation(1, LeftPanel.getPlayer1()
					.getPlayerPos());
		} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer2().setPlayerPos(
					LeftPanel.getPlayer2().getPlayerPos() - 3);
			MiddlePanel.setPlayerCharLocation(2, LeftPanel.getPlayer2()
					.getPlayerPos());
		} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer3().setPlayerPos(
					LeftPanel.getPlayer3().getPlayerPos() - 3);
			MiddlePanel.setPlayerCharLocation(3, LeftPanel.getPlayer3()
					.getPlayerPos());
		} else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer4().setPlayerPos(
					LeftPanel.getPlayer4().getPlayerPos() - 3);
			MiddlePanel.setPlayerCharLocation(4, LeftPanel.getPlayer4()
					.getPlayerPos());
		}
		Warping.warp();
		PropertySetup.buyProperty();
		PropertySetup.rent();
		RightPanel.landOnLecture();
		RideTrain.rideTrain();
		RentAndLoans.payLoan();
		RentAndLoans.payRent();
		PECParking.collectParkingPoolMoney();
	}
	
	/**
	 * This method adds money to the player in the form of a bursary
	 */
	public static void collectBursary(){
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer1().setPlayerMoney(
					LeftPanel.getPlayer1().getPlayerMoney() + 100);
		} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer2().setPlayerMoney(
					LeftPanel.getPlayer2().getPlayerMoney() + 100);
		} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer3().setPlayerMoney(
					LeftPanel.getPlayer3().getPlayerMoney() + 100);
		} else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer4().setPlayerMoney(
					LeftPanel.getPlayer4().getPlayerMoney() + 100);
		}
		Building.updateLabels();
	}
	
	
	/**
	 * This method adds money to the player in the form of a placement year
	 */
	public static void collectPlacement(){
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer1().setPlayerMoney(
					LeftPanel.getPlayer1().getPlayerMoney() + 400);
		} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer2().setPlayerMoney(
					LeftPanel.getPlayer2().getPlayerMoney() + 400);
		} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer3().setPlayerMoney(
					LeftPanel.getPlayer3().getPlayerMoney() + 400);
		} else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer4().setPlayerMoney(
					LeftPanel.getPlayer4().getPlayerMoney() + 400);
		}
		Building.updateLabels();
	}
	
	/**
	 * This method adds money to the player in the form of winning a quiz
	 */
	public static void collectQuiz(){
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer1().setPlayerMoney(
					LeftPanel.getPlayer1().getPlayerMoney() + 25);
		} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer2().setPlayerMoney(
					LeftPanel.getPlayer2().getPlayerMoney() + 25);
		} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer3().setPlayerMoney(
					LeftPanel.getPlayer3().getPlayerMoney() + 25);
		} else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer4().setPlayerMoney(
					LeftPanel.getPlayer4().getPlayerMoney() + 25);
		}
		Building.updateLabels();
	}
	
	/**
	 * This method subtracts money from the player in the form of a speeding fine
	 */
	public static void subtractSpeeding(){
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer1().setPlayerMoney(
					LeftPanel.getPlayer1().getPlayerMoney() - 15);
		} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer2().setPlayerMoney(
					LeftPanel.getPlayer2().getPlayerMoney() - 15);
		} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer3().setPlayerMoney(
					LeftPanel.getPlayer3().getPlayerMoney() - 15);
		} else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer4().setPlayerMoney(
					LeftPanel.getPlayer4().getPlayerMoney() - 15);
		}
		Building.updateLabels();
	}
	
	/**
	 * This method subtracts money from the player in the form of buying textbooks
	 */
	public static void subtractTextbooks(){
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer1().setPlayerMoney(
					LeftPanel.getPlayer1().getPlayerMoney() - 100);
		} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer2().setPlayerMoney(
					LeftPanel.getPlayer2().getPlayerMoney() - 100);
		} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer3().setPlayerMoney(
					LeftPanel.getPlayer3().getPlayerMoney() - 100);
		} else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer4().setPlayerMoney(
					LeftPanel.getPlayer4().getPlayerMoney() - 100);
		}
		Building.updateLabels();
	}
	
	/**
	 * This method subtracts money from the player in the form of bills
	 */
	public static void subtractBills(){
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer1().setPlayerMoney(
					LeftPanel.getPlayer1().getPlayerMoney() - 150);
		} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer2().setPlayerMoney(
					LeftPanel.getPlayer2().getPlayerMoney() - 150);
		} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer3().setPlayerMoney(
					LeftPanel.getPlayer3().getPlayerMoney() - 150);
		} else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer4().setPlayerMoney(
					LeftPanel.getPlayer4().getPlayerMoney() - 150);
		}
		Building.updateLabels();
	}
	
	/**
	 * This method subtracts money from the player in the form of buying players drinks
	 */
	public static void subtractDrinks(){
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer1().setPlayerMoney(
					LeftPanel.getPlayer1().getPlayerMoney() - 20);
		} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer2().setPlayerMoney(
					LeftPanel.getPlayer2().getPlayerMoney() - 20);
		} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer3().setPlayerMoney(
					LeftPanel.getPlayer3().getPlayerMoney() - 20);
		} else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer4().setPlayerMoney(
					LeftPanel.getPlayer4().getPlayerMoney() - 20);
		}
		Building.updateLabels();
	}
	
	/**
	 * This method selects a shot card method randomly
	 */
	
	public static void selectCard()
	{
		if((LeftPanel.getPlayer1().getPlayerNum() == RightPanel.getCurrentPlayer() && 
			(LeftPanel.getPlayer1().getPlayerPos() == PropertySetup.getShotCard().getPropPos() 
			|| LeftPanel.getPlayer1().getPlayerPos() == PropertySetup.getShotCard2().getPropPos() 
			|| LeftPanel.getPlayer1().getPlayerPos() == PropertySetup.getShotCard3().getPropPos()))
			
			|| (LeftPanel.getPlayer2().getPlayerNum() == RightPanel.getCurrentPlayer() && 
			(LeftPanel.getPlayer2().getPlayerPos() == PropertySetup.getShotCard().getPropPos() 
			|| LeftPanel.getPlayer2().getPlayerPos() == PropertySetup.getShotCard2().getPropPos() 
			|| LeftPanel.getPlayer2().getPlayerPos() == PropertySetup.getShotCard3().getPropPos()))
			
			|| (LeftPanel.getPlayer3().getPlayerNum() == RightPanel.getCurrentPlayer() && 
			(LeftPanel.getPlayer3().getPlayerPos() == PropertySetup.getShotCard().getPropPos() 
			|| LeftPanel.getPlayer3().getPlayerPos() == PropertySetup.getShotCard2().getPropPos() 
			|| LeftPanel.getPlayer3().getPlayerPos() == PropertySetup.getShotCard3().getPropPos()))
			
			|| (LeftPanel.getPlayer4().getPlayerNum() == RightPanel.getCurrentPlayer() && 
			(LeftPanel.getPlayer4().getPlayerPos() == PropertySetup.getShotCard().getPropPos() 
			|| LeftPanel.getPlayer4().getPlayerPos() == PropertySetup.getShotCard2().getPropPos() 
			|| LeftPanel.getPlayer4().getPlayerPos() == PropertySetup.getShotCard3().getPropPos())))
		{
			Random random = new Random();
			int randomInt = random.nextInt(13);
			
			if(randomInt == 0)
			{
				JOptionPane.showMessageDialog(null,
						"",
						"Shot Card", JOptionPane.OK_OPTION,
						advanceBoojumCard);
				advanceBoojum();
			}
			
			if(randomInt == 1)
			{
				JOptionPane.showMessageDialog(null,
						"",
						"Shot Card", JOptionPane.OK_OPTION,
						advanceGoCard);
				advanceGo();
			}
			
			if(randomInt == 2)
			{
				JOptionPane.showMessageDialog(null,
						"",
						"Shot Card", JOptionPane.OK_OPTION,
						advanceBotanicCard);
				advanceBotanic();
			}
			
			if(randomInt == 3)
			{
				JOptionPane.showMessageDialog(null,
						"",
						"Shot Card", JOptionPane.OK_OPTION,
						advanceLanyonCard);
				advanceLanyon();
			}		
			
			if(randomInt == 4)
			{
				JOptionPane.showMessageDialog(null,
						"",
						"Shot Card", JOptionPane.OK_OPTION,
						advanceJailCard);
				advanceJail();
			}		
			
			if(randomInt == 5)
			{
				JOptionPane.showMessageDialog(null,
						"",
						"Shot Card", JOptionPane.OK_OPTION,
						back3SpacesCard);
				backThreeSpaces();
			}
			
			if(randomInt == 6)
			{
				JOptionPane.showMessageDialog(null,
						"",
						"Shot Card", JOptionPane.OK_OPTION,
						collectBursaryCard);
				collectBursary();
			}
			
			if(randomInt == 7)
			{
				JOptionPane.showMessageDialog(null,
						"",
						"Shot Card", JOptionPane.OK_OPTION,
						collectPlacementCard);
				collectPlacement();
			}
			
			if(randomInt == 8)
			{
				JOptionPane.showMessageDialog(null,
						"",
						"Shot Card", JOptionPane.OK_OPTION,
						collectQuizCard);
				collectQuiz();
			}
			
			if(randomInt == 9)
			{
				JOptionPane.showMessageDialog(null,
						"",
						"Shot Card", JOptionPane.OK_OPTION,
						subtractSpeedingCard);
				subtractSpeeding();
			}
			
			if(randomInt == 10)
			{
				JOptionPane.showMessageDialog(null,
						"",
						"Shot Card", JOptionPane.OK_OPTION,
						subtractTextBooksCard);
				subtractTextbooks();
			}
			
			if(randomInt == 11)
			{
				JOptionPane.showMessageDialog(null,
						"",
						"Shot Card", JOptionPane.OK_OPTION,
						subtractBillsCard);
				subtractBills();
			}
			
			if(randomInt == 12)
			{
				JOptionPane.showMessageDialog(null,
						"",
						"Shot Card", JOptionPane.OK_OPTION,
						subtractDrinksCard);
				subtractDrinks();
			}
		}
	}
	
	
	
	/**
	 * This method is for test purposes only
	 */
	public static void testAdvanceGo(){
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer1().setPlayerPos(
					PropertySetup.getGo().getPropPos());
		} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer2().setPlayerPos(
					PropertySetup.getGo().getPropPos());
		} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer3().setPlayerPos(
					PropertySetup.getGo().getPropPos());
		} else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer4().setPlayerPos(
					PropertySetup.getGo().getPropPos());
		}
	}
	
	/**
	 * This method is for test purposes only
	 */
	public static void testAdvanceBotanic(){
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer1().setPlayerPos(
					PropertySetup.getBotanicTrain().getPropPos());
		} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer2().setPlayerPos(
					PropertySetup.getBotanicTrain().getPropPos());
		} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer3().setPlayerPos(
					PropertySetup.getBotanicTrain().getPropPos());
		} else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer4().setPlayerPos(
					PropertySetup.getBotanicTrain().getPropPos());
		}
	}
	
	/**
	 * This method advances the player to the Lanyon Building
	 */
	public static void testAdvanceLanyon(){
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer1().setPlayerPos(
					PropertySetup.getLanyonBuilding().getPropPos());
		} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer2().setPlayerPos(
					PropertySetup.getLanyonBuilding().getPropPos());
		} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer3().setPlayerPos(
					PropertySetup.getLanyonBuilding().getPropPos());
		} else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer4().setPlayerPos(
					PropertySetup.getLanyonBuilding().getPropPos());
		}
	}
	
	/**
	 * This method is for test purposes only
	 */
	public static void testAdvanceBoojum(){
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer1().setPlayerPos(
					PropertySetup.getBoojum().getPropPos());
		} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer2().setPlayerPos(
					PropertySetup.getBoojum().getPropPos());
		} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer3().setPlayerPos(
					PropertySetup.getBoojum().getPropPos());
		} else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer4().setPlayerPos(
					PropertySetup.getBoojum().getPropPos());
		}
	}
	
	/**
	 * This method is for test purposes only
	 */
	public static void testAdvanceJail(){
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer1().setPlayerPos(
					PropertySetup.getGotoLecture().getPropPos());
		} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer2().setPlayerPos(
					PropertySetup.getGotoLecture().getPropPos());
		} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer3().setPlayerPos(
					PropertySetup.getGotoLecture().getPropPos());
		} else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer4().setPlayerPos(
					PropertySetup.getGotoLecture().getPropPos());
		}
	}
	
	/**
	 * This method is for test purposes only
	 */
	public static void testBackThreeSpaces() {
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer1().setPlayerPos(
					LeftPanel.getPlayer1().getPlayerPos() - 3);
		} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer2().setPlayerPos(
					LeftPanel.getPlayer2().getPlayerPos() - 3);
		} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer3().setPlayerPos(
					LeftPanel.getPlayer3().getPlayerPos() - 3);
		} else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			LeftPanel.getPlayer4().setPlayerPos(
					LeftPanel.getPlayer4().getPlayerPos() - 3);
		}
	}
}