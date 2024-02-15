
public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=2;j++)
			{
				for(int k=1;k<=10;k++)
					
				{
					if(i%2!=0 && k%2==0)
					{
						System.out.println("Sudent "+k+"of class "+j+"of school"+i+"have completed the assignment");
					}
					else if(i%2==0 && k%2!=0)
					{
						System.out.println("Sudent "+k+"of class "+j+"of school"+i+"have completed the assignment");
					}
					else
					{
						System.out.println("Sudent "+k+"of class "+j+"of school"+i+"is still doing the assignment");
					}
				}
			}
		}
		System.out.println("All assignments are checked");

	}

}
