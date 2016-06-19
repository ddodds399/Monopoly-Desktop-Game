package mainWindow;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.SwingUtils;

/**
 * This class creates the middle panel for the game
 * 
 * @author Brogrammers
 */
@SuppressWarnings("serial")
public class MiddlePanel extends JPanel {

	private SwingUtils utils = new SwingUtils();
	private static Dimension screenRes;
	private static int screenRatio;
	private static int panelWidth, panelHeight;
	private static ImageIcon player1Pic, player2Pic, player3Pic, player4Pic;
	private static JLabel player1Char, player2Char, player3Char, player4Char;
	private List<String> characters;
	private static boolean paintComplete;
	
	/**
	 * This constructor creates the middle panel
	 * @param characterArray - array of player images
	 */
	public MiddlePanel(List<String> characterArray) {
		screenRes = Toolkit.getDefaultToolkit().getScreenSize();
		screenRatio = screenRatio();
		setLayout(null);
		characters = characterArray;
		paintComplete = false;
	}

	/**
	 * This method is used to draw the board to the screen
	 */
	@Override
	protected void paintComponent(Graphics g ) {
		super.paintComponent(g);
			panelWidth = this.getWidth();
			panelHeight = this.getHeight();
			g.drawImage(utils.scaleBackForScreen(new ImageIcon("images/board.jpg"),panelWidth, panelHeight), 0, 0, null);	
			if (paintComplete != true){
				addPlayerCharacters(characters);
			}
	}

	/**
	 * This method is used to add the player characters to the board 
	 * @param characterArray - the array of character images
	 */
	private void addPlayerCharacters(List<String> characterArray) {
		player1Pic = utils.scaleDownForScreen(new ImageIcon("images/characters/" + characterArray.get(0).toLowerCase() + ".png"), panelWidth/35, panelHeight/24);
		player1Char = new JLabel(player1Pic);
		player2Pic = utils.scaleDownForScreen(new ImageIcon("images/characters/" + characterArray.get(1).toLowerCase() + ".png"), panelWidth/35, panelHeight/24);
		player2Char = new JLabel(player2Pic);
		player3Pic = utils.scaleDownForScreen(new ImageIcon("images/characters/" + characterArray.get(2).toLowerCase() + ".png"), panelWidth/35, panelHeight/24);
		player3Char = new JLabel(player3Pic);
		player4Pic = utils.scaleDownForScreen(new ImageIcon("images/characters/" + characterArray.get(3).toLowerCase() + ".png"), panelWidth/35, panelHeight/24);
		player4Char = new JLabel(player4Pic);
		if (screenRatio == 7){
			player1Char.setBounds(panelWidth -(panelWidth/6), panelHeight - (panelHeight/7), 100, 100);
			player2Char.setBounds(panelWidth - (panelWidth/8), panelHeight - (panelHeight/7), 100, 100);
			player3Char.setBounds(panelWidth - (panelWidth/6), panelHeight - (panelHeight/10), 100, 100);
			player4Char.setBounds(panelWidth - (panelWidth/8), panelHeight - (panelHeight/10), 100, 100);
		}
		if (screenRatio == 25 || screenRatio == 26){
			player1Char.setBounds(panelWidth - (panelWidth/9), panelHeight - (panelHeight/8), 100, 100);
			player2Char.setBounds(panelWidth - (panelWidth/14), panelHeight - (panelHeight/8), 100, 100);
			player3Char.setBounds(panelWidth - (panelWidth/9), panelHeight - (panelHeight/11), 100, 100);
			player4Char.setBounds(panelWidth - (panelWidth/14), panelHeight - (panelHeight/11), 100, 100);
		}	
		if(LeftPanel.getTotalPlayers()==2)
		{
			add(player1Char);
			add(player2Char);
		}
		else if(LeftPanel.getTotalPlayers()==3)
		{
			add(player1Char);
			add(player2Char);
			add(player3Char);
		}
		else if(LeftPanel.getTotalPlayers()==4)
		{
			add(player1Char);
			add(player2Char);
			add(player3Char);
			add(player4Char);
		}
		player4Char.setBounds(panelWidth - (panelWidth/14), panelHeight - (panelHeight/11), 100, 100);
		
		if(LeftPanel.getTotalPlayers()==2)
		{
			add(player1Char);
			add(player2Char);
		}
		else if(LeftPanel.getTotalPlayers()==3)
		{
			add(player1Char);
			add(player2Char);
			add(player3Char);
		}
		else if(LeftPanel.getTotalPlayers()==4)
		{
			add(player1Char);
			add(player2Char);
			add(player3Char);
			add(player4Char);
		}
		paintComplete = true;
	}

	/**
	 * This method sets the player's character position depending on the space they are on
	 * @param playerNo - the player of the image to set
	 * @param property - the space they are on
	 */	
	public static void setPlayerCharLocation(int playerNo, int property){
		int startX = 0, horzX = 0, vertX = 0, horzY = 0, vertY = 0, xSpacing = 0, ySpacing = 0, jailX = 0, jailY = 0, horzX2 = 0, vertX2 = 0, horzY2 = 0, vertY2 = 0, inJailX = 0, charSpacingX = 0, charSpacingY = 0, jailSpacing = 0;
		if (screenRatio == 7){
			startX = panelWidth - (panelWidth/6);
			horzX = panelWidth - (panelWidth/5);
			vertX = panelHeight - (panelHeight/7);
			horzY = 0 - (panelWidth/20);
			vertY = panelHeight - (panelHeight/5);
			xSpacing = panelWidth/12;
			ySpacing = panelHeight/13;
			jailX = 0 - (panelWidth/20);
			jailY = panelHeight - (panelHeight/12);
			horzX2 = 0 - (panelWidth/40);
			vertX2 = 0 - (panelWidth/40);;
			horzY2 = panelWidth - (panelWidth/6);
			vertY2 = panelHeight/40;
			inJailX = 0 - (panelWidth/30);
			charSpacingX = panelWidth/25;
			charSpacingY = panelHeight/33;
			jailSpacing = panelWidth/36;
		}
		if (screenRatio == 25){
			startX = panelWidth - (panelWidth/9);
			horzX = panelWidth - (panelWidth/7);
			vertX =  panelHeight - (panelHeight/8);
			horzY = 0;
			vertY = panelHeight - (panelHeight/6);
			xSpacing = panelWidth/12;
			ySpacing = panelHeight/12;
			jailX = 0;
			jailY = panelHeight - (panelHeight/15);
			horzX2 = panelWidth/29;
			vertX2 = 0;
			horzY2 = panelWidth - (panelWidth/9);
			vertY2 = panelHeight/50;
			inJailX = panelWidth/50;
			charSpacingX = panelWidth/25;
			charSpacingY = panelHeight/33;
			jailSpacing = panelWidth/36;
		}
		if (screenRatio == 26){
			startX = panelWidth - (panelWidth/9);
			horzX = panelWidth - (panelWidth/7);
			vertX =  (panelHeight - (panelHeight/8)) + (panelHeight/10);
			horzY = 0;
			vertY = (panelHeight - (panelHeight/6)) + (panelHeight/10);
			xSpacing = panelWidth/12;
			ySpacing = (panelHeight/12) + (panelHeight/10) ;
			jailX = 0;
			jailY = (panelHeight - (panelHeight/15)) + (panelHeight/10);
			horzX2 = panelWidth/29;
			vertX2 = 0;
			horzY2 = panelWidth - (panelWidth/9);
			vertY2 = (panelHeight/50) + (panelHeight/10);
			inJailX = panelWidth/50;
			charSpacingX = panelWidth/25;
			charSpacingY = (panelHeight/33) + (panelHeight/10);
			jailSpacing = panelWidth/36;
		}
		if(playerNo == 1){
			if(property == 0){
				player1Char.setBounds(startX, vertX, 100, 100);
			} 
			else if (property < 10 ){	
				player1Char.setBounds((horzX-(xSpacing*property)), vertX, 100, 100);
			} 
			else if (property == 10){
				player1Char.setBounds(jailX, jailY, 100, 100);
			}
			else if (property < 20 && property > 10){
				player1Char.setBounds(horzY, (vertY-(ySpacing*(property-10))), 100, 100);
			
			}
			else if (property == 20){
				player1Char.setBounds(horzY, vertX2, 100, 100);
			}
			else if (property > 20 && property < 30){	
				player1Char.setBounds((horzX2+(xSpacing*(property-20))), vertX2, 100, 100);
			} 
			else if (property == 30){
				player1Char.setBounds(startX, vertX2, 100, 100);
			}
			else if (property > 30 && property < 40){	
				player1Char.setBounds(horzY2, (vertY2+(ySpacing*(property-30))), 100, 100);
			} 
			else if (property == 40){
				player1Char.setBounds(inJailX, vertY, 100, 100);
			}
			player1Char.repaint();
		}
		if (playerNo == 2){
			if(property == 0){
				player2Char.setBounds(startX + charSpacingX, vertX, 100, 100);
			} 
			else if (property < 10 ){	
				player2Char.setBounds((horzX-(xSpacing*property)+charSpacingX), vertX, 100, 100);
			} 
			else if (property == 10){
				player2Char.setBounds(jailX + jailSpacing, jailY, 100, 100);
			}
			else if (property < 20 && property > 10){
				player2Char.setBounds(horzY + charSpacingX, (vertY-(ySpacing*(property-10))), 100, 100);
			}
			else if (property == 20){
				player2Char.setBounds(horzY + charSpacingX, vertX2, 100, 100);
			}
			else if (property > 20 && property < 30){	
				player2Char.setBounds((horzX2+(xSpacing*(property-20)) + charSpacingX), vertX2, 100, 100);
			} 
			else if (property == 30){
				player2Char.setBounds(startX + charSpacingX, vertX2, 100, 100);
			}
			else if (property > 30 && property < 40){	
				player2Char.setBounds(horzY2 + charSpacingX, (vertY2+(ySpacing*(property-30))), 100, 100);
			} 
			else if (property == 40){
				player2Char.setBounds(inJailX + charSpacingX, vertY, 100, 100);
			}
			player2Char.repaint();
		}
		if(playerNo == 3){
			if(property == 0){
				player3Char.setBounds(startX, vertX + charSpacingX, 100, 100);
			} 
			else if (property < 10 ){	
				player3Char.setBounds((horzX-(xSpacing*property)), vertX + charSpacingY, 100, 100);
			} 
			else if (property == 10){
				player3Char.setBounds(jailX + (2*jailSpacing), jailY, 100, 100);
			}
			else if (property < 20 && property > 10){
				player3Char.setBounds(horzY, (vertY-(ySpacing*(property-10)) + charSpacingY), 100, 100);
			}
			else if (property == 20){
				player3Char.setBounds(horzY, vertX2 + charSpacingY, 100, 100);
			}
			else if (property > 20 && property < 30){	
				player3Char.setBounds((horzX2+(xSpacing*(property-20))), vertX2 + charSpacingY, 100, 100);
			} 
			else if (property == 30){
				player3Char.setBounds(startX, vertX2 + charSpacingY, 100, 100);
			}
			else if (property > 30 && property < 40){	
				player3Char.setBounds(horzY2, (vertY2+(ySpacing*(property-30)) + charSpacingY), 100, 100);
			} 
			else if (property == 40){
				player3Char.setBounds(inJailX, vertY + charSpacingY, 100, 100);
			}
			player3Char.repaint();
		}
		if (playerNo == 4){
			if(property == 0){
				player4Char.setBounds(startX + charSpacingX, vertX + charSpacingY, 100, 100);
			} 
			else if (property < 10 ){	
				player4Char.setBounds((horzX-(xSpacing*property)+charSpacingX), vertX + charSpacingY, 100, 100);
			} 
			else if (property == 10){
				player4Char.setBounds(jailX + (3*jailSpacing), jailY, 100, 100);
			}
			else if (property < 20 && property > 10){
				player4Char.setBounds(horzY + charSpacingX, (vertY-(ySpacing*(property-10)) + charSpacingY), 100, 100);
			}
			else if (property == 20){
				player4Char.setBounds(horzY + charSpacingX, vertX2 + charSpacingY, 100, 100);
			}
			else if (property > 20 && property < 30){	
				player4Char.setBounds((horzX2+(xSpacing*(property-20)) + charSpacingX), vertX2 + charSpacingY, 100, 100);
			} 
			else if (property == 30){
				player4Char.setBounds(startX + charSpacingX, vertX2 + charSpacingY, 100, 100);
			}
			else if (property > 30 && property < 40){	
				player4Char.setBounds(horzY2 + charSpacingX, (vertY2+(ySpacing*(property-30)) + charSpacingY), 100, 100);
			} 
			else if (property == 40){
				player4Char.setBounds(inJailX + charSpacingX, vertY + charSpacingX, 100, 100);
			}
			player4Char.repaint();
		}
	}

	/**
	 * This method is used to calculate the aspect ratio of the screen the players are using
	 */
	private int screenRatio(){
		double ratio = ((screenRes.width + 0.0)/(screenRes.height + 0.0));
		double bestInac = Double.MAX_VALUE;
		int bestX = 0;
		int bestY = 0;
		for (int i = 1; i < 100; i++) {
		  for (int j = 1; j < 100; j++) {
		    double newInac = Math.abs((double) i / (double) j - ratio);
		    if (newInac < bestInac) {
		      bestInac = newInac;
		      bestX = i;
		      bestY = j;
		    }
		  }
		}
		return bestX + bestY;	
	}
	
	//JLabel Getters
	public static JLabel getPlayer1Char(){
		return player1Char;
	}
	
	public static JLabel getPlayer2Char(){
		return player2Char;
	}
	
	public static JLabel getPlayer3Char(){
		return player3Char;
	}
	
	public static JLabel getPlayer4Char(){
		return player4Char;
	}
	
	
	
}


