package com.gamma.SmallBaazaar.service;


import com.gamma.SmallBaazaar.model.Supplier;
import com.gamma.SmallBaazaar.repository.SupplierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Author: Akshay
@Service
public class SupplierService {

    @Autowired
    SupplierRepo ser;

    /*
    Auther : Akshay Hambir
     */
    public List<Supplier> getSupplier(String sname, String pass){
        List<Supplier> ref = ser.findBySnameAndPassword(sname,pass);
        return ref;
    }

    public Supplier getSupplierById(int id){
        Supplier supplier = ser.findById(id).get();
        return supplier;
    }
}
