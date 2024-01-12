import java.util.Scanner;

class Positive
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);//creating the object of scanner class
		System.out.println("Enter a number");//ask the user to enter the number
		int a=scan.nextInt();//read a number and stored in variable a
		PositiveApp n1=new PositiveApp();//creating the object of PositiveApp class
		n1.Posit(a);//calling a posit method
		
		
	}
	
}
