package basiccoreprogrammes;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (n>=1000)
		{
			if (n%400==0) 
			{
				System.out.println(n+" is a leap year");
			} else 
			{
				System.out.println(n+" is not a leap year");

			}
		} 
		else 
		{
			System.out.println("Invalid input");
		}
		sc.close();
	}

}
