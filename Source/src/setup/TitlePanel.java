package setup;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.SwingUtils;

/**
 * This class is used to set up the title panel for the setup window
 * 
 * @author Brogrammers
 */
@SuppressWarnings("serial")
public class TitlePanel extends JPanel {

	private JLabel title;

	public TitlePanel() {

		setLayout(new GridBagLayout());

		setupLabels();

		addComponents();
	}

	/**
	 * This method sets up the labels
	 */
	private void setupLabels() {
		SwingUtils swingUtils = new SwingUtils();

		title = new JLabel("Monopoly Setup");
		swingUtils.setJLabelFont(title, 40.0f);
	}

	/**
	 * This method adds the components to the panel
	 */
	private void addComponents() {
		GridBagConstraints c = new GridBagConstraints();

		c.insets = new Insets(10, 10, 10, 10);
		c.fill = GridBagConstraints.HORIZONTAL;
		add(title);
	}
}