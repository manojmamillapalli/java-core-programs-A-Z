package stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class stringOperations {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		//when we want to collect the huge amount of operations of collection type
		//of elements we use stream api
		list.add("manoj");
		list.add("siri");
		list.add("sagar");
		list.add("krishna");
		list.add("radha");
		list.add("sisupal");
		list.add("ravan");
		Stream<String> s=list.stream();// stream is an interface 
		//stream is a method which is used to convert a collection type of object to a stream type of object.
		//if we perform one operation on the stream it will implicitly close .
		//after we cant perform the second operation on the stream.
		//but at the time we can perform multiple operations on the stream like List<String> li=s.filter(i->i.startsWith("s")).sorted().collect(Collectors.toList());
		//but suppose 
		//step1: System.out.println(s.count()); returns the length of the streams
		//step2:List<String> li=s.filter(i->i.startsWith("s")).sorted().collect(Collectors.toList()); will throw an exception
		// so we need to create an another stream to perform second operation. But at the same time we can perform many operations
		//filter is used to filter the elements according to the condition 
		//collect method is used to collect the filtered objects
		//we need to define to which type we need to collect the filtered values by passing the Collectors.toType which we want
		List<String> li=s.filter(i->i.startsWith("s")).sorted().collect(Collectors.toList());
        System.out.println(li);
	}

}
