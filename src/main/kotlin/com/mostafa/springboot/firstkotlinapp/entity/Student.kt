package com.mostafa.springboot.firstkotlinapp.entity

import javax.persistence.*

@Entity
@Table(name = "tb_students")
data class Student(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,
        @Column(name = "first_name", nullable = false)
        val firstName: String,
        @Column(name = "last_name", nullable = false)
        val lastName: String)
