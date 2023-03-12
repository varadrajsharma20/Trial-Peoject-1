package packOne;

import java.util.Scanner;

public class StarOne 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Value : ");
		n = input.nextInt();
		
		for (int j = 1 ; j <= n ; j++)
		{
			for (int i = 1 ; i <= j ; i++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
}
