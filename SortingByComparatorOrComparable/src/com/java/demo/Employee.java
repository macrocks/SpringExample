package com.java.demo;

public class Employee implements Comparable<Employee> {

	private int id;
	
	private String name;
	
	private int salary;
	
	private String department;


	public Employee(int id, String name, int salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", department=" + department + "]";
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	//do sorting as ascending by Id and if Id is same then descending by employee name
	public int compareTo(Employee o) {
		int value = this.id-o.id;
		if(value==0)
		{
			return o.getName().compareTo(this.getName());
		}
		return value;
	}
	
	
	
}
