package gui;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
	
	private JButton saveButton;
	private JButton refreshButton;
	
	private ToolbarListener textListener;
	
	public Toolbar() {
		setBorder(BorderFactory.createEtchedBorder());
		saveButton = new JButton("Save");
		refreshButton = new JButton("Refresh");
		
		//button functionality
		saveButton.addActionListener(this);
		refreshButton.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(saveButton);
		add(refreshButton);
	} //end toolbar
	
	//link to StringListener abstract class
	public void setToolbarListener(ToolbarListener listener) {
		this.textListener = listener;
	}//end set String Listener

	
	//button handling
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton) e.getSource();
		
		if(clicked == saveButton) {
			if(textListener != null) {
				textListener.saveEventOccured();
			}
			//textPanel.appendText("Hello\n");
		} else if (clicked == refreshButton) {
			if(textListener != null) {
				textListener.refreshEventOccured();
			}
		}
	}//end action performed
	
}
