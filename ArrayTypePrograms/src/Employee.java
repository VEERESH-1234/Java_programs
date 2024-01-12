import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of employers");
		int size=scan.nextInt();
		String[]arr=new String[size];
		System.out.println("Enter the employee name");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextLine();
		}
		for(int i=1;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
