package com.iris.banking_institution.feature.person.employee.domain;

public class AddEmployeeUseCase {
    EmployeeRepository employeeRepository;

    public AddEmployeeUseCase(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    public void execute(Employee employee){
        employeeRepository.addEmployee(employee);
    }
}
