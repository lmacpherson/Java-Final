import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GameFrame extends JFrame {
	
	TopPanel tPanel;
	CenterPanel cPanel;
	BottomPanel bPanel;
	
	public GameFrame()
	{
		setTitle("Welcome to play math learning game");
		setSize(900,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tPanel = new TopPanel();
		cPanel = new CenterPanel();
		bPanel = new BottomPanel();
	
		this.add(tPanel, BorderLayout.NORTH);
		this.add(cPanel, BorderLayout.CENTER);
		this.add(bPanel, BorderLayout.SOUTH);
	}
	
	public void gameloop()
	{
		while (true)
		{
			System.out.println(tPanel.getStartFlag());
			if (tPanel.getStartFlag() == true)
			{
				String player = JOptionPane.showInputDialog(null,"Enter your name: ");
				tPanel.addPlayer(player);
			}
			while(tPanel.getStartFlag())
			{
				// End game in round 10
				if (tPanel.getRound() == 10)
					endRound();
				
				if (tPanel.getPauseFlag() == false)
				{
					//show question
					cPanel.showQuestion();
					tPanel.setPauseFlag(true);
					tPanel.addRound();
				}
				else
				{
					// if user press Quit
					if (tPanel.getQuitFlag() == true)
						endRound();
					//waiting user answer
					if (bPanel.getUserAns() != -1)
					{
						if (cPanel.checkUserAns(bPanel.getUserAns()) == true)
						{
							JOptionPane.showMessageDialog(null, "Correct :D");
							tPanel.addScore();
						}
						else
							JOptionPane.showMessageDialog(null, "Wrong :(");
						//reset
						bPanel.setUserAns(-1);
						tPanel.setPauseFlag(false);
					}
				}
			}
		}
	}
	
	private void endRound()
	{
		JOptionPane.showMessageDialog(null, "Good Job!\nYour Score: " + tPanel.getScore() + 
				"\nPress start to try again");
		tPanel.setStartFlag(false);
		tPanel.setPauseFlag(true);
		tPanel.setQuitFlag(true);
		tPanel.setRound(0);
		tPanel.setScore(0);
		cPanel.clearQuestion();
		bPanel.setUserAns(-1);
	}
}
