package com.simplilearn.assignments;

import java.util.Scanner;

public class SimpleCalculator {
	
	
	
		public static void main(String[] args) {
		
			//declaring variable
			float num1,num2;
			double Result = 0;
			int operator;	
		
		
		//getting input 
		Scanner sc = new Scanner(System.in);
		System.out.println("For Simple arthematic operations\n");
		System.out.println("enter the first number : ");
		num1 = sc.nextFloat();
		System.out.println("enter the first number : ");
		num2= sc.nextFloat();	
		
		//doing operations
		while(true) {		
		System.out.println("Enter the operator\n"+"1. Addition\n"+"2. Subtraction\n"+"3. Multiplication\n"+"4. Division\n"+ "5. Exit ");
		operator = sc.nextInt();
		
	    if(operator==1) {
			Result= num1+num2;
			System.out.println("The Result is :"+Result+"\n\n");
		                }
        else if(operator==2) {
			Result= num1-num2;
			System.out.println("The Result is :"+Result+"\n\n");
		                     }
		else if(operator==3) {
			Result= num1*num2;
			System.out.println("The Result is :"+Result+"\n\n");
		                     }
		else if(operator==4) {
			Result= num1/num2;
			System.out.println("The Result is :"+Result);
			System.out.println("The Result in natural number form is  :"+(int)Result+"\n\n");
			
		                     }
		else if(operator==5)
		    {break;}
		else  
		    {System.out.println("Wrong Operator ,Try again"+"\n\n");}
		
		
		
		}
		
	}

}
