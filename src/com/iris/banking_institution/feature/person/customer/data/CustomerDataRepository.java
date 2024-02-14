package com.iris.banking_institution.feature.person.customer.data;
import com.iris.banking_institution.feature.person.customer.domain.Customer;
import com.iris.banking_institution.feature.person.customer.domain.CustomerRepository;

import java.util.ArrayList;

public class CustomerDataRepository implements CustomerRepository {
    public static CustomerDataRepository instance = null;
    ArrayList<Customer> localCustomers = new ArrayList<>();

    public  static CustomerDataRepository newInstance(){
        if(instance == null){
            instance = new CustomerDataRepository();
        }
        return instance;
    }

    @Override
    public ArrayList<Customer> obtainAllCustomers() {
        return localCustomers;
    }

    @Override
    public Customer obtainOneCustomer(String dni) {
        for(Customer customer:localCustomers){
            if(customer.getDni().equals(dni)){
                return customer;
            }
        }
        return null;
    }

    @Override
    public void deleteCustomer(String dni) {
        for(Customer customer:localCustomers){
            if(customer.getDni().equals(dni)){
                localCustomers.remove(customer);
            }
        }
    }

    @Override
    public void addCustomer(Customer customer) {
        localCustomers.add(customer);
    }

    @Override
    public void modifyCustomer(String dni,Customer customer) {
        for(Customer customerIn:localCustomers){
            if(customerIn.getDni().equals(dni)){
                customerIn=customer;
            }
        }
    }
}
