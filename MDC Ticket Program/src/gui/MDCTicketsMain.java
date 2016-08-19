package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class MDCTicketsMain {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MDCTicketsMain window = new MDCTicketsMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MDCTicketsMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new MDCTicketMainFrame();
		frame.setBounds(100, 100, 959, 641);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
