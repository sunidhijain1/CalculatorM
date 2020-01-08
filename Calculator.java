import java.util.*;

class Calculator{

public static void main(String args[]){
	
	String st;
	do
	{
	  try {	
	Scanner s = new Scanner(System.in);

	System.out.println("Enter the operation you want to perform");
	System.out.println("1-Addition");
	System.out.println("2-Substraction");
	System.out.println("3-Multiplication");
	System.out.println("4-Divison");
	int choice=s.nextInt();

	int result;
	switch(choice)
	{
		case 1:
			System.out.println("Enter first number: ");
			int num1=s.nextInt();
			System.out.println("Enter second number: ");
			int num2=s.nextInt();
			result=num1+num2;
			System.out.println("Addition is: "+result);
			break;

		case 2:
			System.out.println("Enter first number: ");
			int num3=s.nextInt();
			System.out.println("Enter second number: ");
			int num4=s.nextInt();
			result=num3-num4;
			System.out.println("Subtraction is: "+result);
			break;
			
		case 3: 
			System.out.println("Enter first number: ");
			int num5=s.nextInt();
			System.out.println("Enter second number: ");
			int num6=s.nextInt();
			result=num5*num6;
			System.out.println("Multiplication is: "+result);
			break; 

		case 4: try{
			System.out.println("Enter first number: ");
			int num7=s.nextInt();
			System.out.println("Enter second number: ");
			int num8=s.nextInt();
			result=num7/num8;
			System.out.println("Division is: "+result);
			  }
			catch (ArithmeticException e)
			{ 
			  System.out.println("divide excepto"); 
			}
			break;	

		case 5:
			System.out.println("Exiting the program...");
			break;

		default:
			System.out.println("Invalid choice");
		}
		
	  }
		catch (Exception e)
		{
			System.out.println("Wrong input");
		}

		Scanner sb = new Scanner(System.in);
		System.out.println("Do you want to continue (Press y for Yes and n for No)");
		st=sb.next();
		
	}
		while(st.equals("y") || st.equals("Y"));	
 }
}