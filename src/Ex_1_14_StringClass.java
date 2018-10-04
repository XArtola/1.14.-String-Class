/**
 * 
 */

/**
 * @author Xabier
 *
 */import java.util.Scanner;
public class Ex_1_14_StringClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter a sentence to measure its lenght");
		String sentence = scan.nextLine();
		
		/* length()
		 * we use this command to know how many characters are in a string
		 */
		System.out.println("You entered "+sentence.length()+" characters");
		
		/*subString()
		 * It takes the characters stored from the first to the last number in the command of the string
		 * WARNING: the index starts from 0!!
		 * In this case the first 4 characters of the "sentence" string
		 */
		System.out.println(sentence.substring(0, 4));
		
		/* trim()
		 * This command takes a string and erases white spaces from the beginnig and the end (if there is any)
		 */
		String sentence2 = sentence.trim();
		System.out.println(sentence2);
		
		/* charAt()
		 * this command returns the character of a string positioned in the () index space
		 *to store this character you need a CHAR type variable!!!!
		 */
		
		System.out.println("What position of the string do you want to take?");
		int position = scan.nextInt();
		char selectedPos = sentence2.charAt(position);
		System.out.println(selectedPos);
		
		/* compareTo()
		 * Compares if two strings are the same. If they are it return 0 if not a negative number
		 */
		System.out.println("Type two sentences:\n");
		
		sentence = scan.next();
		scan.nextLine();
		sentence2 = scan.next();
		
		int equal = sentence.compareTo(sentence2);
		if (equal == 0) {
			
			System.out.println("The strings are equal");
			
		}
		
		else {
			
			System.out.println("The strings are not equal");
			
		}
		
		/* compareToIgnoreCase()
		 * This command does the same as compareTo but without taking care of upper lower 
		 * 
		 */
		
	System.out.println("Type two sentences:\n");
		
		sentence = scan.next();
		scan.nextLine();
		sentence2 = scan.next();
		
		 equal = sentence.compareToIgnoreCase(sentence2);
		if (equal == 0) {
			
			System.out.println("The strings are equal");
			
		}
		
		else {
			
			System.out.println("The strings are not equal");
			
		}
		
		/* indexOf()
		 * With this command we can know the place in the string of a character
		 */
		
		System.out.println("Type a sentence to store it on a string");
		System.out.println("Type a character to know its position in a string\n");
		
		sentence = scan.next();
		scan.nextLine();
		sentence2 = scan.next();
		
		int character = sentence.indexOf(sentence2);
		
		System.out.println(character);
		
		/* lastIndexOf()
		 * With this command we can know the place in the string of a character, in this case the command takes last time the character appears
		 */
		
		System.out.println("Type a sentence to store it on a string");
		System.out.println("Type a character to know its position in a string\n");
		
		sentence = scan.next();
		scan.nextLine();
		sentence2 = scan.next();
		
		 character = sentence.lastIndexOf(sentence2);
		
		System.out.println(character);
		
		
		/* valueOf()
		 * This command returns the primitive value of a string object
		 */
		
		System.out.println("Enter a number");
		int value = scan.nextInt();
		sentence = String.valueOf(value);
		
		System.out.println(sentence);
		
		/* nextBoolean()
		 * This command allow to scan boolean type tokens
		 */
		System.out.println("Enter a boolean");
		boolean bool = scan.nextBoolean();
		System.out.println(bool);
		
	}

}
