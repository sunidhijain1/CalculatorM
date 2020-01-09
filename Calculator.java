import java.util.*;

class Calculator{

public static void main(String args[]){
	
	  try {	
	Scanner s = new Scanner(System.in);

	while(true){

	System.out.println("Enter the operation you want to perform");
	System.out.println("1-Addition");
	System.out.println("2-Substraction");
	System.out.println("3-Multiplication");
	System.out.println("4-Divison");
	System.out.println("5-Exit");
	int choice=s.nextInt();
	
	if(choice==5)
        { 
		System.out.println("Exiting the program...");
		System.exit(0);
	}
       else {
			System.out.println("Enter first number: ");
			int num1=s.nextInt();
			System.out.println("Enter second number: ");
			int num2=s.nextInt();

	int result;
	switch(choice)
	{
		case 1:
			result=num1+num2;
			System.out.println("Addition is: "+result);
			break;

		case 2:
			result=num1-num2;
			System.out.println("Subtraction is: "+result);
			break;
			
		case 3: 
			result=num1*num2;
			System.out.println("Multiplication is: "+result);
			break; 

		case 4: try{
			result=num1/num2;
			System.out.println("Division is: "+result);
			  }
			catch (ArithmeticException e)
			{ 
			  System.out.println("divide by zero exception"); 
			}
			break;	

		default:
			System.out.println("Invalid choice");
		}
	     } 	
	  }
	}	catch (Exception e)
		{
			System.out.println("Wrong input");
		}

			
 }
}