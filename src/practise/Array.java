package practise;

public class Array {
	public static void main(String [] arg){
		int a1[]={1,2,3};
		int a2[]={4,5,6};
		int []result=new int[a1.length];
		for(int i=0;i<a1.length;i++){
		result[i]=a1[i]+a2[i];
		}
		Array.toString(a1);
		//System.out.println("Array1" + Array.toString(a1));
		//System.out.println("Array2" + Array.toString(a2));
		System.out.println("Result" + Array.toString(result));
		
}
}
