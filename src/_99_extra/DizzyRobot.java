
package _99_extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		dance(1);
		String s = JOptionPane.showInputDialog("How dizzy you want the robot to be from 1-10");
		dance(Integer.parseInt(s));
		// 1. Use the dance method below to make the robot spin.		
		// 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
	

	}

	/*****************   Use this method, DON'T CHANGE THE CODE BELOW  **************/
	
	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.setSpeed(20);
			robot.turn(360);
		}
	}
}

