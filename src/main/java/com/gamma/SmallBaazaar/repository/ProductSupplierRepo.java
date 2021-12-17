package com.gamma.SmallBaazaar.repository;

import com.gamma.SmallBaazaar.model.ProductSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductSupplierRepo extends JpaRepository<ProductSupplier, Integer> {
    public List<ProductSupplier> findByFpid(int fpid);
}
