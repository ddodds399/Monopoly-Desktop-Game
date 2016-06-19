package utils;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.DefaultStyledDocument;

import components.DocumentSizeFilter;

/**
 * This class is used for displaying images to different screen resolutions
 * 
 * @author Brogrammers
 */
public class SwingUtils {

	public void setJLabelFont(JLabel label, float newSize) {
		label.setFont(label.getFont().deriveFont(newSize));
	}

	// http://stackoverflow.com/questions/13863795/enforce-max-characters-on-swing-jtextarea-with-a-few-curve-balls
	public void setJTextFieldCharacterLimit(JTextField textField, int charLimit) {
		DefaultStyledDocument doc = new DefaultStyledDocument();
		doc.setDocumentFilter(new DocumentSizeFilter(charLimit));
		textField.setDocument(doc);

		textField.setColumns(charLimit);
	}

	// http://stackoverflow.com/questions/14121918/force-jtextfield-to-select-all-of-its-contents-when-it-appears
	public void setJTextFieldFocusListener(final JTextField textField) {

		textField.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent arg0) {

			}

			@Override
			public void focusGained(FocusEvent arg0) {
				textField.selectAll();
			}
		});
	}

	public ImageIcon scaleDownByFactor(ImageIcon imageIcon, int factorOf) {
		// http://www.coderanch.com/t/331731/GUI/java/Resize-ImageIcon

		Image image = imageIcon.getImage();

		BufferedImage bufferedImage = new BufferedImage(image.getWidth(null),
				image.getHeight(null), BufferedImage.TYPE_INT_ARGB);

		Graphics graphics = bufferedImage.createGraphics();

		graphics.drawImage(image, 0, 0, imageIcon.getIconWidth() / factorOf,
				imageIcon.getIconHeight() / factorOf, null);

		BufferedImage croppedBi = bufferedImage.getSubimage(0, 0,
				imageIcon.getIconWidth() / factorOf, imageIcon.getIconHeight()
						/ factorOf);

		return new ImageIcon(croppedBi);
	}

	public ImageIcon scaleDownForScreen(ImageIcon imageIcon, int minusX,
			int minusY) {

		Image image = imageIcon.getImage();

		BufferedImage bufferedImage = new BufferedImage(image.getWidth(null),
				image.getHeight(null), BufferedImage.TYPE_INT_ARGB);

		Graphics graphics = bufferedImage.createGraphics();

		graphics.drawImage(image, 0, 0, minusX, minusY, null);

		BufferedImage croppedBi = bufferedImage.getSubimage(0, 0, minusX,
				minusY);

		return new ImageIcon(croppedBi);
	}

	public BufferedImage scaleBackForScreen(ImageIcon imageIcon, int minusX,
			int minusY) {

		Image image = imageIcon.getImage();

		BufferedImage bufferedImage = new BufferedImage(image.getWidth(null),
				image.getHeight(null), BufferedImage.TYPE_INT_ARGB);

		Graphics graphics = bufferedImage.createGraphics();

		graphics.drawImage(image, 0, 0, minusX, minusY, null);

		return bufferedImage.getSubimage(0, 0, minusX, minusY);

	}
}
