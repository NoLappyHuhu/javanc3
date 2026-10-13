import java.util.*;

public class Task4{
	public static void main(String[] args){
		Scanner user = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		System.out.print("Enter word: ");
		//Get the input then remove space and case sensitive
		sb.append(user.nextLine().toLowerCase().replaceAll("\\s",""));

		/*
		Task:		
		Use StringBuilder to create a new string that
		is a reverse of the input string.(sb.reverse())

		Use the equals() method to check if the input
		string and the reversed string are the same.
		*/
		if(sb.toString().equals(sb.reverse().toString()))
			System.out.println("The input string is a palindrome.");
		else
			System.out.println("The input string is not a palindrome.");
	}
}
