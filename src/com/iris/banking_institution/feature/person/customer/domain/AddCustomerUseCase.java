package com.iris.banking_institution.feature.person.customer.domain;


public class AddCustomerUseCase {
    CustomerRepository customerRepository;

    public AddCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void execute(Customer customer){
        customerRepository.addCustomer(customer);
    }
}
