import org.jointheleague.graphical.robot.*;
public class RyanRobot {
public static void main(String[] args) {
	 org.jointheleague.graphical.robot.Robot a = new  org.jointheleague.graphical.robot.Robot();
	 a.penDown();
	 a.setSpeed(10);
	 a.hide();
	 for (int i = 0; i < 1000; i++) {
		 a.setRandomPenColor();
		 a.move(500);
		 a.turn(1);
			a.turn(360/3);
			a.setPenWidth(100);
			
			
	}
	 
}

public void move(int i) {
	// TODO Auto-generated method stub
	
}

public void turn(int i) {
	// TODO Auto-generated method stub
	
}
}
