package Array;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the array elements");
	int a=scan.nextInt();
	int[] x=new int[a];
	for(int i=0;i<a;i++)
	{
		x[i]=scan.nextInt();
		
	}
	for(int i=0;i<a;i++)
	{
	System.out.println(x[i]);
	}
	

	}

}
