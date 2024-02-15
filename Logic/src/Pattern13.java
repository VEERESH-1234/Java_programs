import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the row");
		int n=scan.nextInt();
		System.out.println("Enter the character");
		char ch=scan.next().charAt(0);
		//to print rows
		for(int i=1;i<=n;i++)
		{
			//to print no of spaces in every row
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(" ");
			}
			//to print i no of stars in every row
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(ch);
			}
			//to send the cursor to next line
			System.out.println();
		}
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=11-2*i;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}

		
	}

}
