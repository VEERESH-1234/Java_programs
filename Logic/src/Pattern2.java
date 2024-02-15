import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		System.out.println("Enter the character");
		char a=scan.next().charAt(0);
		for(int i=1;i<=n;i++)
		{
			System.out.println(a);
		}
		

	}

}
