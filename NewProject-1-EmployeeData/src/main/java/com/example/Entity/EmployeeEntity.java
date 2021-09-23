package com.example.Entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Table(name="Employees_Data")
@Data
@Component
public class EmployeeEntity {
	
	@Id
	int emp_id;
	String emp_name;
	String emp_gender;
	String emp_email;
	String emp_job;
	int emp_depId;
	Date emp_Hiredate;
	Double emp_salary;	
	Double emp_commission;
	

}
