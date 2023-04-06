import java.util.Scanner;

public class PalindromeString {

		public static boolean isPalindrome(String st)
		{
			char ch[]=st.toCharArray();
			int i=0,j=ch.length-1;
			while(i<j) {
				if(ch[i]!=ch[j])
					return false;
				i++;
				j--;
			}
			return true;
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");
			String s=sc.nextLine();

			boolean rs=isPalindrome(s);
			if(rs==true)
				System.out.println(s + "is palindrome");
			else
				System.out.println(s + "is not palindrome");
}
}
