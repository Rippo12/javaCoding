import java.util.Scanner;
public class DrawTriangle {
	private static Scanner keyboard;

	public static void main(String[] args)
	{
		keyboard = new Scanner(System.in);
		System.out.println("N=?");
		int iMax = keyboard.nextInt();
		System.out.println("Result:");
		for(int fCounter = 0 ; fCounter < iMax ; fCounter ++)
		{
			for(int sCounter = 0; sCounter < iMax-fCounter-1 ; sCounter++)
			{
				System.out.print(" ");
			}
			for(int sCounter = 0; sCounter < 2*fCounter+1 ; sCounter++)
			{
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		System.exit(0);
	}
}
