import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the row");
		int n=scan.nextInt();
		System.out.println("Enter the character");
		char ch=scan.next().charAt(0);
		//to print rows
		/*for(int i=1;i<=n;i++)
		{
			//to print no of spaces in every row
			for(int j=1;j<=n;j++)
			{
				System.out.print(" ");
			
			}
			for(int k=1;k<=n;k++)
			{
				
				if(i>=2 && i<n)
				{
					if(k>=2 && k<n)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print(ch);
					}
				}
				else
				{
					System.out.print(ch);
				}
			
			}
			System.out.println();
						
		}*/
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==5||j==1||j==5)
				{
					System.out.print(ch);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
