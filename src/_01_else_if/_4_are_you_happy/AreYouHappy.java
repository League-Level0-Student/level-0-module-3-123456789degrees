package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String str= JOptionPane.showInputDialog("Are you happy? ");
		if (str.equals("Yes") || str.equals("yes") || str.equals("y")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
		else {
			String s = JOptionPane.showInputDialog("Do you want to be happy? ");
			if (s.equals("Yes") || s.equals("yes") || s.equals("y")) {
				JOptionPane.showMessageDialog(null, "Change something. ");
			}
			else {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}
		}
	}
}
