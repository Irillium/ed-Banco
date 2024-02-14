package com.iris.banking_institution.feature.person.customer.domain;

public class DeleteCustomerUseCase {
    CustomerRepository customerRepository;

    public DeleteCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void execute(String dni){
        customerRepository.deleteCustomer(dni);
    }
}
