package com.tapas.java;

import java.util.Arrays;
import java.util.List;

//Input[2,4,5,6,8]
public class DivisibleBy2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,4,0,6,8);//java 8 features
		//List<Integer> list2 = List.of(2,4,0,6,8);//java 11 features
		boolean result=list.stream()
				            .allMatch(s->s%2==0);
		
		if(result) {
			System.out.println("All numbers are divisible by 2");
		}
		else
			System.out.println("All numbers are not divisible by 2");
		//==================With out java 8 feature==========================
		Integer[] in1 = new Integer[] {2,4,6,8}; //I create a 
		if(checkNumber(in1)) {//checking the method
			System.out.println("All numbers are divisible bt Two");
		}
		else
			System.out.println("All numbers are not divisible bt Two");
		
		List<Integer> list2 = Arrays.asList(3,5,9,5,2);
		boolean atLeastDivisibleBy2=list2.stream()
				                         .anyMatch(s->s%2==0);
		
		if(atLeastDivisibleBy2) 
			System.out.println("At least one element in this array is devisiblle by 2");
		else
			System.out.println("At least one element is not divisible by 2");
	}
	
		public static boolean checkNumber(Integer[] in) {//create a method by passing Integer Array
			
			for(Integer inter:in) {//create for loop for checing all element are devisible by 2 or not
				if(inter%2==0) {//checing the number
				}
				else
					return false;
			}
			return true;
		}

}
