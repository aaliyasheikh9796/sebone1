

/**class name:-prime
 * objective :To fine whether a given no is prime or  not.
 * 
 */
/**
 * @author Aaliya Sheikh
 *  date:- 17/03/2022
 */

package com.aaliya.numbers.program;
import java.util.Scanner;  
/*
 * methodname-Prime
 * objective:-Taking input from main class 
 * input parameter:-taking a num (number) as input
 * */
public class Prime
{
	boolean IsPrime(int n)
	{
		if(n<=1){
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		Prime p=new Prime();
		boolean prime= p.IsPrime(n);
		if(prime)
		{
			System.out.println(n+ " Prime number");
		}
		else
		{
			System.out.println(n+ " Not Prime");

		}
	}
}
