import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {

	public static void main(String[] args) {
		streamCollect();

	}

	public static void streamCollect() {
		List<String> ls=Stream.of("Arun","Binu","Aradhya","Avinash","Raju").filter(s->s.endsWith("u")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		List<Integer> values=Arrays.asList(3,2,2,7,5,1,9,7);
		//Print unique number from this array
		values.stream().distinct().forEach(s->System.out.println(s));
		
		//sort the array and get 3rd index -> 1,2,3,5,7,9
		List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	}

}
