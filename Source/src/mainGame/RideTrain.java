package mainGame;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

import mainWindow.LeftPanel;
import mainWindow.MiddlePanel;
import mainWindow.RightPanel;

/**
 * This class is used to ride trains to other train stations
 * 
 * @author Brogrammers
 */
@SuppressWarnings("serial")
public class RideTrain extends RightPanel {

	/**
	 * This method is used to ride trains to other train stations. It costs £25 if no one
	 * owns the station, £50 to another player if they own the station and free if the current
	 * player owns the train station
	 */
	public static void rideTrain() {
		// Trains for player 1
		if ((LeftPanel.getPlayer1().getPlayerNum() == RightPanel
				.getCurrentPlayer() && ((LeftPanel.getPlayer1().getPlayerPos() == (PropertySetup
				.getAdelaideTrain().getPropPos()))
				|| (LeftPanel.getPlayer1().getPlayerPos() == (PropertySetup
						.getCityHospitalTrain().getPropPos()))
				|| (LeftPanel.getPlayer1().getPlayerPos() == (PropertySetup
						.getBotanicTrain().getPropPos())) || (LeftPanel
				.getPlayer1().getPlayerPos() == (PropertySetup
				.getCentralTrain().getPropPos()))))) {
			Object[] train = { "Yes", "No" };

			int rideTrain = JOptionPane.showOptionDialog(null,
					"Would you like to ride the train to another station?",
					"Yes/No", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, train, "No");

			if (rideTrain == 0) {
				Object[] select = { "Adelaide", "City Hospital", "Botanic",
						"Central" };

				int station = JOptionPane.showOptionDialog(null,
						"What station would you like?", "Select a station",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, select, "Adelaide");
				
				playTrainSound();

				if (station == 0) {
					if (LeftPanel
							.getPlayer1()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer1()
													.getPlayerPos()))) {
						JOptionPane.showMessageDialog(null,
								"Since you own this station, you pay nothing");
					} else if (LeftPanel
							.getPlayer2()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer1()
													.getPlayerPos()))) {
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() - 50);
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer2().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer3()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer1()
													.getPlayerPos()))) {
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() - 50);
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer3().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer4()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer1()
													.getPlayerPos()))) {
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() - 50);
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer4().getPlayerName()
								+ " to use their train");
					} else {
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() - 25);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null,
								"Paid £25 to use the train");
					}

					LeftPanel.getPlayer1().setPlayerPos(
							PropertySetup.getAdelaideTrain().getPropPos());
					MiddlePanel.setPlayerCharLocation(1, LeftPanel.getPlayer1()
							.getPlayerPos());
					getLogArea().append(
							"\n"
									+ LeftPanel.getPlayer1().getPlayerName()
									+ "'s position is "
									+ PropertySetup
											.getProps()
											.get(LeftPanel.getPlayer1()
													.getPlayerPos())
											.getPropertyName());
				}

				if (station == 1) {
					if (LeftPanel
							.getPlayer1()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer1()
													.getPlayerPos()))) {
						JOptionPane.showMessageDialog(null,
								"Since you own this station, you pay nothing");
					} else if (LeftPanel
							.getPlayer2()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer1()
													.getPlayerPos()))) {
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() - 50);
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer2().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer3()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer1()
													.getPlayerPos()))) {
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() - 50);
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer3().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer4()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer1()
													.getPlayerPos()))) {
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() - 50);
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer4().getPlayerName()
								+ " to use their train");
					} else {
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() - 25);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null,
								"Paid £25 to use the train");
					}

					LeftPanel.getPlayer1().setPlayerPos(
							PropertySetup.getCityHospitalTrain().getPropPos());
					MiddlePanel.setPlayerCharLocation(1, LeftPanel.getPlayer1()
							.getPlayerPos());
					getLogArea().append(
							"\n"
									+ LeftPanel.getPlayer1().getPlayerName()
									+ "'s position is "
									+ PropertySetup
											.getProps()
											.get(LeftPanel.getPlayer1()
													.getPlayerPos())
											.getPropertyName());
				}

				if (station == 2) {
					if (LeftPanel
							.getPlayer1()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer1()
													.getPlayerPos()))) {
						JOptionPane.showMessageDialog(null,
								"Since you own this station, you pay nothing");
					} else if (LeftPanel
							.getPlayer2()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer1()
													.getPlayerPos()))) {
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() - 50);
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer2().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer3()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer1()
													.getPlayerPos()))) {
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() - 50);
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer3().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer4()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer1()
													.getPlayerPos()))) {
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() - 50);
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer4().getPlayerName()
								+ " to use their train");
					} else {
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() - 25);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null,
								"Paid £25 to use the train");
					}

					LeftPanel.getPlayer1().setPlayerPos(
							PropertySetup.getBotanicTrain().getPropPos());
					MiddlePanel.setPlayerCharLocation(1, LeftPanel.getPlayer1()
							.getPlayerPos());
					getLogArea().append(
							"\n"
									+ LeftPanel.getPlayer1().getPlayerName()
									+ "'s position is "
									+ PropertySetup
											.getProps()
											.get(LeftPanel.getPlayer1()
													.getPlayerPos())
											.getPropertyName());
				}

				if (station == 3) {
					if (LeftPanel
							.getPlayer1()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer1()
													.getPlayerPos()))) {
						JOptionPane.showMessageDialog(null,
								"Since you own this station, you pay nothing");
					} else if (LeftPanel
							.getPlayer2()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer1()
													.getPlayerPos()))) {
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() - 50);
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer2().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer3()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer1()
													.getPlayerPos()))) {
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() - 50);
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer3().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer4()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer1()
													.getPlayerPos()))) {
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() - 50);
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer4().getPlayerName()
								+ " to use their train");
					} else {
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() - 25);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null,
								"Paid £25 to use the train");
					}
					LeftPanel.getPlayer1().setPlayerPos(
							PropertySetup.getCentralTrain().getPropPos());
					MiddlePanel.setPlayerCharLocation(1, LeftPanel.getPlayer1()
							.getPlayerPos());
					getLogArea().append(
							"\n"
									+ LeftPanel.getPlayer1().getPlayerName()
									+ "'s position is "
									+ PropertySetup
											.getProps()
											.get(LeftPanel.getPlayer1()
													.getPlayerPos())
											.getPropertyName());
				}
			}
		}

		// Trains for player 2
		if ((LeftPanel.getPlayer2().getPlayerNum() == RightPanel
				.getCurrentPlayer() && ((LeftPanel.getPlayer2().getPlayerPos() == (PropertySetup
				.getAdelaideTrain().getPropPos()))
				|| (LeftPanel.getPlayer2().getPlayerPos() == (PropertySetup
						.getCityHospitalTrain().getPropPos()))
				|| (LeftPanel.getPlayer2().getPlayerPos() == (PropertySetup
						.getBotanicTrain().getPropPos())) || (LeftPanel
				.getPlayer2().getPlayerPos() == (PropertySetup
				.getCentralTrain().getPropPos()))))) {
			Object[] train = { "Yes", "No" };

			int rideTrain = JOptionPane.showOptionDialog(null,
					"Would you like to ride the train to another station?",
					"Yes/No", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, train, "No");

			if (rideTrain == 0) {
				Object[] select = { "Adelaide", "City Hospital", "Botanic",
						"Central" };

				int station = JOptionPane.showOptionDialog(null,
						"What station would you like?", "Select a station",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, select, "Adelaide");

				playTrainSound();

				if (station == 0) {
					if (LeftPanel
							.getPlayer2()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer2()
													.getPlayerPos()))) {
						JOptionPane.showMessageDialog(null,
								"Since you own this station, you pay nothing");
					} else if (LeftPanel
							.getPlayer1()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer2()
													.getPlayerPos()))) {
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() - 50);
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer1().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer3()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer2()
													.getPlayerPos()))) {
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() - 50);
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() + 50);
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer3().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer4()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer2()
													.getPlayerPos()))) {
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() - 50);
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() + 50);
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer4().getPlayerName()
								+ " to use their train");
					} else {
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() - 25);
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null,
								"Paid £25 to use the train");
					}

					LeftPanel.getPlayer2().setPlayerPos(
							PropertySetup.getAdelaideTrain().getPropPos());
					MiddlePanel.setPlayerCharLocation(2, LeftPanel.getPlayer2()
							.getPlayerPos());
					getLogArea().append(
							"\n"
									+ LeftPanel.getPlayer2().getPlayerName()
									+ "'s position is "
									+ PropertySetup
											.getProps()
											.get(LeftPanel.getPlayer2()
													.getPlayerPos())
											.getPropertyName());
				}

				if (station == 1) {
					if (LeftPanel
							.getPlayer2()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer2()
													.getPlayerPos()))) {
						JOptionPane.showMessageDialog(null,
								"Since you own this station, you pay nothing");
					} else if (LeftPanel
							.getPlayer1()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer2()
													.getPlayerPos()))) {
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() - 50);
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer1().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer3()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer2()
													.getPlayerPos()))) {
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() - 50);
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() + 50);
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer3().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer4()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer2()
													.getPlayerPos()))) {
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() - 50);
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() + 50);
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer4().getPlayerName()
								+ " to use their train");
					} else {
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() - 25);
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null,
								"Paid £25 to use the train");
					}

					LeftPanel.getPlayer2().setPlayerPos(
							PropertySetup.getCityHospitalTrain().getPropPos());
					MiddlePanel.setPlayerCharLocation(2, LeftPanel.getPlayer2()
							.getPlayerPos());
					getLogArea().append(
							"\n"
									+ LeftPanel.getPlayer2().getPlayerName()
									+ "'s position is "
									+ PropertySetup
											.getProps()
											.get(LeftPanel.getPlayer2()
													.getPlayerPos())
											.getPropertyName());
				}

				if (station == 2) {
					if (LeftPanel
							.getPlayer2()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer2()
													.getPlayerPos()))) {
						JOptionPane.showMessageDialog(null,
								"Since you own this station, you pay nothing");
					} else if (LeftPanel
							.getPlayer1()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer2()
													.getPlayerPos()))) {
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() - 50);
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer1().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer3()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer2()
													.getPlayerPos()))) {
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() - 50);
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() + 50);
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer3().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer4()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer2()
													.getPlayerPos()))) {
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() - 50);
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() + 50);
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer4().getPlayerName()
								+ " to use their train");
					} else {
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() - 25);
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null,
								"Paid £25 to use the train");
					}

					LeftPanel.getPlayer2().setPlayerPos(
							PropertySetup.getBotanicTrain().getPropPos());
					MiddlePanel.setPlayerCharLocation(2, LeftPanel.getPlayer2()
							.getPlayerPos());
					getLogArea().append(
							"\n"
									+ LeftPanel.getPlayer2().getPlayerName()
									+ "'s position is "
									+ PropertySetup
											.getProps()
											.get(LeftPanel.getPlayer2()
													.getPlayerPos())
											.getPropertyName());
				}

				if (station == 3) {
					if (LeftPanel
							.getPlayer2()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer2()
													.getPlayerPos()))) {
						JOptionPane.showMessageDialog(null,
								"Since you own this station, you pay nothing");
					} else if (LeftPanel
							.getPlayer1()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer2()
													.getPlayerPos()))) {
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() - 50);
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer1().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer3()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer2()
													.getPlayerPos()))) {
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() - 50);
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() + 50);
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer3().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer4()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer2()
													.getPlayerPos()))) {
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() - 50);
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() + 50);
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer4().getPlayerName()
								+ " to use their train");
					} else {
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() - 25);
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null,
								"Paid £25 to use the train");
					}

					LeftPanel.getPlayer2().setPlayerPos(
							PropertySetup.getCentralTrain().getPropPos());
					MiddlePanel.setPlayerCharLocation(2, LeftPanel.getPlayer2()
							.getPlayerPos());
					getLogArea().append(
							"\n"
									+ LeftPanel.getPlayer2().getPlayerName()
									+ "'s position is "
									+ PropertySetup
											.getProps()
											.get(LeftPanel.getPlayer2()
													.getPlayerPos())
											.getPropertyName());
				}
			}
		}

		// Player 3 trains
		if ((LeftPanel.getPlayer3().getPlayerNum() == RightPanel
				.getCurrentPlayer() && ((LeftPanel.getPlayer3().getPlayerPos() == (PropertySetup
				.getAdelaideTrain().getPropPos()))
				|| (LeftPanel.getPlayer3().getPlayerPos() == (PropertySetup
						.getCityHospitalTrain().getPropPos()))
				|| (LeftPanel.getPlayer3().getPlayerPos() == (PropertySetup
						.getBotanicTrain().getPropPos())) || (LeftPanel
				.getPlayer3().getPlayerPos() == (PropertySetup
				.getCentralTrain().getPropPos()))))) {
			Object[] train = { "Yes", "No" };

			int rideTrain = JOptionPane.showOptionDialog(null,
					"Would you like to ride the train to another station?",
					"Yes/No", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, train, "No");

			if (rideTrain == 0) {
				Object[] select = { "Adelaide", "City Hospital", "Botanic",
						"Central" };

				int station = JOptionPane.showOptionDialog(null,
						"What station would you like?", "Select a station",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, select, "Adelaide");

				playTrainSound();

				if (station == 0) {
					if (LeftPanel
							.getPlayer3()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer3()
													.getPlayerPos()))) {
						JOptionPane.showMessageDialog(null,
								"Since you own this station, you pay nothing");
					} else if (LeftPanel
							.getPlayer1()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer3()
													.getPlayerPos()))) {
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() - 50);
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer1().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer2()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer3()
													.getPlayerPos()))) {
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() - 50);
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() + 50);
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer2().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer4()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer3()
													.getPlayerPos()))) {
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() - 50);
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() + 50);
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer4().getPlayerName()
								+ " to use their train");
					} else {
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() - 25);
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null,
								"Paid £25 to use the train");
					}

					LeftPanel.getPlayer3().setPlayerPos(
							PropertySetup.getAdelaideTrain().getPropPos());
					MiddlePanel.setPlayerCharLocation(3, LeftPanel.getPlayer3()
							.getPlayerPos());
					getLogArea().append(
							"\n"
									+ LeftPanel.getPlayer3().getPlayerName()
									+ "'s position is "
									+ PropertySetup
											.getProps()
											.get(LeftPanel.getPlayer3()
													.getPlayerPos())
											.getPropertyName());
				}

				if (station == 1) {
					if (LeftPanel
							.getPlayer3()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer3()
													.getPlayerPos()))) {
						JOptionPane.showMessageDialog(null,
								"Since you own this station, you pay nothing");
					} else if (LeftPanel
							.getPlayer1()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer3()
													.getPlayerPos()))) {
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() - 50);
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer1().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer2()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer3()
													.getPlayerPos()))) {
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() - 50);
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() + 50);
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer2().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer4()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer3()
													.getPlayerPos()))) {
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() - 50);
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() + 50);
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer4().getPlayerName()
								+ " to use their train");
					} else {
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() - 25);
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null,
								"Paid £25 to use the train");
					}

					LeftPanel.getPlayer3().setPlayerPos(
							PropertySetup.getCityHospitalTrain().getPropPos());
					MiddlePanel.setPlayerCharLocation(3, LeftPanel.getPlayer3()
							.getPlayerPos());
					getLogArea().append(
							"\n"
									+ LeftPanel.getPlayer3().getPlayerName()
									+ "'s position is "
									+ PropertySetup
											.getProps()
											.get(LeftPanel.getPlayer3()
													.getPlayerPos())
											.getPropertyName());
				}

				if (station == 2) {
					if (LeftPanel
							.getPlayer3()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer3()
													.getPlayerPos()))) {
						JOptionPane.showMessageDialog(null,
								"Since you own this station, you pay nothing");
					} else if (LeftPanel
							.getPlayer1()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer3()
													.getPlayerPos()))) {
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() - 50);
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer1().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer2()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer3()
													.getPlayerPos()))) {
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() - 50);
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() + 50);
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer2().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer4()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer3()
													.getPlayerPos()))) {
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() - 50);
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() + 50);
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer4().getPlayerName()
								+ " to use their train");
					} else {
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() - 25);
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null,
								"Paid £25 to use the train");
					}

					LeftPanel.getPlayer3().setPlayerPos(
							PropertySetup.getBotanicTrain().getPropPos());
					MiddlePanel.setPlayerCharLocation(3, LeftPanel.getPlayer3()
							.getPlayerPos());
					getLogArea().append(
							"\n"
									+ LeftPanel.getPlayer3().getPlayerName()
									+ "'s position is "
									+ PropertySetup
											.getProps()
											.get(LeftPanel.getPlayer3()
													.getPlayerPos())
											.getPropertyName());
				}

				if (station == 3) {
					if (LeftPanel
							.getPlayer3()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer3()
													.getPlayerPos()))) {
						JOptionPane.showMessageDialog(null,
								"Since you own this station, you pay nothing");
					} else if (LeftPanel
							.getPlayer1()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer3()
													.getPlayerPos()))) {
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() - 50);
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer1().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer2()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer3()
													.getPlayerPos()))) {
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() - 50);
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() + 50);
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer2().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer4()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer3()
													.getPlayerPos()))) {
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() - 50);
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() + 50);
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer4().getPlayerName()
								+ " to use their train");
					} else {
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() - 25);
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null,
								"Paid £25 to use the train");
					}

					LeftPanel.getPlayer3().setPlayerPos(
							PropertySetup.getCentralTrain().getPropPos());
					MiddlePanel.setPlayerCharLocation(3, LeftPanel.getPlayer3()
							.getPlayerPos());
					getLogArea().append(
							"\n"
									+ LeftPanel.getPlayer3().getPlayerName()
									+ "'s position is "
									+ PropertySetup
											.getProps()
											.get(LeftPanel.getPlayer3()
													.getPlayerPos())
											.getPropertyName());
				}
			}
		}

		// Player 4 trains
		if ((LeftPanel.getPlayer4().getPlayerNum() == RightPanel
				.getCurrentPlayer() && ((LeftPanel.getPlayer4().getPlayerPos() == (PropertySetup
				.getAdelaideTrain().getPropPos()))
				|| (LeftPanel.getPlayer4().getPlayerPos() == (PropertySetup
						.getCityHospitalTrain().getPropPos()))
				|| (LeftPanel.getPlayer4().getPlayerPos() == (PropertySetup
						.getBotanicTrain().getPropPos())) || (LeftPanel
				.getPlayer4().getPlayerPos() == (PropertySetup
				.getCentralTrain().getPropPos()))))) {
			Object[] train = { "Yes", "No" };

			int rideTrain = JOptionPane.showOptionDialog(null,
					"Would you like to ride the train to another station?",
					"Yes/No", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, train, "Adelaide");

			if (rideTrain == 0) {
				Object[] select = { "Adelaide", "City Hospital", "Botanic",
						"Central" };

				int station = JOptionPane.showOptionDialog(null,
						"What station would you like?", "Select a station",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, select, "No");

				playTrainSound();

				if (station == 0) {
					if (LeftPanel
							.getPlayer4()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer4()
													.getPlayerPos()))) {
						JOptionPane.showMessageDialog(null,
								"Since you own this station, you pay nothing");
					} else if (LeftPanel
							.getPlayer1()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer4()
													.getPlayerPos()))) {
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() - 50);
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer1().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer2()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer4()
													.getPlayerPos()))) {
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() - 50);
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() + 50);
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer2().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer3()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer4()
													.getPlayerPos()))) {
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() - 50);
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() + 50);
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer3().getPlayerName()
								+ " to use their train");
					} else {
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() - 25);
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null,
								"Paid £25 to use the train");
					}

					LeftPanel.getPlayer4().setPlayerPos(
							PropertySetup.getAdelaideTrain().getPropPos());
					MiddlePanel.setPlayerCharLocation(4, LeftPanel.getPlayer4()
							.getPlayerPos());
					getLogArea().append(
							"\n"
									+ LeftPanel.getPlayer4().getPlayerName()
									+ "'s position is "
									+ PropertySetup
											.getProps()
											.get(LeftPanel.getPlayer4()
													.getPlayerPos())
											.getPropertyName());
				}

				if (station == 1) {
					if (LeftPanel
							.getPlayer4()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer4()
													.getPlayerPos()))) {
						JOptionPane.showMessageDialog(null,
								"Since you own this station, you pay nothing");
					} else if (LeftPanel
							.getPlayer1()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer4()
													.getPlayerPos()))) {
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() - 50);
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer1().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer2()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer4()
													.getPlayerPos()))) {
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() - 50);
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() + 50);
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer2().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer3()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer4()
													.getPlayerPos()))) {
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() - 50);
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() + 50);
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer3().getPlayerName()
								+ " to use their train");
					} else {
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() - 25);
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null,
								"Paid £25 to use the train");
					}

					LeftPanel.getPlayer4().setPlayerPos(
							PropertySetup.getCityHospitalTrain().getPropPos());
					MiddlePanel.setPlayerCharLocation(4, LeftPanel.getPlayer4()
							.getPlayerPos());
					getLogArea().append(
							"\n"
									+ LeftPanel.getPlayer4().getPlayerName()
									+ "'s position is "
									+ PropertySetup
											.getProps()
											.get(LeftPanel.getPlayer4()
													.getPlayerPos())
											.getPropertyName());
				}

				if (station == 2) {
					if (LeftPanel
							.getPlayer4()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer4()
													.getPlayerPos()))) {
						JOptionPane.showMessageDialog(null,
								"Since you own this station, you pay nothing");
					} else if (LeftPanel
							.getPlayer1()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer4()
													.getPlayerPos()))) {
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() - 50);
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer1().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer2()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer4()
													.getPlayerPos()))) {
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() - 50);
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() + 50);
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer2().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer3()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer4()
													.getPlayerPos()))) {
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() - 50);
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() + 50);
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer3().getPlayerName()
								+ " to use their train");
					} else {
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() - 25);
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null,
								"Paid £25 to use the train");
					}

					LeftPanel.getPlayer4().setPlayerPos(
							PropertySetup.getBotanicTrain().getPropPos());
					MiddlePanel.setPlayerCharLocation(4, LeftPanel.getPlayer4()
							.getPlayerPos());
					getLogArea().append(
							"\n"
									+ LeftPanel.getPlayer4().getPlayerName()
									+ "'s position is "
									+ PropertySetup
											.getProps()
											.get(LeftPanel.getPlayer4()
													.getPlayerPos())
											.getPropertyName());
				}

				if (station == 3) {
					if (LeftPanel
							.getPlayer4()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer4()
													.getPlayerPos()))) {
						JOptionPane.showMessageDialog(null,
								"Since you own this station, you pay nothing");
					} else if (LeftPanel
							.getPlayer1()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer4()
													.getPlayerPos()))) {
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() - 50);
						LeftPanel.getPlayer1().setPlayerMoney(
								LeftPanel.getPlayer1().getPlayerMoney() + 50);
						LeftPanel.getPlayer1Label().setText(
								LeftPanel.getPlayer1().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer1()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer1().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer2()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer4()
													.getPlayerPos()))) {
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() - 50);
						LeftPanel.getPlayer2().setPlayerMoney(
								LeftPanel.getPlayer2().getPlayerMoney() + 50);
						LeftPanel.getPlayer2Label().setText(
								LeftPanel.getPlayer2().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer2()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer2().getPlayerName()
								+ " to use their train");
					} else if (LeftPanel
							.getPlayer3()
							.getPropertiesArray()
							.contains(
									PropertySetup.getProps().get(
											LeftPanel.getPlayer4()
													.getPlayerPos()))) {
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() - 50);
						LeftPanel.getPlayer3().setPlayerMoney(
								LeftPanel.getPlayer3().getPlayerMoney() + 50);
						LeftPanel.getPlayer3Label().setText(
								LeftPanel.getPlayer3().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer3()
												.getPlayerMoney());
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null, "Paid £50 to "
								+ LeftPanel.getPlayer3().getPlayerName()
								+ " to use their train");
					} else {
						LeftPanel.getPlayer4().setPlayerMoney(
								LeftPanel.getPlayer4().getPlayerMoney() - 25);
						LeftPanel.getPlayer4Label().setText(
								LeftPanel.getPlayer4().getPlayerName()
										+ " £"
										+ LeftPanel.getPlayer4()
												.getPlayerMoney());
						JOptionPane.showMessageDialog(null,
								"Paid £25 to use the train");
					}

					LeftPanel.getPlayer4().setPlayerPos(
							PropertySetup.getCentralTrain().getPropPos());
					MiddlePanel.setPlayerCharLocation(4, LeftPanel.getPlayer4()
							.getPlayerPos());
					getLogArea().append(
							"\n"
									+ LeftPanel.getPlayer4().getPlayerName()
									+ "'s position is "
									+ PropertySetup
											.getProps()
											.get(LeftPanel.getPlayer4()
													.getPlayerPos())
											.getPropertyName());
				}
			}
		}
	}
	
	/**
	 * This method plays a sound effect for riding the train
	 */
	public static void playTrainSound()
	 {
		Clip clip;
		try 
		{
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("audio/Train.wav").getAbsoluteFile( ));
			clip = AudioSystem.getClip( );
			clip.open(audioInputStream);
			clip.start();
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "Error with playing sound.");
			ex.printStackTrace( );
		}
	 }
}
