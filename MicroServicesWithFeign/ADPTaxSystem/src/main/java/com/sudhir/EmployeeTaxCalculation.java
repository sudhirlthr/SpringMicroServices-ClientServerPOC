package com.sudhir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeTaxCalculation {
	
	@Autowired
	Environment environment;
	
	@RequestMapping("/adptax/{empId}/{salary}")
	public EmployeeTaxOutput calculateEmployeeTax(@PathVariable("empId") Integer empId, @PathVariable("salary") Double salary) {
		//System.out.println("In ADP tax calculation with EMP-Id : "+empId+" and Salary : "+salary);
		Double tax = salary*20/100;
		Double salaryAfterTax = salary-tax;
		EmployeeTaxOutput employeeTaxOutput = new EmployeeTaxOutput();
		employeeTaxOutput.setEmpId(empId);
		employeeTaxOutput.setSalaryAfterTax(salaryAfterTax);
		employeeTaxOutput.setTaxableAmount(tax);
		employeeTaxOutput.setSalary(salary);
		employeeTaxOutput.setPortNumber(Integer.parseInt(environment.getProperty("local.server.port")));
		return employeeTaxOutput;
	}
}
