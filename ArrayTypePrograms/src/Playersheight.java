import java.util.Scanner;

public class Playersheight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of teams");
		int row=scan.nextInt();
		System.out.println("Enter the number of players");
		int col=scan.nextInt();
		//creating an 2D array
		double [][]arr=new double[row][col];
		//storing the height of the players in array
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the height of the team "+(i+1)+" player "+(j+1));
				arr[i][j]=scan.nextDouble();
			}
		}
		//Displaying the players height in array
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("The height of the team "+(i+1)+(" player ")+(j+1)+(" is ")+arr[i][j]);
			}

		}

	}

}
