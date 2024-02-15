import java.util.Scanner;

public class Number8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		double a=scan.nextInt();
		System.out.println("Enter secomd number");
		double b=scan.nextInt();
		System.out.println("Enter a character");
		char c=scan.next().charAt(0);
		calci(a,b,c);

	}
	public static void calci(double a,double b,char c)
	{
		if(c=='+')
		{
			System.out.println(a+b);
		}
		else if(c=='-')
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
		else if(c=='*')
		{
			System.out.println(a*b);
		}
		else if(c=='/')
		{
			if(b==0)
			{
				System.out.println("Denominator cannot be zero");
			}
			else
			{
				System.out.println(a/b);
			}
		}
		else
		{
			System.out.println("Enter only these operations +,-,*,/");
		}
	}

}
