package com.noiret.blanc;
import java.util.Scanner;

// This is a program making use of the switch statement . 
public class Vi {
	
public static void main (String args[]) {
	
int side;	// Declaring side as an integer
Scanner feed =new Scanner(System.in);

System.out.println("How many sides does your plane shape have ? ");// Prompt asking the user for input
side = feed.nextInt();// Taking input

switch  (side) // The switch statement 
{
	case 3 : 
		System.out.print("Triangle");
         break;
       
	case 4 : 
		System.out.println("Quadrilateral");
		break;
		
	case 5 : 
		System.out.println("Pentagon");
		break;
		
	case 6 : 
		System.out.println("Hexagon");
		break;
		
	case 7 : 
		System.out.println("Septagon");
		break;
		
	case 8 : 
		System.out.println("Octagon");
		break;
		
	case 9 : 
		System.out.println("Nonagon");
		break;
		
	case 10 : 
		System.out.println("Decagon");
		break;
		
	case 11 : 
		System.out.println("Undecagon");
		break;
		
	case 12 : 
		System.out.println("Dodecagon");
		break;
		
	case 13 : 
		System.out.println("Tridecagon");
		break;
		
	case 14 : 
		System.out.println("Tetradecagon");
		break;
		
	case 15 : 
		System.out.println("Pentadecagon");
		break;
		
	case 16 : 
		System.out.println("Hexadecagon");
		break;
		
	case 17 : 
		System.out.println("Heptadecagon");
		break;
		
	case 18 : 
		System.out.println("Octadecagon");
		break;
		
	case 19 : 
		System.out.println("Enneadecagon");
		break;
		
	case 20 : 
		System.out.println("Icosagon");
		break;
		
      default : 
    	   System.out.println("I guess I ain't got what you looking for ! ");

};




	feed.close();
	
   }
}
