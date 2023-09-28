package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
	public static void main(String[] args) {
		
	
	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
		int random = ran.nextInt(4);
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
		System.out.println(random);
		// 3. Print your variable to the console
		String awesome = JOptionPane.showInputDialog("Enter something Awesome: ");
		// 4. Get the user to enter something that they think is awesome
		if(random==0) {
			JOptionPane.showMessageDialog(null, "That's Cool ");
		}
		// 5. If your variable is  0
			
	
		// 6. If your variable is  1
	
		if(random==1) {
			JOptionPane.showMessageDialog(null, "Okay");
		}
	
		// 7. If your variable is  2
	
			if(random==2) {
				JOptionPane.showMessageDialog(null, "Boring");
			}
	
		// 8. If your variable is  3
			if(random==3) {
				JOptionPane.showMessageDialog(null, "Tell me something else");
			}
 			// -- invent your own message to give to the user (be nice).
	}
}
