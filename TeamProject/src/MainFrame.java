import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{
	
	static TextPanel centerPanelView;
	private TopPanel topPanelView; 
	@SuppressWarnings({ "unused", "rawtypes" })
	private JList listToAddToDisplay;
	@SuppressWarnings("unused")
	private JTextArea nextGuess;
	private bottomPanel bottomPanelView;

	
	public MainFrame() {
		super("Numbers Game");
		//Window size
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		setLayout(new BorderLayout());
		//start game and next guess panel
		topPanelView = new TopPanel();
		
		
		//make scroll pane for display area
		centerPanelView = new TextPanel();
		
		//send new guess to display area
		topPanelView.setTextPanel(centerPanelView);
		
		bottomPanelView = new bottomPanel();
		
		
		//layout
		add(topPanelView, BorderLayout.NORTH);
		add(centerPanelView, BorderLayout.CENTER);
		add(bottomPanelView, BorderLayout.SOUTH);
		
		setVisible(true);
		
		//should i add listeners here?
		
		
		//set input for GUI
		
	}

}
