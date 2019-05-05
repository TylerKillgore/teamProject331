import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class bottomPanel extends JPanel{
	private JButton clear;
	private JRadioButton difficultViewOption;
	private JButton displayStats;
	
	public bottomPanel() {
		setLayout(new GridLayout(2,2));
		
		
		clear = new JButton("Clear Display Button");
		clear.addActionListener(new clearListener());
		
		displayStats = new JButton("Display Statistics");
		displayStats.addActionListener(new stats());
		//String[] mostDiff = {"Most Difficult Level"};
				difficultViewOption = new JRadioButton("Most Difficult");
		
		//add buttons
		add(clear);
		add(new StatsOptionsPanel());
		add(displayStats);
		add(difficultViewOption);
		
	}
	
}
class clearListener implements ActionListener{ //clear button in bottom panel not calling this action listener
	public void actionPerformed(ActionEvent ae) {
		MainFrame.centerPanelView.clearText();
}
}
class stats implements ActionListener{ //clear button in bottom panel not calling this action listener
	public void actionPerformed(ActionEvent ae) {
		JFrame statsFrame = new JFrame();
		JPanel panel = new StatsOptionsPanel();
		statsFrame.add(panel);
		statsFrame.setVisible(true);
}
}