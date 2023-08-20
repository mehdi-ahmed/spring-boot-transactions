package com.mytutos.springboot.transactions.repositories;

import com.mytutos.springboot.transactions.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
