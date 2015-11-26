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
		
	}

}
