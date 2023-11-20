package multiplication;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
	        
	    System.out.print("Enter a number to print its multiplication table: ");
	    int number = scanner.nextInt();
	        
	    printMultiplicationTable(number);
	}
	private static void printMultiplicationTable(int n) 
	{
		System.out.println("Multiplication table for " + n + ":");
	    for (int i = 1; i <= 10; i++) 
	    {
	    	System.out.println(n + " x " + i + " = " + (n * i));
	    }
	}
}