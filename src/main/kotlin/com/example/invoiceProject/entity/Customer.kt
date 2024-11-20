package com.example.invoiceProject.entity

import jakarta.persistence.*

@Entity
@Table(name = "customer")
class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    var id: Long? = null
    @Column (unique = true, nullable = false)
    var fullName: String? = null
    @Column (unique = true, nullable = false)
    var email: String? = null
}