import java.util.Scanner;

public class HospitalPatients {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//Creating an array
		int [][]arr=new int [3][];
		arr[0]=new int[2];
		arr[1]=new int[4];
		arr[2]=new int[3];
		//storing the age of the patients
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the age for hospital "+(i+1)+" patient "+(j+1));
				arr[i][j]=scan.nextInt();
			}
		}
		//displaying the age of the patients
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("The age for hospital "+(i+1)+" patient "+(j+1)+" is "+arr[i][j]);
			}
		}

	}

}
