import java.util.Scanner;

public class Numberofbacklog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of semesters");
		int sem=scan.nextInt();
		//creating an array object
		int [] arr=new int[sem];
		//enter the number of backlog in array
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("do you have any backlogs in semester "+(i+1));
			boolean res=scan.nextBoolean();
			if(res==true)
			{
				
				System.out.println("Enter the number of backlogs in semester "+(i+1)+" is ");
				arr[i]=scan.nextInt();
			}
			else
			{
				arr[i]=0;
				
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Backlog in semester "+(i+1)+" is "+arr[i]);
		}

	}

}
