package primenumber;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
    	Scanner scanner = new Scanner(System.in);
	        
	    System.out.print("Enter the lower bound of the range: ");
	    int lowerBound = scanner.nextInt();
	        
	    System.out.print("Enter the upper bound of the range: ");
	    int upperBound = scanner.nextInt();
	        
	    System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + " are:");
	        
	    for (int i = lowerBound; i <= upperBound; i++) 
	    {
	    	if (isPrime(i)) 
	    	{
	    		System.out.print(i + " ");
	        }
	    }
	    }
    
    private static boolean isPrime(int num) 
    {
    	if (num <= 1) 
    	{
    		return false;
	    }
    	
    	for (int i = 2; i <= Math.sqrt(num); i++) 
    	{
    		if (num % i == 0) 
    		{
    			return false;
	        }
	    }
    	return true;
	}
}