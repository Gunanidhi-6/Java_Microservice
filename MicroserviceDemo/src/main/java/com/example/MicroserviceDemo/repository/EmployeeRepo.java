package com.example.MicroserviceDemo.repository;

import com.example.MicroserviceDemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}