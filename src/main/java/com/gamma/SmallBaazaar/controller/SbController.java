package com.gamma.SmallBaazaar.controller;

import com.gamma.SmallBaazaar.model.Customer;
import com.gamma.SmallBaazaar.model.Product;
import com.gamma.SmallBaazaar.model.ProductSupplier;
import com.gamma.SmallBaazaar.model.Supplier;
import com.gamma.SmallBaazaar.repository.SBInterface;
import com.gamma.SmallBaazaar.service.CustomerService;
import com.gamma.SmallBaazaar.service.ProductService;
import com.gamma.SmallBaazaar.service.ProductSupplierService;
import com.gamma.SmallBaazaar.service.SupplierService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SbController {

    @Autowired
    CustomerService service;

    @Autowired
    SupplierService ser;

    @Autowired
    ProductService pServ;

    @Autowired
    ProductSupplierService psServ;

    /*Auther: Manoj Sakat*/
    @GetMapping("/")
    public String test(Model model){
        List<Product> products = pServ.getAll();
        model.addAttribute("products", products);
        return "home.html";
    }

    @GetMapping("/register")
    public String register(){
        return "register.html";
    }

    @GetMapping("/login")
    public String login(){
        return "login.html";
    }

    /*
    Module Info:
    Auther : Akshay Hambir
    */
    @GetMapping("/registerUser")
    public String reg_cust(@ModelAttribute Customer customer){
        service.setCustomer(customer);
        System.out.println("post method");
        return "register.html";
    }

    /*
    Auther : Ajinkya Suryawanshi
     */
    @GetMapping("/loginUser")
    public String log_cust(@RequestParam("email") String email, @RequestParam("password") String password){
        List<Customer> ref = service.getCustomer(email,password);
        if(!ref.isEmpty()){
            return "home.html";
        }
        return "login.html";
    }

    /*
    Auther : Akshay Hambir
     */
    @GetMapping("/loginSupplier")
    public String sup_login(@RequestParam("sname") String sname, @RequestParam("password") String password){
        List<Supplier> ref = ser.getSupplier(sname,password);
//        Supplier s = ref.get(0);
//        System.out.println(s.getSname());
        if(!ref.isEmpty()){
            return "SupplierHomePage.html";
        }
        return "loginSupplier.html";
    }

    @GetMapping("/loginAsSupplier")
    public String loginAsSupplier(){
        return "loginSupplier.html";
    }

    @GetMapping("/product/details/{fpid}")
    public String productDetails(@PathVariable("fpid") String id, Model model){
        int i = Integer.parseInt(id);
        List<ProductSupplier> pSuppliers = psServ.getByFpid(i);
//        List<Product> products = new ArrayList<>();
        List<Supplier> suppliers = new ArrayList<>();

        for(ProductSupplier p: pSuppliers){
            int sid = p.getSid();
            Supplier supplier = ser.getSupplierById(sid);
            suppliers.add(supplier);

//            int pid = p.getFpid();
//            Product product = pServ.getProductById(pid);
//            products.add(product);
        }

        model.addAttribute("pSuppliers", pSuppliers);
        model.addAttribute("suppliers", suppliers);
//        model.addAttribute("products", products);

        return "productDetails.html";
    }
}
