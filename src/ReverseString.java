
public class ReverseString {

	public static void main(String[] args) {

		String s="karthivino";
				String st="";
		for(int i=s.length()-1;i>=0;i--) {
			st=st+s.charAt(i);
		}
		System.out.println(s);
		System.out.println(st);
		
	}

}
