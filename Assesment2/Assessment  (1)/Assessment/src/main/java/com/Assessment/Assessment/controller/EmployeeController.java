package com.Assessment.Assessment.controller;
import com.Assessment.Assessment.repository.Department;
import com.Assessment.Assessment.repository.DepartmentRepository;
import com.Assessment.Assessment.repository.Employee;
import com.Assessment.Assessment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EmployeeController {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;


    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    
    //This is for the first sub question
  //  @GetMapping("/api")
//    public Employee getEmployeeByEno(@RequestParam("ENO") int eno) {
//        Employee employee = employeeRepository.findById(eno).orElse(null);
//        if (employee != null) {
//            System.out.println("Employee Details:");
//            System.out.println("ENO: " + employee.getEno());
//            System.out.println("Ename: " + employee.getEname());
//            System.out.println("DNO: " + employee.getD_no());
//            System.out.println("Salary: " + employee.getSalary());
//        }
//        return employee;
// }


    
    //This is for the second sub question
        @GetMapping("/api")
        public List<Employee> getEmployeesByDname(@RequestParam("DNAME") String dname) {

           List<Department> departments = departmentRepository.findBydname(dname);
            if (!departments.isEmpty()) {
                List<Integer> dnoList = new ArrayList<>();

                for (Department department : departments) {
                    dnoList.add(department.getdno()*10);
                }

             List<Employee> employees = employeeRepository.findBydnoIn(dnoList);

                for (int i = 0; i < employees.size(); i++) {
                    System.out.println(employees.getEname);
                }
                return employees;
            }

            return null;
 }

    }




