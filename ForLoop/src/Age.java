import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=scan.nextInt();
		AgeApp A=new AgeApp();
		A.Display(age);
		

	}

}
