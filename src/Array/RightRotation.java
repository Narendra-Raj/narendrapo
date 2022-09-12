package Array;
import java.util.Scanner;
public class RightRotation {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rotation");
		int a=scan.nextInt();
		int[] x= {2,3,4,5,6,7};
		for(int k=1;k<=a;k++)
		{
		int last=x[x.length-1];
		for(int i=x.length-1;i>0;i--)
			
		{
			x[i]=x[i-1];
		}
		 x[0]=last;
		}

		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]);
		}
		
	}

}
