package com.example.springbootjpa.controllers;

import com.example.springbootjpa.dao.AddressRepo;
import com.example.springbootjpa.models.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class AddressController {

    @Autowired
    AddressRepo repo;

    @RequestMapping("address")
    @ResponseBody
    public String addAddress(Address address){
        repo.save(address);
        return "Hello Brother";
    }


    @RequestMapping("getAddress")
    @ResponseBody
    public String getAddress(@RequestParam Integer id){
        Optional<Address> address = repo.findById(id);
        System.out.println(address);
        return "Hello Brother";
    }
}
