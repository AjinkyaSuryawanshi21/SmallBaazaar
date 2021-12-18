package com.gamma.SmallBaazaar.service;

import com.gamma.SmallBaazaar.model.ProductSupplier;
import com.gamma.SmallBaazaar.repository.ProductSupplierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Author: Ajinkya, Akshay and Manoj
@Service
public class ProductSupplierService {

    @Autowired
    ProductSupplierRepo psRef;

    public List<ProductSupplier> getByFpid(int fpid){
        List<ProductSupplier> pSuppliers = psRef.findByFpid(fpid);
        return pSuppliers;
    }
}
