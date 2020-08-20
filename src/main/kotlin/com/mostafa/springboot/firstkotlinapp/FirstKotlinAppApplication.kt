package com.mostafa.springboot.firstkotlinapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FirstKotlinAppApplication

fun main(args: Array<String>) {
    runApplication<FirstKotlinAppApplication>(*args)
}
