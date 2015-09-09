import org.jointheleague.graphical.robot.*;
public class Robot {
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
}
