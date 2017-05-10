package domain;

import java.awt.Graphics;

public class Punt extends Vorm{
	private int x;
	private int y;

	public Punt(int x, int y) {
		super();
		setX(x);
		setY(y);
	}

	public int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}

	@Override
	public boolean equals(Object object) {
		Punt punt = (Punt) object;
		if (punt == null) {
			return false;
		} else if (punt.getX() == this.getX() && punt.getY() == this.getY()) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "(" + this.getX() + ", " + this.getY() + ")";
	}

	@Override
	public void teken(Graphics graphics) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Omhullende getOmhullende() {
		// TODO Auto-generated method stub
		return null;
	}

}
