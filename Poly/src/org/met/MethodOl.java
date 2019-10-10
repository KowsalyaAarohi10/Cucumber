package org.met;

import java.util.*;

public class MethodOl {
	
	
public static void main(String[] args) {
	

List<Integer> numbers = Arrays.asList(1, 2, 3);
numbers.stream().map(MethodOl::divideByZero).forEach(System.out::println);

}

public static int divideByZero(int n) {
	
	
	return n/0;
}
			
}


