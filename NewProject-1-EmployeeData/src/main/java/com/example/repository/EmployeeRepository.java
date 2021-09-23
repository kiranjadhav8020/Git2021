package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{

}
