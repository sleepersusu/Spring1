package com.bistro.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositoryDao extends JpaRepository<Employee, Integer> {
}
