
public class PowerCalc {
	public void Display(int base,int exponent)
	{
		int res=1;
		for(int i=1;i<=exponent;i++)
		{
			res=res*base;
		}
		System.out.println(res);
	}

}
