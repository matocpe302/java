package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindInStreams {

	static List<Employee> employees = Arrays.asList(
			 new Employee("Tom Jones", 40),
			    new Employee("Harry Major", 25),
			    new Employee("Ethan Hardy", 65),
			    new Employee("Nancy Smith", 42));
	
	public static void main(String[] args){
		
			Optional<Employee> anyEmp = employees.stream()
										.filter(emp ->emp.getAge() > 40)
										.findAny();
			
			if(anyEmp.isPresent()){
					System.out.println(anyEmp.get().getName());
			}
	}
}
