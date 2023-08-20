package com.mytutos.springboot.transactions.service;

import com.mytutos.springboot.transactions.model.Address;
import com.mytutos.springboot.transactions.repositories.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Address addAddress(Address address) {
        return addressRepository.save(address);
    }
}
