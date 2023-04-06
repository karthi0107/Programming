import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
	ListIterator<Integer> ob=al.listIterator();
	while(ob.hasNext())
	{
	int e=ob.next();
	if(e==300)
	{
	ob.set(777);
	}
	}
	for(Integer i:al){
		System.out.println(i);
}
	}

}
