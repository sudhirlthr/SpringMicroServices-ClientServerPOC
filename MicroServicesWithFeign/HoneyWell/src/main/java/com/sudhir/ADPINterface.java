package com.sudhir;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sudhir.model.Employee;

@RibbonClient(name="ADPTaxSystem")
/* @FeignClient(name="ADPTaxSystem", url="http://localhost:7000") */
@FeignClient(name="ADPTaxSystem")
public interface ADPINterface {

	@RequestMapping("/adptax/{empId}/{salary}")
	public Employee calculateEmployeeTax(@PathVariable("empId") Integer empId, @PathVariable("salary") Double salary) ;
}
