package com.mostafa.springboot.firstkotlinapp.repositories

import com.mostafa.springboot.firstkotlinapp.entity.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository : JpaRepository<Student, Long>{
    fun findByFirstNameContainsAndLastNameContains(firstName:String, lastName:String):List<Student>
}