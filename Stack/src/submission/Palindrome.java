package submission;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;


public class Palindrome {

	String input = "test";



	public static boolean isPalindrome(String s) {
		//Queue<Character> q = new LinkedList<Character>( );
		ArrayStack<Character> t = new ArrayStack<Character>( );
		Character letter;   // One character from the input string
		int mismatches = 0; // Number of spots that mismatched
		int i;              // Index for the input string

		for (i = 0; i < s.length( ); i++)
		{
			letter = s.charAt(i);
			if (Character.isLetter(letter))
			{
				//q.add(letter);
				t.push(letter);
			}
		}

		while (!t.isEmpty( ))
		{
//			if (q.remove( ) != t.pop( ))
//				mismatches++;

		}
		return false;
	}

	public static void main(String[] args) {
		Palindrome.isPalindrome("test");
	}

}

/*import java.util.Stack;

public class PalindromeTest {

    public static void main(String[] args) {

        String input = "test";
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reverseInput = "";

        while (!stack.isEmpty()) {
            reverseInput += stack.pop();
        }

        if (input.equals(reverseInput))
            System.out.println("Yo! that is a palindrome.");
        else
            System.out.println("No! that isn't a palindrome.");

    }
 */

/*
import java.util.Stack;
import java.util.Scanner;
class PalindromeTest {

    public static void main(String[] args) {

    	System.out.print("Enter any string:");
        Scanner in=new Scanner(System.in);
        String inputString = in.nextLine();
        Stack stack = new Stack();

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        String reverseString = "";

        while (!stack.isEmpty()) {
            reverseString = reverseString+stack.pop();
        }

        if (inputString.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");

    }
}
 */