package com.tapas.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenandOddNumberFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Way -1 
			List<Integer> list = Arrays.asList(1,3,4,7,4,6,9,3,5,67,5);
			/*	List<Integer> even=list.stream().filter(n-> n%2==0).collect(Collectors.toList());
				List<Integer> odd = list.stream().filter(n->n%2==1).collect(Collectors.toList());
				System.out.println("Even Number :: "+even);
				System.out.println("Odd Number:: "+odd);*/
	    //way -- 2
	    Map<Boolean, List<Integer>> result=list.stream().collect(Collectors.partitioningBy(n ->n%2==0));
	    
	    List<Integer> evenNumber= result.get(true);
	    List<Integer> oddNumber= result.get(false);
	    System.out.println("Even Number ::"+evenNumber);
	    System.out.println("Odd Number::"+oddNumber);

	}

}
