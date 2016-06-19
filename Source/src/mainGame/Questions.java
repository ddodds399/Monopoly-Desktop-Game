package mainGame;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import mainWindow.Building;
import mainWindow.LeftPanel;
import mainWindow.RightPanel;

public class Questions {
	
	private static ArrayList<Questions>questions = new ArrayList<>();
	private String questionDes;
	private int answer;
	
	static Questions one = new Questions("It is impossible to run a program if its total memory requirements exceed available RAM", 0);
	static Questions two = new Questions("Inside a computer, data is stored in binary form.",1);
	static Questions three = new Questions("A disk drive is a direct access storage device",1);
	
	
	
	public Questions(String qQuestionDes, int qAnswer){
		questionDes = qQuestionDes;
		answer = qAnswer;
	}
	
	
	public static ArrayList<Questions> questionArray(){
		questions.add(one);
		questions.add(two);
		questions.add(three);
		
		return questions;
	}
	
	public static void chooseQuestion(){
		Random random = new Random();
		int Low = 0;
		int High = 2;
		int i = random.nextInt(High) + Low; 
	Object[] buy = { "True", "False" };

	int selection = JOptionPane.showOptionDialog(null,
			questionArray().get(i).getQuestionDes(),
			"Question Time!", JOptionPane.YES_NO_OPTION,
			JOptionPane.QUESTION_MESSAGE, null, buy, "False");
	
	if(questionArray().get(i).getAnswer() == selection){
		JOptionPane.showMessageDialog(null, "You have answered correctly! £100 will be added to your pot");
		if(LeftPanel.getPlayer1().getPlayerNum() == RightPanel.getCurrentPlayer()){
			LeftPanel.getPlayer1().setPlayerMoney(LeftPanel.getPlayer1().getPlayerMoney() + 100);
		}
		else if(LeftPanel.getPlayer2().getPlayerNum() == RightPanel.getCurrentPlayer()){
			LeftPanel.getPlayer2().setPlayerMoney(LeftPanel.getPlayer2().getPlayerMoney() + 100);
		}
		else if(LeftPanel.getPlayer3().getPlayerNum() == RightPanel.getCurrentPlayer()){
			LeftPanel.getPlayer3().setPlayerMoney(LeftPanel.getPlayer3().getPlayerMoney() + 100);
		}
		else if(LeftPanel.getPlayer4().getPlayerNum() == RightPanel.getCurrentPlayer()){
			LeftPanel.getPlayer4().setPlayerMoney(LeftPanel.getPlayer4().getPlayerMoney() + 100);
		}
	}
	
	else {
		JOptionPane.showMessageDialog(null, "You have answered incorrectly! £200 will be deducted from your pot");
		
		if(LeftPanel.getPlayer1().getPlayerNum() == RightPanel.getCurrentPlayer()){
			LeftPanel.getPlayer1().setPlayerMoney(LeftPanel.getPlayer1().getPlayerMoney() - 200);
		}
		else if(LeftPanel.getPlayer2().getPlayerNum() == RightPanel.getCurrentPlayer()){
			LeftPanel.getPlayer2().setPlayerMoney(LeftPanel.getPlayer2().getPlayerMoney() - 200);
		}
		else if(LeftPanel.getPlayer3().getPlayerNum() == RightPanel.getCurrentPlayer()){
			LeftPanel.getPlayer3().setPlayerMoney(LeftPanel.getPlayer3().getPlayerMoney() - 200);
		}
		else if(LeftPanel.getPlayer4().getPlayerNum() == RightPanel.getCurrentPlayer()){
			LeftPanel.getPlayer4().setPlayerMoney(LeftPanel.getPlayer4().getPlayerMoney() - 200);
		}
	}
	Building.updateLabels();
	}


	public String getQuestionDes() {
		return questionDes;
	}


	public int getAnswer() {
		return answer;
	}
}
