package com.iris.banking_institution.feature.person.employee.data;

import com.iris.banking_institution.feature.person.employee.domain.Employee;
import com.iris.banking_institution.feature.person.employee.domain.EmployeeRepository;

import java.util.ArrayList;

public class EmployeeDataRepository implements EmployeeRepository {
    ArrayList<Employee> localEmployees = new ArrayList<>();
    public static EmployeeDataRepository instance = null;
    public static EmployeeDataRepository newInstance(){
        if(instance==null){
            instance = new EmployeeDataRepository();
        }
        return instance;
    }

    @Override
    public ArrayList<Employee> obtainAllEmployees() {
        return localEmployees;
    }

    @Override
    public Employee obtainOneEmployee(String ssn) {
        for(Employee employee: localEmployees){
            if (employee.getSSN().equals(ssn)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void deleteEmployee(String ssn) {
        for(Employee employee: localEmployees){
            if (employee.getSSN().equals(ssn)) {
                localEmployees.remove(employee);
            }
        }
    }

    @Override
    public void addEmployee(Employee employee) {
            localEmployees.add(employee);
    }

    @Override
    public void modifyEmployee(String ssn, Employee employee) {
        for(Employee employeeIn: localEmployees){
            if (employeeIn.getSSN().equals(ssn)) {
                employeeIn=employee;
            }
        }
    }
}
