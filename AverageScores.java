/**
 * @author Arash
 * 
 * Write a program that reads in exam scores and displays the average score. 
 * (Extra credit +2 display the highest score)
 * You should first ask the user how many exams there are.  
 * Your program must work for any number of exams.

 * How many exams? 5
 * Enter a score: 74
 * Enter a score: 91
 * Enter a score: 87
 * Enter a score: 93
 * Enter a score: 89
 * The average score is 86.8. (and the high score is 93. Extra credit)
 */

import java.util.Scanner;

public class AverageScores 
{
	/**
	 * ==Pseudocode ish==
	 * System.out.print("How many exams?"); 
	 * User enters int N [this is NEVER a double]
	 * loop N
	 * System.out.print("Enter a score: ");
	 * scanner input double
	 * scanner input ++ = combined scores
	 * 
	 * *extra credit* IF scanner input >= 0 OR highest score 
	 * 	scanner input = highest score
	 * 
	 * combined scores divided by N
	 * 
	 * System.out.printf("The average score is %f. (and high score is %f.)", combined scores, highest score );
	 */

	public static void main(String[] args) 
	{
		//variables
		int n;
		double tempScore=0.0, combinedScore=0.0, highestScore=0.0;
		
		//create scanner object
		Scanner keyboard = new Scanner(System.in);
		
		//input
		System.out.print("How many exams? "); 
		n = keyboard.nextInt();
		
		//loop for each exam score
		for(int tempValue = 0; tempValue < n; tempValue++)
		{
			System.out.print("Enter a score: ");
			tempScore = keyboard.nextDouble();
			
				//check score validity
				while (tempScore<0 || tempScore>100)
				{
					System.out.print("Enter a score between 0 and 100: ");
					tempScore = keyboard.nextDouble();
				}
				
			// adds all scores into one variable
			combinedScore += tempScore;
					
			//captures the highest score
			if (tempScore > highestScore)
			{
				highestScore = tempScore;
			}
		}
		
		//calculations
		combinedScore /=n;
		
		//output
		System.out.printf("The average score is %.2f. (and the high score is %.2f.Extra credit)", combinedScore, highestScore);
		
		//close scanner object
		keyboard.close();
	}

}
