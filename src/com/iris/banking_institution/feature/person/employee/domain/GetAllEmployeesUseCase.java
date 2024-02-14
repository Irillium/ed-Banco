package com.iris.banking_institution.feature.person.employee.domain;

public class GetAllEmployeesUseCase {
    EmployeeRepository employeeRepository;

    public GetAllEmployeesUseCase(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    public void execute(){
        employeeRepository.obtainAllEmployees();
    }
}
