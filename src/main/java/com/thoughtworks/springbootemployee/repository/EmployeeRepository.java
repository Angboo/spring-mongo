package com.thoughtworks.springbootemployee.repository;

import com.thoughtworks.springbootemployee.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EmployeeRepository1 extends MongoRepository<Employee,String> {
    List<Employee> findAllByGender(String gender);
}
