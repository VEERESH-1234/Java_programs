import java.util.Scanner;

public class Number4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character");
		char a=scan.next().charAt(0);
		if (a>='A' && a<='Z')
		{
			System.out.println("Upper case");
		}
		else if(a>='a' && a<='z')
		{
			System.out.println("Lower case");
		}
		else
		{
			System.out.println("it is number");
		}
		

	}

}
