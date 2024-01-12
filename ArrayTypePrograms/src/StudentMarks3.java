import java.util.Scanner;

public class StudentMarks3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number of school");
		int block=scan.nextInt();
		System.out.println("Enter a number of classes");
		int row=scan.nextInt();
		System.out.println("Enter a number of students");
		int col=scan.nextInt();
		int [][][]arr=new int[block][row][col];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("Enter the marks for the school "+(i+1)+" class "+(j+1)+" student "+(k+1));
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
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
