package mainWindow;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

import mainGame.Properties;
import mainGame.PropertySetup;

/**
 * This class creates the interface to build flats/halls and sell properties
 * 
 * @author Brogrammers
 */
@SuppressWarnings("serial")
public class Building extends JFrame {
	@SuppressWarnings("unused")
	private int TASKBARSIZE = 45;

	// private static Dimension screenRes;

	/**
	 * This constructor creates the interface
	 */
	public Building() {

		setupFrame();

		validate();
		revalidate();
		repaint();
	}

	/**
	 * This method sets up the frame giving it's default options and adding action listeners
	 * for each JButton in each tab of the interface
	 */
	private void setupFrame() {
		// screenRes = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(600, 400);

		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setLocationRelativeTo(null);

		ImageIcon windowIcon = new ImageIcon("images/windowIcon.jpg");
		setIconImage(windowIcon.getImage());

		setTitle("Build");

		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.lightGray);

		JTabbedPane tabbedPane = new JTabbedPane();
		JPanel middlePanel = new JPanel(new GridLayout());

		JPanel brownPanel = new JPanel(new GridLayout(3, 2));
		Color brown = new Color(129, 69, 19);
		brownPanel.setBackground(brown);
		JPanel bluePanel = new JPanel(new GridLayout(3, 3));
		bluePanel.setBackground(Color.cyan);
		JPanel pinkPanel = new JPanel(new GridLayout(3, 3));
		Color pink = new Color(255, 51, 153);
		pinkPanel.setBackground(pink);
		JPanel orangePanel = new JPanel(new GridLayout(3, 3));
		orangePanel.setBackground(Color.orange);
		JPanel redPanel = new JPanel(new GridLayout(3, 3));
		redPanel.setBackground(Color.red);
		JPanel yellowPanel = new JPanel(new GridLayout(3, 3));
		yellowPanel.setBackground(Color.yellow);
		JPanel greenPanel = new JPanel(new GridLayout(3, 3));
		greenPanel.setBackground(Color.GREEN);
		JPanel purplePanel = new JPanel(new GridLayout(3, 2));
		purplePanel.setBackground(Color.blue);
		/**
		 * The brown tab
		 * 
		 * 
		 */
		final JButton buildAginHouse = new JButton("Build Flat £" +PropertySetup.getAgincourtAve().getCostBuyFlat());
		disableButtons(PropertySetup.getAgincourtAve(), buildAginHouse);
		final JLabel agin = new JLabel("<html>Agincourt Avenue<br>Flats: "
				+ PropertySetup.getAgincourtAve().getFlats() + "<br>Halls: "
				+ PropertySetup.getAgincourtAve().getHalls() + "<html>");
		agin.setHorizontalAlignment(SwingConstants.CENTER);
		agin.setForeground(Color.white);
		agin.setBorder(BorderFactory.createLineBorder(Color.black));

		JButton aginOverdraft = new JButton("Overdraft");
		
		
			
		
		
		// Buying a house for AginCourt
		buildAginHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {

				if (player1Contain2Method(PropertySetup.getAgincourtAve(),
						PropertySetup.getTatesAve())) {
					player1FlatsAndHalls(1, PropertySetup.getAgincourtAve(),
							buildAginHouse);
				} else if (player2Contain2Method(
						PropertySetup.getAgincourtAve(),
						PropertySetup.getTatesAve())) {
					player2FlatsAndHalls(1, PropertySetup.getAgincourtAve(),
							buildAginHouse);
				} else if (player3Contain2Method(
						PropertySetup.getAgincourtAve(),
						PropertySetup.getTatesAve())) {
					player3FlatsAndHalls(1, PropertySetup.getAgincourtAve(),
							buildAginHouse);
				} else if (player4Contain2Method(
						PropertySetup.getAgincourtAve(),
						PropertySetup.getTatesAve())) {
					player4FlatsAndHalls(1, PropertySetup.getAgincourtAve(),
							buildAginHouse);
				} else {
					JOptionPane.showMessageDialog(null,
							"You do not own both of the brown properties");
				}
				agin.setText("<html>Agincourt Avenue<br>Flats: "
						+ PropertySetup.getAgincourtAve().getFlats()
						+ "<br>Halls: "
						+ PropertySetup.getAgincourtAve().getHalls() + "<html>");
			}
		});
		final JButton buildTatesHouse = new JButton("Build Flat £"+PropertySetup.getTatesAve().getCostBuyFlat());
		disableButtons(PropertySetup.getTatesAve(), buildTatesHouse);
		final JLabel tate = new JLabel("<html>Tates" + "<br>Flats: "
				+ PropertySetup.getTatesAve().getFlats() + "<br>Halls: "
				+ PropertySetup.getTatesAve().getHalls() + "<html>");
		JButton tatesOverdraft = new JButton("Overdraft");
		tate.setHorizontalAlignment(SwingConstants.CENTER);
		tate.setForeground(Color.WHITE);
		tate.setBorder(BorderFactory.createLineBorder(Color.black));

		buildTatesHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {

				if (player1Contain2Method(PropertySetup.getAgincourtAve(),
						PropertySetup.getTatesAve())) {
					player1FlatsAndHalls(3, PropertySetup.getAgincourtAve(),
							buildTatesHouse);
				} else if (player2Contain2Method(
						PropertySetup.getAgincourtAve(),
						PropertySetup.getTatesAve())) {
					player2FlatsAndHalls(3, PropertySetup.getAgincourtAve(),
							buildTatesHouse);
				} else if (player3Contain2Method(
						PropertySetup.getAgincourtAve(),
						PropertySetup.getTatesAve())) {
					player3FlatsAndHalls(3, PropertySetup.getAgincourtAve(),
							buildTatesHouse);
				} else if (player4Contain2Method(
						PropertySetup.getAgincourtAve(),
						PropertySetup.getTatesAve())) {
					player4FlatsAndHalls(3, PropertySetup.getAgincourtAve(),
							buildTatesHouse);
				} else {
					JOptionPane.showMessageDialog(null,
							"You do not own both of the brown properties");
				}
				tate.setText("<html>Tates" + "<br>Flats: "
						+ PropertySetup.getTatesAve().getFlats()
						+ "<br>Halls: "
						+ PropertySetup.getTatesAve().getHalls() + "<html>");
			}
		});

		brownPanel.add(agin);
		brownPanel.add(tate);
		brownPanel.add(buildAginHouse);
		brownPanel.add(buildTatesHouse);
		brownPanel.add(aginOverdraft);
		brownPanel.add(tatesOverdraft);

		/**
		 * The Blue Tab
		 */
		final JButton buildBcbHouse = new JButton("Build Flat £"+PropertySetup.getBcbRubble().getCostBuyFlat());
		disableButtons(PropertySetup.getBcbRubble(), buildBcbHouse);
		final JLabel bcb = new JLabel("<html>BCB Rubble" + "<br>Flats: "
				+ PropertySetup.getBcbRubble().getFlats() + "<br>Halls: "
				+ PropertySetup.getBcbRubble().getHalls() + "</html>");
		bcb.setForeground(Color.black);
		bcb.setHorizontalAlignment(SwingConstants.CENTER);
		bcb.setBorder(BorderFactory.createLineBorder(Color.black));

		JButton bcbOverdraft = new JButton("Overdraft");

		buildBcbHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {

				if (player1Contain3Method(PropertySetup.getBcbRubble(),
						PropertySetup.getDunluceAve(),
						PropertySetup.getMaloneAve())) {
					player1FlatsAndHalls(6, PropertySetup.getBcbRubble(),
							buildBcbHouse);
				} else if (player2Contain3Method(PropertySetup.getBcbRubble(),
						PropertySetup.getDunluceAve(),
						PropertySetup.getMaloneAve())) {
					player2FlatsAndHalls(6, PropertySetup.getBcbRubble(),
							buildBcbHouse);
				} else if (player3Contain3Method(PropertySetup.getBcbRubble(),
						PropertySetup.getDunluceAve(),
						PropertySetup.getMaloneAve())) {
					player3FlatsAndHalls(6, PropertySetup.getBcbRubble(),
							buildBcbHouse);
				} else if (player4Contain3Method(PropertySetup.getBcbRubble(),
						PropertySetup.getDunluceAve(),
						PropertySetup.getMaloneAve())) {
					player4FlatsAndHalls(3, PropertySetup.getBcbRubble(),
							buildBcbHouse);
				} else {
					JOptionPane.showMessageDialog(null,
							"You do not own all of the blue properties");
				}
				bcb.setText("<html>BCB Rubble" + "<br>Flats: "
						+ PropertySetup.getBcbRubble().getFlats()
						+ "<br>Halls: "
						+ PropertySetup.getBcbRubble().getHalls() + "</html>");
			}
		});

		final JButton buildDunluceHouse = new JButton("Build Flat £"+PropertySetup.getDunluceAve().getCostBuyFlat());
		disableButtons(PropertySetup.getDunluceAve(), buildDunluceHouse);
		final JLabel dun = new JLabel("<html>Dunluce Avenue" + "<br>Flats: "
				+ PropertySetup.getDunluceAve().getFlats() + "<br>Halls: "
				+ PropertySetup.getDunluceAve().getHalls() + "</html>");
		dun.setForeground(Color.black);
		dun.setHorizontalAlignment(SwingConstants.CENTER);
		dun.setBorder(BorderFactory.createLineBorder(Color.black));
		JButton dunOverdraft = new JButton("Overdraft");

		buildDunluceHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {

				if (player1Contain3Method(PropertySetup.getBcbRubble(),
						PropertySetup.getDunluceAve(),
						PropertySetup.getMaloneAve())) {
					player1FlatsAndHalls(8, PropertySetup.getDunluceAve(),
							buildDunluceHouse);
				} else if (player2Contain3Method(PropertySetup.getBcbRubble(),
						PropertySetup.getDunluceAve(),
						PropertySetup.getMaloneAve())) {
					player2FlatsAndHalls(8, PropertySetup.getDunluceAve(),
							buildDunluceHouse);
				} else if (player3Contain3Method(PropertySetup.getBcbRubble(),
						PropertySetup.getDunluceAve(),
						PropertySetup.getMaloneAve())) {
					player3FlatsAndHalls(8, PropertySetup.getDunluceAve(),
							buildDunluceHouse);
				} else if (player4Contain3Method(PropertySetup.getBcbRubble(),
						PropertySetup.getDunluceAve(),
						PropertySetup.getMaloneAve())) {
					player4FlatsAndHalls(8, PropertySetup.getDunluceAve(),
							buildDunluceHouse);
				} else {
					JOptionPane.showMessageDialog(null,
							"You do not own all of the blue properties");
				}
				dun.setText("<html>Dunluce Avenue" + "<br>Flats: "
						+ PropertySetup.getDunluceAve().getFlats()
						+ "<br>Halls: "
						+ PropertySetup.getDunluceAve().getHalls() + "</html>");
			}
		});

		final JButton buildMaloneAHouse = new JButton("Build Flat £"+PropertySetup.getMaloneAve().getCostBuyFlat());
		disableButtons(PropertySetup.getMaloneAve(), buildMaloneAHouse);
		final JLabel maloneA = new JLabel("<html>Malone Avenue" + "<br>Flats: "
				+ PropertySetup.getMaloneAve().getFlats() + "<br>Halls: "
				+ PropertySetup.getMaloneAve().getHalls() + "</html>");
		JButton maloneAOverdraft = new JButton("Overdraft");
		maloneA.setForeground(Color.black);
		maloneA.setHorizontalAlignment(SwingConstants.CENTER);
		maloneA.setBorder(BorderFactory.createLineBorder(Color.black));

		buildMaloneAHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {

				if (player1Contain3Method(PropertySetup.getBcbRubble(),
						PropertySetup.getDunluceAve(),
						PropertySetup.getMaloneAve())) {
					player1FlatsAndHalls(9, PropertySetup.getMaloneAve(),
							buildMaloneAHouse);
				} else if (player2Contain3Method(PropertySetup.getBcbRubble(),
						PropertySetup.getDunluceAve(),
						PropertySetup.getMaloneAve())) {
					player2FlatsAndHalls(9, PropertySetup.getMaloneAve(),
							buildMaloneAHouse);
				} else if (player3Contain3Method(PropertySetup.getBcbRubble(),
						PropertySetup.getDunluceAve(),
						PropertySetup.getMaloneAve())) {
					player3FlatsAndHalls(9, PropertySetup.getMaloneAve(),
							buildMaloneAHouse);
				} else if (player4Contain3Method(PropertySetup.getBcbRubble(),
						PropertySetup.getDunluceAve(),
						PropertySetup.getMaloneAve())) {
					player4FlatsAndHalls(9, PropertySetup.getMaloneAve(),
							buildMaloneAHouse);
				} else {
					JOptionPane.showMessageDialog(null,
							"You do not own all of the blue properties");
				}
				maloneA.setText("<html>Malone Avenue" + "<br>Flats: "
						+ PropertySetup.getMaloneAve().getFlats()
						+ "<br>Halls: "
						+ PropertySetup.getMaloneAve().getHalls() + "</html>");
			}
		});

		bluePanel.add(bcb);
		bluePanel.add(dun);
		bluePanel.add(maloneA);
		bluePanel.add(buildBcbHouse);
		bluePanel.add(buildDunluceHouse);
		bluePanel.add(buildMaloneAHouse);
		bluePanel.add(bcbOverdraft);
		bluePanel.add(dunOverdraft);
		bluePanel.add(maloneAOverdraft);

		/**
		 * 
		 * The Pinks
		 */

		final JButton buildSocaHouse = new JButton("Build Flat £"+PropertySetup.getSoca().getCostBuyFlat());
		disableButtons(PropertySetup.getSoca(), buildSocaHouse);
		final JLabel soca = new JLabel("<html>School Of Creative Arts"
				+ "<br>Flats: " + PropertySetup.getSoca().getFlats()
				+ "<br>Halls: " + PropertySetup.getSoca().getHalls()
				+ "</html>");
		JButton socaOverdraft = new JButton("Overdraft");
		soca.setForeground(Color.white);
		soca.setHorizontalAlignment(SwingConstants.CENTER);
		soca.setBorder(BorderFactory.createLineBorder(Color.black));

		buildSocaHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {

				if (player1Contain3Method(PropertySetup.getSoca(),
						PropertySetup.getTheologyCentre(),
						PropertySetup.getMaloneRoad())) {
					player1FlatsAndHalls(11, PropertySetup.getSoca(),
							buildSocaHouse);
				} else if (player2Contain3Method(PropertySetup.getSoca(),
						PropertySetup.getTheologyCentre(),
						PropertySetup.getMaloneRoad())) {
					player2FlatsAndHalls(11, PropertySetup.getSoca(),
							buildSocaHouse);
				} else if (player3Contain3Method(PropertySetup.getSoca(),
						PropertySetup.getTheologyCentre(),
						PropertySetup.getMaloneRoad())) {
					player3FlatsAndHalls(11, PropertySetup.getSoca(),
							buildSocaHouse);
				} else if (player4Contain3Method(PropertySetup.getSoca(),
						PropertySetup.getTheologyCentre(),
						PropertySetup.getMaloneRoad())) {
					player4FlatsAndHalls(11, PropertySetup.getSoca(),
							buildSocaHouse);
				} else {
					JOptionPane.showMessageDialog(null,
							"You do not own all of the pink properties");
				}
				soca.setText("<html>School Of Creative Arts" + "<br>Flats: "
						+ PropertySetup.getSoca().getFlats() + "<br>Halls: "
						+ PropertySetup.getSoca().getHalls() + "</html>");
			}
		});

		final JButton buildTheologyHouse = new JButton("Build Flat £"+PropertySetup.getTheologyCentre().getCostBuyFlat());
		disableButtons(PropertySetup.getTheologyCentre(), buildTheologyHouse);
		final JLabel theo = new JLabel("<html>Theology Centre" + "<br>Flats: "
				+ PropertySetup.getTheologyCentre().getFlats() + "<br>Halls: "
				+ PropertySetup.getTheologyCentre().getHalls() + "</html>");
		JButton theologyOverdraft = new JButton("Overdraft");
		theo.setForeground(Color.white);
		theo.setHorizontalAlignment(SwingConstants.CENTER);
		theo.setBorder(BorderFactory.createLineBorder(Color.black));

		buildTheologyHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {

				if (player1Contain3Method(PropertySetup.getSoca(),
						PropertySetup.getTheologyCentre(),
						PropertySetup.getMaloneRoad())) {
					player1FlatsAndHalls(13, PropertySetup.getTheologyCentre(),
							buildTheologyHouse);
				} else if (player2Contain3Method(PropertySetup.getSoca(),
						PropertySetup.getTheologyCentre(),
						PropertySetup.getMaloneRoad())) {
					player2FlatsAndHalls(13, PropertySetup.getTheologyCentre(),
							buildTheologyHouse);
				} else if (player3Contain3Method(PropertySetup.getSoca(),
						PropertySetup.getTheologyCentre(),
						PropertySetup.getMaloneRoad())) {
					player3FlatsAndHalls(13, PropertySetup.getTheologyCentre(),
							buildTheologyHouse);
				} else if (player4Contain3Method(PropertySetup.getSoca(),
						PropertySetup.getTheologyCentre(),
						PropertySetup.getMaloneRoad())) {
					player4FlatsAndHalls(13, PropertySetup.getTheologyCentre(),
							buildTheologyHouse);
				} else {
					JOptionPane.showMessageDialog(null,
							"You do not own all of the pink properties");
				}
				theo.setText("<html>Theology Centre" + "<br>Flats: "
						+ PropertySetup.getTheologyCentre().getFlats()
						+ "<br>Halls: "
						+ PropertySetup.getTheologyCentre().getHalls()
						+ "</html>");
			}
		});

		final JButton buildMaloneRHouse = new JButton("Build Flat £"+PropertySetup.getMaloneRoad().getCostBuyFlat());
		disableButtons(PropertySetup.getMaloneRoad(), buildMaloneRHouse);
		final JLabel maloneR = new JLabel("<html>Malone Road" + "<br>Flats: "
				+ PropertySetup.getMaloneRoad().getFlats() + "<br>Halls: "
				+ PropertySetup.getMaloneRoad().getHalls() + "</html>");
		JButton maloneROverdraft = new JButton("Overdraft");
		maloneR.setForeground(Color.white);
		maloneR.setHorizontalAlignment(SwingConstants.CENTER);
		maloneR.setBorder(BorderFactory.createLineBorder(Color.black));

		buildMaloneRHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {

				if (player1Contain3Method(PropertySetup.getSoca(),
						PropertySetup.getTheologyCentre(),
						PropertySetup.getMaloneRoad())) {
					player1FlatsAndHalls(14, PropertySetup.getMaloneRoad(),
							buildMaloneRHouse);
				} else if (player2Contain3Method(PropertySetup.getSoca(),
						PropertySetup.getTheologyCentre(),
						PropertySetup.getMaloneRoad())) {
					player2FlatsAndHalls(14, PropertySetup.getMaloneRoad(),
							buildMaloneRHouse);
				} else if (player3Contain3Method(PropertySetup.getSoca(),
						PropertySetup.getTheologyCentre(),
						PropertySetup.getMaloneRoad())) {
					player3FlatsAndHalls(14, PropertySetup.getMaloneRoad(),
							buildMaloneRHouse);
				} else if (player4Contain3Method(PropertySetup.getSoca(),
						PropertySetup.getTheologyCentre(),
						PropertySetup.getMaloneRoad())) {
					player4FlatsAndHalls(14, PropertySetup.getMaloneRoad(),
							buildMaloneRHouse);
				} else {
					JOptionPane.showMessageDialog(null,
							"You do not own all of the pink properties");
				}
				maloneR.setText("<html>Malone Road" + "<br>Flats: "
						+ PropertySetup.getMaloneRoad().getFlats()
						+ "<br>Halls: "
						+ PropertySetup.getMaloneRoad().getHalls() + "</html>");
			}
		});

		pinkPanel.add(soca);
		pinkPanel.add(theo);
		pinkPanel.add(maloneR);
		pinkPanel.add(buildSocaHouse);
		pinkPanel.add(buildTheologyHouse);
		pinkPanel.add(buildMaloneRHouse);
		pinkPanel.add(socaOverdraft);
		pinkPanel.add(theologyOverdraft);
		pinkPanel.add(maloneROverdraft);

		/**
		 * 
		 * The orange
		 */
		final JButton buildFitzHouse = new JButton("Build Flat £"+PropertySetup.getFitzwilliamStreet().getCostBuyFlat());
		disableButtons(PropertySetup.getFitzwilliamStreet(), buildFitzHouse);
		final JLabel fitz = new JLabel("<html>Fitzwilliam Street"
				+ "<br>Flats: "
				+ PropertySetup.getFitzwilliamStreet().getFlats()
				+ "<br>Halls: "
				+ PropertySetup.getFitzwilliamStreet().getHalls() + "</html>");
		JButton fitzOverdraft = new JButton("Overdraft");
		fitz.setForeground(Color.white);
		fitz.setHorizontalAlignment(SwingConstants.CENTER);
		fitz.setBorder(BorderFactory.createLineBorder(Color.black));

		buildFitzHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {

				if (player1Contain3Method(PropertySetup.getFitzwilliamStreet(),
						PropertySetup.getGeographyBuilding(),
						PropertySetup.getEcsBuilding())) {
					player1FlatsAndHalls(16,
							PropertySetup.getFitzwilliamStreet(),
							buildFitzHouse);
				} else if (player2Contain3Method(
						PropertySetup.getFitzwilliamStreet(),
						PropertySetup.getGeographyBuilding(),
						PropertySetup.getEcsBuilding())) {
					player2FlatsAndHalls(16,
							PropertySetup.getFitzwilliamStreet(),
							buildFitzHouse);
				} else if (player3Contain3Method(
						PropertySetup.getFitzwilliamStreet(),
						PropertySetup.getGeographyBuilding(),
						PropertySetup.getEcsBuilding())) {
					player3FlatsAndHalls(16,
							PropertySetup.getFitzwilliamStreet(),
							buildFitzHouse);
				} else if (player4Contain3Method(
						PropertySetup.getFitzwilliamStreet(),
						PropertySetup.getGeographyBuilding(),
						PropertySetup.getEcsBuilding())) {
					player4FlatsAndHalls(16,
							PropertySetup.getFitzwilliamStreet(),
							buildFitzHouse);
				} else {
					JOptionPane.showMessageDialog(null,
							"You do not own all of the orange properties");
				}
				fitz.setText("<html>Fitzwilliam Street" + "<br>Flats: "
						+ PropertySetup.getFitzwilliamStreet().getFlats()
						+ "<br>Halls: "
						+ PropertySetup.getFitzwilliamStreet().getHalls()
						+ "</html>");
			}
		});

		final JButton buildGeoHouse = new JButton("Build Flat £"+PropertySetup.getGeographyBuilding().getCostBuyFlat());
		disableButtons(PropertySetup.getGeographyBuilding(), buildGeoHouse);
		final JLabel geo = new JLabel("<html>Geography Building"
				+ "<br>Flats: "
				+ PropertySetup.getGeographyBuilding().getFlats()
				+ "<br>Halls: "
				+ PropertySetup.getGeographyBuilding().getHalls() + "</html>");
		JButton geoOverdraft = new JButton("Overdraft");
		geo.setForeground(Color.white);
		geo.setHorizontalAlignment(SwingConstants.CENTER);
		geo.setBorder(BorderFactory.createLineBorder(Color.black));

		buildGeoHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {

				if (player1Contain3Method(PropertySetup.getFitzwilliamStreet(),
						PropertySetup.getGeographyBuilding(),
						PropertySetup.getEcsBuilding())) {
					player1FlatsAndHalls(18,
							PropertySetup.getGeographyBuilding(), buildGeoHouse);
				} else if (player2Contain3Method(
						PropertySetup.getFitzwilliamStreet(),
						PropertySetup.getGeographyBuilding(),
						PropertySetup.getEcsBuilding())) {
					player2FlatsAndHalls(18,
							PropertySetup.getGeographyBuilding(), buildGeoHouse);
				} else if (player3Contain3Method(
						PropertySetup.getFitzwilliamStreet(),
						PropertySetup.getGeographyBuilding(),
						PropertySetup.getEcsBuilding())) {
					player3FlatsAndHalls(18,
							PropertySetup.getGeographyBuilding(), buildGeoHouse);
				} else if (player4Contain3Method(
						PropertySetup.getFitzwilliamStreet(),
						PropertySetup.getGeographyBuilding(),
						PropertySetup.getEcsBuilding())) {
					player4FlatsAndHalls(18,
							PropertySetup.getGeographyBuilding(), buildGeoHouse);
				} else {
					JOptionPane.showMessageDialog(null,
							"You do not own all of the orange properties");
				}
				geo.setText("<html>Geography Building" + "<br>Flats: "
						+ PropertySetup.getGeographyBuilding().getFlats()
						+ "<br>Halls: "
						+ PropertySetup.getGeographyBuilding().getHalls()
						+ "</html>");
			}
		});

		final JButton buildEcsHouse = new JButton("Build Flat £"+PropertySetup.getEcsBuilding().getCostBuyFlat());
		disableButtons(PropertySetup.getEcsBuilding(), buildEcsHouse);
		final JLabel ecs = new JLabel("<html>ECS Building" + "<br>Flats: "
				+ PropertySetup.getEcsBuilding().getFlats() + "<br>Halls: "
				+ PropertySetup.getEcsBuilding().getHalls() + "</html>");
		JButton ecsOverdraft = new JButton("Overdraft");
		ecs.setForeground(Color.white);
		ecs.setHorizontalAlignment(SwingConstants.CENTER);
		ecs.setBorder(BorderFactory.createLineBorder(Color.black));

		buildEcsHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {

				if (player1Contain3Method(PropertySetup.getFitzwilliamStreet(),
						PropertySetup.getGeographyBuilding(),
						PropertySetup.getEcsBuilding())) {
					player1FlatsAndHalls(19, PropertySetup.getEcsBuilding(),
							buildEcsHouse);
				} else if (player2Contain3Method(
						PropertySetup.getFitzwilliamStreet(),
						PropertySetup.getGeographyBuilding(),
						PropertySetup.getEcsBuilding())) {
					player2FlatsAndHalls(19, PropertySetup.getEcsBuilding(),
							buildEcsHouse);
				} else if (player3Contain3Method(
						PropertySetup.getFitzwilliamStreet(),
						PropertySetup.getGeographyBuilding(),
						PropertySetup.getEcsBuilding())) {
					player3FlatsAndHalls(19, PropertySetup.getEcsBuilding(),
							buildEcsHouse);
				} else if (player4Contain3Method(
						PropertySetup.getFitzwilliamStreet(),
						PropertySetup.getGeographyBuilding(),
						PropertySetup.getEcsBuilding())) {
					player4FlatsAndHalls(19, PropertySetup.getEcsBuilding(),
							buildEcsHouse);
				} else {
					JOptionPane.showMessageDialog(null,
							"You do not own all of the orange properties");
				}
				ecs.setText("<html>ECS Building" + "<br>Flats: "
						+ PropertySetup.getEcsBuilding().getFlats()
						+ "<br>Halls: "
						+ PropertySetup.getEcsBuilding().getHalls() + "</html>");
			}
		});

		orangePanel.add(fitz);
		orangePanel.add(geo);
		orangePanel.add(ecs);
		orangePanel.add(buildFitzHouse);
		orangePanel.add(buildGeoHouse);
		orangePanel.add(buildEcsHouse);
		orangePanel.add(fitzOverdraft);
		orangePanel.add(geoOverdraft);
		orangePanel.add(ecsOverdraft);

		/**
		 * The red
		 * 
		 */

		final JButton buildBoojumHouse = new JButton("Build Flat £"+PropertySetup.getBoojum().getCostBuyFlat());
		disableButtons(PropertySetup.getBoojum(), buildBoojumHouse);
		final JLabel boojum = new JLabel("<html>Boojum" + "<br>Flats: "
				+ PropertySetup.getBoojum().getFlats() + "<br>Halls: "
				+ PropertySetup.getBoojum().getHalls() + "</html>");
		JButton boojumOverdraft = new JButton("Overdraft");
		boojum.setForeground(Color.white);
		boojum.setHorizontalAlignment(SwingConstants.CENTER);
		boojum.setBorder(BorderFactory.createLineBorder(Color.black));

		buildBoojumHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {

				if (player1Contain3Method(PropertySetup.getBoojum(),
						PropertySetup.getPec(),
						PropertySetup.getAshbyBuilding())) {
					player1FlatsAndHalls(21, PropertySetup.getBoojum(),
							buildBoojumHouse);
				} else if (player2Contain3Method(PropertySetup.getBoojum(),
						PropertySetup.getPec(),
						PropertySetup.getAshbyBuilding())) {
					player2FlatsAndHalls(21, PropertySetup.getBoojum(),
							buildBoojumHouse);
				} else if (player3Contain3Method(PropertySetup.getBoojum(),
						PropertySetup.getPec(),
						PropertySetup.getAshbyBuilding())) {
					player3FlatsAndHalls(21, PropertySetup.getBoojum(),
							buildBoojumHouse);
				} else if (player4Contain3Method(PropertySetup.getBoojum(),
						PropertySetup.getPec(),
						PropertySetup.getAshbyBuilding())) {
					player4FlatsAndHalls(21, PropertySetup.getBoojum(),
							buildBoojumHouse);
				} else {
					JOptionPane.showMessageDialog(null,
							"You do not own all of the red properties");
				}
				boojum.setText("<html>Boojum" + "<br>Flats: "
						+ PropertySetup.getBoojum().getFlats() + "<br>Halls: "
						+ PropertySetup.getBoojum().getHalls() + "</html>");
			}
		});

		final JButton buildPECHouse = new JButton("Build Flat £"+PropertySetup.getPec().getCostBuyFlat());
		disableButtons(PropertySetup.getPec(), buildPECHouse);
		final JLabel pec = new JLabel("<html>PEC" + "<br>Flats: "
				+ PropertySetup.getPec().getFlats() + "<br>Halls: "
				+ PropertySetup.getPec().getHalls() + "</html>");
		JButton pecOverdraft = new JButton("Overdraft");
		pec.setForeground(Color.white);
		pec.setHorizontalAlignment(SwingConstants.CENTER);
		pec.setBorder(BorderFactory.createLineBorder(Color.black));

		buildPECHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {

				if (player1Contain3Method(PropertySetup.getBoojum(),
						PropertySetup.getPec(),
						PropertySetup.getAshbyBuilding())) {
					player1FlatsAndHalls(23, PropertySetup.getPec(),
							buildPECHouse);
				} else if (player2Contain3Method(PropertySetup.getBoojum(),
						PropertySetup.getPec(),
						PropertySetup.getAshbyBuilding())) {
					player2FlatsAndHalls(23, PropertySetup.getPec(),
							buildPECHouse);
				} else if (player3Contain3Method(PropertySetup.getBoojum(),
						PropertySetup.getPec(),
						PropertySetup.getAshbyBuilding())) {
					player3FlatsAndHalls(23, PropertySetup.getPec(),
							buildPECHouse);
				} else if (player4Contain3Method(PropertySetup.getBoojum(),
						PropertySetup.getPec(),
						PropertySetup.getAshbyBuilding())) {
					player4FlatsAndHalls(23, PropertySetup.getPec(),
							buildPECHouse);
				} else {
					JOptionPane.showMessageDialog(null,
							"You do not own all of the red properties");
				}
				pec.setText("<html>PEC" + "<br>Flats: "
						+ PropertySetup.getPec().getFlats() + "<br>Halls: "
						+ PropertySetup.getPec().getHalls() + "</html>");
			}
		});

		final JButton buildAshbyHouse = new JButton("Build Flat £"+PropertySetup.getAshbyBuilding().getCostBuyFlat());
		disableButtons(PropertySetup.getAshbyBuilding(), buildAshbyHouse);
		final JLabel ashby = new JLabel("<html>Ashby Building" + "<br>Flats: "
				+ PropertySetup.getAshbyBuilding().getFlats() + "<br>Halls: "
				+ PropertySetup.getAshbyBuilding().getHalls() + "</html>");
		JButton ashbyOverdraft = new JButton("Overdraft");
		ashby.setForeground(Color.white);
		ashby.setHorizontalAlignment(SwingConstants.CENTER);
		ashby.setBorder(BorderFactory.createLineBorder(Color.black));

		buildAshbyHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {

				if (player1Contain3Method(PropertySetup.getBoojum(),
						PropertySetup.getPec(),
						PropertySetup.getAshbyBuilding())) {
					player1FlatsAndHalls(24, PropertySetup.getAshbyBuilding(),
							buildAshbyHouse);
				} else if (player2Contain3Method(PropertySetup.getBoojum(),
						PropertySetup.getPec(),
						PropertySetup.getAshbyBuilding())) {
					player2FlatsAndHalls(24, PropertySetup.getAshbyBuilding(),
							buildAshbyHouse);
				} else if (player3Contain3Method(PropertySetup.getBoojum(),
						PropertySetup.getPec(),
						PropertySetup.getAshbyBuilding())) {
					player3FlatsAndHalls(24, PropertySetup.getAshbyBuilding(),
							buildAshbyHouse);
				} else if (player4Contain3Method(PropertySetup.getBoojum(),
						PropertySetup.getPec(),
						PropertySetup.getAshbyBuilding())) {
					player4FlatsAndHalls(24, PropertySetup.getAshbyBuilding(),
							buildAshbyHouse);
				} else {
					JOptionPane.showMessageDialog(null,
							"You do not own all of the red properties");
				}
				ashby.setText("<html>Ashby Building" + "<br>Flats: "
						+ PropertySetup.getAshbyBuilding().getFlats()
						+ "<br>Halls: "
						+ PropertySetup.getAshbyBuilding().getHalls()
						+ "</html>");
			}
		});

		redPanel.add(boojum);
		redPanel.add(pec);
		redPanel.add(ashby);
		redPanel.add(buildBoojumHouse);
		redPanel.add(buildPECHouse);
		redPanel.add(buildAshbyHouse);
		redPanel.add(boojumOverdraft);
		redPanel.add(pecOverdraft);
		redPanel.add(ashbyOverdraft);

		/**
		 * The Yellow
		 */

		final JButton buildMcClayHouse = new JButton("Build Flat £"+PropertySetup.getMcClayLibrary().getCostBuyFlat());
		disableButtons(PropertySetup.getMcClayLibrary(), buildMcClayHouse);
		final JLabel mcClay = new JLabel("<html>McClay Library" + "<br>Flats: "
				+ PropertySetup.getMcClayLibrary().getFlats() + "<br>Halls: "
				+ PropertySetup.getMcClayLibrary().getHalls() + "</html>");
		JButton mcClayOverdraft = new JButton("Overdraft");
		mcClay.setForeground(Color.black);
		mcClay.setHorizontalAlignment(SwingConstants.CENTER);
		mcClay.setBorder(BorderFactory.createLineBorder(Color.black));

		buildMcClayHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {

				if (player1Contain3Method(PropertySetup.getMcClayLibrary(),
						PropertySetup.getPeterFroggatCentre(),
						PropertySetup.getMbc())) {
					player1FlatsAndHalls(26, PropertySetup.getMcClayLibrary(),
							buildMcClayHouse);
				} else if (player2Contain3Method(
						PropertySetup.getMcClayLibrary(),
						PropertySetup.getPeterFroggatCentre(),
						PropertySetup.getMbc())) {
					player2FlatsAndHalls(26, PropertySetup.getMcClayLibrary(),
							buildMcClayHouse);
				} else if (player3Contain3Method(
						PropertySetup.getMcClayLibrary(),
						PropertySetup.getPeterFroggatCentre(),
						PropertySetup.getMbc())) {
					player3FlatsAndHalls(26, PropertySetup.getMcClayLibrary(),
							buildMcClayHouse);
				} else if (player4Contain3Method(
						PropertySetup.getMcClayLibrary(),
						PropertySetup.getPeterFroggatCentre(),
						PropertySetup.getMbc())) {
					player4FlatsAndHalls(26, PropertySetup.getMcClayLibrary(),
							buildMcClayHouse);
				} else {
					JOptionPane.showMessageDialog(null,
							"You do not own all of the yellow properties");
				}
				mcClay.setText("<html>McClay Library" + "<br>Flats: "
						+ PropertySetup.getMcClayLibrary().getFlats()
						+ "<br>Halls: "
						+ PropertySetup.getMcClayLibrary().getHalls()
						+ "</html>");
			}
		});

		final JButton buildPeterHouse = new JButton("Build Flat £"+PropertySetup.getPeterFroggatCentre().getCostBuyFlat());
		disableButtons(PropertySetup.getPeterFroggatCentre(), buildPeterHouse);
		final JLabel peter = new JLabel("<html>Peter Froggat Centre"
				+ "<br>Flats: "
				+ PropertySetup.getPeterFroggatCentre().getFlats()
				+ "<br>Halls: "
				+ PropertySetup.getPeterFroggatCentre().getHalls() + "</html>");
		JButton peterOverdraft = new JButton("Overdraft");
		peter.setForeground(Color.black);
		peter.setHorizontalAlignment(SwingConstants.CENTER);
		peter.setBorder(BorderFactory.createLineBorder(Color.black));

		buildPeterHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {

				if (player1Contain3Method(PropertySetup.getMcClayLibrary(),
						PropertySetup.getPeterFroggatCentre(),
						PropertySetup.getMbc())) {
					player1FlatsAndHalls(27,
							PropertySetup.getPeterFroggatCentre(),
							buildPeterHouse);
				} else if (player2Contain3Method(
						PropertySetup.getMcClayLibrary(),
						PropertySetup.getPeterFroggatCentre(),
						PropertySetup.getMbc())) {
					player2FlatsAndHalls(27,
							PropertySetup.getPeterFroggatCentre(),
							buildPeterHouse);
				} else if (player3Contain3Method(
						PropertySetup.getMcClayLibrary(),
						PropertySetup.getPeterFroggatCentre(),
						PropertySetup.getMbc())) {
					player3FlatsAndHalls(27,
							PropertySetup.getPeterFroggatCentre(),
							buildPeterHouse);
				} else if (player4Contain3Method(
						PropertySetup.getMcClayLibrary(),
						PropertySetup.getPeterFroggatCentre(),
						PropertySetup.getMbc())) {
					player4FlatsAndHalls(27,
							PropertySetup.getPeterFroggatCentre(),
							buildPeterHouse);
				} else {
					JOptionPane.showMessageDialog(null,
							"You do not own all of the yellow properties");
				}
				peter.setText("<html>Peter Froggat Centre" + "<br>Flats: "
						+ PropertySetup.getPeterFroggatCentre().getFlats()
						+ "<br>Halls: "
						+ PropertySetup.getPeterFroggatCentre().getHalls()
						+ "</html>");
			}
		});

		final JButton buildMbcHouse = new JButton("Build Flat £"+PropertySetup.getMbc().getCostBuyFlat());
		disableButtons(PropertySetup.getMbc(), buildMbcHouse);
		final JLabel mbc = new JLabel("<html>MBC" + "<br>Flats: "
				+ PropertySetup.getMbc().getFlats() + "<br>Halls: "
				+ PropertySetup.getMbc().getHalls() + "</html>");
		JButton mbcOverdraft = new JButton("Overdraft");
		mbc.setForeground(Color.black);
		mbc.setHorizontalAlignment(SwingConstants.CENTER);
		mbc.setBorder(BorderFactory.createLineBorder(Color.black));

		buildMbcHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {

				if (player1Contain3Method(PropertySetup.getMcClayLibrary(),
						PropertySetup.getPeterFroggatCentre(),
						PropertySetup.getMbc())) {
					player1FlatsAndHalls(29, PropertySetup.getMbc(),
							buildMbcHouse);
				} else if (player2Contain3Method(
						PropertySetup.getMcClayLibrary(),
						PropertySetup.getPeterFroggatCentre(),
						PropertySetup.getMbc())) {
					player2FlatsAndHalls(29, PropertySetup.getMbc(),
							buildMbcHouse);
				} else if (player3Contain3Method(
						PropertySetup.getMcClayLibrary(),
						PropertySetup.getPeterFroggatCentre(),
						PropertySetup.getMbc())) {
					player3FlatsAndHalls(29, PropertySetup.getMbc(),
							buildMbcHouse);
				} else if (player4Contain3Method(
						PropertySetup.getMcClayLibrary(),
						PropertySetup.getPeterFroggatCentre(),
						PropertySetup.getMbc())) {
					player4FlatsAndHalls(29, PropertySetup.getMbc(),
							buildMbcHouse);
				} else {
					JOptionPane.showMessageDialog(null,
							"You do not own all of the yellow properties");
				}
				mbc.setText("<html>MBC" + "<br>Flats: "
						+ PropertySetup.getMbc().getFlats() + "<br>Halls: "
						+ PropertySetup.getMbc().getHalls() + "</html>");
			}
		});

		yellowPanel.add(mcClay);
		yellowPanel.add(peter);
		yellowPanel.add(mbc);
		yellowPanel.add(buildMcClayHouse);
		yellowPanel.add(buildPeterHouse);
		yellowPanel.add(buildMbcHouse);
		yellowPanel.add(mcClayOverdraft);
		yellowPanel.add(peterOverdraft);
		yellowPanel.add(mbcOverdraft);

		/**
		 * The greens
		 */

		final JButton buildWhitlaHouse = new JButton("Build Flat £"+PropertySetup.getWhitlaHall().getCostBuyFlat());
		disableButtons(PropertySetup.getWhitlaHall(), buildWhitlaHouse);
		final JLabel whitla = new JLabel("<html>Whitla Hall" + "<br>Flats: "
				+ PropertySetup.getWhitlaHall().getFlats() + "<br>Halls: "
				+ PropertySetup.getWhitlaHall().getHalls() + "</html>");
		JButton whitlaOverdraft = new JButton("Overdraft");
		whitla.setForeground(Color.white);
		whitla.setHorizontalAlignment(SwingConstants.CENTER);
		whitla.setBorder(BorderFactory.createLineBorder(Color.black));

		buildWhitlaHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {

				if (player1Contain3Method(PropertySetup.getWhitlaHall(),
						PropertySetup.getDkb(), PropertySetup.getStudentUnion())) {
					player1FlatsAndHalls(31, PropertySetup.getWhitlaHall(),
							buildWhitlaHouse);
				} else if (player2Contain3Method(PropertySetup.getWhitlaHall(),
						PropertySetup.getDkb(), PropertySetup.getStudentUnion())) {
					player2FlatsAndHalls(31, PropertySetup.getWhitlaHall(),
							buildWhitlaHouse);
				} else if (player3Contain3Method(PropertySetup.getWhitlaHall(),
						PropertySetup.getDkb(), PropertySetup.getStudentUnion())) {
					player3FlatsAndHalls(31, PropertySetup.getWhitlaHall(),
							buildWhitlaHouse);
				} else if (player4Contain3Method(PropertySetup.getWhitlaHall(),
						PropertySetup.getDkb(), PropertySetup.getStudentUnion())) {
					player4FlatsAndHalls(31, PropertySetup.getWhitlaHall(),
							buildWhitlaHouse);
				} else {
					JOptionPane.showMessageDialog(null,
							"You do not own all of the green properties");
				}
				whitla.setText("<html>Whitla Hall" + "<br>Flats: "
						+ PropertySetup.getWhitlaHall().getFlats()
						+ "<br>Halls: "
						+ PropertySetup.getWhitlaHall().getHalls() + "</html>");
			}
		});

		final JButton buildDkbHouse = new JButton("Build Flat £"+PropertySetup.getDkb().getCostBuyFlat());
		disableButtons(PropertySetup.getDkb(), buildDkbHouse);
		final JLabel dkb = new JLabel("<html>David Keir Building"
				+ "<br>Flats: " + PropertySetup.getDkb().getFlats()
				+ "<br>Halls: " + PropertySetup.getDkb().getHalls() + "</html>");
		JButton dkbOverdraft = new JButton("Overdraft");
		dkb.setForeground(Color.white);
		dkb.setHorizontalAlignment(SwingConstants.CENTER);
		dkb.setBorder(BorderFactory.createLineBorder(Color.black));

		buildDkbHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {

				if (player1Contain3Method(PropertySetup.getWhitlaHall(),
						PropertySetup.getDkb(), PropertySetup.getStudentUnion())) {
					player1FlatsAndHalls(32, PropertySetup.getDkb(),
							buildDkbHouse);
				} else if (player2Contain3Method(PropertySetup.getWhitlaHall(),
						PropertySetup.getDkb(), PropertySetup.getStudentUnion())) {
					player2FlatsAndHalls(32, PropertySetup.getDkb(),
							buildDkbHouse);
				} else if (player3Contain3Method(PropertySetup.getWhitlaHall(),
						PropertySetup.getDkb(), PropertySetup.getStudentUnion())) {
					player3FlatsAndHalls(32, PropertySetup.getDkb(),
							buildDkbHouse);
				} else if (player4Contain3Method(PropertySetup.getWhitlaHall(),
						PropertySetup.getDkb(), PropertySetup.getStudentUnion())) {
					player4FlatsAndHalls(32, PropertySetup.getDkb(),
							buildDkbHouse);
				} else {
					JOptionPane.showMessageDialog(null,
							"You do not own all of the green properties");
				}
				dkb.setText("<html>David Keir Building" + "<br>Flats: "
						+ PropertySetup.getDkb().getFlats() + "<br>Halls: "
						+ PropertySetup.getDkb().getHalls() + "</html>");
			}
		});

		final JButton buildSUHouse = new JButton("Build Flat £"+PropertySetup.getStudentUnion().getCostBuyFlat());
		disableButtons(PropertySetup.getStudentUnion(), buildSUHouse);
		final JLabel su = new JLabel("<html>Students Union" + "<br>Flats: "
				+ PropertySetup.getStudentUnion().getFlats() + "<br>Halls: "
				+ PropertySetup.getStudentUnion().getHalls() + "</html>");
		JButton suOverdraft = new JButton("Overdraft");
		su.setForeground(Color.white);
		su.setHorizontalAlignment(SwingConstants.CENTER);
		su.setBorder(BorderFactory.createLineBorder(Color.black));

		buildSUHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {

				if (player1Contain3Method(PropertySetup.getWhitlaHall(),
						PropertySetup.getDkb(), PropertySetup.getStudentUnion())) {
					player1FlatsAndHalls(34, PropertySetup.getStudentUnion(),
							buildSUHouse);
				} else if (player2Contain3Method(PropertySetup.getWhitlaHall(),
						PropertySetup.getDkb(), PropertySetup.getStudentUnion())) {
					player2FlatsAndHalls(34, PropertySetup.getStudentUnion(),
							buildSUHouse);
				} else if (player3Contain3Method(PropertySetup.getWhitlaHall(),
						PropertySetup.getDkb(), PropertySetup.getStudentUnion())) {
					player3FlatsAndHalls(34, PropertySetup.getStudentUnion(),
							buildSUHouse);
				} else if (player4Contain3Method(PropertySetup.getWhitlaHall(),
						PropertySetup.getDkb(), PropertySetup.getStudentUnion())) {
					player4FlatsAndHalls(34, PropertySetup.getStudentUnion(),
							buildSUHouse);
				} else {
					JOptionPane.showMessageDialog(null,
							"You do not own all of the green properties");
				}
				su.setText("<html>Students Union" + "<br>Flats: "
						+ PropertySetup.getStudentUnion().getFlats()
						+ "<br>Halls: "
						+ PropertySetup.getStudentUnion().getHalls()
						+ "</html>");
			}
		});

		greenPanel.add(whitla);
		greenPanel.add(dkb);
		greenPanel.add(su);
		greenPanel.add(buildWhitlaHouse);
		greenPanel.add(buildDkbHouse);
		greenPanel.add(buildSUHouse);
		greenPanel.add(whitlaOverdraft);
		greenPanel.add(dkbOverdraft);
		greenPanel.add(suOverdraft);

		tabbedPane.addTab("Browns", brownPanel);
		tabbedPane.addTab("Blue", bluePanel);
		tabbedPane.addTab("Pink", pinkPanel);
		tabbedPane.addTab("Orange", orangePanel);
		tabbedPane.addTab("Red", redPanel);
		tabbedPane.addTab("Yellow", yellowPanel);
		tabbedPane.addTab("Green", greenPanel);
		tabbedPane.addTab("Purple", purplePanel);

		/**
		 * 
		 * The purples
		 */

		final JButton buildBotHouse = new JButton("Build Flat £"+PropertySetup.getBotanicGardens().getCostBuyFlat());
		disableButtons(PropertySetup.getBotanicGardens(), buildBotHouse);
		final JLabel bot = new JLabel("<html>Botanic Gardens" + "<br>Flats: "
				+ PropertySetup.getBotanicGardens().getFlats() + "<br>Halls: "
				+ PropertySetup.getBotanicGardens().getHalls() + "</html>");
		JButton botOverdraft = new JButton("Overdraft");
		bot.setForeground(Color.white);
		bot.setHorizontalAlignment(SwingConstants.CENTER);
		bot.setBorder(BorderFactory.createLineBorder(Color.black));

		buildBotHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {

				if (player1Contain2Method(PropertySetup.getBotanicGardens(),
						PropertySetup.getLanyonBuilding())) {
					player1FlatsAndHalls(37, PropertySetup.getBotanicGardens(),
							buildBotHouse);
				} else if (player2Contain2Method(
						PropertySetup.getBotanicGardens(),
						PropertySetup.getLanyonBuilding())) {
					player2FlatsAndHalls(37, PropertySetup.getBotanicGardens(),
							buildBotHouse);
				} else if (player3Contain2Method(
						PropertySetup.getBotanicGardens(),
						PropertySetup.getLanyonBuilding())) {
					player3FlatsAndHalls(37, PropertySetup.getBotanicGardens(),
							buildBotHouse);
				} else if (player4Contain2Method(
						PropertySetup.getBotanicGardens(),
						PropertySetup.getLanyonBuilding())) {
					player4FlatsAndHalls(37, PropertySetup.getBotanicGardens(),
							buildBotHouse);
				} else {
					JOptionPane.showMessageDialog(null,
							"You do not own both of the purple properties");
				}
				bot.setText("<html>Botanic Gardens" + "<br>Flats: "
						+ PropertySetup.getBotanicGardens().getFlats()
						+ "<br>Halls: "
						+ PropertySetup.getBotanicGardens().getHalls()
						+ "</html>");
			}
		});

		final JButton buildLanyonHouse = new JButton("Build Flat £"+PropertySetup.getLanyonBuilding().getCostBuyFlat());
		disableButtons(PropertySetup.getLanyonBuilding(), buildLanyonHouse);
		final JLabel lanyon = new JLabel("<html>Lanyon Building"
				+ "<br>Flats: " + PropertySetup.getLanyonBuilding().getFlats()
				+ "<br>Halls: " + PropertySetup.getLanyonBuilding().getHalls()
				+ "</html>");
		JButton lanyonOverdraft = new JButton("Overdraft");
		lanyon.setForeground(Color.white);
		lanyon.setHorizontalAlignment(SwingConstants.CENTER);
		lanyon.setBorder(BorderFactory.createLineBorder(Color.black));

		buildLanyonHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent build) {

				if (player1Contain2Method(PropertySetup.getBotanicGardens(),
						PropertySetup.getLanyonBuilding())) {
					player1FlatsAndHalls(39, PropertySetup.getLanyonBuilding(),
							buildLanyonHouse);
				} else if (player2Contain2Method(
						PropertySetup.getBotanicGardens(),
						PropertySetup.getLanyonBuilding())) {
					player2FlatsAndHalls(39, PropertySetup.getLanyonBuilding(),
							buildLanyonHouse);
				} else if (player3Contain2Method(
						PropertySetup.getBotanicGardens(),
						PropertySetup.getLanyonBuilding())) {
					player3FlatsAndHalls(39, PropertySetup.getLanyonBuilding(),
							buildLanyonHouse);
				} else if (player4Contain2Method(
						PropertySetup.getBotanicGardens(),
						PropertySetup.getLanyonBuilding())) {
					player4FlatsAndHalls(39, PropertySetup.getLanyonBuilding(),
							buildLanyonHouse);
				} else {
					JOptionPane.showMessageDialog(null,
							"You do not own both of the purple properties");
				}
				lanyon.setText("<html>Lanyon Building" + "<br>Flats: "
						+ PropertySetup.getLanyonBuilding().getFlats()
						+ "<br>Halls: "
						+ PropertySetup.getLanyonBuilding().getHalls()
						+ "</html>");
			}
		});

		purplePanel.add(bot);
		purplePanel.add(lanyon);
		purplePanel.add(buildBotHouse);
		purplePanel.add(buildLanyonHouse);
		purplePanel.add(botOverdraft);
		purplePanel.add(lanyonOverdraft);

		add(topPanel);
		middlePanel.add(tabbedPane);
		add(middlePanel);

		
		aginOverdraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent over){
				sellForOverdraft(PropertySetup.getAgincourtAve());
				
			}
					
		});
		
		tatesOverdraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent over){
				sellForOverdraft(PropertySetup.getTatesAve());
				
			}
					
		});
		bcbOverdraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent over){
				sellForOverdraft(PropertySetup.getBcbRubble());
				
			}
					
		});
		dunOverdraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent over){
				sellForOverdraft(PropertySetup.getDunluceAve());
				
			}
					
		});
		maloneAOverdraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent over){
				sellForOverdraft(PropertySetup.getMaloneAve());
				
			}
					
		});
		socaOverdraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent over){
				sellForOverdraft(PropertySetup.getSoca());
				
			}
					
		});
		theologyOverdraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent over){
				sellForOverdraft(PropertySetup.getTheologyCentre());
				
			}
					
		});
		maloneROverdraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent over){
				sellForOverdraft(PropertySetup.getMaloneRoad());
				
			}
					
		});
		fitzOverdraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent over){
				sellForOverdraft(PropertySetup.getFitzwilliamStreet());
				
			}
					
		});
		geoOverdraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent over){
				sellForOverdraft(PropertySetup.getGeographyBuilding());
				
			}
					
		});
		ecsOverdraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent over){
				sellForOverdraft(PropertySetup.getEcsBuilding());
				
			}
					
		});
		boojumOverdraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent over){
				sellForOverdraft(PropertySetup.getBoojum());
				
			}
					
		});
		pecOverdraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent over){
				sellForOverdraft(PropertySetup.getPec());
				
			}
					
		});
		ashbyOverdraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent over){
				sellForOverdraft(PropertySetup.getAshbyBuilding());
				
			}
					
		});
		mcClayOverdraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent over){
				sellForOverdraft(PropertySetup.getMcClayLibrary());
				
			}
					
		});
		peterOverdraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent over){
				sellForOverdraft(PropertySetup.getPeterFroggatCentre());
				
			}
					
		});
		mbcOverdraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent over){
				sellForOverdraft(PropertySetup.getMbc());
				
			}
					
		});
		whitlaOverdraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent over){
				sellForOverdraft(PropertySetup.getWhitlaHall());
				
			}
					
		});
		dkbOverdraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent over){
				sellForOverdraft(PropertySetup.getDkb());
				
			}
					
		});
		suOverdraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent over){
				sellForOverdraft(PropertySetup.getStudentUnion());
				
			}
					
		});
		botOverdraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent over){
				sellForOverdraft(PropertySetup.getBotanicGardens());
				
			}
					
		});
		lanyonOverdraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent over){
				sellForOverdraft(PropertySetup.getLanyonBuilding());
				
			}
					
		});
	}

	/**
	 * This method is used to check if player 1 contains two properties in a row
	 * @param properties - first property
	 * @param properties2 - second property
	 * @return - true or false depending on the above comments
	 */
	public boolean player1Contain2Method(Properties properties,
			Properties properties2) {
		if (LeftPanel.getPlayer1().getPropertiesArray().contains((properties))
				&& LeftPanel.getPlayer1().getPropertiesArray()
						.contains((properties2))
				&& LeftPanel.getPlayer1().getPlayerNum() == RightPanel
						.getCurrentPlayer()) {
			return true;

		} else {
			return false;
		}
	}

	/**
	 * This method is used to check if player 1 contains three properties in a row
	 * @param properties - first property
	 * @param properties2 - second property
	 * @param properties 3 - third property
	 * @return - true or false depending on the above comments
	 */
	public boolean player1Contain3Method(Properties properties,
			Properties properties2, Properties properties3) {
		if (LeftPanel.getPlayer1().getPropertiesArray().contains((properties))
				&& LeftPanel.getPlayer1().getPropertiesArray()
						.contains((properties2))
				&& LeftPanel.getPlayer1().getPropertiesArray()
						.contains(properties3)
				&& LeftPanel.getPlayer1().getPlayerNum() == RightPanel
						.getCurrentPlayer()) {
			return true;

		} else {
			return false;
		}
	}

	/**
	 * This method is used to check if player 2 contains two properties in a row
	 * @param properties - first property
	 * @param properties2 - second property
	 * @return - true or false depending on the above comments
	 */
	public boolean player2Contain2Method(Properties properties,
			Properties properties2) {
		if (LeftPanel.getPlayer2().getPropertiesArray().contains((properties))
				&& LeftPanel.getPlayer2().getPropertiesArray()
						.contains((properties2))
				&& LeftPanel.getPlayer2().getPlayerNum() == RightPanel
						.getCurrentPlayer()) {
			return true;

		} else {
			return false;
		}
	}

	/**
	 * This method is used to check if player 2 contains three properties in a row
	 * @param properties - first property
	 * @param properties2 - second property
	 * @param properties 3 - third property
	 * @return - true or false depending on the above comments
	 */
	public boolean player2Contain3Method(Properties properties,
			Properties properties2, Properties properties3) {
		if (LeftPanel.getPlayer2().getPropertiesArray().contains((properties))
				&& LeftPanel.getPlayer2().getPropertiesArray()
						.contains((properties2))
				&& LeftPanel.getPlayer2().getPropertiesArray()
						.contains(properties3)
				&& LeftPanel.getPlayer2().getPlayerNum() == RightPanel
						.getCurrentPlayer()) {
			return true;

		} else {
			return false;
		}
	}

	/**
	 * This method is used to check if player 3 contains two properties in a row
	 * @param properties - first property
	 * @param properties2 - second property
	 * @return - true or false depending on the above comments
	 */
	public boolean player3Contain2Method(Properties properties,
			Properties properties2) {
		if (LeftPanel.getPlayer3().getPropertiesArray().contains((properties))
				&& LeftPanel.getPlayer3().getPropertiesArray()
						.contains((properties2))
				&& LeftPanel.getPlayer3().getPlayerNum() == RightPanel
						.getCurrentPlayer()) {
			return true;

		} else {
			return false;
		}
	}

	/**
	 * This method is used to check if player 3 contains three properties in a row
	 * @param properties - first property
	 * @param properties2 - second property
	 * @param properties3 - third property
	 * @return - true or false depending on the above comments
	 */
	public boolean player3Contain3Method(Properties properties,
			Properties properties2, Properties properties3) {
		if (LeftPanel.getPlayer3().getPropertiesArray().contains((properties))
				&& LeftPanel.getPlayer3().getPropertiesArray()
						.contains((properties2))
				&& LeftPanel.getPlayer3().getPropertiesArray()
						.contains(properties3)
				&& LeftPanel.getPlayer3().getPlayerNum() == RightPanel
						.getCurrentPlayer()) {
			return true;

		} else {
			return false;
		}
	}

	/**
	 * This method is used to check if player 4 contains two properties in a row
	 * @param properties - first property
	 * @param properties2 - second property
	 * @return - true or false depending on the above comments
	 */
	public boolean player4Contain2Method(Properties properties,
			Properties properties2) {
		if (LeftPanel.getPlayer4().getPropertiesArray().contains((properties))
				&& LeftPanel.getPlayer4().getPropertiesArray()
						.contains((properties2))
				&& LeftPanel.getPlayer4().getPlayerNum() == RightPanel
						.getCurrentPlayer()) {
			return true;

		} else {
			return false;
		}
	}

	/**
	 * This method is used to check if player 4 contains three properties in a row
	 * @param properties - first property
	 * @param properties2 - second property
	 * @param properties 3 - third property
	 * @return - true or false depending on the above comments
	 */
	public boolean player4Contain3Method(Properties properties,
			Properties properties2, Properties properties3) {
		if (LeftPanel.getPlayer4().getPropertiesArray().contains((properties))
				&& LeftPanel.getPlayer4().getPropertiesArray()
						.contains((properties2))
				&& LeftPanel.getPlayer4().getPropertiesArray()
						.contains(properties3)
				&& LeftPanel.getPlayer4().getPlayerNum() == RightPanel
						.getCurrentPlayer()) {
			return true;

		} else {
			return false;
		}
		
	}

	/**
	 * This method is used to build flats and halls for player 1
	 * @param i - property index
	 * @param properties - the property to buy flats and halls on
	 * @param button - the button to change the text of
	 */
	public void player1FlatsAndHalls(int i, Properties properties,
			JButton button) {
		if (PropertySetup.getProps().get(i).getFlats() < 4
				&& PropertySetup.getProps().get(i).getHalls() == 0) {
			PropertySetup.getProps().get(i)
					.setFlats(PropertySetup.getProps().get(i).getFlats() + 1);
			LeftPanel.getPlayer1().setPlayerMoney(
					LeftPanel.getPlayer1().getPlayerMoney()
							- properties.getCostBuyFlat());
		} else if (PropertySetup.getProps().get(i).getFlats() == 4) {
			button.setText("Build Hall £" +PropertySetup.getProps().get(i).getCostBuyHalls());
			PropertySetup.getProps().get(i).setFlats(0);
			PropertySetup.getProps().get(i).setHalls(1);
			LeftPanel.getPlayer1().setPlayerMoney(
					LeftPanel.getPlayer1().getPlayerMoney()
							- properties.getCostBuyHalls());

		}

		else {
			button.setText("Maxed Out");

		}
		updateLabels();
	}

	/**
	 * This method is used to build flats and halls for player 2
	 * @param i - property index
	 * @param properties - the property to buy flats and halls on
	 * @param button - the button to change the text of
	 */
	public void player2FlatsAndHalls(int i, Properties properties,
			JButton button) {
		if (PropertySetup.getProps().get(i).getFlats() < 4
				&& PropertySetup.getProps().get(i).getHalls() == 0) {
			PropertySetup.getProps().get(i)
					.setFlats(PropertySetup.getProps().get(i).getFlats() + 1);
			LeftPanel.getPlayer2().setPlayerMoney(
					LeftPanel.getPlayer2().getPlayerMoney()
							- properties.getCostBuyFlat());
		} else if (PropertySetup.getProps().get(i).getFlats() == 4) {
			button.setText("Build Hall £"+PropertySetup.getProps().get(i).getCostBuyHalls());
			PropertySetup.getProps().get(i).setFlats(0);
			PropertySetup.getProps().get(i).setHalls(1);
			LeftPanel.getPlayer2().setPlayerMoney(
					LeftPanel.getPlayer2().getPlayerMoney()
							- properties.getCostBuyHalls());
		}

		else {
			button.setText("Maxed Out");
		}
		updateLabels();
	}

	/**
	 * This method is used to build flats and halls for player 3
	 * @param i - property index
	 * @param properties - the property to buy flats and halls on
	 * @param button - the button to change the text of
	 */
	public void player3FlatsAndHalls(int i, Properties properties,
			JButton button) {
		if (PropertySetup.getProps().get(i).getFlats() < 4
				&& PropertySetup.getProps().get(i).getHalls() == 0) {
			PropertySetup.getProps().get(i)
					.setFlats(PropertySetup.getProps().get(i).getFlats() + 1);
			LeftPanel.getPlayer3().setPlayerMoney(
					LeftPanel.getPlayer3().getPlayerMoney()
							- properties.getCostBuyFlat());

		} else if (PropertySetup.getProps().get(i).getFlats() == 4) {
			button.setText("Build Hall £"+PropertySetup.getProps().get(i).getCostBuyHalls());
			PropertySetup.getProps().get(i).setFlats(0);
			PropertySetup.getProps().get(i).setHalls(1);
			LeftPanel.getPlayer3().setPlayerMoney(
					LeftPanel.getPlayer3().getPlayerMoney()
							- properties.getCostBuyHalls());
		}
		else {
			button.setText("Maxed Out");
		}
		updateLabels();
	}

	/**
	 * This method is used to build flats and halls for player 4
	 * @param i - property index
	 * @param properties - the property to buy flats and halls on
	 * @param button - the button to change the text of
	 */
	public void player4FlatsAndHalls(int i, Properties properties,
			JButton button) {
		if (PropertySetup.getProps().get(i).getFlats() < 4
				&& PropertySetup.getProps().get(i).getHalls() == 0) {
			PropertySetup.getProps().get(i)
					.setFlats(PropertySetup.getProps().get(i).getFlats() + 1);
			LeftPanel.getPlayer4().setPlayerMoney(
					LeftPanel.getPlayer4().getPlayerMoney()
							- properties.getCostBuyFlat());
		} else if (PropertySetup.getProps().get(i).getFlats() == 4) {
			button.setText("Build Hall £"+PropertySetup.getProps().get(i).getCostBuyHalls());
			PropertySetup.getProps().get(i).setFlats(0);
			PropertySetup.getProps().get(i).setHalls(1);
			LeftPanel.getPlayer4().setPlayerMoney(
					LeftPanel.getPlayer4().getPlayerMoney()
							- properties.getCostBuyHalls());
		}

		else {
			button.setText("Maxed Out");
		}
		updateLabels();
	}

	/**
	 * This method disables the button is the flats and halls for a property is at the limit
	 * @param property - the property in question
	 * @param button - the button to disable
	 */
	public void disableButtons(Properties property, JButton button) {
		if (property.getFlats() == 4) {
			button.setText("Build Hall");
		}
		if (property.getHalls() == 1) {
			button.setEnabled(false);
			button.setText("Maxed Out");
		}

	}

	/**
	 * This method is used to sell properties
	 * @param properties - the property to sell
	 */
	public void  sellForOverdraft(Properties properties){
		if(LeftPanel.getPlayer1().getPropertiesArray().contains(properties)){
			LeftPanel.getPlayer1().getPropertiesArray().remove(properties);
			properties.setFlats(0);
			properties.setHalls(0);
			properties.setBuyable(true);
			LeftPanel.getPlayer1().setPlayerMoney(LeftPanel.getPlayer1().getPlayerMoney() + properties.getMortgageValue());
			JOptionPane.showMessageDialog(null, "You have sold this property");
		}
		else if(LeftPanel.getPlayer2().getPropertiesArray().contains(properties)){
			LeftPanel.getPlayer2().getPropertiesArray().remove(properties);
			properties.setFlats(0);
			properties.setHalls(0);
			properties.setBuyable(true);
			LeftPanel.getPlayer2().setPlayerMoney(LeftPanel.getPlayer2().getPlayerMoney() +  properties.getMortgageValue());
			JOptionPane.showMessageDialog(null, "You have sold this property");

		}
		else if(LeftPanel.getPlayer3().getPropertiesArray().contains(properties)){
			LeftPanel.getPlayer3().getPropertiesArray().remove(properties);
			properties.setFlats(0);
			properties.setHalls(0);
			properties.setBuyable(true);
			LeftPanel.getPlayer3().setPlayerMoney(LeftPanel.getPlayer3().getPlayerMoney() +  properties.getMortgageValue());
			JOptionPane.showMessageDialog(null, "You have sold this property");

		}
		else if(LeftPanel.getPlayer4().getPropertiesArray().contains(properties)){
			LeftPanel.getPlayer4().getPropertiesArray().remove(properties);
			properties.setFlats(0);
			properties.setHalls(0);
			properties.setBuyable(true);
			LeftPanel.getPlayer4().setPlayerMoney(LeftPanel.getPlayer4().getPlayerMoney() +  properties.getMortgageValue());
			JOptionPane.showMessageDialog(null, "You have sold this property");

		}
		else{
			JOptionPane.showMessageDialog(null, "You do not own this property");
		}
		updateLabels();
	}
	
	public static void updateLabels(){
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