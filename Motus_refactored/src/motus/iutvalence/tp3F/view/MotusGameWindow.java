package motus.iutvalence.tp3F.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;	
import javax.swing.JPanel;

public class MotusGameWindow {
		public static void main(String[] args)
		{
			JFrame windowMotus = new JFrame();
			JPanel eastPanel = new JPanel(); 
			JPanel centerPanel = new JPanel(); 
			JPanel mainPanel = new JPanel(); 
			
			windowMotus.setVisible(true);
			windowMotus.setSize(600, 400);
			windowMotus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			windowMotus.setTitle("Motus");
			windowMotus.setLocationRelativeTo(null);
			windowMotus.setLayout(new BorderLayout());
			
			
		}
		
}
