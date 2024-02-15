import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=scan.nextInt();
		if(a>0)
		{
			System.out.println("Positive number");
		}
		else if(a<0)
		{
			System.out.println("Negative number");
		}
		else
		{
			System.out.println("Zero number");
		}

	}

}
