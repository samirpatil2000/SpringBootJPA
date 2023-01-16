package com.example.springbootjpa.dao;

import com.example.springbootjpa.models.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddressRepo extends CrudRepository<Address, Integer> {
    List<Address> findByFullName(String fullName);
    List<Address> findByIdGreaterThan(int id);
}
