package motus.iutvalence.tp3F.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrame windowMotus = new JFrame();
	JPanel westPanel = new JPanel(); 
	JPanel eastPanel = new JPanel();
	JPanel proposedWordPanel = new JPanel();
	JPanel mainPanel = new JPanel();
	JPanel wordPanel = new JPanel();

	JLabel nickname = new JLabel("Player's nickname");
	JLabel nbTurns = new JLabel("The number of turns left");
	JLabel wordLength = new JLabel("The length of the word");

	JTextField proposedWord = new JTextField("Propose a word");

	JButton submitWord = new JButton("Submit");					
	//===================================================================================
	public Window(){
	windowMotus.setTitle("Motus");
	windowMotus.setSize(700, 400);
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
	submitWord.addActionListener(this);

	eastPanel.setBorder(BorderFactory.createTitledBorder("Game"));
	eastPanel.add(wordPanel, BorderLayout.NORTH);


	windowMotus.setContentPane(mainPanel);

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String exampleWord = "";
		System.out.println("hello");
		exampleWord = proposedWord.getText();
		int wordLengthLoop= 7 ;
		wordPanel.setLayout(new GridLayout(1, 10));
		for (int loopCounter = 0; loopCounter < wordLengthLoop; loopCounter++)
		{
			JLabel word = new JLabel(exampleWord.substring(loopCounter, loopCounter+1));
			word.setBackground(Color.RED);
			word.setOpaque(true);
			wordPanel.add(word);	
		}
		
		
	}
}
