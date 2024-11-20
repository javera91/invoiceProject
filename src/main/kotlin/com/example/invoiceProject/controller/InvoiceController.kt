package com.example.invoiceProject.controller

import com.example.invoiceProject.entity.Customer
import com.example.invoiceProject.entity.Invoice
import com.example.invoiceProject.service.InvoiceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/invoices")
class InvoiceController {

    @Autowired
    lateinit var invoiceService: InvoiceService

    @GetMapping
    fun findAll(): List<Invoice> {
        return invoiceService.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Invoice? {
        return invoiceService.findById(id)
    }

    @PostMapping
    fun save(@RequestBody invoice: Invoice): Invoice {
        return invoiceService.save(invoice)
    }
}