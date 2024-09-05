package stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class streamDemo {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(30);
		l.add(49);
		l.add(90);
		l.add(20);
		l.add(35);
		l.add(12);
		Stream<Integer> s=l.stream();// convert list into stream.
		List<Integer> list=s.filter(i-> i%5==0).sorted().collect(Collectors.toList());
		System.out.println(list);
		//filter method is used to add the condition
		//sorted method is used to sort the stream before collected
		//collect method is the method in collectosr used to collect the stream and convert it into the list or our
		// required type
		

	}

}
