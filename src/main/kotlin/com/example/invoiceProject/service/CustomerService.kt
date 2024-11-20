package com.example.invoiceProject.service

import com.example.invoiceProject.entity.Customer
import com.example.invoiceProject.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class CustomerService {
    @Autowired
    lateinit var customerRepository: CustomerRepository

    fun findAll(): List<Customer>{
        return customerRepository.findAll()
    }

    fun findById(id: Long?): Customer? {
        return customerRepository.findById(id)
    }

    fun save(customer: Customer): Customer {
        return customerRepository.save(customer)
    }
}