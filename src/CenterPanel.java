import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class CenterPanel extends GamePanel {
	
	private JLabel content;
	int [] qNum = new int[3];
	int randomNumIndex;
	
	public CenterPanel()
	{
		super();
		
		contentPanel.setBackground(Color.white);
		contentPanel.setLayout(null);
		
		content = new JLabel("");
		content.setFont(new Font("Serif", Font.PLAIN, 48));
		content.setBounds(350, 100, 1000, 100);
		
		contentPanel.add(content);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
	}

	public void showQuestion()
	{
		Random r = new Random();
		String questionStr;
		
		//Randomize question
		qNum[0] = r.nextInt(10);
		qNum[1] = r.nextInt(10);
		qNum[2] = qNum[0] + qNum[1];
		
		//Put a number to blank
		String[] numArr = {Integer.toString(qNum[0]), Integer.toString(qNum[1]), Integer.toString(qNum[2])};
		randomNumIndex = r.nextInt(2);
		numArr[randomNumIndex] = "_";
		
		//set question
		questionStr = numArr[0] + " + " + numArr[1] + " = " + numArr[2];
		content.setText(questionStr);
	}
	
	public Boolean checkUserAns(int uAns)
	{
		if (qNum[randomNumIndex] == uAns)
			return true;
		return false;
	}
	
	public void clearQuestion()
	{
		content.setText("");
	}
}
