package com.tapas.java;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Example_01 {

	public static void main(String[] args) {
//Create person object
		int count=0;
		List<Person> personList = new ArrayList();
		personList.add(new Person("Ajit",25.0,"Male","HR"));
		personList.add(new Person("Tapas",35.0,"Female","IT"));
		personList.add(new Person("Rajesh",35.0,"Female","IT"));
		personList.add(new Person("Hari",22.0,"Male","HR"));
		personList.add(new Person("Rahul",21.0,"Female","IT"));
		//no.1:: I want to find distinct department
		/*personList.stream()
		           .map(Person::getDeptno)
		           .distinct()
		           .forEach(System.out::println);*/
		//no.2:: Count of person  from each department
		/*Map<String,Long> listMap=personList.stream()
				                           .collect(Collectors.groupingBy(Person::getDeptno, Collectors.counting()));
		System.out.println(listMap);*/
		//no.3:: find average age for Male and Female
		/*Map<String,Double> averageAge=personList.stream().
				collect(Collectors.groupingBy(Person::getGender,Collectors.averagingDouble(Person::getAge)));
		System.out.println(averageAge);*/
		//no.4:: sorted person by age in ascending order
		/*personList.stream()
		           .sorted((o1,o2)->o1.getAge()>o2.getAge()?-1:o1.getAge()<o2.getAge()?1:0)
		           .forEach(System.out::println);*/
		/*Map<Double, List<Person>> map=	personList.stream()
				          .sorted((o1, o2) -> o1.getAge().compareTo(o2.getAge()))
				          .collect(Collectors.groupingBy(Person::getAge));
		map.forEach((s,t)->{
			List<String> name =new ArrayList<>();
			for(Person p1 :t) {
				name.add(p1.getName());
				}
			System.out.println("Age :"+s+", Name: "+name);
		});*/
		// no.5:: I want to print the person whose age between 20 to 25
		/*personList.stream()
		          .filter(s->s.getAge()>=20 && s.getAge()<=25)
		          .forEach(System.out::println);*/
		//no.6:: print sorted the person as per length in descending
		/* personList.stream()
		           .sorted((o1, o2) ->o1.getName().length()>o2.getName().length()?-1:o1.getName().length()<o2.getName().length()?1:0)
		           .forEach(System.out::println);*/
		//no.7:: sorting Person by Alphabetically
		/*personList.stream()
		           .sorted((o1, o2) ->o1.getName().compareToIgnoreCase(o2.getName()))
		           .forEach(System.out::println);*/
		personList.stream()
		          .map(Person::getName)
		          .sorted()
		          .toList()
		          .forEach(System.out::println);
	}

}
