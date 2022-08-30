import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		
		//Can accept duplicate values
		//Implements List interface-> ArrayList, LinkedList, Vector
		//Arrays have fixed size whereas ArrayList can grow dynamically
		//can access and insert any value in any index
		ArrayList<String> a=new ArrayList<String>();
		a.add("Nisha");
		a.add("Vicky");
		System.out.println(a);
		a.add(0, "Hello");
		System.out.println(a);
		//a.remove(0);
		//System.out.println(a);
		//a.remove("Vicky");
		//System.out.println(a);
		System.out.println(a.contains("Nisha"));
		System.out.println(a.get(2));
		System.out.println(a.indexOf("Nisha"));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		a.add("Vicky");
		System.out.println(a);
		
	}

}
