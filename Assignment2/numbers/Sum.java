

/**class name:-sum
 * objective :- To print the sum of 1- n numbers
 * 
 */
/**
 * @author Aaliya Sheikh
 * date-17/03/2022
 */
package com.aaliya.numbers.program;
import java.util.Scanner;  
/*
 * method name-Sum
 * objective:-Taking input from main class 
 * input parameter:-taking a num (number) as input
 * */
public class Sum 
{
	// static sum=0;
	int sumofnumber(int num,int sum)
	{
         if (num == 0)
              return sum;

      sum += num % 10;
      return sumofnumber (num / 10, sum);
   }

   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int num=sc.nextInt();
      Sum Sn = new Sum();
      int sum=0;
      System.out.println("Sum of number is "+ Sn.sumofnumber(num,sum));
   }

}