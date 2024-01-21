package org.example.spring_boot_practice.hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/")
    fun index(): HelloResponse {
        val list = listOf("aaa", "bbb", "ccc", "ddd")
        return HelloResponse(list.map { HelloList(it) })
    }
}