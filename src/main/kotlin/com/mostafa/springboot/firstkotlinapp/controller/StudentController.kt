package com.mostafa.springboot.firstkotlinapp.controller

import com.mostafa.springboot.firstkotlinapp.entity.Student
import com.mostafa.springboot.firstkotlinapp.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/students")
class StudentController(@Autowired private val studentService: StudentService) {
    @GetMapping
    fun filterByName(@RequestParam firstName: String?,
                     @RequestParam lastName: String?): List<Student> {
        return studentService.findNames(firstName, lastName)
    }
}