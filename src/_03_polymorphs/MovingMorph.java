package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph{
	
	private Random r;
	
	private int xMomentum;
	private int yMomentum;
	
	MovingMorph(int x, int y) {
		super(x, y, 50, 50);
		this.r = new Random();
		this.xMomentum = 0; 
		this.yMomentum = 0;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	@Override
	public void update(){
		xMomentum += r.nextInt(3) - 1;
		yMomentum += r.nextInt(3) - 1;
		if(xMomentum > 4) {
			xMomentum = 4;
		}else if(xMomentum < -4) {
			xMomentum = -4;
		}
		if(yMomentum > 4) {
			yMomentum = 4;
		}else if(yMomentum < -4) {
			xMomentum = -4;
		}
		setX(getX()+xMomentum);
		setY(getY()+yMomentum);
		if(getX() < 0) {
			setX(0);
		}else if(getX() > 850) {
			setX(850);
		}
		if(getY() < 0) {
			setY(0);
		}else if(getY() > 550) {
			setY(550);
		}
    }

}
