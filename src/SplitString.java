
public class SplitString {

	public static void main(String[] args) {
		String s="karthi123 @gmail.com";
		String sp="",sd="",digit="",alpa="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z');
			alpa=alpa+ch;
			
			
			//else if(ch>='0'&& ch<='9')
			//	digit=digit+ch;
				
		}
		System.out.println(alpa);
	
	}

}
