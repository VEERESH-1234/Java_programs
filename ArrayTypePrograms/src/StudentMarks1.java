import java.util.Scanner;

public class StudentMarks1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of company");
		int row=scan.nextInt();
		System.out.println("Enter the number of employees");
		int col=scan.nextInt();
		
		//Creating an 2D array
		String [][]arr=new String[row][col];
		//Storing the data in array
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the name for company "+(i+1)+" employee "+(j+1));
				arr[i][j]=scan.next();
			}
		}
		//Displaying the data in array 
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("The name of company "+(i+1)+" employee "+(j+1)+" is "+arr[i][j]);
			}
		}

	}

}
