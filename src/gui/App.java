package gui;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		
		//begin window thread
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame();
			}	
		});
		//end Thread
		
	}

}

