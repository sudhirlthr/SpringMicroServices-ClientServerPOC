package com.sudhir;

public class EmployeeTaxOutput {
	private Integer empId;
	private Double salaryAfterTax;
	private Double taxableAmount;
	public Double salary;
	
	public EmployeeTaxOutput() {
	}
	
	public EmployeeTaxOutput(Integer empId, Double salaryAfterTax, Double taxableAmount, Double salary) {
		this.empId = empId;
		this.salaryAfterTax = salaryAfterTax;
		this.taxableAmount = taxableAmount;
		this.salary = salary;
	}



	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	
}
