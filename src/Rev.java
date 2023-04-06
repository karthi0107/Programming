
public class Rev {

	public static void main(String[] args) {
		String s="karthikeyan";
		int l=s.length();
		int m=l/2;
		String frsthalf=s.substring(0,m);
		String secondhalf=s.substring(m);

		char[] shc=secondhalf.toCharArray();
		int n=shc.length;
		for(int i=0;i<n/2;i++){
		char temp=shc[i];
		shc[i]=shc[n-1-i];
		shc[n-1-i]=temp;
		}
		String reversesecondhalf=new String(shc);
		System.out.println(frsthalf+reversesecondhalf);
		}
	}


