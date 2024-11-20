package com.example.invoiceProject.repository

import com.example.invoiceProject.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository:JpaRepository<Customer, Long> {
    fun findById(id: Long?): Customer?
}