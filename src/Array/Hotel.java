package Array;
import java.util.Scanner;
public class Hotel {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("please select the hotel");
		int a=scan.nextInt();
		int price,n;
		switch(a)
		{
		case 1:System.out.println("name of the hotel is:Dolphin");
		System.out.println("location  of the hotel is:Mumbai");
		System.out.println("please select the type of room");
		int b=scan.nextInt();
		if(b<2)
		{
			System.out.println("you select the ac room");
			System.out.println("the view of the room is:mountains,hills");
			Scanner scan1=new Scanner(System.in);
			System.out.println("please enter th how many numbers");
			
		int a1=scan.nextInt();
		if(a1<=4)
		{
			System.out.println("the cost of the room is:3000");
			System.out.println("please enter the extra numbers");
			int a2=scan.nextInt();
			if(a2>=4)
			{
				n=a2%4;
				System.out.println("cost of the room="+(price=n*3000/4));
			}
		}
			}
		break;
		case 2:System.out.println("name of the hotel is:novotel");
		System.out.println("location of the hotel is:Vizag");
		System.out.println("please select the type of room");
		int c=scan.nextInt();
		if(c>2)
		{
			System.out.println("you select the nonac room");
			System.out.println("the view of the room is:oceans,");
			Scanner scan1=new Scanner(System.in);
			System.out.println("please enter th how many numbers");
			int num=scan1.nextInt();
			
				Scanner scan3=new Scanner(System.in);
				System.out.println("please enter how many numbers");
				int a2=scan.nextInt();
				if(a2<=4)
				{
					System.out.println("the cost of the room is:2500");
					System.out.println("please enter the extra numbers");
					int a3=scan.nextInt();
					if(a3>=4)
					{
						n=a3%4;
						System.out.println("cost of the room="+(price=n*2500/4));
					}
					}
				}
			}
		}
			
		}
		




