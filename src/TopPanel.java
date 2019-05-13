import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class TopPanel extends GamePanel {

	private JButton startButton;
	private JButton quitButton;
	private JButton scoreButton;
	
	private Boolean startFlag = false;
	private Boolean pauseFlag = true;
	private Boolean quitFlag = true;
	
	private int round = 0;
	private JLabel curRound;
	private int score = 0;
	private JLabel curScore;
	
	public TopPanel(String player) {
		
		super(player);
		
		contentPanel.setBackground(Color.red);
		contentPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

		startButton = new JButton("Start", new ImageIcon("images/play.gif"));
		startButton.addActionListener(this);
		startButton.setPreferredSize(new java.awt.Dimension(100, 80));
		contentPanel.add(startButton);
		
		quitButton = new JButton("Quit", new ImageIcon("images/stop.gif"));
		quitButton.addActionListener(this);
		quitButton.setPreferredSize(new java.awt.Dimension(100, 80));
		contentPanel.add(quitButton);
		
		scoreButton = new JButton("ScoreBoard", new ImageIcon("images/s.gif"));
		scoreButton.addActionListener(this);
		scoreButton.setPreferredSize(new java.awt.Dimension(100, 80));
		contentPanel.add(scoreButton);
		
		curScore = new JLabel(" Score: " + Integer.toString(score));
		curScore.setFont(new Font("Serif", Font.PLAIN, 48));
		contentPanel.add(curScore);
		
		curRound = new JLabel(" Round: " + Integer.toString(score));
		curRound.setFont(new Font("Serif", Font.PLAIN, 48));
		contentPanel.add(curRound);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		Object source = e.getSource();
		
		if (source == startButton)
		{
			setStartFlag(true);
			setPauseFlag(false);
			setQuitFlag(false);
		}
		else if (source == quitButton)
		{
			setQuitFlag(true);
		}
		else if (source == scoreButton)
		{
			JOptionPane.showMessageDialog(null, "ScoreBoard");
		}
		
	}

	//Score
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
		curScore.setText(" Score: " + Integer.toString(score));
	}
	
	public void addScore()
	{
		this.score += 1;
		curScore.setText(" Score: " + Integer.toString(score));
	}
	//round
	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
		curRound.setText(" Round: " + Integer.toString(round));
	}
	
	public void addRound()
	{
		this.round += 1;
		curRound.setText(" Round: " + Integer.toString(round));
	}
	//startFlag
	public Boolean getStartFlag() {
		return startFlag;
	}

	public void setStartFlag(Boolean startFlag) {
		this.startFlag = startFlag;
	}
	//pauseFlag
	public Boolean getPauseFlag() {
		return pauseFlag;
	}

	public void setPauseFlag(Boolean pauseFlag) {
		this.pauseFlag = pauseFlag;
	}
	//quitFlag
	public Boolean getQuitFlag() {
		return quitFlag;
	}

	public void setQuitFlag(Boolean quitFlag) {
		this.quitFlag = quitFlag;
	}
}
