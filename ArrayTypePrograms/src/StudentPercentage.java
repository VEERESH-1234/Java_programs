import java.util.Scanner;

public class StudentPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of classes");
		int row=scan.nextInt();
		float[][]arr=new float[row][];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the number of students in class "+(i+1));
			int col=scan.nextInt();
			arr[i]=new float[col];
		}
	
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the percentage for class "+(i+1)+" student "+(j+1));
				arr[i][j]=scan.nextFloat();
			}
		
			
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("The percentage for class "+(i+1)+" student "+(j+1)+" is "+arr[i][j]);
			}
		}

	}

}
