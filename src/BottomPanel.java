import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class BottomPanel extends GamePanel {
	
	private JButton n0, n1, n2, n3, n4, n5, n6, n7, n8, n9;
	
	public BottomPanel(String player)
	{
		super(player);
		
		contentPanel.setBackground(Color.blue);
		contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

		n0 = new JButton("0", new ImageIcon("images/s.gif"));
		n0.addActionListener(this);
		n0.setPreferredSize(new java.awt.Dimension(80, 100));
		contentPanel.add(n0);
		
		n1 = new JButton("1", new ImageIcon("images/s.gif"));
		n1.addActionListener(this);
		n1.setPreferredSize(new java.awt.Dimension(80, 100));
		contentPanel.add(n1);
		
		n2 = new JButton("2", new ImageIcon("images/s.gif"));
		n2.addActionListener(this);
		n2.setPreferredSize(new java.awt.Dimension(80, 100));
		contentPanel.add(n2);
		
		n3 = new JButton("3", new ImageIcon("images/s.gif"));
		n3.addActionListener(this);
		n3.setPreferredSize(new java.awt.Dimension(80, 100));
		contentPanel.add(n3);

		n4 = new JButton("4", new ImageIcon("images/s.gif"));
		n4.addActionListener(this);
		n4.setPreferredSize(new java.awt.Dimension(80, 100));
		contentPanel.add(n4);
		
		n5 = new JButton("5", new ImageIcon("images/s.gif"));
		n5.addActionListener(this);
		n5.setPreferredSize(new java.awt.Dimension(80, 100));
		contentPanel.add(n5);
		
		n6 = new JButton("6", new ImageIcon("images/s.gif"));
		n6.addActionListener(this);
		n6.setPreferredSize(new java.awt.Dimension(80, 100));
		contentPanel.add(n6);
		
		n7 = new JButton("7", new ImageIcon("images/s.gif"));
		n7.addActionListener(this);
		n7.setPreferredSize(new java.awt.Dimension(80, 100));
		contentPanel.add(n7);
		
		n8 = new JButton("8", new ImageIcon("images/s.gif"));
		n8.addActionListener(this);
		n8.setPreferredSize(new java.awt.Dimension(80, 100));
		contentPanel.add(n8);
		
		n9 = new JButton("9", new ImageIcon("images/s.gif"));
		n9.addActionListener(this);
		n9.setPreferredSize(new java.awt.Dimension(80, 100));
		contentPanel.add(n9);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object source = e.getSource();
		
		if (source == n0)
		{
			JOptionPane.showMessageDialog(null, "0");
		}
		else if (source == n1)
		{
			JOptionPane.showMessageDialog(null, "1");
		}
		else if (source == n2)
		{
			JOptionPane.showMessageDialog(null, "2");
		}
		else if (source == n3)
		{
			JOptionPane.showMessageDialog(null, "3");
		}
		else if (source == n4)
		{
			JOptionPane.showMessageDialog(null, "4");
		}
		else if (source == n5)
		{
			JOptionPane.showMessageDialog(null, "5");
		}
		else if (source == n6)
		{
			JOptionPane.showMessageDialog(null, "6");
		}
		else if (source == n7)
		{
			JOptionPane.showMessageDialog(null, "7");
		}
		else if (source == n8)
		{
			JOptionPane.showMessageDialog(null, "8");
		}
		else if (source == n9)
		{
			JOptionPane.showMessageDialog(null, "9");
		}
	}
}
