import java.util.Scanner;
/**
 * This simply asks the user for a sentence, and prints out the characters backwards.
 * exampleString --> gnirtSelpmaxe
 * @author Tom
 *
 */
public class ReverseSentenceApp {
	
	/**
	 * Starts the application, will continue asking for a sentence to reverse until the user inputs anything other than "y" or "Y"
	 * 
	 */

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		String choice = "y";
		String userSentence;
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter a line to be reversed ");
			userSentence = input.nextLine();
			System.out.println(reverseString(userSentence));
			System.out.println("\nWant to reverse another sentence? (y/n): ");
			choice=input.nextLine();
		}
		System.out.println("Good bye!");
		input.close();
	}

	/**
	 * This method adds the last character of a String and places it at the beginning of a new String Builder. 
	 * It does this until each character of the String is acknowledged. 
	 * @param forwardString - the String that will be reversed
	 * @return the forwardSting but reversed
	 */
	private static String reverseString(String forwardString) {
		StringBuilder reversedString=new StringBuilder();
		for(int x=forwardString.length()-1;x>=0;x--){
			reversedString.append(forwardString.charAt(x));
		}
		return reversedString.toString();		
	}

}
