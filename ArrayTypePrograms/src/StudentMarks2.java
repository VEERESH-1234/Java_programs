import java.util.Scanner;

public class StudentMarks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of schools");
		int block=scan.nextInt();
		//Creating a 3D jagged array
		int [][][]arr=new int[block][][];
		//craeting rows in 3D jagged array
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the number of classes in school "+(i+1));
			int row=scan.nextInt();
			arr[i]=new int[row][];
		}
		//creating columns in 3D jagged array
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the number of students in school "+(i+1)+" class "+(j+1));
				int col=scan.nextInt();
				arr[i][j]=new int[col];
			}
			
		}
		//blocks
		for(int i=0;i<=arr.length-1;i++)
		{
			//row
			for(int j=0;j<=arr[i].length-1;j++)
			{
				//col
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("Enter the marks for the school "+(i+1)+" class "+(j+1)+" student "+(k+1));
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		//displaying the marks of the students
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("The marks for the school "+(i+1)+" class "+(j+1)+" student "+(k+1)+" is "+arr[i][j][k]);
				}
			}
		}

	}

}
