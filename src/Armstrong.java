import java.util.Scanner;

public class Armstrong {
	
		public static boolean armStrong(int x) {
			int sum=0;
		int temp=x;
		do {
			int r=x%10;
			sum=sum*r*r*r;
			x=x/10;
		}
		while(x!=0);
		return sum==temp;
		}
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value");
			int n=sc.nextInt();
			boolean rs=armStrong(n);
					
			if (rs==true)
				System.out.println("is Armstrong");
			else
				System.out.println("is not Armstrong");
			
		
	}

}
