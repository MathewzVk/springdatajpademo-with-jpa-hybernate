package com.mathewzvk.springdatajpademowithjpahybernate.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mathewzvk.springdatajpademowithjpahybernate.entity.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
