package com.mostafa.springboot.firstkotlinapp

import com.mostafa.springboot.firstkotlinapp.service.StudentService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinAppApplicationTests(@Autowired val studentService: StudentService) {

    @Test
    fun contextLoads() {
    }

    @Test
    fun testFirstNameAndLastName(){
        val students = studentService.findNames(null, "Rastegar")
        assertEquals(2, students.size)
    }

}
