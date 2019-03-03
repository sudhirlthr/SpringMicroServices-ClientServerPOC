package com.sudhir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sudhir.model.Employee;

@RestController
public class EmployeeTaxCalculations {
	
	@Autowired
	ADPINterface adpInterface;
	
	@RequestMapping("/honeywell/{empId}/{name}/{salary}")
	public Employee calculateTax(@PathVariable("empId") Integer empId, 
									@PathVariable("name") String name, 
									@PathVariable("salary") Double salary) {
		/*
		 * String url = "http://localhost:7000/adptax/{empId}/{salary}"; HashMap<String,
		 * Object> hashMap = new HashMap<>(); hashMap.put("empId", empId);
		 * hashMap.put("salary", salary);
		 * 
		 * RestTemplate restTemplate = new RestTemplate(); ResponseEntity<Employee>
		 * forEntity = restTemplate.getForEntity(url, Employee.class, hashMap); Employee
		 * employee = forEntity.getBody();
		 */
		Employee employee = adpInterface.calculateEmployeeTax(empId, salary);		
		employee.setName(name);
		return employee;
	}
}
