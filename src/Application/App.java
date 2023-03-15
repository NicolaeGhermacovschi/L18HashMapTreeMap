package Application;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;

public class App {

	public static void main(String[] args) {
		System.out.println("============ex1=====================");
		Map<String, List<Employee>> office = new HashMap<>();
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("12313d","Nicolae","Ghermacovschi","nicolae.ghermacovschi@gmail.com",22));
		employees.add(new Employee("12311233d","Nicolae","Nicolae","nicolae@gmail.com",22));
		employees.add(new Employee("1233d","Nic","Nicolae","nicolaeNic@gmail.com",22));
		employees.add(new Employee("1233d","Nic","Ni","nicolaeNi@gmail.com",22));
		
		office.put("Programmers", employees);
		
	
		System.out.println(office);
		
		Map<String, List<Employee>> programmers = new HashMap<>();
		//copy hashmap to another hashmap
		for(Entry<String, List<Employee>> dev : office.entrySet()) {
			programmers.put(dev.getKey(), dev.getValue());
		}
		System.out.println(programmers);
		
		System.out.println("============ex2=====================");
		Queue<List<Employee>> empl = new ArrayDeque<>();
		
		for(Entry<String, List<Employee>> dev : programmers.entrySet()) {
			empl.offer( dev.getValue());
		}
		
		for (List<Employee> employee : empl) {
			System.out.println(employee);
		}
		
		System.out.println("============ex3=====================");
		
		ArrayDeque<List<Employee>> devProgrammers = new ArrayDeque<>();
		
		for(Entry<String, List<Employee>> dev : programmers.entrySet()) {
			devProgrammers.push(dev.getValue());
		}
		for (List<Employee> list : devProgrammers) {
			System.out.println(list);
		}
		System.out.println("============ex4=====================");
		Queue<Employee> accounters = new LinkedList<>();
		accounters.offer(new Employee("518","Ion","Ion","ionion@gmail.com",34));
		accounters.offer(new Employee("5138","Andrei","Andrei","Andrei@gmail.com",24));
		accounters.offer(new Employee("5168","Ion","Andrei","ionAndrei@gmail.com",38));
 
		
		office.put("Accounters", (List<Employee>) accounters);

		System.out.println(office);
		
		
//		Queue<List<Employee>> employeeAccounters = new ArrayDeque<>();
//		employeeAccounters.offer((List<Employee>) new Employee("518","Ion","Ion","ionion@gmail.com",34));
//		employeeAccounters.offer((List<Employee>) new Employee("5138","Andrei","Andrei","Andrei@gmail.com",24));
//		employeeAccounters.offer((List<Employee>) new Employee("5168","Ion","Andrei","ionAndrei@gmail.com",38));
//		
//		Exception in thread "main" java.lang.ClassCastException: class Application.Employee cannot be cast to 
//		class java.util.List (Application.Employee is in unnamed module of loader 'app'; java.util.List is in 
//		module java.base of loader 'bootstrap')
//		at Application.App.main(App.java:69)
		
		
	}

}







































