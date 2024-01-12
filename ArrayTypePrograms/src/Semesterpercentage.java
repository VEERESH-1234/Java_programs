import java.util.Scanner;

public class Semesterpercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of semesters");
		int sem=scan.nextInt();
		double arr[]=new double[sem];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the percentage in sem "+(i+1)+" is ");
			
			arr[i]=scan.nextDouble();
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("the percentage in semester "+i+" is "+arr[i]);
		}

	}

}
