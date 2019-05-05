import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


@SuppressWarnings("serial")
public class submitNameAndDifficultyFrame extends JFrame{
	JPanel panel = new JPanel();
	JTextArea pName = new JTextArea();
	JComboBox<String> dropdown = new JComboBox<String>();
	static int playerNumber;
	
	public submitNameAndDifficultyFrame() {
		JFrame startFrame = new JFrame("Enter Name and Difficulty Level");
		startFrame.setLayout(new BorderLayout());
		startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		startFrame.setSize(400, 400);
		JTextArea pName = new JTextArea();
		JComboBox<String> dropdown = new JComboBox<String>();
		this.createPanel();
		startFrame.add(this.panel);
 	    startFrame.setVisible(true);
		 	 
	}
	public void createPanel(){
		JLabel name = new JLabel("Player Name");
		
		//add difficulty label
 	    JLabel diff = new JLabel("Select one of the possible choices and click Submit");
		
 	    //add difficulty dropdown
 	    dropdown.addItem("Level 1");
 	    dropdown.addItem("Level 2");
 	    dropdown.addItem("Level 3");
 	    dropdown.addItem("Level 4");
 	    dropdown.addItem("Level 5");
		//button to submit name and diff
		JButton submit = new JButton("Submit");
		
		submit.addActionListener(new submitButtonListener());
		
		panel = new JPanel();

		panel.add(name);
		panel.add(pName);
		panel.add(diff);
		panel.add(dropdown);
		panel.add(submit);

	}
	  class submitButtonListener implements ActionListener{ 
			public void actionPerformed(ActionEvent ae) {
				//String playerName = pName.getText();
				//String level = (String)dropdown.getSelectedItem();
				
				String playerName = pName.getText();//return blank
				System.out.println(playerName);
				String level = (String) dropdown.getSelectedItem();//return null
				System.out.println(level);
				
				//set player name 
				new Player(playerName);
				//close this window after throwing level and playername
		}
	}
}
