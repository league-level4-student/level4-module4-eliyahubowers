package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    
    private int width;
    private int height;
    
    Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    
    public void update(){
   	 
    }
    
    int getX() {
    	return this.x;
    }
    int getY() {
    	return this.y;
    }
    int getWidth(){
    	return this.width;
    }
    int getHeight(){
    	return this.height;
    }
    
    void setX(int i) {
    	this.x = i;
    }
    void setY(int i) {
    	this.y = i;    	
    }
    void setWidth(int i){
    	this.width = i;
    }
    void setHeight(int i){
    	this.height = i;
    }
    
    public abstract void draw(Graphics g);
}
