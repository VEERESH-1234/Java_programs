import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a row numbers");
		int row=scan.nextInt();
		System.out.println("Enter the column number");
		int column=scan.nextInt();
		System.out.println("Enter the character");
		char ch=scan.next().charAt(0);
		//for loop
		/*for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=column;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}*/
		//while loop
		/*int i=1;
		while(i<=row)
		{
			int j=1;
			while(j<=column)
			{
				System.out.print(ch);
				j++;
			}
			System.out.println();
			i++;
		}*/
		//do while loop
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print(ch);
				j++;
			}
			while(j<=column);
			System.out.println();
			i++;
		
			
		}
		while(i<=row);
	}

}
