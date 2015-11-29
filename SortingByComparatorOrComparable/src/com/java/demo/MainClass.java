package com.java.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		//Array of Employee Class having various employee values
		
		Employee[] employeeArray=new Employee[5];
		employeeArray[0]=new Employee(1,"sujit",25000,"IT");
		employeeArray[1] =new Employee(2, "Amit", 20000, "HR");
		employeeArray[2]=new Employee(2,"Ajit",25000,"IT");
		employeeArray[3] =new Employee(2, "nemo", 20000, "HR");
		employeeArray[4] =new Employee(4, "Mone", 20000, "HR");
		
		System.out.println(Arrays.toString(employeeArray));
		Arrays.sort(employeeArray);
		System.out.println(Arrays.toString(employeeArray));
		
		employeeArray=new Employee[5];
		employeeArray[0]=new Employee(1,"sujit",25000,"IT");
		employeeArray[1] =new Employee(2, "Amit", 20000, "HR");
		employeeArray[2]=new Employee(2,"Ajit",25000,"IT");
		employeeArray[3] =new Employee(2, "nemo", 20000, "HR");
		employeeArray[4] =new Employee(4, "Mone", 20000, "HR");
		
		System.out.println(Arrays.toString(employeeArray));
		List<Employee> employeeCollectionList=new ArrayList<Employee>();
		employeeCollectionList.addAll(Arrays.asList(employeeArray));
		Arrays.sort(employeeArray,new ComparatorExtraClass());
		System.out.println(Arrays.toString(employeeArray));
		//sorting on array list
		Collections.sort(employeeCollectionList);
		//if you want to sort it at runtime by salary then use below code
		//Collections.sort(employeeCollectionList,new ComparatorBySalary());
		System.out.println(Arrays.toString(employeeCollectionList.toArray()));
		/*
		 * 
		 * Input Data:- 
		 * [Employee [id=1, name=sujit, salary=25000, department=IT], Employee [id=2, name=Amit, salary=20000, department=HR], Employee [id=2, name=Ajit, salary=25000, department=IT], Employee [id=2, name=nemo, salary=20000, department=HR], Employee [id=4, name=Mone, salary=20000, department=HR]]
			
		 sorting as ascending by Id and if Id is same then descending by employee name
			[Employee [id=1, name=sujit, salary=25000, department=IT], Employee [id=2, name=nemo, salary=20000, department=HR], Employee [id=2, name=Amit, salary=20000, department=HR], Employee [id=2, name=Ajit, salary=25000, department=IT], Employee [id=4, name=Mone, salary=20000, department=HR]]
		
		input Data:- 
		[Employee [id=1, name=sujit, salary=25000, department=IT], Employee [id=2, name=Amit, salary=20000, department=HR], Employee [id=2, name=Ajit, salary=25000, department=IT], Employee [id=2, name=nemo, salary=20000, department=HR], Employee [id=4, name=Mone, salary=20000, department=HR]]
		
		
		sorting as ascending by Id and if Id is same then ascending by employee name
		
		[Employee [id=1, name=sujit, salary=25000, department=IT], Employee [id=2, name=Ajit, salary=25000, department=IT], Employee [id=2, name=Amit, salary=20000, department=HR], Employee [id=2, name=nemo, salary=20000, department=HR], Employee [id=4, name=Mone, salary=20000, department=HR]]

		Sorting on array list
		[Employee [id=1, name=sujit, salary=25000, department=IT], Employee [id=2, name=nemo, salary=20000, department=HR], Employee [id=2, name=Amit, salary=20000, department=HR], Employee [id=2, name=Ajit, salary=25000, department=IT], Employee [id=4, name=Mone, salary=20000, department=HR]]

		 * 
		 */
		
		//Now i want to sort employee array by salary only
		
		employeeArray=new Employee[5];
		employeeArray[0]=new Employee(1,"sujit",20000,"IT");
		employeeArray[1] =new Employee(2, "Amit", 24000, "HR");
		employeeArray[2]=new Employee(2,"Ajit",2500,"IT");
		employeeArray[3] =new Employee(2, "nemo", 12000, "HR");
		employeeArray[4] =new Employee(4, "Mone", 30000, "HR");
		
		
		System.out.println(Arrays.toString(employeeArray));
		//here you can pass comparator by which you want to do sorting. this is runtime decided sorting
		Arrays.sort(employeeArray, new ComparatorBySalary());
		System.out.println(Arrays.toString(employeeArray));
	}

}
