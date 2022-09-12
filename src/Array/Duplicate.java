package Array;

public class Duplicate {

	public static void main(String[] args)
	{
		int[] x= {2,3,3,4,4,5,6,7,7,};
		for(int i=0;i<=x.length-1;i++)
		{
			for(int j=i+1;j<=x.length-1;j++)
			{
				if(x[i]==x[j])
				{
					System.out.println(x[j]);
				}
			}
		}
	

	}

}
