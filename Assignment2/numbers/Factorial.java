
/**class name:-factorial
* objective :- To print the  factorial of a given no
*  
*/
/**
* @author Aaliya Sheikh
* date-17/03/2022
*/
package com.aaliya.numbers.program;
import java.util.Scanner;
/*
 * methodname-Factorial
 * objective:-Taking input from main class 
 * input parameter:-taking a num (number) as input
 * */

public class Factorial
{
       int Isfactorial(int num) 
       {
            if(num>=0)
            {
           	 int fact=1;
           	 for(int i=num;i>=1;i--)
           		 fact=fact*i;
           	 System.out.println("fact are "+fact);
            }
            else 
            {
                System.out.println("Number are not define");         
            }
            return num;
        }
     public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Given number is :");
       int num=sc.nextInt();
       Factorial Fn=new Factorial();
       Fn.Isfactorial(num);
     }
}