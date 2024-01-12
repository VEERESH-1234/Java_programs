import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=scan.nextInt();
		Display(age);
		

	}
	public static void Display(int age)
	{
		if(age>21)
		{
			System.out.println("Adult");
		}
	}

}
