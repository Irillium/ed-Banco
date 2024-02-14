package com.iris.banking_institution.feature.person.customer.domain;

public class GetAllCustomerUseCase {
    CustomerRepository customerRepository;

    public GetAllCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void execute(){
        customerRepository.obtainAllCustomers();
    }
}
