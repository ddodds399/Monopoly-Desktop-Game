package mainWindow;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


import utils.GameCheck;


/**
 * This method sets up the main window interface for the game
 * 
 * @author Brogrammers
 */
@SuppressWarnings("serial")
public class MainWindow extends JFrame {
	private int TASKBARSIZE = 45;

	private static Dimension screenRes;
	private LeftPanel leftPanel;
	// private BottomPanel bottomPanel;
	private RightPanel rightPanel;
	private MiddlePanel middlePanel;

	/**
	 * This constructor creates the main window
	 * @param arrayList - name array
	 * @param list - character array
	 */
	public MainWindow(ArrayList<String> arrayList, List<String> list) {
		setupFrame();
		GameCheck.setupSurrenderCounter();
		initialisePanels(arrayList, list);

		addPanels();

		validate();
		revalidate();
		repaint();
	}

	/**
	 * This method sets up the window
	 */
	private void setupFrame() {
		screenRes = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenRes.width, screenRes.height - TASKBARSIZE);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon windowIcon = new ImageIcon("images/windowIcon.jpg");
		setIconImage(windowIcon.getImage());
		setTitle("Education Establishment Game - The Best Game");
	}

	/**
	 * This method sets up the left, right and middle panels for the window
	 * @param nameArray - array of player names
	 * @param characterArray - array of player images
	 */
	private void initialisePanels(ArrayList<String> nameArray,
			List<String> characterArray) {
		leftPanel = new LeftPanel(nameArray, characterArray);
		rightPanel = new RightPanel();
		// bottomPanel = new BottomPanel();
		middlePanel = new MiddlePanel(characterArray);
	}

	/**
	 * This method adds the panels to the window
	 */
	private void addPanels() {
		// The reason I have used border layout is so that the game
		// will look good on all screen sizes
		setLayout(new BorderLayout());
		add(leftPanel, BorderLayout.LINE_START);
		add(rightPanel, BorderLayout.LINE_END);
		// add(bottomPanel, BorderLayout.PAGE_END);
		add(middlePanel, BorderLayout.CENTER);
	}
}