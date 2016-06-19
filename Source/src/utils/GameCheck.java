package utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import setup.SetupWindow;
import mainWindow.MiddlePanel;
import mainWindow.RightPanel;
import mainWindow.LeftPanel;

public class GameCheck {
	
	private static int surrenderCounter;
	private static JFrame endFrame;
	private static String winner;
	private static int winnings;
	private static String properties="";
	static Clip clip;
	
	public static void surrenderCheck()
	{
		if(LeftPanel.getPlayer1().getSurrender() == true && RightPanel.getCurrentPlayer()==LeftPanel.getPlayer1().getPlayerNum())
		{
			LeftPanel.getPlayer1Panel().getParent().remove(LeftPanel.getPlayer1Panel());
			MiddlePanel.getPlayer1Char().setVisible(false);
			MiddlePanel.getPlayer1Char().repaint();
			surrenderCounter++;
			RightPanel.checkNextPlayer();
		}
		if(LeftPanel.getPlayer2().getSurrender() == true && RightPanel.getCurrentPlayer()==LeftPanel.getPlayer2().getPlayerNum())
		{
			LeftPanel.getPlayer2Panel().getParent().remove(LeftPanel.getPlayer2Panel());
			MiddlePanel.getPlayer2Char().setVisible(false);
			MiddlePanel.getPlayer2Char().repaint();
			surrenderCounter++;
			RightPanel.checkNextPlayer();
		}
		if(LeftPanel.getPlayer3().getSurrender() == true && RightPanel.getCurrentPlayer()==LeftPanel.getPlayer3().getPlayerNum())
		{
			LeftPanel.getPlayer3Panel().getParent().remove(LeftPanel.getPlayer3Panel());
			MiddlePanel.getPlayer3Char().setVisible(false);
			MiddlePanel.getPlayer3Char().repaint();
			surrenderCounter++;
			RightPanel.checkNextPlayer();
		}
		if(LeftPanel.getPlayer4().getSurrender() == true && RightPanel.getCurrentPlayer()==LeftPanel.getPlayer4().getPlayerNum())
		{
			LeftPanel.getPlayer4Panel().getParent().remove(LeftPanel.getPlayer4Panel());
			MiddlePanel.getPlayer4Char().setVisible(false);
			MiddlePanel.getPlayer4Char().repaint();
			surrenderCounter++;
			RightPanel.checkNextPlayer();
		}
		
	}
	
	public static void balanceCheck()
	{
		if((LeftPanel.getPlayer1().getPlayerMoney() < 0)&&(LeftPanel.getPlayer1().getPropertiesArray().isEmpty())&&(LeftPanel.getPlayer1().getSurrender()==false))
		{
			JOptionPane.showMessageDialog(null, "" + LeftPanel.getPlayer1().getPlayerName() + " is broke!");
			LeftPanel.getPlayer1Panel().getParent().remove(LeftPanel.getPlayer1Panel());
			LeftPanel.getPlayer1().setSurrender(true);
			MiddlePanel.getPlayer1Char().setVisible(false);
			MiddlePanel.getPlayer1Char().repaint();
			surrenderCounter++;
			//RightPanel.setCurrentPlayer(RightPanel.getCurrentPlayer()+1);
		}
		if((LeftPanel.getPlayer2().getPlayerMoney() < 0)&&(LeftPanel.getPlayer2().getPropertiesArray().isEmpty())&&(LeftPanel.getPlayer2().getSurrender()==false))
		{
			JOptionPane.showMessageDialog(null, "" + LeftPanel.getPlayer2().getPlayerName() + " is broke!");
			LeftPanel.getPlayer2Panel().getParent().remove(LeftPanel.getPlayer2Panel());
			LeftPanel.getPlayer2().setSurrender(true);
			MiddlePanel.getPlayer2Char().setVisible(false);
			MiddlePanel.getPlayer2Char().repaint();
			surrenderCounter++;
			//RightPanel.setCurrentPlayer(RightPanel.getCurrentPlayer()+1);
		}
		if((LeftPanel.getPlayer3().getPlayerMoney() < 0)&&(LeftPanel.getPlayer3().getPropertiesArray().isEmpty())&&(LeftPanel.getPlayer3().getSurrender()==false))
		{
			JOptionPane.showMessageDialog(null, "" + LeftPanel.getPlayer3().getPlayerName() + " is broke!");
			LeftPanel.getPlayer3Panel().getParent().remove(LeftPanel.getPlayer3Panel());
			LeftPanel.getPlayer3().setSurrender(true);
			MiddlePanel.getPlayer3Char().setVisible(false);
			MiddlePanel.getPlayer3Char().repaint();
			surrenderCounter++;
			//RightPanel.setCurrentPlayer(RightPanel.getCurrentPlayer()+1);
		}
		if((LeftPanel.getPlayer4().getPlayerMoney() < 0)&&(LeftPanel.getPlayer4().getPropertiesArray().isEmpty())&&(LeftPanel.getPlayer4().getSurrender()==false))
		{
			JOptionPane.showMessageDialog(null, "" + LeftPanel.getPlayer4().getPlayerName() + " is broke!");
			LeftPanel.getPlayer4Panel().getParent().remove(LeftPanel.getPlayer4Panel());
			LeftPanel.getPlayer4().setSurrender(true);
			MiddlePanel.getPlayer4Char().setVisible(false);
			MiddlePanel.getPlayer4Char().repaint();
			surrenderCounter++;
			//RightPanel.setCurrentPlayer(RightPanel.getCurrentPlayer()+1);
		}
	}
	
	/*
	 * Method to display Game Over Screen once one player remains in the game.
	 */
	public static void gameOverCheck()
	{
		if(surrenderCounter == 3)
		{	setUpGameOverScreen();
			endFrame.setVisible(true);
			endFrame.setFocusableWindowState(true);
			
		}
	}
	
	/*
	 * This method decides how many players need to lose in order for the game to end, depending on the total number
	 * of players
	 */
	public static void setupSurrenderCounter()
	{
		if(LeftPanel.getTotalPlayers() == 2)
		{
			surrenderCounter = 2;
		}
		if(LeftPanel.getTotalPlayers() == 3)
		{
			surrenderCounter = 1;
		}
		if(LeftPanel.getTotalPlayers() == 4)
		{	
			surrenderCounter = 0;
		}
	}
	
	public static void setUpGameOverScreen()
	{
		endFrame = new JFrame();
		endFrame.setVisible(false);
		JPanel buttonPanel = new JPanel();
		JPanel textPanel = new JPanel();
		JPanel winnerPanel = new JPanel();
		JPanel goPanel = new JPanel();
		goPanel.setLayout(new BoxLayout(goPanel, BoxLayout.Y_AXIS));
		goPanel.setBackground(Color.darkGray);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		playLoopSound();
		
		//components
		JLabel text = new JLabel("<html><h1>Game Over</h1></html");
		JLabel WinImage = new JLabel(new ImageIcon("images/wingif.gif"));
		JLabel winText = new JLabel();
		JButton retry = new JButton("Play Again");
		JButton quit = new JButton("Quit");
		JButton propertiesOwned = new JButton("Your Properties");
		System.out.println("Has player one surrendered " + LeftPanel.getPlayer1().getSurrender());
		if(LeftPanel.getPlayer1().getSurrender() == false)
		{
			winner = LeftPanel.getPlayer1().getPlayerName();
			winnings = LeftPanel.getPlayer1().getPlayerMoney();
			propertiesOwned.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent e) {
					endFrame.setVisible(false);
					String properties = "";
					for (int j = 0; j < LeftPanel.getPlayer1().getPropertiesArray()
							.size(); j++) {
						properties += LeftPanel.getPlayer1().getPropertiesArray().get(j)
								.getPropertyName()
								+ ":  Rent £"
								+ LeftPanel.getPlayer1().getPropertiesArray().get(j).getRent() + "\n";
					}
					JOptionPane.showMessageDialog(
							null,""+ LeftPanel.getPlayer1().getPlayerName() + " owned: \n"
									+ properties, "Player 1",
							JOptionPane.INFORMATION_MESSAGE);
					
					endFrame.setVisible(true);
				}
			
			});
			
		}
		else if(LeftPanel.getPlayer2().getSurrender() == false)
		{
			winner = LeftPanel.getPlayer2().getPlayerName();
			winnings = LeftPanel.getPlayer2().getPlayerMoney();
			
			propertiesOwned.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent e) {
					endFrame.setVisible(false);
					String properties = "";
					for (int j = 0; j < LeftPanel.getPlayer2().getPropertiesArray()
							.size(); j++) {
						properties += LeftPanel.getPlayer2().getPropertiesArray().get(j)
								.getPropertyName()
								+ ":  Rent £"
								+ LeftPanel.getPlayer2().getPropertiesArray().get(j).getRent() + "\n";
					}
					JOptionPane.showMessageDialog(
							null,""+ LeftPanel.getPlayer2().getPlayerName() + " owned: \n"
									+ properties, "Player 2",
							JOptionPane.INFORMATION_MESSAGE);
					
					endFrame.setVisible(true);
				}
			
			});
			
		}
		else if(LeftPanel.getPlayer3().getSurrender() == false)
		{
			winner = LeftPanel.getPlayer3().getPlayerName();
			winnings = LeftPanel.getPlayer3().getPlayerMoney();
			
			propertiesOwned.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent e) {
					endFrame.setVisible(false);
					String properties = "";
					for (int j = 0; j < LeftPanel.getPlayer3().getPropertiesArray()
							.size(); j++) {
						properties += LeftPanel.getPlayer3().getPropertiesArray().get(j)
								.getPropertyName()
								+ ":  Rent £"
								+ LeftPanel.getPlayer3().getPropertiesArray().get(j).getRent() + "\n";
					}
					JOptionPane.showMessageDialog(
							null,""+ LeftPanel.getPlayer3().getPlayerName() + " owned: \n"
									+ properties, "Player 3",
							JOptionPane.INFORMATION_MESSAGE);
					
					endFrame.setVisible(true);
				}
			
			});
		}
		else if(LeftPanel.getPlayer4().getSurrender() == false)
		{
			winner = LeftPanel.getPlayer4().getPlayerName();
			winnings = LeftPanel.getPlayer4().getPlayerMoney();
			propertiesOwned.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent e) {
					endFrame.setVisible(false);
					String properties = "";
					for (int j = 0; j < LeftPanel.getPlayer4().getPropertiesArray()
							.size(); j++) {
						properties += LeftPanel.getPlayer4().getPropertiesArray().get(j)
								.getPropertyName()
								+ ":  Rent £"
								+ LeftPanel.getPlayer4().getPropertiesArray().get(j).getRent() + "\n";
					}
					JOptionPane.showMessageDialog(
							null,""+ LeftPanel.getPlayer4().getPlayerName() + " owned: \n"
									+ properties, "Player 4",
							JOptionPane.INFORMATION_MESSAGE);
					
					endFrame.setVisible(true);
				}
			
			});
		}
		winText = new JLabel("<html>The winner is " + winner + ", who finished with £" + winnings + "<br>"+ "Properties Owned: " + "<br>"+properties);
	
		endFrame.setSize(600, 480);
		endFrame.setAlwaysOnTop(true);
		endFrame.setTitle("Game Over!");
		endFrame.setResizable(false);
		endFrame.setLocation(dim.width/2-endFrame.getSize().width/2, dim.height/2-endFrame.getSize().height/2);
		
		endFrame.add(goPanel);
		
		goPanel.add(textPanel);
		goPanel.add(winnerPanel);
		goPanel.add(buttonPanel);
		
		textPanel.add(text);
		winnerPanel.add(WinImage);
		winnerPanel.add(winText);
		buttonPanel.add(retry);
		buttonPanel.add(quit);
		buttonPanel.add(propertiesOwned);
		
		//action listeners
		retry.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				endFrame.dispose();
				SetupWindow.getWindow().dispose();
				@SuppressWarnings("unused")
				SetupWindow su = new SetupWindow();
				endLoopSound();
				
			}
		
		});
		quit.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				endFrame.dispose();
				System.exit(1);
				
			}
			
		});
	}
	
	public static JFrame getGOScreen()
	{
		return endFrame;
	}
	
	/**
	 * This method plays the victory music
	 */
	public static void playLoopSound()
	 {
	   try 
	   {
	    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("audio/Victory.wav").getAbsoluteFile( ));
	    clip = AudioSystem.getClip( );
	    clip.open(audioInputStream);
	    clip.loop(Clip.LOOP_CONTINUOUSLY);
	   }
	   catch(Exception ex)
	   {
	     System.out.println("Error with playing sound.");
	     ex.printStackTrace( );
	   }
	 }
	
	/**
	 * This method ends the loop music
	 */
	public static void endLoopSound()
	{
		clip.stop();
	}
}
