
public class CountStringVowels {

	public static void main(String[] args) {
		String s="karthi123 @";
		int c=0,sp=0,d=0,v=0,sd=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')
				v++;
			else if(ch>='0' && ch<='9')
				d++;
			else if(ch>='a' && ch<='z')
				c++;
			else if(ch==' ')
				sp++;
			else
				sd++;
			}
	System.out.println(v);
	System.out.println(d);
	System.out.println(c);
	System.out.println(sp);
	System.out.println(sd);
	}

}
