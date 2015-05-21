package motus.iutvalence.tp3F.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;	

public class MotusGameWindow {
		public static void main(String[] args)
		{
			JFrame windowMotus = new JFrame();
			windowMotus.setVisible(true);
			windowMotus.setSize(600, 400);
			windowMotus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			windowMotus.setTitle("Motus");
			windowMotus.setLocationRelativeTo(null);
			windowMotus.setLayout(new BorderLayout());
			
		}
		
}
