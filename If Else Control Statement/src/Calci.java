import java.util.Scanner;

public class Calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a object of Scanner class
		Scanner scan=new Scanner(System.in);
		// Asking user to enter a first number
		System.out.println("Enter the first number");
		//Reading a number and stored in variable a
		double a=scan.nextDouble();
		//Asking user to enter the second number
		System.out.println("Enter the secomd number");
		//Reading a number and stored in varible b
		double b=scan.nextDouble();
		//Asking user to enter the character 
		System.out.println("Enter a character");
		//Reading a character and stored in variable c
		char c=scan.next().charAt(0);
		//check whether the character is +
		if (c=='+')
		{
			System.out.println(a+b);
		}
		//check whether the character is -
		else if (c=='-')
		{
			if(a>b)
			{
				System.out.println(a-b);
			}
			else
			{
				System.out.println(b-a);
			}
			
		}
		//check whether the character is *
		else if (c=='*')
		{
			System.out.println(a*b);
		}
		//check whether the character is /
		else if (c=='/')
		{
			if (b==0)
			{
				System.out.println("Denominator cannot be zero");
			}
			else
			{
				System.out.println(a/b);
			}
			                 
		}
		//otherwise print enter only these operations
		else
		{
			System.out.println("Enter only these operations of +,-,*,/");
		}
		
		

	}

}
