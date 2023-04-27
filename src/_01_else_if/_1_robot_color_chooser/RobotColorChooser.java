
package _01_else_if._1_robot_color_chooser;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		Robot rob = new Robot();
		while (true) {
			rob.setPenWidth(10);
			String str= JOptionPane.showInputDialog("What color should the robot be? (Red, Blue, Green, Yellow, Black, Pink)");
			if (str.equals("Red")) {
				rob.setPenColor(Color.red);
			}
			else if (str.equals("Blue")) {
				rob.setPenColor(Color.blue);
			}
			else if (str.equals("Green")) {
				rob.setPenColor(Color.green);
			}
			else if (str.equals("Yellow")){
				rob.setPenColor(Color.yellow);
			}
			else if (str.equals("Black")){
				rob.setPenColor(Color.black);
			}
			else if (str.equals("Pink")){
				rob.setPenColor(Color.pink);
			}
			else {
				rob.setPenColor(new Color(100,242,150));
			}
			rob.penDown();
			rob.setSpeed(100);
			rob.move(100);
			rob.turn(90);
			rob.move(100);
			rob.turn(90);
			rob.move(100);
			rob.turn(90);
			rob.move(100);
		}
	}
}
