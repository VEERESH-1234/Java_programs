import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=scan.nextInt();
		Voting(age);

	}
	public static void Voting(int age)
	{
		if(age>=18)
		{
			System.out.println("You are eligible to Voting");
		}
		else
		{
			System.out.println("You are not eligible to Voting");
		}
	}

}
