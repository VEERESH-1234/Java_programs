import java.util.Scanner;

public class SumofDiagonalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row=scan.nextInt();
		System.out.println("Enter the number of columns");
		int col=scan.nextInt();
		int [][]matrix=new int[row][col];
		System.out.println("Enter the elements of the matrix");
		for(int i=0;i<=matrix.length-1;i++)
		{
			for(int j=0;j<=matrix[i].length-1;j++)
			{
				matrix[i][j]=scan.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<=matrix.length-1;i++)
		{
			for(int j=0;j<=matrix[i].length-1;j++)
			{
				if(i+1==j-1)
				{
					sum=sum+matrix[i][j];
					
				}
			}
		}
		
		
		System.out.println(sum);
		

	}

}
