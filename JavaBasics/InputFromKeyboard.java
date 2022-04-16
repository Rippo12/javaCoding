import java.util.Scanner;
public class InputFromKeyboard {
	public static void main(String[] args)
	{
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.println("What's your name?");
			String strName= keyboard.nextLine();
			System.out.println("How old are you?");
			int iAge = keyboard.nextInt();
			System.out.println("How tall are you (m)?");
			double dHeight = keyboard.nextDouble();
			
			//similer to other data types
			//nextByte(), nextShort(), nextLong()
			//nextFloat(), nextBoolean()
			
			System.out.println("Mrs/Mr. " + strName + ", " + iAge + " years old. " 
					+ "Your height is " + dHeight + ".");
		}
		System.exit(0);
	}
}
