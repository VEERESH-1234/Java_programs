import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		System.out.println("Enter a charcter");
		char ch=scan.next().charAt(0);
		/*for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=11-2*i;k++)
			{
				if(i>=2 && i<n)
				{
					if(k>=2 && k<11-2*i)
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
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=11-2*i;j++)
			{
				if(i==1||i==5||i==2 && j==1||i==2 &&j==7||i==3 && j==1||i==3 && j==5||i==4 && j==1||i==4 && j==3)
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
