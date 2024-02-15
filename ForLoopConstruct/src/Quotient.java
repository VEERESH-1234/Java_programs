import java.util.Scanner;

public class Quotient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		double a=scan.nextInt();
		while(a>1)
		{
			System.out.println(a);
			a=a/2;
		}
		

	}

}
