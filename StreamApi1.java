package Java8Features;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
//Stream is used perform pipelined operation by taking the input from collections or arrays 
//Stream is not data structure it only process or express the data into streams
public class StreamApi1 {
	public static Integer cubes(int a){
		return a*a*a;
	}

	public static void main(String[] args) {
		// to store integer values in list
		List<Integer> my_num=Arrays.asList(12,24,26,27,67,23,78);
		//to store string values in list
		List<String> my_name=List.of("vish" , "muthu " ,"akash" , "ravi");
		//to store objects in a list
		List<Employee> my_emp=List.of(new Employee(10,"vish"),new Employee(20,"akash"));
		// Intermediate operations

		// 1. map method 
		// if we want to perform any operation on list, we can use this map method  
		List<Integer> cubes=my_num.stream()
				.map(StreamApi1::cubes)//using method reference operator or
				.collect(Collectors.toList());
		System.out.println(cubes);

		// or we can use lambda expression to perform cube operation like this
		/*
		List<Integer> cubes=my_num.stream()
		.map(i->return i*i*i;)
		.collect(Collectors.toList());
		System.out.println(cubes);
		 */

		// 2. filter method
		// if we want to filter any existing data we can use this filter method
		List<String> Select_candidate=my_name.stream()
				.filter(str->str.endsWith("sh"))
				.collect(Collectors.toList());
		System.out.println(Select_candidate);

		List<Employee> select_emp=my_emp.stream().filter(emp->emp.name.startsWith("a")).collect(Collectors.toList());
		// we can iterate using for each loop 
		for(Employee e:select_emp) {
			System.out.println(e.name);
		}
		// or by using regular for loop 
		for(int i=0;i<select_emp.size();i++) {
			System.out.println(select_emp.get(i).name);

		}
		// 3. reduce method
		// reduce method is an terminal method which  takes the input from intermediate operations and 
		// reduce the elements of a stream to a single value
		int odd_name=my_num.stream().filter(odd->odd%2!=0).reduce(1,(res,i)->res*i);
		System.out.println(odd_name);

	}
}
