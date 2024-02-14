package com.iris.banking_institution.feature.person.employee.domain;

public class GetOneEmployeeUseCase {
    EmployeeRepository employeeRepository;

    public GetOneEmployeeUseCase(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    public void execute(String ssn){
        employeeRepository.obtainOneEmployee(ssn);
    }
}
