package gui;

import java.awt.Dimension;
import java.awt.ScrollPane;

import javax.swing.JPanel;
import java.awt.Scrollbar;
import javax.swing.JScrollBar;
import javax.swing.JLabel;

public class MainMenuPanel extends JPanel{

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
