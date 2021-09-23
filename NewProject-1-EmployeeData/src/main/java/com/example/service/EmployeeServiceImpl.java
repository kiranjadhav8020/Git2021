package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.EmployeeEntity;
import com.example.dto.EmployeeDTO;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeEntity entity;
	
	@Autowired
	EmployeeRepository repo;
	
	@Autowired
	List<EmployeeDTO> dto;

	@Override
	public String saveEmployee(EmployeeDTO dto) {
		// TODO Auto-generated method stub
		
		BeanUtils.copyProperties(dto, entity);
		
		Optional<EmployeeEntity> checkNull = 
                				Optional.ofNullable(repo.save(entity));  
  if (checkNull.isPresent()) 
	  	return "record_Saved";
   else  
    return "Record Not Save";  
		

	}

	@Override
	public List<EmployeeDTO> getAllRecord() {
		// TODO Auto-generated method stub
		
		List<EmployeeEntity> findAll = repo.findAll();
		System.out.println(findAll);
		
		for(EmployeeEntity entity : findAll) {
			EmployeeDTO dto1=new EmployeeDTO();
			 BeanUtils.copyProperties(entity,dto1);
			 dto.add(dto1);
		}
		
		
		System.out.println(dto);
		return dto;
	}
	
}
