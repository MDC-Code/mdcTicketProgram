package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Dimension;

import javax.swing.JComboBox;

public class DraperyPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;

	/**
	 * Create the panel.
	 */
	public DraperyPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(620, 401));
		
		JLabel lblDraperyPanel = new JLabel("Drapery Panel");
		lblDraperyPanel.setBounds(191, 5, 68, 14);
		add(lblDraperyPanel);
		
		JLabel lblFabric = new JLabel("Fabric");
		lblFabric.setBounds(23, 37, 29, 14);
		add(lblFabric);
		
		textField = new JTextField();
		textField.setBounds(62, 34, 287, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(23, 62, 46, 14);
		add(lblColor);
		
		textField_1 = new JTextField();
		textField_1.setBounds(62, 59, 140, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblStyle = new JLabel("Style");
		lblStyle.setBounds(212, 62, 29, 14);
		add(lblStyle);
		
		textField_2 = new JTextField();
		textField_2.setBounds(241, 59, 108, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblMatWidth = new JLabel("Mat Width");
		lblMatWidth.setBounds(355, 37, 61, 14);
		add(lblMatWidth);
		
		textField_3 = new JTextField();
		textField_3.setBounds(413, 34, 86, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(509, 34, 53, 20);
		add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 124, 565, 168);
		add(panel);
		
		JLabel lblWidth = new JLabel("Width");
		lblWidth.setBounds(10, 321, 29, 14);
		add(lblWidth);
		
		JLabel lblLength = new JLabel("Length");
		lblLength.setBounds(49, 321, 33, 14);
		add(lblLength);
		
		JLabel lblVar = new JLabel("Var");
		lblVar.setBounds(92, 321, 21, 14);
		add(lblVar);
		
		JLabel lblFull = new JLabel("Full");
		lblFull.setBounds(116, 321, 21, 14);
		add(lblFull);
		
		JLabel lblDraw = new JLabel("Draw");
		lblDraw.setBounds(137, 321, 29, 14);
		add(lblDraw);
		
		JLabel lblOl = new JLabel("O.L.");
		lblOl.setBounds(176, 321, 29, 14);
		add(lblOl);
		
		JLabel lblRepeat = new JLabel("Repeat");
		lblRepeat.setBounds(213, 321, 46, 14);
		add(lblRepeat);
		
		JLabel lblLeftReturn = new JLabel("Left Return");
		lblLeftReturn.setBounds(253, 321, 68, 14);
		add(lblLeftReturn);
		
		JLabel lblRightReturn = new JLabel("Right Return");
		lblRightReturn.setBounds(315, 321, 61, 14);
		add(lblRightReturn);
		
		JLabel lblMount = new JLabel("Mount");
		lblMount.setBounds(386, 321, 46, 14);
		add(lblMount);
		
		JLabel lblPin = new JLabel("Pin");
		lblPin.setBounds(427, 321, 21, 14);
		add(lblPin);
		
		JLabel lblUnitWidths = new JLabel("Unit Widths");
		lblUnitWidths.setBounds(449, 321, 68, 14);
		add(lblUnitWidths);
		
		JLabel lblUnitYards = new JLabel("Unit Yards");
		lblUnitYards.setBounds(509, 321, 53, 14);
		add(lblUnitYards);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 342, 33, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(49, 342, 33, 20);
		add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(92, 342, 21, 20);
		add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(116, 342, 33, 20);
		add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(159, 342, 29, 20);
		add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(203, 342, 33, 20);
		add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(253, 342, 46, 20);
		add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(315, 342, 46, 20);
		add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(383, 342, 33, 20);
		add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(413, 342, 29, 20);
		add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(449, 342, 46, 20);
		add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(509, 342, 46, 20);
		add(textField_15);
		textField_15.setColumns(10);

	}
}
