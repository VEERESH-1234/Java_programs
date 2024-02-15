
public class Pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=25;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(count>9)
				{
					System.out.print(count+" ");
					count--;
				}
				else
				{
					System.out.print("0"+count+" ");
					count--;
				}
			}
			System.out.println();
		}

	}

}
