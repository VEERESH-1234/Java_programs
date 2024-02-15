
public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(count<=9)
				{
					System.out.print("0"+count+" ");
					count++;
					
				}
				else
				{
					System.out.print(count+" ");
					count++;
				}
				
				
			}
			System.out.println();
		}

	}

}
