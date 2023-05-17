package com.Assessment.Assessment.seeder;

import com.Assessment.Assessment.repository.Department;
import com.Assessment.Assessment.repository.DepartmentRepository;
import com.Assessment.Assessment.repository.Employee;
import com.Assessment.Assessment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    @Autowired
    public DatabaseSeeder(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) {


        Department d1 = SetValues(10, "Admin");
        departmentRepository.save(d1);
        Department d2= SetValues(20, "Accounts");
        departmentRepository.save(d2);
        Department d3 = SetValues(30, "Sales");
        departmentRepository.save(d3);
        Department d4 = SetValues(40, "Marketing");
        departmentRepository.save(d4);
        Department d5 = SetValues(50, "Purchasing");
        departmentRepository.save(d5);

        Employee e1= SetValues(1,"Amal", 10, 30000);
        employeeRepository.save(e1);
        Employee e2= SetValues(2,"Shyamal", 30, 50000);
        employeeRepository.save(e2);
        Employee e3= SetValues(3,"Kamal", 40, 10000);
        employeeRepository.save(e3);
        Employee e4= SetValues(4,"Nirmal", 50, 30000);
        employeeRepository.save(e4);
        Employee e5= SetValues(5,"Bimal", 20, 40000);
        employeeRepository.save(e5);
        Employee e6= SetValues(6,"parimal", 10, 20000);
        employeeRepository.save(e6);

    }
    public static Department SetValues(int dno, String dname){
        Department d = new Department();
        d.setDno(dno);
        d.setDname(dname);
        return d;
    }
    public static Employee SetValues(int eno, String Ename, int Dno, int salary){
        Employee employee1 = new Employee();
        employee1.setEno(eno);
        employee1.setEname(Ename);
        employee1.setD_no(Dno);
        employee1.setSalary(salary);
        return  employee1;
    }
}

