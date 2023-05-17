package com.Assessment.Assessment.controller;
import com.Assessment.Assessment.repository.Department;
import com.Assessment.Assessment.repository.DepartmentRepository;
import com.Assessment.Assessment.repository.Employee;
import com.Assessment.Assessment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;


    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @GetMapping("/api")
    public Employee getEmployeeByEno(@RequestParam("ENO") int eno) {
        Employee employee = employeeRepository.findById(eno).orElse(null);
        if (employee != null) {
            System.out.println("Employee Details:");
            System.out.println("ENO: " + employee.getEno());
            System.out.println("Ename: " + employee.getEname());
            System.out.println("DNO: " + employee.getD_no());
            System.out.println("Salary: " + employee.getSalary());
        }
        return employee;
    }

//    @GetMapping("/api")
//    public List<Employee> getEmployeesByDname(@RequestParam("DNAME") String dname) {
//        List<Employee> employees = employeeRepository.findByDname(dname);
//        if (employees != null) {
//            for (int i = 0; i < employees.size(); i++) {
//                System.out.println(employeeRepository.findByDno(employees.);
//            }
//            return employeeRepository.findByDno(departments.);
//        }
//        return null;

}



