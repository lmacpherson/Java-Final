import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class GamePanel extends JPanel implements ActionListener{
	
	String player;
	JPanel contentPanel;
	
	public GamePanel(String player)
	{
		this.player = player;
		this.setLayout(new BorderLayout());
		contentPanel = new JPanel();
		this.add(contentPanel);
	}
	
}
