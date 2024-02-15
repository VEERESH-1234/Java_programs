
public class Numbers {
	public void Display(int a,int b,int c)
	{
		if(a==b && b==c && c==a)
		{
			System.out.println("All numbers are equal");
		}
		else if(a>b && a>c)
		{
			System.out.println(a);
		}
		else if(b>a && b>c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
	}

}
