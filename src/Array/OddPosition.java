package Array;

public class OddPosition {

	public static void main(String[] args) 
	{
		
       int[] x= {1,2,4,6,8,9,10};
       for(int i=1;i<=x.length-1;i=i+2)
       {
    	   System.out.println(x[i]);
       }
	}

}
