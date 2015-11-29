package com.java.demo;

import java.util.Comparator;

public class ComparatorBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getSalary()-o2.getSalary();
	}

}
