package Array;

public class Program1 {

	public static void main(String[] args)
	{
		int[] x= {2,3,4,5,6};
		int[] x1=new int[x.length];
          for(int i=0;i<x.length;i++)
          {
        	  x1[i]=x[i];
        	 // System.out.print(x1[i]);//
          }
          System.out.println();
          for(int i=0;i<x.length;i++)
          {
        	  x1[i]=x[i];
        	  System.out.print(x1[i]);
          }
          System.out.println();
          for(int i=0;i<x.length;i++)
          {
      
        	  System.out.print(x1[i]);
          }
	}

}
