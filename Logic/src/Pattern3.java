import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		System.out.println("Enter the character");
		char a=scan.next().charAt(0);
		/*for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=n;j++)
			{
				System.out.print(a);
			}
			System.out.println(a);
		}*/
		//while loop
		/*int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=n)
			{
				System.out.print(a);
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
				System.out.print(a);
				j++;
			}
			while(j<=n);
			System.out.println();
			i++;
		}
		while(i<=n);
	}

}
