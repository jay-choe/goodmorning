package com.jj.goodmorning

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class GoodmorningApplication

fun main(args: Array<String>) {
    runApplication<GoodmorningApplication>(*args)
}
