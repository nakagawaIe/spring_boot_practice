package org.example.spring_boot_practice.hello

import org.springframework.web.bind.annotation.*

@RestController
class HelloController {
    @GetMapping("/")
    fun index(
        @RequestParam(name = "message", required = false, defaultValue = "aaa") message: String,
    ): HelloResponse {
        val list = listOf(message, "bbb", "ccc", "ddd")
        return HelloResponse(list.map { HelloList(it) })
    }

    @PostMapping("/")
    fun post(@RequestBody request: HelloPostRequest): HelloResponse {
        val list = listOf(request.message)
        return HelloResponse(list.map { HelloList(it) })
    }
}
