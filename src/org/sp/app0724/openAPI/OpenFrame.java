package org.sp.app0724.openAPI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class OpenFrame extends JFrame{
	JPanel p_north;
	JButton bt;
	JTextField t_url;
	JTable table;
	JScrollPane scroll;

	public OpenFrame() {
		p_north = new JPanel();
		bt = new JButton();
		t_url = new JTextField();
		table = new JTable();
		scroll = new JScrollPane(table);
		
		p_north.add(bt);
		p_north.add(t_url);
		
		add(p_north, BorderLayout.NORTH);
		add(scroll);
	}
	
	public static void main(String[] args) {
		new OpenFrame();
	}
}
