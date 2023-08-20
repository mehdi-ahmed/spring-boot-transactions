package com.mytutos.springboot.transactions.repositories;

import com.mytutos.springboot.transactions.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
