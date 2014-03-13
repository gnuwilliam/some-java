package com.gnuwilliam.parsexml;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.gnuwilliam.parsexml.handler.ParseXMLHandler;


public class Main {

	public static void main(String[] args) {
		
		ParseXMLHandler document = new ParseXMLHandler();
		ArrayList<String> news = document.parseXML("http://feeds.bbci.co.uk/news/rss.xml?edition=int");
		
		JFrame frame = new JFrame("BBC News - WorldWide");
		frame.setLayout(new FlowLayout());
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel(new GridLayout(0, 1));
		
		JLabel title = new JLabel("BBC NEWS", SwingConstants.CENTER);
		title.setFont(new Font("Courier New", Font.BOLD, 20));
		panel.add(title);

		for (int i = 0; i < news.size(); i++) {
			JLabel item = new JLabel(news.get(i), SwingConstants.LEFT);
			panel.add(item);
		}
		
		frame.getContentPane().add(panel);
		
		frame.setVisible(true);
	}

}
