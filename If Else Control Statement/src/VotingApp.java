import java.util.Scanner;
public class VotingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the age");
		int age=scan.nextInt();
		if(age>=18)
		{
			System.out.println("You are eligible to vote");
		}
		else
		{
			System.out.println("You are not eligible to vote");
		}

	}

}
