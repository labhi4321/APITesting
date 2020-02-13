import java.util.Scanner;

public class Highest_num{
	
	public static void main(String[] args) {
		
		int a,b,c;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the first num");
		a=in.nextInt();
		
		System.out.println("Enter the Second num");
		b=in.nextInt();
		
		System.out.println("Enter the third num");
		c=in.nextInt();
				
		if(a>b && a>c) {
		System.out.println("First is greater ");
		}
		else if(b>a && b>c)
		{
			System.out.println("Second is greater ");
		}
		else
			System.out.println("Third is greater");
		
		
		
	}
}