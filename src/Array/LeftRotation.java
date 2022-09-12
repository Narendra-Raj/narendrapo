package Array;
import java.util.Scanner;
public class LeftRotation {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rotation");
		int a=scan.nextInt();
	    int[] x= {1,2,3,4,5,6};
	   
	    for(int j=1;j<=a;j++)
	    {
	    	int first=x[0];
	    
	    for(int i=0;i<x.length-1;i++)
	    {
	    	x[i]=x[i+1];
	    }
	    x[x.length-1]=first;
	    }
	    for(int i=0;i<=x.length-1;i++)
	    {
	    	System.out.print(x[i]);
	    	
	    }
	    
	}

}
