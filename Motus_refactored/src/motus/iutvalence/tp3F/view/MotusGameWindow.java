package motus.iutvalence.tp3F.view;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;	
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MotusGameWindow {
		public static void main(String[] args)
		{
			JFrame windowMotus = new JFrame();
			
			JPanel westPanel = new JPanel(); 
			JPanel centerPanel = new JPanel();
			JPanel proposedWordPanel = new JPanel();
			JPanel mainPanel = new JPanel(); 
			
			JLabel nickname = new JLabel("Player's nickname");
			JLabel nbTurns = new JLabel("The number of turns left");
			
			JTextField proposedWord = new JTextField("Propose a word");
			
			JButton submitWord = new JButton("Submit");
						
//===================================================================================
			windowMotus.setTitle("Motus");
			windowMotus.setSize(600, 400);
			windowMotus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			windowMotus.setLocationRelativeTo(null);
			windowMotus.setVisible(true);
			
			mainPanel.setLayout(new GridLayout(1, 2));
			mainPanel.add(westPanel);
			mainPanel.add(centerPanel);
			
			westPanel.setBorder(BorderFactory.createTitledBorder("User"));
			westPanel.setLayout(new GridLayout(6, 1));
			westPanel.add(nickname);
			westPanel.add(nbTurns);
			westPanel.add(proposedWordPanel);
			
			proposedWord.setColumns(17);
			proposedWordPanel.add(proposedWord);
			proposedWordPanel.add(submitWord);
			
			centerPanel.setBorder(BorderFactory.createTitledBorder("Game"));
			
			windowMotus.setContentPane(mainPanel);
			
			
			
			
		}
		
}
