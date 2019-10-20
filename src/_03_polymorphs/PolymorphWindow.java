package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    //polymorphs
    
    ArrayList<Polymorph> polymorphs;
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
     //init polymorphs--
   	 
   	 Polymorph p;
   	 
   	 Random r = new Random();
   	 
   	 polymorphs = new ArrayList<Polymorph>();
   	 
   	 for(int i = 0; i < 5; i++) {
   		 polymorphs.add(p = new BluePolymorph(r.nextInt(WIDTH-50), r.nextInt(HEIGHT-50)));
   		 polymorphs.add(p = new RedPolymorph(r.nextInt(WIDTH-50), r.nextInt(HEIGHT-50)));
   		 polymorphs.add(p = new MovingMorph(r.nextInt(WIDTH-50), r.nextInt(HEIGHT-50)));
   	 }
   	 
   	 //--
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, WIDTH, HEIGHT);  	
   	 //draw polymorphs--
   	 
   	 for(Polymorph p : polymorphs) {
   		 p.draw(g);
   	 }
   	 
   	 //--
   	 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
     //update polymorphs--
  
   	 for(Polymorph p : polymorphs) {
  		 p.update();
  	 }
   	 
   	 //--
   	 
    }
}
