package com.iris.banking_institution.feature.person.customer.domain;

import java.util.ArrayList;

public interface CustomerRepository {
    ArrayList<Customer> obtainAllCustomers();
    Customer obtainOneCustomer(String dni);
    void deleteCustomer(String dni);
    void addCustomer(Customer customer);
    void modifyCustomer(String dni,Customer customer);
}
