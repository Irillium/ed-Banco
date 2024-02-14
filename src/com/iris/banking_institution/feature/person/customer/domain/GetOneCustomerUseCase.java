package com.iris.banking_institution.feature.person.customer.domain;


public class GetOneCustomerUseCase {
    CustomerRepository customerRepository;

    public GetOneCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void execute(String dni){
        customerRepository.obtainOneCustomer(dni);
    }
}
