import java.util.Scanner;

public class Number5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=scan.nextInt();
		Positive(a);

	}
	public static void Positive(int a)
	{
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
