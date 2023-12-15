package mycom.exam.upgradeduck;

import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck {
    
	public RedDuck(){
    }
    
    public RedDuck(int mx, int my) {
    	super(mx, my);
    }

    @Override
    public void display(Graphics g) {
    	g.setColor(Color.RED);
    	g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
    }
}
