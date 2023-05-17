package com.Assessment.Assessment.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
//    @Query("SELECT e FROM Employee e WHERE e.d_no = :dno")
//    List<Employee> findByDno(int dno);
//
//    @Query("SELECT e FROM Employee e JOIN e.department d WHERE d.dname = :dname")
//    List<Employee> findByDname(String dname);
}



