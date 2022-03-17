

/**class name:-fibonacci 
 * objective :- To print the fibonacci series upto n or upto a given range
 * 
 */
/**
 * @author Aaliya Sheikh
 * date-17/03/2022
 */

package com.aaliya.numbers.program; 
//package name should be within 6-8 char
import java.util.Scanner;
/*method name:- fibonacci
 * objective:- taking input from main class and to return the fibonacci series
 * input parameter:- n(series upto n number)
 * */
public class Fibonacci

{
	static int n1=0,n2=1,n3=0; 
	void isfibonacci(int n)
	{ 
		if(n==1) 
		{
			System.out.println(0);
			return;
		}
		System.out.print(n1+" "+n2);
			for (int i = 2; i < n; i++)
			{
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
				System.out.println(" "+n3+" ");
			}
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		Fibonacci Fs=new Fibonacci();
		Fs.isfibonacci(n);

	}

}