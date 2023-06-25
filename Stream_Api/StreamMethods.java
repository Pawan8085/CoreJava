package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {
		
		//* Stream Api's methods : filter(), map()
		
		//* filter - it takes Predicate Predicate returns boolean value
		
		List<Integer> list1 = Arrays.asList(15,10,2001);
		
		List<Integer> evenNumbers = list1.stream().filter(n-> n%2==0).collect(Collectors.toList());
		
		System.out.println(evenNumbers);
		
		
		//* map : used to map the element 
		
		List<Integer> squearedNumbers = list1.stream().map(e -> e*e).collect(Collectors.toList());
		System.out.println(squearedNumbers);
		
		//* sorted()
		list1.stream().sorted().forEach(e -> System.out.println(e));
		
		
		//* min() 
		int minElement = list1.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println(minElement);
		
		//* max() 
		
		int maxElement = list1.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println(maxElement);
		
	}
	

}
 