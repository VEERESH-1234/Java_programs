import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		isPrime(n);

	}
	public static void isPrime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			count=0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
				
			}
			if(count==1)
			{
				System.out.println(i+" ");
			}
			
		}
	}

}
