package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dto.EmployeeDTO;
import com.example.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl service;
	
	@GetMapping("/home")
	public String getHome() {
		
		return "home";
	}
	
	@GetMapping("/addEmployeePage")
	public String saveEmployeeForm(Model model) {
		
		model.addAttribute("employeeDTO",new EmployeeDTO());
		return "NewEmployee";
	}
	
	@PostMapping("/addEmployee")
	public String addEmployee(@ModelAttribute("employeeDTO") EmployeeDTO empdto,Model model) {
		System.out.println(empdto);
		String record = service.saveEmployee(empdto);
		if(record.equals("record_Saved"))
		return "recordSave";
		else 
			return "error";
	}
	
	@GetMapping("/updateEmployee")
	public String updateEmployee() {
		
		return "error";
	}
	
	@GetMapping("/allEmployees")
	public String getAllEmployees(Model model) {
		List<EmployeeDTO> employeeList=new ArrayList<EmployeeDTO>(); 
		// employeeList.add(new EmployeeDTO(101,"kiran", "male", "kiran@gmail", "manager", "string", 100.00,100.0, 111));
		employeeList= service.getAllRecord();
		model.addAttribute("employeeList1",employeeList);
		return "allRecord";
	}
	
	public String getUpdaedRecord() {
		return "home";
	}

}
