package com.example.springbootjpa.dao;

import com.example.springbootjpa.models.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<Address, Integer> {

}
