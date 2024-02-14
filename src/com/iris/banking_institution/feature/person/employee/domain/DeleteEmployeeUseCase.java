package com.iris.banking_institution.feature.person.employee.domain;

public class DeleteEmployeeUseCase {
    EmployeeRepository employeeRepository;

    public DeleteEmployeeUseCase(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void execute(String ssn){
        employeeRepository.deleteEmployee(ssn);
    }
}
