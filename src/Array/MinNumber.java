package Array;

public class MinNumber {

	public static void main(String[] args)
	{
		int[] x= {2,3,4,5,5,6,7,8};
		int min=x[0];
		for(int i=0;i<=x.length-1;i++)
		{
			if(x[i]<min)
			{
				min=x[i];
			}
		}
		System.out.println(min );

	}

}
