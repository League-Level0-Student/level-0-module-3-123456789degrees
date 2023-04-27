package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class ADVENTURE {
	public static void main(String[] args) {
		String str= JOptionPane.showInputDialog("You are walking down the street when suddenly two thieves try to pickpocket you. You notice them. Should you run or fight back?");
		if (str.equals("run")) {
			String s = JOptionPane.showInputDialog("You run, but they are quickly catching up. Should you keep on running or hide?");
			if (s.equals("keep on running")) {
				JOptionPane.showMessageDialog(null, "They are way quicker than you. You lose :(");
				System.exit(0);
			}
			else {
				JOptionPane.showMessageDialog(null, "You hide under a rock, and the thieves lost track of you. YOU WIN!!!!!!");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "They are way stronger than you. You lose :(");
		}
	}
}
