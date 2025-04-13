package com.training.assignment2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.assignment2.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByName(String name);
}
