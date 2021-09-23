package com.example.service;

import java.util.List;

import com.example.dto.EmployeeDTO;

public interface EmployeeService {
	
	public String saveEmployee(EmployeeDTO dto);
	
	public List<EmployeeDTO> getAllRecord();

}
