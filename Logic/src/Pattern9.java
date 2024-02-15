import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the row");
		int n=scan.nextInt();
		System.out.println("Enter the character");
		char ch=scan.next().charAt(0);
		//to print rows
		for(int i=n;i>=1;i--)
		{
			//to print no of spaces in every row
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			//to print i no of stars in every row
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
			}
			//to send the cursor to next line
			System.out.println();
		}

	}

}
