package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score=0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
					String question1 = JOptionPane.showInputDialog("How many championships do the Los Angeles Lakers have? ");
				// 3.  Use an if statement to check if their answer is correct
					if(question1.equals("17")) {
						score+=1;
						JOptionPane.showMessageDialog(null, "Score: "+score);
					}
					else {
						score-=1;
						JOptionPane.showMessageDialog(null, "Score: "+score);
					}
					String question2 = JOptionPane.showInputDialog("What is the most legendary rivalry in basketball?: ");
					if(question2.equals("Los Angeles Lakers vs Boston Celtics")) {
						score+=1;
						JOptionPane.showMessageDialog(null, "Score: "+score);
								
					}
					else {
						score-=1;
						JOptionPane.showMessageDialog(null, "Score: "+score);
					}
					String question3 = JOptionPane.showInputDialog("Who leads the Lakers in points? ");
					if(question3.equals("Kobe Bryant")) {
						score+=1;
						JOptionPane.showMessageDialog(null, "Score: "+score);
					}
					else {
						score-=1;
						JOptionPane.showMessageDialog(null, "Score: "+score);
					}
					String question4 = JOptionPane.showInputDialog("What was the Lakers dynasty in the 1980s called? ");
					if(question4.equals("Showtime Lakers")) {
						score+=1;
						JOptionPane.showMessageDialog(null, "Score: "+score);
					}
					else {
						score-=1;
						JOptionPane.showMessageDialog(null, "Score: "+score);
					}
					// 4.  if the user's answer was correct, add one to their score 
					
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
