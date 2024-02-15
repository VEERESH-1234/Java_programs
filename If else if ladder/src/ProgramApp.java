import java.util.Scanner;

public class ProgramApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=scan.nextInt();
		System.out.println("Enter second number");
		int b=scan.nextInt();
		System.out.println("Enter the operation");
		char c=scan.next().charAt(0);
		Program.Calci(a,b,c);

	}

}
