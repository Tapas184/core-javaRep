package com.tapas.java;

import java.util.*;

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
		Double xyz=findNthHighestSalary(empList, 3);
			if(xyz!=null) {
			empList.forEach(s->{
						if(s.getEmpSalary()==xyz)
							System.out.println(s);
					});
			}else
				System.out.println("Employee Not available");
		
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

}
