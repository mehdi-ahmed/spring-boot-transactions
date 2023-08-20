package com.mytutos.springboot.transactions.service;


import com.mytutos.springboot.transactions.model.Address;
import com.mytutos.springboot.transactions.model.Employee;
import com.mytutos.springboot.transactions.repositories.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    private final AddressService addressService;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository,
                           AddressService addressService) {
        this.employeeRepository = employeeRepository;
        this.addressService = addressService;
    }

    @Transactional
    public Employee addEmployee(Employee employee) {
        Employee employeeSavedDB = this.employeeRepository.save(employee);

        // Address address = new Address();

        // we will initialize the
        // address object as null
        Address address = null;
        address.setId(123L);
        address.setAddress("Kuala Lumpur");
        address.setEmployee(employee);

        // calling addAddress()
        this.addressService.addAddress(address);
        return employeeSavedDB;
    }
}
