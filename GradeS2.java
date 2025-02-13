package com.noiret.blanc;
import java.util.Scanner;

public class GradeS2 {
	public static void main(String[] args) {
		System.out.println(" HELLO THERE ");
		System.out.println("................................");
		System.out.println("SCHOOL FEES : 100 CEDIS");
		System.out.println("ASSESSEMENT SCORE REQUIRED : 15 OR MORE");
		System.out.println("EXAMS SCORE REQUIRED : 25 OR MORE ");
		System.out.println(".................................");
		
		double escore,ascore,Sfees; // Instantiation 
		
		Scanner feed = new Scanner(System.in);
		System.out.println("What did you Score in your Exams ? ");
		escore = feed.nextDouble();
		System.out.println("What did you score in your assessment ?");
		ascore =feed.nextDouble();
		System.out.println("How much of your fees have you paid ?");
		Sfees = feed.nextDouble();
		
		// This part of the code checks a student who have met the first requirement and also paid his fees in full
		
		if (escore < 0 || ascore < 0) {  
		    // Handling negative values  
		    System.out.println("THE SCORES YOU ENTERED ARE INVALID. SCORES CANNOT BE NEGATIVE. TRY AGAIN!");  

		} else if (escore >= 25 && ascore >= 15) {  
		    // Passed both components  
		    if (Sfees == 100) {  
		        System.out.println("CONGRATULATIONS! You passed. Since you have paid your fees in full, you have been issued  a certificate.");  
		    } else {  
		        System.out.println("CONGRATULATIONS! You passed. Please make full payment of your fees to get your certificate.");  
		    }  

		} else if ((escore == 25 && ascore == 14) || (escore == 24 && ascore == 15)) {  
		    // Condoned students  
		    if (Sfees == 100) {  
		        System.out.println("CONGRATULATIONS! You are condoned. Since you have paid your fees in full, you have been issued a certificate.");  
		    } else {  
		        System.out.println("CONGRATULATIONS! You are condoned. Please make full payment of your fees to get your certificate.");  
		    }  

		} else {  
		    // Failed Cases  
		    if (escore < 25 && ascore >= 15) {  
		        System.out.println("You have FAILED! You failed in your Exams but passed your Assessment.");  
		    } else if (escore >= 25 && ascore < 15) {  
		        System.out.println("You have FAILED! You passed your Exams but failed your Assessment.");  
		    } else if (escore < 25 && ascore < 15) {  
		        System.out.println("You have been REPEATED! You failed both your Exams and Assessment.");  
		    }  
		}
              feed.close();
		}
		
		
	}
