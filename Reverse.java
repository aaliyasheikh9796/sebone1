

/**class name:-Reverse
 * objective :To find reverse of a given string.
 * 
 */
/**
 * @author Aaliya Sheikh
 *  date:- 17/03/2022
 */
package com.aaliya.string;
import java.util.Scanner; 
/*
 * Method name-Reverse
 * Objective:-Taking input from main class 
 * Input parameter:-taking a string as input
 * Return type:- string
 * */
public class Reverse
{
	public String reverse(String str)
    {
		if(str.isEmpty())
		{
			System.out.println("empty ");
			return str;
		}
		else 
		{
			String rev="";
			for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
   return str;
}
	
  public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the String: ");
     String str = sc.nextLine();
     Reverse R = new Reverse();
     System.out.println("reversed ");
	 R.reverse(str);
   }
}
