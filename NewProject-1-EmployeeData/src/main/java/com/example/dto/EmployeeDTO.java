package com.example.dto;

import java.sql.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class EmployeeDTO {
	
	int emp_id;
	String emp_name;
	String emp_gender;
	String emp_job;
	String emp_email;
	Date emp_Hiredate;
	double emp_salary;	
	double emp_commission;
	int emp_depId;
	
	public EmployeeDTO(){
		
	}

	/*
	 * public EmployeeDTO(int emp_id, String emp_name, String emp_gender, String
	 * emp_job, String emp_email, String emp_Hiredate, double emp_salary, double
	 * emp_commission, int emp_depId) { super(); this.emp_id = emp_id; this.emp_name
	 * = emp_name; this.emp_gender = emp_gender; this.emp_job = emp_job;
	 * this.emp_email = emp_email; this.emp_Hiredate = emp_Hiredate; this.emp_salary
	 * = emp_salary; this.emp_commission = emp_commission; this.emp_depId =
	 * emp_depId; }
	 */

}
