/**
Mohammed Raza
CS 241 
Fall 2013
Programming Assignment 1
November 7, 2013
*/

import java.util.Scanner;

public class TowerofHanoi
{
   public static void main(String[] args) 
	{
	   Scanner keyboard = new Scanner(System.in);
		
		int n;
		
		System.out.println("Towers of Hanoi\nInput number of disks(max 6): ");
      n = keyboard.nextInt();

      Towers('A', 'B', 'C', n);
   }
	
   	public static void Towers(char A, char B, char C, int n) 
		{
      	if (n == 1)
			{
        		 System.out.println("Move disk " + n + " from " + A + " to " + B);
    	   }
			else 
			{
         	Towers(A, C, B, n-1);
				
         	System.out.println("Move disk " + n + " from " + A + " to " + B);
			
        	   Towers(C, B, A, n-1);
         }
 	   }
}