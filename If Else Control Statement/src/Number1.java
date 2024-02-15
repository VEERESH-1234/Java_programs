import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=scan.nextInt();
		if(a>0)
		{
			System.out.println("Entered number is Positive "+a);
		}
		else
		{
			System.out.println("Entered number is Negative "+a);
		}

	}

}
