import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the base");
		int base=scan.nextInt();
		System.out.println("Enter the exponent");
		int exponent=scan.nextInt();
		PowerCalc P=new PowerCalc();
		P.Display(base,exponent);

	}

}
