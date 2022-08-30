import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		//HashSet, TreeSet, LinkedHashSet implements Set interface
		//Does not accept duplicate values.
		//There is no guarantee that the elements stored are in a sequential order.....stored in random order
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("UK");
		hs.add("USA");
		hs.add("INDIA");
		hs.add("NEPAL");
		hs.add("CHINA");
		System.out.println(hs);
		//System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		//Iterator
		Iterator<String>i=hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
