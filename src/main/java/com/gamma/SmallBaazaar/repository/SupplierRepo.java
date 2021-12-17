package com.gamma.SmallBaazaar.repository;

import com.gamma.SmallBaazaar.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepo extends JpaRepository<Supplier, Integer> {
    public List<Supplier> findBySnameAndPassword(String sname,String pass);
}
