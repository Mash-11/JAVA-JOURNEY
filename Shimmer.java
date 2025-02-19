package com.noiret.blanc;
import javax.swing.JOptionPane;

// This program is uses the Dialog box functionality make sure you import the JOptionPane Class
// I hope the Arcane lovers dig this one

public class Shimmer{	
public static void main(String args[]) {
	
	
	String name ;
  name = JOptionPane.showInputDialog("What is your Name ?");
JOptionPane.showMessageDialog(null,"Hello " + name);
	
  
	String Location;
   Location = JOptionPane.showInputDialog("Are you from Piltover or Zaun");
   JOptionPane.showMessageDialog(null,"If you are from "+ Location + " ,then what do you know about the Arcane ?");
	
	
   String Arcane;
   Arcane = JOptionPane.showInputDialog("I am listening .............");
   JOptionPane.showMessageDialog(null,"That's show mind bending truth about the Arcane . I will keep intouch Bye .");
	
         
	
	
      }
}
