import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();

		int r,sum=0,temp;
		//int n=454;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;

		}
		if(temp==sum)
			System.out.println("is palindrome");
		else
			System.out.println("is not palindrome");
	}

}
