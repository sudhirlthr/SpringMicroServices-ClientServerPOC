package com.sudhir.model;

public class Employee {
	public Integer empId;
	public String name;
	public Double salary;
	private Double salaryAfterTax;
	private Double taxableAmount;
	private Integer portNumber;

	public Employee() {
	}

	public Employee(Integer empId, String name, Double salary, Double salaryAfterTax, Double taxableAmount,
			Integer portNumber) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.salaryAfterTax = salaryAfterTax;
		this.taxableAmount = taxableAmount;
		this.portNumber = portNumber;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getSalaryAfterTax() {
		return salaryAfterTax;
	}

	public void setSalaryAfterTax(Double salaryAfterTax) {
		this.salaryAfterTax = salaryAfterTax;
	}

	public Double getTaxableAmount() {
		return taxableAmount;
	}

	public void setTaxableAmount(Double taxableAmount) {
		this.taxableAmount = taxableAmount;
	}

	public Integer getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(Integer portNumber) {
		this.portNumber = portNumber;
	}
}
