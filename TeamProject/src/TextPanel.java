import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.Scrollable;

public class TextPanel extends JPanel implements Scrollable{
	private JTextArea textArea;
	private JScrollPane scrollPane;
	
	@SuppressWarnings("static-access")
	public TextPanel() {
		textArea = new JTextArea();
		
		setLayout(new BorderLayout());
		
		add(new JScrollPane(textArea) , BorderLayout.CENTER);
	}

	public void appendText(String text) {
		// TODO Auto-generated method stub
		textArea.append(text);
	}

	public void clearText() {
		// TODO Auto-generated method stub
		textArea.setText(null);
	}

}
