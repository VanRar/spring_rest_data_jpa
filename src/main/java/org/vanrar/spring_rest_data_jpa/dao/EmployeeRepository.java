package org.vanrar.spring_rest_data_jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vanrar.spring_rest_data_jpa.entity.Employee;


import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByName(String name);
}