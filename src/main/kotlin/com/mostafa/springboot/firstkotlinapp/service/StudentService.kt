package com.mostafa.springboot.firstkotlinapp.service

import com.mostafa.springboot.firstkotlinapp.entity.Student
import com.mostafa.springboot.firstkotlinapp.repositories.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService(@Autowired private val studentRepository: StudentRepository) {
    fun findById(id: Long): Student {
        return studentRepository.findById(id).orElseThrow { IllegalArgumentException("input id is not valid") };
    }

    fun findNames(firstName: String?, lastName: String?): List<Student> {
        return studentRepository.findByFirstNameContainsAndLastNameContains(firstName
                ?: "", lastName ?: "")
    }
}