import java.util.Scanner;

public class Backlog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of semesters");
		int sem=scan.nextInt();
		//creating an array object
		boolean arr[]=new boolean[sem];
		//storing an backlog in array
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("do you have backlog in semester "+(i+1));
			
			arr[i]=scan.nextBoolean();
			
		}
		//displaying the backlogs is true or false
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("backlogs in semester "+(i+1)+" is: ");
			if(arr[i]==true)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}

	}

}
