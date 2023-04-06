
public class MainStringRev {

	public static void main(String[] args) {

		String s = "Hello World";
		int len = s.length();
		int mid = len/2;
		
		String firstHalf = s.substring(0, mid);
		String secondHalf = s.substring(mid);
		
		StringBuilder revfirstHalf = new StringBuilder(firstHalf).reverse();
		StringBuilder revsecondHalf = new StringBuilder(secondHalf).reverse();
		//System.out.println(reversedfirstHalf" +"reversedsecondHalf);
	System.out.println(revsecondHalf);
	System.out.println(revfirstHalf);
	
	
	}

}
