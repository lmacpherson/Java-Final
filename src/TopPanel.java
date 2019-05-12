import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class TopPanel extends GamePanel {

	private JButton startButton;
	private JButton stopButton;
	private JButton scoreButton;
	
	public TopPanel(String player) {
		
		super(player);
		
		contentPanel.setBackground(Color.red);
		contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

		startButton = new JButton("Start", new ImageIcon("images/play.gif"));
		startButton.addActionListener(this);
		startButton.setPreferredSize(new java.awt.Dimension(100, 80));
		contentPanel.add(startButton);
		
		stopButton = new JButton("Stop", new ImageIcon("images/stop.gif"));
		stopButton.addActionListener(this);
		stopButton.setPreferredSize(new java.awt.Dimension(100, 80));
		contentPanel.add(stopButton);
		
		scoreButton = new JButton("Score", new ImageIcon("images/s.gif"));
		scoreButton.addActionListener(this);
		scoreButton.setPreferredSize(new java.awt.Dimension(100, 80));
		contentPanel.add(scoreButton);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		Object source = e.getSource();
		
		if (source == startButton)
		{
			JOptionPane.showMessageDialog(null, "start");
		}
		else if (source == stopButton)
		{
			JOptionPane.showMessageDialog(null, "stop");
		}
		else if (source == scoreButton)
		{
			JOptionPane.showMessageDialog(null, "score");
		}
		
	}

}
