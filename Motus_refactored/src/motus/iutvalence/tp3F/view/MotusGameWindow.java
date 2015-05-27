package motus.iutvalence.tp3F.view;

import java.awt.GridLayout;


import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;	
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MotusGameWindow {
	
	private int col=0;
	 
	public int getCol() {
		return col;}

	public void setCol(int col) {
		this.col = col;}

		public static void main(String[] args)
		{
			JFrame windowMotus = new JFrame();
			
			JPanel westPanel = new JPanel(); 
			JPanel eastPanel = new JPanel();
			JPanel proposedWordPanel = new JPanel();
			JPanel mainPanel = new JPanel();
			JPanel wordPanel = new JPanel();
			
			JLabel nickname = new JLabel("Player's nickname");
			JLabel nbTurns = new JLabel("The number of turns left");
			JLabel wordLength = new JLabel("The length of the word");
			/*JLabel word = new JLabel("WORD");
			JLabel word2 = new JLabel("WORD");
			JLabel word3 = new JLabel("WORD");
			JLabel word4 = new JLabel("WORD");
			JLabel word5 = new JLabel("WORD");
			JLabel word6 = new JLabel("WORD");
			JLabel word7 = new JLabel("WORD");
			JLabel word8 = new JLabel("WORD");
			JLabel word9 = new JLabel("WORD");
			JLabel word10 = new JLabel("WORD");*/
			
			JTextField proposedWord = new JTextField("Propose a word");
			
			JButton submitWord = new JButton("Submit");					
//===================================================================================
			windowMotus.setTitle("Motus");
			windowMotus.setSize(800, 400);
			windowMotus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			windowMotus.setLocationRelativeTo(null);
			windowMotus.setResizable(false);
			windowMotus.setVisible(true);
			
			mainPanel.setLayout(new GridLayout(1, 2));
			mainPanel.add(westPanel);
			mainPanel.add(eastPanel);
			
			westPanel.setBorder(BorderFactory.createTitledBorder("User"));
			westPanel.setLayout(new GridLayout(6, 1));
			westPanel.add(nickname);
			westPanel.add(wordLength);
			westPanel.add(nbTurns);
			westPanel.add(proposedWordPanel);
			
			proposedWord.setColumns(17);
			proposedWordPanel.add(proposedWord);
			proposedWordPanel.add(submitWord);
			
			eastPanel.setBorder(BorderFactory.createTitledBorder("Game"));
			eastPanel.add(wordPanel);
			
			wordPanel.setLayout(new GridLayout(10,1));
			/*wordPanel.add(word);
			wordPanel.add(word2);
			wordPanel.add(word3);
			wordPanel.add(word4);
			wordPanel.add(word5);
			wordPanel.add(word6);
			wordPanel.add(word7);
			wordPanel.add(word8);
			wordPanel.add(word9);
			wordPanel.add(word10);*/
		
			windowMotus.setContentPane(mainPanel);

			

			
			
			
		}
		
}
