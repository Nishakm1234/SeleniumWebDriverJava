import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class StreamMap {

	public static void main(String[] args) {
		streamMap();

	}
	public static void streamMap() {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Man");
		names.add("Nan");
		names.add("Van");
		names.add("Ban");
		names.add("Pan");
		
		//Print names which has last letter as 'u' with Uppercase
		Stream.of("Arun","Binu","Aradhya","Avinash","Raju").filter(s->s.endsWith("u")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Print names which has first letter as 'a' with uppercase and sort it
		List<String> names1=Arrays.asList("Arun","Binu","Aradhya","Avinash","Raju");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//To merge 2 different lists and sort it in order
		Stream<String> newStream=Stream.concat(names.stream(), names1.stream());
		//newStream.forEach(s->System.out.println(s));
		//newStream.sorted().forEach(s->System.out.println(s));
		
		//To find if "Binu" is present in list
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Binu"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
}
