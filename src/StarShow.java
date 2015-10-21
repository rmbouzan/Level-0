import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/* Before beginning recipe: 
* 1. ask students to find and explain the method in this recipe. 
* 2. ask students how they might use the method to make the picture in the laminated hand-outs. */

public class StarShow {
	
	Robot a = new Robot("june");
	
	void makeStars() {
		
String bleh = JOptionPane.showInputDialog("Set the starsize (keep trying numbers far apart)");	
int starsize = Integer.parseInt(bleh);
String color = JOptionPane.showInputDialog("Set the color (red, yellow, blue, green, or random");
if(color.equals("red")){
a.setPenColor(Color.RED);
}
if(color.equals("yellow")){
a.setPenColor(Color.YELLOW);
}
if(color.equals("blue")){
a.setPenColor(Color.BLUE);	
}
		
a.setSpeed(8);
		
int xpos = 10;
		
int ypos = 950;
		
for (int i = 0; i < 30; i++) {
	

			
a.setPenWidth(i);	
			
a.setX(xpos);			
a.setY(ypos);			
	drawStar(starsize);
			
xpos=xpos+starsize;	
			
ypos=ypos-starsize;	
		
starsize=starsize+20;	
			
a.turn(12);
		
}
	}

	private void drawStar(int starSize) {
		
a.penDown();
		
for (int i = 0; i < 5; i++) {
	

			
	a.move(starSize);
			
			a.turn(144);
	}
	}
	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}





