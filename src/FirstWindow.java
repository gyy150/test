import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FirstWindow  extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FirstWindow(){
		super("you computer has a virus");
		setSize(600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		JButton b = new JButton("Button 1");
		JButton c = new JButton("Button 2");
		
		b.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "haha"+e);
			}		
		});
		p.add(b);
		p.add(c);
		
		JPanel p2 = new JPanel();
		
		JCheckBox jb = new JCheckBox("hello?");
		JCheckBox jb2 = new JCheckBox("hello 2?");
		   
		p2.add(jb);
		p2.add(jb2);
		
		add(p2,BorderLayout.SOUTH);
		add(p,BorderLayout.NORTH);
	}
	
	
}
