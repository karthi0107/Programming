package practise;

public class StringConsonant {

	public static void main(String[] args) {
		String s="karthikeyan m";
		int l=s.length();
		for(int i=0;i<l;i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch==' ') {

			}
			else {
				System.out.print(ch);
			}
		}
	}
}
