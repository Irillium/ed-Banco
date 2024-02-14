package com.iris.banking_institution.feature.person.employee.domain;

import java.util.ArrayList;

public interface EmployeeRepository {
    public ArrayList<Employee> obtainAllEmployees();
    public Employee obtainOneEmployee(String ssn);
    public void deleteEmployee(String ssn);
    public void addEmployee(Employee employee);
    public void modifyEmployee(String ssn, Employee employee);
}
