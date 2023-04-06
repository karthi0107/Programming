
public class ReverseSentences {

	public static void main(String[] args) {
String s="HELLO WORLD";

	char ch[]=s.toCharArray();
	String st="";
	for(int i=ch.length-1;i>=0;i--) {
		int f=i;
		while(i>=0 && ch[i]!=' ') {
			i--;
		}
		int j=i+1;
		while(j<=f) {
			st=st+ch[j];
			j++;			
		}
		if(i>=0)
			st=st+ch[i];
	}
	System.out.println(st); 

				                                           //Output is OLLEH DLROW====>hello world
	
				                                           /*String st[]=s.split(" ");
															String str="";
															for(int i=0;i<st.length;i++) {
															System.out.println(new StringBuffer(st[i]).reverse()+" ");																		}*/
	}
}
