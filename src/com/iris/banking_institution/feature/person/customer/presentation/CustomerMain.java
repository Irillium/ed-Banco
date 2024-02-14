package com.iris.banking_institution.feature.person.customer.presentation;
import com.iris.banking_institution.feature.person.customer.data.CustomerDataRepository;
import com.iris.banking_institution.feature.person.customer.domain.*;

public class CustomerMain {
    public static void printAllCustomer(){
        GetAllCustomerUseCase getAllCustomerUseCase = new GetAllCustomerUseCase(CustomerDataRepository.newInstance());
        getAllCustomerUseCase.execute();
    }
    public static void printOneCustomer(String idCustomer){
        GetOneCustomerUseCase getOneCustomerUseCase = new GetOneCustomerUseCase(CustomerDataRepository.newInstance());
        getOneCustomerUseCase.execute(idCustomer);
    }
    public static void deleteCustomer(String idCustomer){
        DeleteCustomerUseCase deleteCustomerUseCase = new DeleteCustomerUseCase(CustomerDataRepository.newInstance());
        deleteCustomerUseCase.execute(idCustomer);
    }
    public static void addCustomer(Customer customer){
        AddCustomerUseCase addCustomerUseCase = new AddCustomerUseCase(CustomerDataRepository.newInstance());
        addCustomerUseCase.execute(customer);
    }
    public static void modifyCustomer(String idCustomer, Customer customer){
        ModifyCustomerUseCase modifyCustomerUseCase = new ModifyCustomerUseCase(CustomerDataRepository.newInstance());
        modifyCustomerUseCase.execute(idCustomer,customer);
    }
}
