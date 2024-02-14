package com.iris.banking_institution.feature.person.employee.domain;

public class ModifyEmployeUseCase {
    EmployeeRepository employeeRepository;

    public ModifyEmployeUseCase(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    public void execute(String ssn, Employee employee){
        employeeRepository.modifyEmployee(ssn, employee);
    }
}
