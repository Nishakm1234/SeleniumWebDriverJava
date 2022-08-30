import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;
//To count the number of names starting with letter "A"
public class NamesStartingWithA {
public static void main(String args[]) {
	regular();
	stringFilter();
}
	public static void regular() {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Arun");
		names.add("Binu");
		names.add("Aradhya");
		names.add("Avinash");
		names.add("Raju");
		int count=0;
		for(int i=0;i<names.size();i++) {
			String actual=names.get(i);
			if(actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);

	}
	//Using Java Streams
	public static void stringFilter() {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Arun");
		names.add("Binu");
		names.add("Aradhya");
		names.add("Avinash");
		names.add("Raju");
		//There is no life for intermediate opp if there is no terminal op
		//Terminal operation will execute only if intermediate operation(filter) returns true
		long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		//We can create Streams without creating collections in single line
		Long d=Stream.of("Arun","Binu","Aradhya","Avinash","Raju").filter(s->s.startsWith("A")).count();
		System.out.println(d);
		
		//We can create Streams without creating collections with multiple lines
		Long f=Stream.of("Arun","Binu","Aradhya","Avinash","Raju").filter(s->{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(f);
		
		//To print the names in a ArrayList with length >4
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		//To print name in first index 
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
	}

}
