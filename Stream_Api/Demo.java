package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,9);
		
		//Qu. Filter even numbers from above list 
//		
//		Stream<Integer> stream = list.stream();
		
		List<Integer> evenNumbers = list.stream().filter(n -> n%2==0).collect(Collectors.toList());
		
		System.out.println(evenNumbers);
		
		
		//* Stream with Arrays 
		String[] names = {"Pawan", "Kumar", "Pawan Kumar", "Kumar Pawan"};
		
		Stream<String> stream1 = Stream.of(names);
		
		stream1.forEach(e -> System.out.println(e));
		
		//* Anonymous array 
		IntStream stream2 = Arrays.stream(new int[] {2,3,4,7,9});
		stream2.forEach(e -> System.out.println(e));
		
		
		
		
	}

}
