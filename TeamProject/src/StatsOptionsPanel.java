
import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class StatsOptionsPanel extends JPanel{
	private JRadioButton topPlayer;
	private JRadioButton numberOfPlays;
	private JRadioButton time;
	private JTextArea title;
	
	public StatsOptionsPanel(){
	setLayout(new BorderLayout());
	topPlayer = new JRadioButton("Top Player");
	numberOfPlays = new JRadioButton("Most Difficult");
	time = new JRadioButton("Time");
	title = new JTextArea("Statistics Options");
	add(title, BorderLayout.PAGE_START);
	add(time, BorderLayout.LINE_START);
	add(numberOfPlays, BorderLayout.CENTER);
	add(topPlayer, BorderLayout.LINE_END);
		
		}
	
}
