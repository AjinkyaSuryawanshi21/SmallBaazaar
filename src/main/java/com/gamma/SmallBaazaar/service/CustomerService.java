package com.gamma.SmallBaazaar.service;

import com.gamma.SmallBaazaar.model.Customer;
import com.gamma.SmallBaazaar.repository.SBInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Author: Ajinkya
@Service
public class CustomerService {

    @Autowired
    SBInterface service;

    /*Auther : Akshay Hambir*/
    public Object setCustomer(Customer customer){
        return service.save(customer);
    }

    /*Auther : Ajinkya Suryawanshi*/
    public List<Customer> getCustomer(String email, String password){
        List<Customer> ref = service.findByEmailAndPassword(email, password);
        return ref;
    }
}
