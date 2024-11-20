package com.example.invoiceProject.repository

import com.example.invoiceProject.entity.Invoice
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface InvoiceRepository: JpaRepository<Invoice, Long> {
    fun findById(id: Long?): Invoice?
    fun finByCustomerId(customerId: Long?): List<Invoice>?
}