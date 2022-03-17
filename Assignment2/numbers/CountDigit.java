/**class name:- CountDigit
 * objective :To count the digit in a given number 
 * 
 */
/**
 * @author Aaliya Sheikh
 *  date:- 17/03/2022/**
 * 
 */
package com.aaliya.numbers.program;
import java.util.Scanner;
/*
 * methodname-Countdigit
 * objective:-Taking input from main class 
 * input parameter:-taking a num (number) as input
 * */
public class CountDigit 
{
	int count(int num)
	{
		int count=0;
	     if(num==0)
	        return 1;
	            
	    while(num!=0) 
	    {
	      num=num/10;
	      count++;
	    }
	 return count;
	            
	 }
 public static void main(String[] args) 
    {
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter a number:");
	 	int n=sc.nextInt();
	 	CountDigit countDigit=new CountDigit();
	 	//cd.count(n);
	 	System.out.println("Number of digit is :"+countDigit.count(n));
	        }
	        
}
