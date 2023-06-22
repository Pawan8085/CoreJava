package mypkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(5, "PawaN ", 65000));
		employees.add(new Employee(3, "PawaN Kumar", 75000));
		employees.add(new Employee(2, "PawaN Kumar Sahu", 60000));
		
		// Sorting based on employee id *Using Comparable
		Collections.sort(employees); 
		
		System.out.println(employees);
		
		
		// Sorting based on employee marks *Using Comparator
		Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getMarks() - emp2.getMarks();
            }
        });
		
		System.out.println(employees);

	}

}
