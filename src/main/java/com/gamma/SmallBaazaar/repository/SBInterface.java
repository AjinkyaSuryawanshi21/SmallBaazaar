package com.gamma.SmallBaazaar.repository;

import com.gamma.SmallBaazaar.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*Auther : Manoj Sakat*/
@Repository
public interface SBInterface extends JpaRepository<Customer,Integer> {
    public List<Customer> findByEmailAndPassword(String email, String password);
}
