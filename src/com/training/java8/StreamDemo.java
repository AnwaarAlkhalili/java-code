//Apply stream on a collection of numbers and then filter 
//out all the odd numbers then square those filtered odd numbers then sort them and display


package com.training.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
    	
      public class StreamDemo {

        // Create a List of numbers
        //List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Apply stream operations: filter odd numbers, square them, and sort
//        							  numbers.stream()
//                                      .filter(n -> n % 2 != 0)   // Filter out odd numbers
//                                      .map(m -> m * m)         // Square the odd numbers or transform
//                                      .sorted()                      // Sort the squared numbers
//                                      .collect(Collectors.toList());
//                                      //.forEach(x->System.out.println(x));//Collect the result into a list
        
        
        List<Department> deptList = new ArrayList<>();
        
        deptList.add(new Department(1, "Sales"));
        deptList.add(new Department(2, "IT"));
        deptList.add(new Department(3, "Account"));
        deptList.add(new Department(4, "Marketing"));
        
        empList.add(new Employee());
        //To list all department 
        deptList.stream().map(dept -> dept.getDeptName()).forEach(d -> System.out.println(d));
        System.out.println();
        
        // 3) Find the employee with the highest salary
        Optional<Employee> highestSalaryEmployee = employees.stream()
            .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        highestSalaryEmployee.ifPresent(emp -> 
            System.out.println("Employee with highest salary: " + emp.getName() + ", Salary: " + emp.getSalary()));
        
        // 4) Find the employee count in every department
        map<String, Long> employeeCountByDepartment = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        employeeCountByDepartment.forEach((department, count) -> 
            System.out.println("Department: " + department + ", Employee Count: " + count));
        
        

            }
    }
