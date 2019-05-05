import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TopPanel extends JPanel{
	private JButton start;
	private JTextArea nextGuess;
	private JButton submitGuess;
	private TextPanel textPanel;
	private JButton nextGuessLabel;
	
	public TopPanel() {		
		start = new JButton("Start Game Button");
		start.addActionListener(new startButtonListener());
		nextGuessLabel = new JButton(" Guess: ");
		submitGuess = new JButton("Submit Guess");
		submitGuess.addActionListener(new nextGuessListener());
		nextGuess = new JTextArea("                          ");
		setLayout(new FlowLayout());
		
		add(start);//start button
		add(nextGuessLabel);//label
		add(nextGuess);//text area
		add(submitGuess);//submit guess button

	}//end of constructors
	public void setTextPanel(TextPanel textPanel) {//adds guesses to display area
		this.textPanel = textPanel;
		
	}
	class nextGuessListener implements ActionListener{ 
		public void actionPerformed(ActionEvent ae) {
		String text = nextGuess.getText();
		textPanel.appendText("Last Guess: " + text + "\n");//still need to add Guess
		
		//if no player name and diff selected popupwindow saying "Hit Start Game Button First"
	}
	}		
	class startButtonListener implements ActionListener{ 
		public void actionPerformed(ActionEvent ae) {
		JFrame startGame = new submitNameAndDifficultyFrame();
	}
	}		
}
