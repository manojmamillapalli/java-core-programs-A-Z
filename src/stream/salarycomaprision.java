package stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Employee
{
	Employee(String name, long salary)
	{
		super();
		this.salary=salary;
		this.name=name;
	}
	private String name;
	private long salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString()
	{
		return name+" "+salary;
	}
	
	// s function which will accept another function as input is known as higher order function
}
public class salarycomaprision {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee("manoj", 60000));
		list.add(new Employee("naidu", 70000));
		list.add(new Employee("manoj naidu mamillapalli", 100000));
		list.add(new Employee("susmitha", 80000));
		list.add(new Employee("sri harsha", 90000));
		list.add(new Employee("prasad", 10000));
		list.add(new Employee("mamatha", 20000));
		Stream<Employee>s=list.stream();
		List<Employee> e=s.filter(emp->emp.getSalary()>50000).sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		for(Employee i: e)
		{
			System.out.println(i);
		}
	}

}
