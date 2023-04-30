
package _99_extra;

import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		String x = JOptionPane.showInputDialog("Do you like bananas? ");
		if (x.equals("No") || x.equals("no") || x.equals("n")) {
			JOptionPane.showMessageDialog(null, "YOU ARE CRAZY!!!");
		}
		else if (x.equals("Yes") || x.equals("yes") || x.equals("y")) {
			String str = JOptionPane.showInputDialog("What is your favorite hobby?");
			JOptionPane.showMessageDialog(null, str + " is much better");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "You are bananas!?");
		}
		//1. ask the user if they like bananas
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than "yes?" or "no?"
		//	show a pop up that says "You are bananas!?"
	
	}

}
