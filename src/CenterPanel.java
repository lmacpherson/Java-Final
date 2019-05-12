import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class CenterPanel extends GamePanel {
	
	private JLabel content;
	
	public CenterPanel(String player)
	{
		super(player);
		
		contentPanel.setBackground(Color.white);
		contentPanel.setLayout(null);
		
		content = new JLabel("1 + 1 = 2");
		content.setFont(new Font("Serif", Font.PLAIN, 48));
		content.setBounds(350, 100, 1000, 100);
		
		contentPanel.add(content);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
	}
	
}
