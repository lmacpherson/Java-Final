import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GameFrame extends JFrame {
	
	String player;
	
	public GameFrame()
	{
		player = JOptionPane.showInputDialog(null,"Enter your name: ");
		setTitle("Welcome "+ player +", play math learning game");
		setSize(900,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel tPanel = new TopPanel(player);
		JPanel cPanel = new CenterPanel(player);
		JPanel bPanel = new BottomPanel(player);
	
		this.add(tPanel, BorderLayout.NORTH);
		this.add(cPanel, BorderLayout.CENTER);
		this.add(bPanel, BorderLayout.SOUTH);
	}
}
