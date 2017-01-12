package javengers;

/**
 * @authors epapanikolaou
 */

import javax.swing.*;



public class MySEOFrame {

	public JButton bl;
	public MySEOFrame() {
		frame();
	}
	
	
	public void frame() {
		JFrame f = new JFrame("SEO Frame");
		f.setVisible(true);
		f.setSize(400,400);
		f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);

		
		JPanel p = new JPanel();

		bl = new JButton("Search");

		HashtoArray.getInputTerm();

		JLabel l = new JLabel("Enter your search terms:");
		
		JTextField t = new JTextField("                                     ");

		
		
		
		


		p.add(l);
		
		p.add(t);

		p.add(bl);

		f.add(p);

	}
	public JButton getJButton() {
		return bl;
	}


}