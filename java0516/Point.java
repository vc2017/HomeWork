package java0516;

import java.awt.Color;

public class Point {
	private int x;
	private int y;
	private Color color;
	public static final int size = 40;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Point(int x, int y, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", color=" + color + "]";
	}
	
	
}
