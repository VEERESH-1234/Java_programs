import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the row");
		int n=scan.nextInt();
		System.out.println("Enter the character");
		char ch=scan.next().charAt(0);
		//to print rows
		/*for(int i=1;i<=n;i++)//rows
		{
			//to print no of spaces in every row
			for(int j=1;j<=n-i+1;j++)//space
			{
				System.out.print(" ");//printing space
			
			}
			for(int k=1;k<=2*i-1;k++)//printing the stars
			{
				
				if(i>=2 && i<n)
				{
					if(k>=2 && k<2*i-1)
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
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(i==1||i==5||i==2 && j==3||i==3 && j==5||i==4 && j==7||i==2 &&j==1||i==3 && j==1||i==4 && j==1)
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
