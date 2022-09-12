package Array;

public class ArraySum {

	public static void main(String[] args) 
	{
		int[] x= {2,3,4,5,6};
		int sum=0;
		for(int i=0;i<=x.length-1;i++)
		{
			sum=sum+x[i];
		}
		System.out.println(sum);

	}

}
