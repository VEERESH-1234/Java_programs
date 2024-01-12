import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an array object
		int[]arr=new int[5];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age");
		//storing the age in array
		for(int i=0;i<=4;i++)
		{
			arr[i]=scan.nextInt();
		}
		//displaying the age
		for(int i=0;i<=4;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
