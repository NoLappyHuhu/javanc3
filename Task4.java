import java.util.*;

public class Task4{
	public static void main(String[] args){
		Scanner user = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		System.out.print("Enter word: ");
		sb.append(user.nextLine().toLowerCase().replaceAll("\\s",""));

		// String reverseWord = sb.reverse().toString();
		if(sb.toString().equals(sb.reverse().toString()))
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
	}
}
