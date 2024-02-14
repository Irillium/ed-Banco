package com.iris.banking_institution.feature.person.employee.presentation;

import com.iris.banking_institution.feature.person.employee.data.EmployeeDataRepository;
import com.iris.banking_institution.feature.person.employee.domain.*;

public class EmployeeMain {
    public static void printAllEmployees(){
        GetAllEmployeesUseCase getAllEmployeesUseCase = new GetAllEmployeesUseCase(EmployeeDataRepository.newInstance());
        getAllEmployeesUseCase.execute();
    }
    public static void printOneEmployee(String ssn){
        GetOneEmployeeUseCase getOneEmployeeUseCase = new GetOneEmployeeUseCase(EmployeeDataRepository.newInstance());
        getOneEmployeeUseCase.execute(ssn);
    }
    public static void addEmployee(Employee employee){
        AddEmployeeUseCase addEmployeeUseCase = new AddEmployeeUseCase(EmployeeDataRepository.newInstance());
        addEmployeeUseCase.execute(employee);
    }
    public static void deleteEmployee(String ssn){
        DeleteEmployeeUseCase deleteEmployeeUseCase = new DeleteEmployeeUseCase(EmployeeDataRepository.newInstance());
        deleteEmployeeUseCase.execute(ssn);
    }
    public static void modifyEmployee(String ssn, Employee employee){
        ModifyEmployeUseCase modifyEmployeUseCase = new ModifyEmployeUseCase(EmployeeDataRepository.newInstance());
        modifyEmployeUseCase.execute(ssn, employee);
    }
}
