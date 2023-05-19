package com.tapas.java;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//need to find nth salary of the given details
public class EmployeeNthSalry {

	public static void main(String[] args) {
		Employee e1 = new Employee(1001,"Tapas",25000.0,15);
		Employee e2 = new Employee(1002,"Subha",18000.0,10);
		Employee e3 = new Employee(1003,"Selly",25000.0,05);
		Employee e4 = new Employee(1004,"Muna",14000.0,02);
		Employee e5 = new Employee(1005,"Jaga",10000.0,15);
		Employee e6 = new Employee(1006,"Barsha",18000.0,02);
		Employee e7 = new Employee(1007,"Damayanti",12000.0,10);
		Employee e8 = new Employee(1008,"Hari",13000.0,07);
		Employee e9 = new Employee(1009,"Priya",21000.0,06);
		Employee e10 = new Employee(1010,"Sunil",13000.0,05);
		List<Employee> empList = List.of(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);
		//find the nth number of highest salary
		Scanner sc = new Scanner(System.in);
		System.out.println("Which position salary employee details required ?");
		int posNumber = sc.nextInt();
		sc.close();
		/*double xyz=findNthHighestSalary(empList, posNumber);
			for(Employee e :empList) {
				if(e.getEmpSalary()==xyz) {
					System.out.println(e);
				}
			}//for				
		*/	
		Map<Integer, List<Employee>> nthHighestSalary = nthHighestSalary(empList, posNumber);
		nthHighestSalary.forEach((s,t)->{
			System.out.print(s+"=");
			t.forEach(y->System.out.println(y));
		});
		/*	                    Scanner sc = new Scanner(System.in);
		                System.out.println("Enter which number of employee salary you want");
		                int posNumber = sc.nextInt();
		                sc.close();
		                Map<Integer,List<Employee>> getEmployee= nthHighestSalary(empList,posNumber);
		                getEmployee.forEach((s,y)->{
		                	System.out.println(s+"th of HigestSalary is =");
		                 y.forEach(System.out::println);
		                });*/
				}
										public static Double findNthHighestSalary(List<Employee> employees, int n) {
												    // Create a HashSet to remove duplicates
												    Set<Double> salaries = new HashSet<>();
												    
												    // Add all salaries to the HashSet
												    for (Employee e : employees) {
												        salaries.add(e.getEmpSalary());
												    }
												    
												    // Convert the HashSet to an ArrayList and sort it in descending order
												    List<Double> sortedSalaries = new ArrayList<>(salaries);
												    Collections.sort(sortedSalaries, Collections.reverseOrder());
												    
												    // Return the nth highest salary
												    return sortedSalaries.get(n-1);
												}

				private static Map<Integer, List<Employee>> nthHighestSalary(List<Employee> empList, int posNumber) {
				        List<Double> empSalary = empList.stream()
				           .map(Employee::getEmpSalary)
				           .sorted(Comparator.reverseOrder())
				           .distinct()
				           .toList();
				            
				       List<Employee> listofEmp = empList.stream()
				             .filter(s->s.getEmpSalary()==(double)empSalary.get(posNumber-1))
				              .collect(Collectors.toList());
				       Map<Integer, List<Employee>> map = new HashMap<>();
				map.put(posNumber, listofEmp);
					return map;
				}

}
