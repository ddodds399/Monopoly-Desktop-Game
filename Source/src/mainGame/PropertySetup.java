package mainGame;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import mainWindow.Building;
import mainWindow.LeftPanel;
import mainWindow.RightPanel;

/**
 * This class sets up the properties for the board
 * 
 * @author Brogrammers
 */
public class PropertySetup {

	static ArrayList<Properties> props = new ArrayList<Properties>();

	static Properties go = new Properties("Go", 0, 0, 0, 0, false, 0, 0, null);
	static Properties agincourtAve = new Properties("Agincourt Avenue", 1, 20,
			18, 2, true, 20, 70, "brown");
	static Properties shotCard = new Properties("Shot 1", 2, 0, 0, 0,
			false, 0, 0, null);
	static Properties tatesAve = new Properties("Tates Avenue", 3, 40, 30, 4,
			true, 20, 70, "brown");
	static Properties monthlyRent = new Properties("Monthly Rent", 4, 0, 0, 0,
			false, 0, 0, null);
	static Properties adelaideTrain = new Properties("Adelaide Train Station",
			5, 200, 100, 0, true, 0, 0, "train");
	static Properties bcbRubble = new Properties("BCB Rubble", 6, 100, 80, 10,
			true, 40, 90, "blue");
	static Properties warp = new Properties("Warp 1", 7, 0, 0, 0, false,
			0, 0, null);
	static Properties dunluceAve = new Properties("Dunluce Avenue", 8, 100, 80,
			10, true, 40, 90, "blue");
	static Properties maloneAve = new Properties("Malone Avenue", 9, 120, 90,
			12, true, 40, 90, "blue");
	static Properties jail = new Properties("Lecture Hall", 10, 0, 0, 0, false,
			0, 0, null);
	static Properties soca = new Properties("School of Creative Arts", 11, 140,
			120, 18, true, 40, 110, "pink");
	static Properties nie = new Properties("NIE", 12, 150, 75, 0, true,
			0, 0, null);
	static Properties theologyCentre = new Properties("Theology Centre", 13,
			140, 120, 18, true, 60, 140, "pink");
	static Properties maloneRoad = new Properties("Malone Road", 14, 160, 130,
			19, true, 60, 140, "pink");
	static Properties cityHospitalTrain = new Properties(
			"City Hospital Train Station", 15, 200, 100, 0, true, 0, 0,
			"train");
	static Properties fitzwilliamStreet = new Properties("Fitzwilliam Street",
			16, 160, 135, 22, true, 80, 180, "orange");
	static Properties shotCard2 = new Properties("Shot 2", 17, 0, 0, 0,
			false, 0, 0, null);
	static Properties geographyBuilding = new Properties("Geography Building",
			18, 180, 155, 26, true, 80, 180, "orange");
	static Properties ecsBuilding = new Properties("ECS Building", 19, 200,
			160, 28, true, 80, 180, "orange");
	static Properties parking = new Properties("PEC Parking", 20, 0, 0, 0,
			false, 0, 0, null);
	static Properties boojum = new Properties("Boojum", 21, 220, 190, 30, true,
			100, 220, "red");
	static Properties warp2 = new Properties("Warp 2", 22, 0, 0, 0,
			false, 0, 0, null);
	static Properties pec = new Properties("PEC", 23, 220, 190, 30, true, 100, 220,
			"red");
	static Properties ashbyBuilding = new Properties("Ashby Building", 24, 240,
			200, 34, true, 100, 220, "red");
	static Properties botanicTrain = new Properties("Botanic Train Station",
			25, 200, 100, 0, true, 0, 0, "train");
	static Properties mcClayLibrary = new Properties("McClay Library", 26, 260,
			220, 38, true, 120, 260, "yellow");
	static Properties peterFroggatCentre = new Properties(
			"Peter Froggatt Centre", 27, 260, 220, 38, true, 120, 260, "yellow");
	static Properties air = new Properties("Airtricity", 28, 150, 75, 0, true,
			0, 0, null);
	static Properties mbc = new Properties("MBC", 29, 280, 240, 42, true, 120, 260,
			"yellow");
	static Properties gotoLecture = new Properties("Go To Lecture", 30, 0, 0, 0,
			false, 0, 0, null);
	static Properties whitlaHall = new Properties("Whitla Hall", 31, 300, 280,
			45, true, 140, 300, "green");
	static Properties dkb = new Properties("DKB", 32, 300, 280, 45, true, 140, 300,
			"green");
	static Properties shotCard3 = new Properties("Shot 3", 33, 0, 0, 0,
			false, 0, 0, null);
	static Properties studentUnion = new Properties("Student Union", 34, 320,
			290, 48, true, 140, 300, "green");
	static Properties centralTrain = new Properties("Central Train Station",
			35, 200, 100, 0, true, 0, 0, "train");
	static Properties warp3 = new Properties("Warp 3", 36, 0, 0, 0,
			false, 0, 0, null);
	static Properties botanicGardens = new Properties("Botanic Gardens", 37,
			350, 320, 55, true, 160, 340, "purple");
	static Properties loan = new Properties("Loan", 38, 0, 0, 0, false,
			0, 0, null);
	static Properties lanyonBuilding = new Properties("Lanyon Building", 39,
			400, 370, 60, true, 160, 340, "purple");

	/**
	 * This method allows players to buy a property
	 */
	public static void buyProperty() {
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			int i = 0;
			while (LeftPanel.getPlayer1().getPlayerPos() != getProps().get(i)
					.getPropPos()) {
				i++;

			}
			if (getProps().get(i).isBuyable() == true) {

				Object[] buy = { "Yes", "No" };

				int purchase = JOptionPane.showOptionDialog(null,
						"Would you like to buy "
								+ getProps().get(i).getPropertyName(),
						"Purchase?", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE, PropertyImages.imageList().get(i), buy, "No");

				if (purchase == 0) {
					// getProps().get(i).setBuyable(false);
					LeftPanel.getPlayer1().buyProperty(getProps().get(i));
					//System.out.println("MoneyLeft: "
							//+ LeftPanel.getPlayer1().getPlayerMoney());
					//System.out.println(LeftPanel.getPlayer1().getPlayerName()
							//+ " now owns: ");
					LeftPanel.getPlayer1Label().setText(
							LeftPanel.getPlayer1().getPlayerName() + " £"
									+ LeftPanel.getPlayer1().getPlayerMoney());
					//for (int j = 0; j < LeftPanel.getPlayer1()
							//.getPropertiesArray().size(); j++)

						//System.out.println(LeftPanel.getPlayer1()
								//.getPropertiesArray().get(j).getPropertyName());
				}
			}

			// find a property with a certain position and return the property
			// object

		} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			int i = 0;
			while (LeftPanel.getPlayer2().getPlayerPos() != getProps().get(i)
					.getPropPos()) {
				i++;

			}
			if (getProps().get(i).isBuyable() == true) {

				Object[] buy = { "Yes", "No" };

				int purchase = JOptionPane.showOptionDialog(null,
						"Would you like to buy "
								+ getProps().get(i).getPropertyName(),
						"Purchase?", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE, PropertyImages.imageList().get(i), buy, "No");

				if (purchase == 0) {
					// getProps().get(i).setBuyable(false);
					LeftPanel.getPlayer2().buyProperty(getProps().get(i));
					//System.out.println("MoneyLeft: "
							//+ LeftPanel.getPlayer2().getPlayerMoney());
					//System.out.println(LeftPanel.getPlayer2().getPlayerName()
							//+ " now owns: ");
					LeftPanel.getPlayer2Label().setText(
							LeftPanel.getPlayer2().getPlayerName() + " £"
									+ LeftPanel.getPlayer2().getPlayerMoney());
					//for (int j = 0; j < LeftPanel.getPlayer2()
							//.getPropertiesArray().size(); j++)

						//System.out.println(LeftPanel.getPlayer2()
								//.getPropertiesArray().get(j).getPropertyName());
				}
			}

		} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			int i = 0;
			while (LeftPanel.getPlayer3().getPlayerPos() != getProps().get(i)
					.getPropPos()) {
				i++;

			}
			if (getProps().get(i).isBuyable() == true) {

				Object[] buy = { "Yes", "No" };

				int purchase = JOptionPane.showOptionDialog(null,
						"Would you like to buy "
								+ getProps().get(i).getPropertyName(),
						"Purchase?", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE, PropertyImages.imageList().get(i), buy, "No");

				if (purchase == 0) {
					 //getProps().get(i).setBuyable(false);
					LeftPanel.getPlayer3().buyProperty(getProps().get(i));
					//System.out.println("MoneyLeft: "
							//+ LeftPanel.getPlayer3().getPlayerMoney());
					//System.out.println(LeftPanel.getPlayer3().getPlayerName()
							//+ " now owns: ");
					LeftPanel.getPlayer3Label().setText(
							LeftPanel.getPlayer3().getPlayerName() + " £"
									+ LeftPanel.getPlayer3().getPlayerMoney());
					//for (int j = 0; j < LeftPanel.getPlayer3()
							//.getPropertiesArray().size(); j++)

						//System.out.println(LeftPanel.getPlayer3()
								//.getPropertiesArray().get(j).getPropertyName());
				}
			}

		}

		else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			int i = 0;
			while (LeftPanel.getPlayer4().getPlayerPos() != getProps().get(i)
					.getPropPos()) {
				i++;

			}
			if (getProps().get(i).isBuyable() == true) {

				Object[] buy = { "Yes", "No" };

				int purchase = JOptionPane.showOptionDialog(null,
						"Would you like to buy "
								+ getProps().get(i).getPropertyName(),
						"Purchase?", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE, PropertyImages.imageList().get(i), buy, "No");

				if (purchase == 0) {
					 //getProps().get(i).setBuyable(false);
					LeftPanel.getPlayer4().buyProperty(getProps().get(i));
					//System.out.println("MoneyLeft: "
							//+ LeftPanel.getPlayer4().getPlayerMoney());
					//System.out.println(LeftPanel.getPlayer1().getPlayerName()
							//+ " now owns: ");
					LeftPanel.getPlayer4Label().setText(
							LeftPanel.getPlayer4().getPlayerName() + " £"
									+ LeftPanel.getPlayer4().getPlayerMoney());
					//for (int j = 0; j < LeftPanel.getPlayer4()
							//.getPropertiesArray().size(); j++)

						//System.out.println(LeftPanel.getPlayer4()
								//.getPropertiesArray().get(j).getPropertyName());
				}

			}

		}

	}

	/**
	 * This method is used to pay rent from one player to another if a player owns a property
	 */
	public static void rent() {
		
		if((LeftPanel.getPlayer1().getPlayerNum() == RightPanel.getCurrentPlayer())
				&& ((LeftPanel.getPlayer1().getPlayerPos() == getAir().getPropPos()) ||
				(LeftPanel.getPlayer1().getPlayerPos() == getNie().getPropPos())))
		{
			payUtilityRent();
			return;
		}
		else if((LeftPanel.getPlayer2().getPlayerNum() == RightPanel.getCurrentPlayer())
				&& ((LeftPanel.getPlayer2().getPlayerPos() == getAir().getPropPos()) ||
				(LeftPanel.getPlayer2().getPlayerPos() == getNie().getPropPos())))
		{
			payUtilityRent();
			return;
		}
		else if((LeftPanel.getPlayer3().getPlayerNum() == RightPanel.getCurrentPlayer())
				&& ((LeftPanel.getPlayer3().getPlayerPos() == getAir().getPropPos()) ||
				(LeftPanel.getPlayer3().getPlayerPos() == getNie().getPropPos())))
		{
			payUtilityRent();
			return;
		}
		else if((LeftPanel.getPlayer4().getPlayerNum() == RightPanel.getCurrentPlayer())
				&& ((LeftPanel.getPlayer4().getPlayerPos() == getAir().getPropPos()) ||
				(LeftPanel.getPlayer4().getPlayerPos() == getNie().getPropPos())))
		{
			payUtilityRent();
			return;
		}
		// if the current player does not own the square they land on
		// and another player owns the property
		// then pay the rent money to the player that owns the property
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			int i = 0;
			i = getProps().get(LeftPanel.getPlayer1().getPlayerPos())
					.getPropPos();
			Properties j = getProps().get(i);
			if (getProps().get(i).isBuyable() == false
					&& !LeftPanel.getPlayer1().getPropertiesArray().contains(j)) {
				if (LeftPanel.getPlayer2().getPropertiesArray().contains(j)) {
					LeftPanel.getPlayer1().setPlayerMoney(
							LeftPanel.getPlayer1().getPlayerMoney()
									- getProps().get(i).getRent());
					LeftPanel
							.getPlayer2()
							.setPlayerMoney(
									(LeftPanel.getPlayer2().getPlayerMoney() + getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+ "Rent Paid to " + LeftPanel.getPlayer2().getPlayerName());
					LeftPanel.getPlayer1Label().setText(
							LeftPanel.getPlayer1().getPlayerName() + " £"
									+ LeftPanel.getPlayer1().getPlayerMoney());
					LeftPanel.getPlayer2Label().setText(
							LeftPanel.getPlayer2().getPlayerName() + " £"
									+ LeftPanel.getPlayer2().getPlayerMoney());
				} else if (LeftPanel.getPlayer3().getPropertiesArray()
						.contains(j)) {
					LeftPanel.getPlayer1().setPlayerMoney(
							LeftPanel.getPlayer1().getPlayerMoney()
									- getProps().get(i).getRent());
					LeftPanel
							.getPlayer3()
							.setPlayerMoney(
									(LeftPanel.getPlayer3().getPlayerMoney() + getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+ " Rent Paid to " + LeftPanel.getPlayer3().getPlayerName());
					LeftPanel.getPlayer1Label().setText(
							LeftPanel.getPlayer1().getPlayerName() + " £"
									+ LeftPanel.getPlayer1().getPlayerMoney());
					LeftPanel.getPlayer3Label().setText(
							LeftPanel.getPlayer3().getPlayerName() + " £"
									+ LeftPanel.getPlayer3().getPlayerMoney());
				} else if (LeftPanel.getPlayer4().getPropertiesArray()
						.contains(j)) {
					LeftPanel.getPlayer1().setPlayerMoney(
							LeftPanel.getPlayer1().getPlayerMoney()
									- getProps().get(i).getRent());
					LeftPanel
							.getPlayer4()
							.setPlayerMoney(
									(LeftPanel.getPlayer4().getPlayerMoney() + getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+  " Rent Paid to " + LeftPanel.getPlayer4().getPlayerName());
					LeftPanel.getPlayer1Label().setText(
							LeftPanel.getPlayer1().getPlayerName() + " £"
									+ LeftPanel.getPlayer1().getPlayerMoney());
					LeftPanel.getPlayer4Label().setText(
							LeftPanel.getPlayer4().getPlayerName() + " £"
									+ LeftPanel.getPlayer4().getPlayerMoney());
				}

			}

		} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			
			int i = 0;
			i = getProps().get(LeftPanel.getPlayer2().getPlayerPos())
					.getPropPos();
			Properties j = getProps().get(i);
			if (getProps().get(i).isBuyable() == false
					&& !LeftPanel.getPlayer2().getPropertiesArray().contains(j)) {
				if (LeftPanel.getPlayer1().getPropertiesArray().contains(j)) {
					LeftPanel.getPlayer1().setPlayerMoney(
							LeftPanel.getPlayer1().getPlayerMoney()
									+ getProps().get(i).getRent());
					LeftPanel
							.getPlayer2()
							.setPlayerMoney(
									(LeftPanel.getPlayer2().getPlayerMoney() - getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+ " Rent Paid to "+ LeftPanel.getPlayer1().getPlayerName());
					LeftPanel.getPlayer1Label().setText(
							LeftPanel.getPlayer1().getPlayerName() + " £"
									+ LeftPanel.getPlayer1().getPlayerMoney());
					LeftPanel.getPlayer2Label().setText(
							LeftPanel.getPlayer2().getPlayerName() + " £"
									+ LeftPanel.getPlayer2().getPlayerMoney());
				} else if (LeftPanel.getPlayer3().getPropertiesArray()
						.contains(j)) {
					LeftPanel.getPlayer2().setPlayerMoney(
							LeftPanel.getPlayer2().getPlayerMoney()
									- getProps().get(i).getRent());
					LeftPanel
							.getPlayer3()
							.setPlayerMoney(
									(LeftPanel.getPlayer3().getPlayerMoney() + getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+ " Rent Paid to " + LeftPanel.getPlayer3().getPlayerName());
					LeftPanel.getPlayer2Label().setText(
							LeftPanel.getPlayer2().getPlayerName() + " £"
									+ LeftPanel.getPlayer2().getPlayerMoney());
					LeftPanel.getPlayer3Label().setText(
							LeftPanel.getPlayer3().getPlayerName() + " £"
									+ LeftPanel.getPlayer3().getPlayerMoney());
				} else if (LeftPanel.getPlayer4().getPropertiesArray()
						.contains(j)) {
					LeftPanel.getPlayer2().setPlayerMoney(
							LeftPanel.getPlayer2().getPlayerMoney()
									- getProps().get(i).getRent());
					LeftPanel
							.getPlayer4()
							.setPlayerMoney(
									(LeftPanel.getPlayer4().getPlayerMoney() + getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+ " Rent Paid to " + LeftPanel.getPlayer4().getPlayerName());
					LeftPanel.getPlayer2Label().setText(
							LeftPanel.getPlayer2().getPlayerName() + " £"
									+ LeftPanel.getPlayer2().getPlayerMoney());
					LeftPanel.getPlayer4Label().setText(
							LeftPanel.getPlayer4().getPlayerName() + " £"
									+ LeftPanel.getPlayer4().getPlayerMoney());
				}

			}

		} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			int i = 0;
			i = getProps().get(LeftPanel.getPlayer3().getPlayerPos())
					.getPropPos();
			Properties j = getProps().get(i);
			if (getProps().get(i).isBuyable() == false
					&& !LeftPanel.getPlayer3().getPropertiesArray().contains(j)) {
				if (LeftPanel.getPlayer1().getPropertiesArray().contains(j)) {
					LeftPanel.getPlayer1().setPlayerMoney(
							LeftPanel.getPlayer1().getPlayerMoney()
									+ getProps().get(i).getRent());
					LeftPanel
							.getPlayer3()
							.setPlayerMoney(
									(LeftPanel.getPlayer3().getPlayerMoney() - getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+ " Rent Paid to "  +LeftPanel.getPlayer1().getPlayerName());
					LeftPanel.getPlayer1Label().setText(
							LeftPanel.getPlayer1().getPlayerName() + " £"
									+ LeftPanel.getPlayer1().getPlayerMoney());
					LeftPanel.getPlayer3Label().setText(
							LeftPanel.getPlayer3().getPlayerName() + " £"
									+ LeftPanel.getPlayer3().getPlayerMoney());
				} else if (LeftPanel.getPlayer2().getPropertiesArray()
						.contains(j)) {
					LeftPanel.getPlayer2().setPlayerMoney(
							LeftPanel.getPlayer2().getPlayerMoney()
									+ getProps().get(i).getRent());
					LeftPanel
							.getPlayer3()
							.setPlayerMoney(
									(LeftPanel.getPlayer3().getPlayerMoney() - getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+ " Rent Paid to " + LeftPanel.getPlayer2().getPlayerName());
					LeftPanel.getPlayer2Label().setText(
							LeftPanel.getPlayer2().getPlayerName() + " £"
									+ LeftPanel.getPlayer2().getPlayerMoney());
					LeftPanel.getPlayer3Label().setText(
							LeftPanel.getPlayer3().getPlayerName() + " £"
									+ LeftPanel.getPlayer3().getPlayerMoney());
				} else if (LeftPanel.getPlayer4().getPropertiesArray()
						.contains(j)) {
					LeftPanel.getPlayer3().setPlayerMoney(
							LeftPanel.getPlayer3().getPlayerMoney()
									- getProps().get(i).getRent());
					LeftPanel
							.getPlayer4()
							.setPlayerMoney(
									(LeftPanel.getPlayer4().getPlayerMoney() + getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+ " Rent Paid to "+ LeftPanel.getPlayer4().getPlayerName());
					LeftPanel.getPlayer3Label().setText(
							LeftPanel.getPlayer3().getPlayerName() + " £"
									+ LeftPanel.getPlayer3().getPlayerMoney());
					LeftPanel.getPlayer4Label().setText(
							LeftPanel.getPlayer4().getPlayerName() + " £"
									+ LeftPanel.getPlayer4().getPlayerMoney());
				}

			}

		} else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			int i = 0;
			i = getProps().get(LeftPanel.getPlayer4().getPlayerPos())
					.getPropPos();
			Properties j = getProps().get(i);
			if (getProps().get(i).isBuyable() == false
					&& !LeftPanel.getPlayer4().getPropertiesArray().contains(j)) {
				if (LeftPanel.getPlayer1().getPropertiesArray().contains(j)) {
					LeftPanel.getPlayer1().setPlayerMoney(
							LeftPanel.getPlayer1().getPlayerMoney()
									+ getProps().get(i).getRent());
					LeftPanel
							.getPlayer4()
							.setPlayerMoney(
									(LeftPanel.getPlayer4().getPlayerMoney() - getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+ " Rent Paid to " + LeftPanel.getPlayer1().getPlayerName());
					LeftPanel.getPlayer1Label().setText(
							LeftPanel.getPlayer1().getPlayerName() + " £"
									+ LeftPanel.getPlayer1().getPlayerMoney());
					LeftPanel.getPlayer4Label().setText(
							LeftPanel.getPlayer4().getPlayerName() + " £"
									+ LeftPanel.getPlayer4().getPlayerMoney());
				} else if (LeftPanel.getPlayer2().getPropertiesArray()
						.contains(j)) {
					LeftPanel.getPlayer2().setPlayerMoney(
							LeftPanel.getPlayer2().getPlayerMoney()
									+ getProps().get(i).getRent());
					LeftPanel
							.getPlayer4()
							.setPlayerMoney(
									(LeftPanel.getPlayer4().getPlayerMoney() - getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+ " Rent Paid to " +LeftPanel.getPlayer2().getPlayerName());
					LeftPanel.getPlayer2Label().setText(
							LeftPanel.getPlayer2().getPlayerName() + " £"
									+ LeftPanel.getPlayer2().getPlayerMoney());
					LeftPanel.getPlayer4Label().setText(
							LeftPanel.getPlayer4().getPlayerName() + " £"
									+ LeftPanel.getPlayer4().getPlayerMoney());
				} else if (LeftPanel.getPlayer3().getPropertiesArray()
						.contains(j)) {
					LeftPanel.getPlayer3().setPlayerMoney(
							LeftPanel.getPlayer3().getPlayerMoney()
									+ getProps().get(i).getRent());
					LeftPanel
							.getPlayer4()
							.setPlayerMoney(
									(LeftPanel.getPlayer4().getPlayerMoney() - getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+ " Rent Paid to "+ LeftPanel.getPlayer3().getPlayerName());
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
	
	/**
	 * This method is used to pay the rent of Utilities if a player lands on a utility property
	 */
	public static void payUtilityRent() {
		// if the current player does not own the square they land on
		// and another player owns the property
		// then pay the rent money to the player that owns the property
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			int i = 0;
			i = getProps().get(LeftPanel.getPlayer1().getPlayerPos())
					.getPropPos();
			Properties j = getProps().get(i);
			if (getProps().get(i).isBuyable() == false
					&& !LeftPanel.getPlayer1().getPropertiesArray().contains(j)) {
				if (LeftPanel.getPlayer2().getPropertiesArray().contains(j)) {
					if((LeftPanel.getPlayer2().getPropertiesArray().contains(getNie()))
							&& (LeftPanel.getPlayer2().getPropertiesArray().contains(getAir())))
							{
								j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*10);
							}
					else
					{
						j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*4);
					}
					LeftPanel.getPlayer1().setPlayerMoney(
							LeftPanel.getPlayer1().getPlayerMoney()
									- getProps().get(i).getRent());
					LeftPanel
							.getPlayer2()
							.setPlayerMoney(
									(LeftPanel.getPlayer2().getPlayerMoney() + getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+ " Rent Paid to "+LeftPanel.getPlayer2().getPlayerName());
					LeftPanel.getPlayer1Label().setText(
							LeftPanel.getPlayer1().getPlayerName() + " £"
									+ LeftPanel.getPlayer1().getPlayerMoney());
					LeftPanel.getPlayer2Label().setText(
							LeftPanel.getPlayer2().getPlayerName() + " £"
									+ LeftPanel.getPlayer2().getPlayerMoney());
				} else if (LeftPanel.getPlayer3().getPropertiesArray()
						.contains(j)) {
					
					if((LeftPanel.getPlayer3().getPropertiesArray().contains(getNie()))
							&& (LeftPanel.getPlayer3().getPropertiesArray().contains(getAir())))
							{
								j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*10);
							}
					else
					{
						j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*4);
					}
					LeftPanel.getPlayer1().setPlayerMoney(
							LeftPanel.getPlayer1().getPlayerMoney()
									- getProps().get(i).getRent());
					LeftPanel
							.getPlayer3()
							.setPlayerMoney(
									(LeftPanel.getPlayer3().getPlayerMoney() + getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+ " Rent Paid "+LeftPanel.getPlayer3().getPlayerName());
					LeftPanel.getPlayer1Label().setText(
							LeftPanel.getPlayer1().getPlayerName() + " £"
									+ LeftPanel.getPlayer1().getPlayerMoney());
					LeftPanel.getPlayer3Label().setText(
							LeftPanel.getPlayer3().getPlayerName() + " £"
									+ LeftPanel.getPlayer3().getPlayerMoney());
				} else if (LeftPanel.getPlayer4().getPropertiesArray()
						.contains(j)) {
					
					if((LeftPanel.getPlayer4().getPropertiesArray().contains(getNie()))
							&& (LeftPanel.getPlayer4().getPropertiesArray().contains(getAir())))
							{
								j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*10);
							}
					else
					{
						j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*4);
					}
					LeftPanel.getPlayer1().setPlayerMoney(
							LeftPanel.getPlayer1().getPlayerMoney()
									- getProps().get(i).getRent());
					LeftPanel
							.getPlayer4()
							.setPlayerMoney(
									(LeftPanel.getPlayer4().getPlayerMoney() + getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+ " Rent Paid to "+LeftPanel.getPlayer4().getPlayerName());
					LeftPanel.getPlayer1Label().setText(
							LeftPanel.getPlayer1().getPlayerName() + " £"
									+ LeftPanel.getPlayer1().getPlayerMoney());
					LeftPanel.getPlayer4Label().setText(
							LeftPanel.getPlayer4().getPlayerName() + " £"
									+ LeftPanel.getPlayer4().getPlayerMoney());
				}

			}

		} else if (LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			int i = 0;
			i = getProps().get(LeftPanel.getPlayer2().getPlayerPos())
					.getPropPos();
			Properties j = getProps().get(i);
			if (getProps().get(i).isBuyable() == false
					&& !LeftPanel.getPlayer2().getPropertiesArray().contains(j)) {
				if (LeftPanel.getPlayer1().getPropertiesArray().contains(j)) {
					
					if((LeftPanel.getPlayer1().getPropertiesArray().contains(getNie()))
							&& (LeftPanel.getPlayer1().getPropertiesArray().contains(getAir())))
							{
								j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*10);
							}
					else
					{
						j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*4);
					}
					LeftPanel.getPlayer1().setPlayerMoney(
							LeftPanel.getPlayer1().getPlayerMoney()
									+ getProps().get(i).getRent());
					LeftPanel
							.getPlayer2()
							.setPlayerMoney(
									(LeftPanel.getPlayer2().getPlayerMoney() - getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+ " Rent Paid to" +LeftPanel.getPlayer1().getPlayerName());
					LeftPanel.getPlayer1Label().setText(
							LeftPanel.getPlayer1().getPlayerName() + " £"
									+ LeftPanel.getPlayer1().getPlayerMoney());
					LeftPanel.getPlayer2Label().setText(
							LeftPanel.getPlayer2().getPlayerName() + " £"
									+ LeftPanel.getPlayer2().getPlayerMoney());
				} else if (LeftPanel.getPlayer3().getPropertiesArray()
						.contains(j)) {
					
					if((LeftPanel.getPlayer3().getPropertiesArray().contains(getNie()))
							&& (LeftPanel.getPlayer3().getPropertiesArray().contains(getAir())))
							{
								j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*10);
							}
					else
					{
						j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*4);
					}
					LeftPanel.getPlayer2().setPlayerMoney(
							LeftPanel.getPlayer2().getPlayerMoney()
									- getProps().get(i).getRent());
					LeftPanel
							.getPlayer3()
							.setPlayerMoney(
									(LeftPanel.getPlayer3().getPlayerMoney() + getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+  " Rent Paid to "+LeftPanel.getPlayer3().getPlayerName());
					LeftPanel.getPlayer2Label().setText(
							LeftPanel.getPlayer2().getPlayerName() + " £"
									+ LeftPanel.getPlayer2().getPlayerMoney());
					LeftPanel.getPlayer3Label().setText(
							LeftPanel.getPlayer3().getPlayerName() + " £"
									+ LeftPanel.getPlayer3().getPlayerMoney());
				} else if (LeftPanel.getPlayer4().getPropertiesArray()
						.contains(j)) {
					
					if((LeftPanel.getPlayer4().getPropertiesArray().contains(getNie()))
							&& (LeftPanel.getPlayer4().getPropertiesArray().contains(getAir())))
							{
								j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*10);
							}
					else
					{
						j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*4);
					}
					LeftPanel.getPlayer2().setPlayerMoney(
							LeftPanel.getPlayer2().getPlayerMoney()
									- getProps().get(i).getRent());
					LeftPanel
							.getPlayer4()
							.setPlayerMoney(
									(LeftPanel.getPlayer4().getPlayerMoney() + getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+ " Rent Paid to "+LeftPanel.getPlayer4().getPlayerName());
					LeftPanel.getPlayer2Label().setText(
							LeftPanel.getPlayer2().getPlayerName() + " £"
									+ LeftPanel.getPlayer2().getPlayerMoney());
					LeftPanel.getPlayer4Label().setText(
							LeftPanel.getPlayer4().getPlayerName() + " £"
									+ LeftPanel.getPlayer4().getPlayerMoney());
				}

			}

		} else if (LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			int i = 0;
			i = getProps().get(LeftPanel.getPlayer3().getPlayerPos())
					.getPropPos();
			Properties j = getProps().get(i);
			if (getProps().get(i).isBuyable() == false
					&& !LeftPanel.getPlayer3().getPropertiesArray().contains(j)) {
				if (LeftPanel.getPlayer1().getPropertiesArray().contains(j)) {
					
					if((LeftPanel.getPlayer1().getPropertiesArray().contains(getNie()))
							&& (LeftPanel.getPlayer1().getPropertiesArray().contains(getAir())))
							{
								j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*10);
							}
					else
					{
						j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*4);
					}
					LeftPanel.getPlayer1().setPlayerMoney(
							LeftPanel.getPlayer1().getPlayerMoney()
									+ getProps().get(i).getRent());
					LeftPanel
							.getPlayer3()
							.setPlayerMoney(
									(LeftPanel.getPlayer3().getPlayerMoney() - getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+ " Rent Paid to "+LeftPanel.getPlayer1().getPlayerName());
					LeftPanel.getPlayer1Label().setText(
							LeftPanel.getPlayer1().getPlayerName() + " £"
									+ LeftPanel.getPlayer1().getPlayerMoney());
					LeftPanel.getPlayer3Label().setText(
							LeftPanel.getPlayer3().getPlayerName() + " £"
									+ LeftPanel.getPlayer3().getPlayerMoney());
				} else if (LeftPanel.getPlayer2().getPropertiesArray()
						.contains(j)) {
					
					if((LeftPanel.getPlayer2().getPropertiesArray().contains(getNie()))
							&& (LeftPanel.getPlayer2().getPropertiesArray().contains(getAir())))
							{
								j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*10);
							}
					else
					{
						j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*4);
					}
					LeftPanel.getPlayer2().setPlayerMoney(
							LeftPanel.getPlayer2().getPlayerMoney()
									+ getProps().get(i).getRent());
					LeftPanel
							.getPlayer3()
							.setPlayerMoney(
									(LeftPanel.getPlayer3().getPlayerMoney() - getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+ " Rent Paid to "+LeftPanel.getPlayer2().getPlayerName());
					LeftPanel.getPlayer2Label().setText(
							LeftPanel.getPlayer2().getPlayerName() + " £"
									+ LeftPanel.getPlayer2().getPlayerMoney());
					LeftPanel.getPlayer3Label().setText(
							LeftPanel.getPlayer3().getPlayerName() + " £"
									+ LeftPanel.getPlayer3().getPlayerMoney());
				} else if (LeftPanel.getPlayer4().getPropertiesArray()
						.contains(j)) {
					
					if((LeftPanel.getPlayer4().getPropertiesArray().contains(getNie()))
							&& (LeftPanel.getPlayer4().getPropertiesArray().contains(getAir())))
							{
								j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*10);
							}
					else
					{
						j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*4);
					}
					LeftPanel.getPlayer3().setPlayerMoney(
							LeftPanel.getPlayer3().getPlayerMoney()
									- getProps().get(i).getRent());
					LeftPanel
							.getPlayer4()
							.setPlayerMoney(
									(LeftPanel.getPlayer4().getPlayerMoney() + getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+ " Rent Paid to "+LeftPanel.getPlayer4().getPlayerName());
					LeftPanel.getPlayer3Label().setText(
							LeftPanel.getPlayer3().getPlayerName() + " £"
									+ LeftPanel.getPlayer3().getPlayerMoney());
					LeftPanel.getPlayer4Label().setText(
							LeftPanel.getPlayer4().getPlayerName() + " £"
									+ LeftPanel.getPlayer4().getPlayerMoney());
				}

			}

		} else if (LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			int i = 0;
			i = getProps().get(LeftPanel.getPlayer4().getPlayerPos())
					.getPropPos();
			Properties j = getProps().get(i);
			if (getProps().get(i).isBuyable() == false
					&& !LeftPanel.getPlayer4().getPropertiesArray().contains(j)) {
				if (LeftPanel.getPlayer1().getPropertiesArray().contains(j)) {
					
					if((LeftPanel.getPlayer1().getPropertiesArray().contains(getNie()))
							&& (LeftPanel.getPlayer1().getPropertiesArray().contains(getAir())))
							{
								j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*10);
							}
					else
					{
						j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*4);
					}
					LeftPanel.getPlayer1().setPlayerMoney(
							LeftPanel.getPlayer1().getPlayerMoney()
									+ getProps().get(i).getRent());
					LeftPanel
							.getPlayer4()
							.setPlayerMoney(
									(LeftPanel.getPlayer4().getPlayerMoney() - getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+ " Rent Paid to "+LeftPanel.getPlayer1().getPlayerName());
					LeftPanel.getPlayer1Label().setText(
							LeftPanel.getPlayer1().getPlayerName() + " £"
									+ LeftPanel.getPlayer1().getPlayerMoney());
					LeftPanel.getPlayer4Label().setText(
							LeftPanel.getPlayer4().getPlayerName() + " £"
									+ LeftPanel.getPlayer4().getPlayerMoney());
				} else if (LeftPanel.getPlayer2().getPropertiesArray()
						.contains(j)) {
					
					if((LeftPanel.getPlayer2().getPropertiesArray().contains(getNie()))
							&& (LeftPanel.getPlayer2().getPropertiesArray().contains(getAir())))
							{
								j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*10);
							}
					else
					{
						j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*4);
					}
					LeftPanel.getPlayer2().setPlayerMoney(
							LeftPanel.getPlayer2().getPlayerMoney()
									+ getProps().get(i).getRent());
					LeftPanel
							.getPlayer4()
							.setPlayerMoney(
									(LeftPanel.getPlayer4().getPlayerMoney() - getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+ " Rent Paid to "+LeftPanel.getPlayer2().getPlayerName());
					LeftPanel.getPlayer2Label().setText(
							LeftPanel.getPlayer2().getPlayerName() + " £"
									+ LeftPanel.getPlayer2().getPlayerMoney());
					LeftPanel.getPlayer4Label().setText(
							LeftPanel.getPlayer4().getPlayerName() + " £"
									+ LeftPanel.getPlayer4().getPlayerMoney());
				} else if (LeftPanel.getPlayer3().getPropertiesArray()
						.contains(j)) {
					
					if((LeftPanel.getPlayer3().getPropertiesArray().contains(getNie()))
							&& (LeftPanel.getPlayer3().getPropertiesArray().contains(getAir())))
							{
								j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*10);
							}
					else
					{
						j.setRent((Dice.getDiceOne()+Dice.getDiceTwo())*4);
					}
					LeftPanel.getPlayer3().setPlayerMoney(
							LeftPanel.getPlayer3().getPlayerMoney()
									+ getProps().get(i).getRent());
					LeftPanel
							.getPlayer4()
							.setPlayerMoney(
									(LeftPanel.getPlayer4().getPlayerMoney() - getProps()
											.get(i).getRent()));
					JOptionPane.showMessageDialog(null, "£"+j.getRent()+ " Rent Paid to "+LeftPanel.getPlayer3().getPlayerName());
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

	@SuppressWarnings("unused")
	public static void buildProperty() {
		Building build = new Building();
		int numOfBrowns = 0, numOfBlues = 0, numOfPinks = 0, numOfOranges = 0, numOfReds = 0, numOfYellow = 0, numOfGreens = 0, numOfPurples = 0;
		if (LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer()) {
			int i = 0;
			for (i = 0; i < LeftPanel.getPlayer1().getPropertiesArray().size(); i++) {
				if (LeftPanel.getPlayer1().getPropertiesArray().get(i)
						.getPropColour().equals("brown")) {
					numOfBrowns = numOfBrowns + 1;

				} else if (LeftPanel.getPlayer1().getPropertiesArray().get(i)
						.getPropColour().equals("blue")) {
					numOfBlues = numOfBlues + 1;
				} else if (LeftPanel.getPlayer1().getPropertiesArray().get(i)
						.getPropColour().equals("pinks")) {
				}
			}
		}
	}

	/**
	 * This method is used to return the property arraylist
	 * @return - the property array list
	 */
	public static ArrayList<Properties> getProps() {
		props.add(go);
		props.add(agincourtAve);
		props.add(shotCard);
		props.add(tatesAve);
		props.add(monthlyRent);
		props.add(adelaideTrain);
		props.add(bcbRubble);
		props.add(warp);
		props.add(dunluceAve);
		props.add(maloneAve);
		props.add(jail);
		props.add(soca);
		props.add(nie);
		props.add(theologyCentre);
		props.add(maloneRoad);
		props.add(cityHospitalTrain);
		props.add(fitzwilliamStreet);
		props.add(shotCard2);
		props.add(geographyBuilding);
		props.add(ecsBuilding);
		props.add(parking);
		props.add(boojum);
		props.add(warp2);
		props.add(pec);
		props.add(ashbyBuilding);
		props.add(botanicTrain);
		props.add(mcClayLibrary);
		props.add(peterFroggatCentre);
		props.add(air);
		props.add(mbc);
		props.add(gotoLecture);
		props.add(whitlaHall);
		props.add(dkb);
		props.add(shotCard3);
		props.add(studentUnion);
		props.add(centralTrain);
		props.add(warp3);
		props.add(botanicGardens);
		props.add(loan);
		props.add(lanyonBuilding);

		return props;
	}

	/**
	 * This method returns the go space
	 * @return - Go space
	 */
	public static Properties getGo() {
		return go;
	}

	/**
	 * This method returns the Agincourt Avenue space
	 * @return - Agincourt avenue space
	 */
	public static Properties getAgincourtAve() {
		return agincourtAve;
	}

	/**
	 * This method returns the first shot card space
	 * @return - first shot card space
	 */
	public static Properties getShotCard() {
		return shotCard;
	}

	/**
	 * This method returns the tates avenue space
	 * @return - Tates avenue space
	 */
	public static Properties getTatesAve() {
		return tatesAve;
	}

	/**
	 * This method returns the monthly rent space
	 * @return - monthly rent space
	 */
	public static Properties getMonthlyRent() {
		return monthlyRent;
	}

	/**
	 * This method returns the adelaide train space
	 * @return - Adelaide train space
	 */
	public static Properties getAdelaideTrain() {
		return adelaideTrain;
	}

	/**
	 * This method returns the BCB rubble space
	 * @return - BCB rubble space
	 */
	public static Properties getBcbRubble() {
		return bcbRubble;
	}

	/**
	 * This method returns the first warp space
	 * @return - first warp space
	 */
	public static Properties getWarp() {
		return warp;
	}

	/**
	 * This method returns the dunluce avenue space
	 * @return - Dunluce avenue space
	 */
	public static Properties getDunluceAve() {
		return dunluceAve;
	}

	/**
	 * This method returns the malone avenue space
	 * @return - Malone avenue space
	 */
	public static Properties getMaloneAve() {
		return maloneAve;
	}

	/**
	 * This method returns the jail space
	 * @return
	 */
	public static Properties getJail() {
		return jail;
	}

	/**
	 * This method returns the Soca space
	 * @return - SOCA space
	 */
	public static Properties getSoca() {
		return soca;
	}

	/**
	 * This method returns the NIE space
	 * @return - NIE space
	 */
	public static Properties getNie() {
		return nie;
	}

	/**
	 * This method returns the theology centre space
	 * @return - Theology space
	 */
	public static Properties getTheologyCentre() {
		return theologyCentre;
	}

	/**
	 * This method returns the malone road space
	 * @return - Malone Road space
	 */
	public static Properties getMaloneRoad() {
		return maloneRoad;
	}

	/**
	 * This method returns the city hospital train space
	 * @return - City Hospital train space
	 */
	public static Properties getCityHospitalTrain() {
		return cityHospitalTrain;
	}

	/**
	 * This method returns the Fitzwilliam street space
	 * @return - Fitzwilliam street space
	 */
	public static Properties getFitzwilliamStreet() {
		return fitzwilliamStreet;
	}

	/**
	 * This method returns the second shot card space
	 * @return - shot card 2 space
	 */
	public static Properties getShotCard2() {
		return shotCard2;
	}

	/**
	 * This method returns the geography building space
	 * @return - Geography building space
	 */
	public static Properties getGeographyBuilding() {
		return geographyBuilding;
	}

	/**
	 * This method returns the ecsBuilding space
	 * @return - ECS building space
	 */
	public static Properties getEcsBuilding() {
		return ecsBuilding;
	}

	/**
	 * This method returns the PEC parking space
	 * @return - parking space
	 */
	public static Properties getParking() {
		return parking;
	}

	/**
	 * This method returns the Boojum space
	 * @return - Boojum space
	 */
	public static Properties getBoojum() {
		return boojum;
	}

	/**
	 * This method returns the second warp space
	 * @return - warp 2 space
	 */
	public static Properties getWarp2() {
		return warp2;
	}
	
	/**
	 * This method returns the PEC space
	 * @return - PEC space
	 */
	public static Properties getPec() {
		return pec;
	}

	/**
	 * This method returns the ashby building space
	 * @return - Ashby Building space
	 */
	public static Properties getAshbyBuilding() {
		return ashbyBuilding;
	}

	/**
	 * This method returns the botanic train space
	 * @return - Botanic Train space
	 */
	public static Properties getBotanicTrain() {
		return botanicTrain;
	}

	/**
	 * This method returns the McClay Library space
	 * @return - McClay Library space
	 */
	public static Properties getMcClayLibrary() {
		return mcClayLibrary;
	}

	/**
	 * This method returns the peter froggat centre space
	 * @return - Peter Froggat Centre space
	 */
	public static Properties getPeterFroggatCentre() {
		return peterFroggatCentre;
	}

	/**
	 * This method returns the Airtricity space
	 * @return - Airtricity Space
	 */
	public static Properties getAir() {
		return air;
	}
	
	/**
	 * This method returns the MBC space
	 * @return - MBC space
	 */
	public static Properties getMbc() {
		return mbc;
	}

	/**
	 * This method return the go to lecture space
	 * @return - go to lecture space
	 */
	public static Properties getGotoLecture() {
		return gotoLecture;
	}

	/**
	 * This method returns the whitla hall space
	 * @return - whitla hall space
	 */
	public static Properties getWhitlaHall() {
		return whitlaHall;
	}

	/**
	 * This method returns the DKB space
	 * @return - DKB space
	 */
	public static Properties getDkb() {
		return dkb;
	}

	/**
	 * This method returns the 3rd shot card space
	 * @return - Shot card 3 space
	 */
	public static Properties getShotCard3() {
		return shotCard3;
	}

	/**
	 * This method returns the student union space
	 * @return - Student Union space
	 */
	public static Properties getStudentUnion() {
		return studentUnion;
	}

	/**
	 * This method returns the central train space
	 * @return - Central Train space
	 */
	public static Properties getCentralTrain() {
		return centralTrain;
	}

	/**
	 * This method returns the 3rd warp space
	 * @return - Warp 3 space
	 */
	public static Properties getWarp3() {
		return warp3;
	}

	/**
	 * This method returns the Botanice Gardens space
	 * @return - Botanic Gardens space
	 */
	public static Properties getBotanicGardens() {
		return botanicGardens;
	}

	/**
	 * This method returns the loan space
	 * @return - Loan space
	 */
	public static Properties getLoan() {
		return loan;
	}

	/**
	 * This method returns the Lanyon building space
	 * @return - Lanyon Building space
	 */
	public static Properties getLanyonBuilding() {
		return lanyonBuilding;
	}
}