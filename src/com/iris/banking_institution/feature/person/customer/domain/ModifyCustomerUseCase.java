package com.iris.banking_institution.feature.person.customer.domain;


public class ModifyCustomerUseCase {
    CustomerRepository customerRepository;

    public ModifyCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void execute(String dni, Customer customer){
        customerRepository.modifyCustomer(dni,customer);
    }
}
