package homework;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.Icon;

public class Drawable implements Icon{
	
	private int height = 100; 
	private int width = 100;
	private Color fillColor = Color.RED;
	
	public Drawable(int height, int width){
		this.height = height;
		this.width = width;
	}
	@Override
	public int getIconHeight() {
		return height;
	}

	@Override
	public int getIconWidth() {
		return width;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double circle = new Ellipse2D.Double(x, y, getIconHeight(), getIconWidth());
		g2.setColor(getColor());
		g2.fill(circle);
	}
	
	public void setColor(Color color){
		this.fillColor = color;
	}
	
	public Color getColor(){
		return fillColor;
	}
	
	

}
