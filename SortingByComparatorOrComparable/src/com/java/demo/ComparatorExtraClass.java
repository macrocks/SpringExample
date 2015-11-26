package com.java.demo;

import java.util.Comparator;

public class ComparatorExtraClass implements Comparator<Employee> {

	//do sorting as ascending by Id and if Id is same then ascending by employee name
	@Override
	public int compare(Employee o1, Employee o2) {
		int value = o1.getId()-o2.getId();
		if(value==0)
		{
			return o1.getName().compareTo(o2.getName());
		}
		return value;
	}

}
