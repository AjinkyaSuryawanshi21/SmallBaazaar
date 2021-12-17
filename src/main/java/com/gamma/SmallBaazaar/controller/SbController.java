package com.gamma.SmallBaazaar.controller;

import com.gamma.SmallBaazaar.model.Customer;
import com.gamma.SmallBaazaar.repository.SBInterface;
import com.gamma.SmallBaazaar.service.CustomerService;
import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SbController {

    @Autowired
    CustomerService service;

    /*Auther: Manoj Sakat*/
    @GetMapping("/")
    public String test(){
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
}
