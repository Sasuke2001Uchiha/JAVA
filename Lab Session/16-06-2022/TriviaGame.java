// Java program to create a trivia game
package lab;

// Importing packages
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class TriviaGame 
{
//Creating Static Variables
public static int[] points = { 1, 4, 1, 1, 3 };
public static String[] answers = { "SIR ISSAC NEWTON", "28 FEBRUARY", "TIGER", "HOCKEY", "LOTUS" };

//creating static trivialMehtod which takes 2 String parameters
public static int triviaMethod(String[] questions, String[] stt) 
{
	Scanner sc = new Scanner(System.in);
	String str;
	int point = 0;
	for (int i = 0; i < 5; i++) 
	{
		System.out.println(questions[i]);
		System.out.println(stt[i]);
		if (stt[i].toUpperCase().equals(answers[i])) 
		{
			System.out.println("Correct!");
		point += points[i];
		System.out.println("");
	} 
	else 
	{
		System.out.println("Wrong answer");
		System.out.println("Correct Answer is : " + answers[i]+"\n");
		}
	}
	return point;
}
public static void main(String[] args) 
{
	int point;
	Scanner sc = new Scanner(System.in);
	String[] stt = new String[5];
	//adding questions
String[] questions = { 
		"Question 1: Who discovered gravity ?",
		"Question 2: when is national science day celebrated in India ?",
		"Question 3: Which is the National Animal of INDIA ?",
		"Question 4: Which is the National Sport of INDIA ?",
		"Question 5: Which is the National Flower of INDIA ?",
};
for (int i = 0; i < 5; i++) 
{
	System.out.println(questions[i]);
	System.out.print("Enter Your Ans: ");
	stt[i] = sc.nextLine();
	System.out.print("\n");
}
point = triviaMethod(questions, stt);
System.out.println("Final score: " + point);
	}
}