package Array;

public class MaxNumber {

	public static void main(String[] args)
	{
		int[] x= {2,3,4,5,6,7,8};
		int max=x[0];
		for(int i=0;i<=x.length-1;i++)
		{
			if(x[i]>max)
			{
			  max=x[i];
			}
		}
		System.out.println(max);

	}

}
