package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class groupListGUI extends JFrame {

	private JFrame frame;
	private JPanel panel=null;
	private JButton btnCancel=null;

	public groupListGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setBounds(100, 100, 345, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setContentPane(getCreatePanel());
		
		JLabel lblYourInterestGroup = new JLabel("your interest group:");
		lblYourInterestGroup.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblYourInterestGroup.setBounds(81, 28, 186, 23);
		panel.add(lblYourInterestGroup);
	}
	private JPanel getCreatePanel(){
		
		
		if(panel==null)
		{
			panel=new JPanel();
			panel.setLayout(null);
			
			btnCancel = new JButton("cancel");
			btnCancel.setBounds(237, 204, 89, 23);
			panel.add(btnCancel);
		}
		return panel;
	}
	public void addcancel(ActionListener l) {
		btnCancel.addActionListener(l);
	}
	public void close() {
		this.setVisible(false);
		dispose();
	}
}
