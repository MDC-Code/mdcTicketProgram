package gui;

import javax.swing.JPanel;

public class MainMenuPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MainMenuPanel() {
		
		JPanel customerInfoPanel = new CustomerInfoPanel();
		add(customerInfoPanel);
		
		JPanel draperyPanel = new DraperyPanel();
		add(draperyPanel);
		
		JPanel cornicePanel = new CornicePanel();
		add(cornicePanel);

	}

}
