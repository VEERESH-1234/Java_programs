import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=scan.nextInt();
		System.out.println("Enter the second number");
		int b=scan.nextInt();
		System.out.println("Enter the third number");
		int c=scan.nextInt();
		Numbers N=new Numbers();
		N.Display(a,b,c);

	}

}
