import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=scan.nextInt();
		System.out.println("Enter the character");
		char ch=scan.next().charAt(0);
		//for loop
		/*for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}*/
		//while loop
		/*int i=row;
		while(i>=1)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(ch);
				j++;
			}
			System.out.println();
			i--;
		}*/
		//do while loop
		int i=row;
		do
		{
			int j=1;
			do
			{
				System.out.print(ch);
				j++;
			}
			while(j<=i);
			System.out.println();
			i--;
		}
		while(i>=1);

	}

}
