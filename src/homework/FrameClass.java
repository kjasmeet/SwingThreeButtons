package homework;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameClass {

	static Drawable icon = new Drawable(100, 100);
	static JLabel jLabel;
	
	/**
	 * Main class creates three buttons and sets label 
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		JButton red = new JButton("Red");
		JButton green = new JButton("Green");
		JButton blue = new JButton("Blue");
		
		frame.setLayout(new FlowLayout());
		
		red.addActionListener(createActionListener(Color.RED));
		
		green.addActionListener(createActionListener(Color.GREEN));
		
		blue.addActionListener(createActionListener(Color.BLUE));
		
		frame.add(red);
		frame.add(green);
		frame.add(blue);
		
		jLabel = new JLabel(icon);
		frame.add(jLabel);
		
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	/**
	 * When the button is clicked, the color is changed to that button
	 * 
	 * @param color
	 * @return ActionListener
	 */
	public static ActionListener createActionListener(Color color){
		return new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				icon.setColor(color);
				jLabel.repaint();
			}
			
		};
	}
	

}
