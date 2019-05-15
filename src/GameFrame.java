/**
 * @author Juo-Wei, Bansi, Lauran
 * Java Programming
 * CS170-01
 * Final Project
 */

import java.awt.BorderLayout;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class GameFrame extends JFrame {
	
	TopPanel tPanel;
	CenterPanel cPanel;
	BottomPanel bPanel;
	AudioPlayer bgmPlayer, correctPlayer, wrongPlayer;
	
	public GameFrame() throws UnsupportedAudioFileException, IOException, LineUnavailableException
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
		
		bgmPlayer = new AudioPlayer("audio/bgm1.wav");
		correctPlayer = new AudioPlayer("audio/correct.wav");
		wrongPlayer = new AudioPlayer("audio/wrong.wav");
	}
	
	public void gameloop() throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{
		
		bgmPlayer.play();
		
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
							tPanel.addScore();
							correctPlayer.play();
							correctPlayer.resetAudioStream();
							JOptionPane.showMessageDialog(null, "Correct :D");
						}
						else
						{
							wrongPlayer.play();
							wrongPlayer.resetAudioStream();
							JOptionPane.showMessageDialog(null, "Wrong :(");
						}
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
