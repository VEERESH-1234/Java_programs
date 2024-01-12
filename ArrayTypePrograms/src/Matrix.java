import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row=scan.nextInt();
		System.out.println("Enter the number of columns");
		int col=scan.nextInt();
		//Creating a 2D array
		int [][]matrix=new int[row][col];
		//Storing the matrix values
		System.out.println("Enter the elements of the matrix");
		for(int i=0;i<=matrix.length-1;i++)
		{
			for(int j=0;j<=matrix[i].length-1;j++)
			{
				
				matrix[i][j]=scan.nextInt();
			}
			
		}
		//Displaying the matrix values
		System.out.println("The elements of the matrix are: ");
		for(int i=0;i<=matrix.length-1;i++)
		{
			for(int j=0;j<=matrix[i].length-1;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

	}

}
