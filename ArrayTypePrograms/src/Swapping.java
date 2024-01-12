import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=scan.nextInt();
		System.out.println("Enter second number");
		int num2=scan.nextInt();
		System.out.println("Numbers before swapping");
		System.out.println(num1+" "+num2);
		int num3;
		num3=num1;
		num1=num2;
		num2=num3;
		System.out.println("Numbers after swapping");
		System.out.println(num1+" "+num2);

		
	}

}
