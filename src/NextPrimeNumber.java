// Next Prime Number - Have the program find prime numbers 
// until the user chooses to stop asking for the next one.

import java.util.Scanner;

public class NextPrimeNumber 
{

	public static void main(String[] args) 
	{
		int max = 1;
		
		System.out.println("Hit enter to generate primes.");
		
		// Test all ints between 1 and max
		for (int i = 1; i<=max; i++)
		{
			boolean isPrime = true;
			
			// Divide all ints by every lesser int, if anything divides evenly not prime
			for (int j = 2; j<i; j++)
			{
				if(i % j == 0)
				{
					isPrime = false;
					max++;
					break;
				}
			}
			
			if(isPrime)
			{
				System.out.println(i);
				
				Scanner scanner = new Scanner(System.in);
				String readString = scanner.nextLine();
				
				//Check if only enter key has been pressed
				if (readString.isEmpty()) 
				{
		            max++;
		        }
			}
		}
	}
}

