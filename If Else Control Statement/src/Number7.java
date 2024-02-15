import java.util.Scanner;

public class Number7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a character");
		char a=scan.next().charAt(0);
		Upper(a);

	}
	public static void Upper(char a)
	{
		if(a>='A' && a<='Z')
		{
			System.out.println("Upper case");
		}
		else if(a>='a' && a<='z')
		{
			System.out.println("Lower case");
		}
		else
		{
			System.out.println("It is number");
		}
	}

}
