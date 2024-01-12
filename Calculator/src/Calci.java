import java.util.Scanner;

public class Calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		double num1=scan.nextInt();
		System.out.println("Enter second number");
		double num2=scan.nextInt();
		System.out.println("Enter the operation");
		char operation=scan.next().charAt(0);
		CalciApp.operations(num1,num2,operation);

	}

}
