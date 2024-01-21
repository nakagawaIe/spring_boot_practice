package org.example.spring_boot_practice.hello

import com.fasterxml.jackson.annotation.JsonProperty

data class HelloResponse (
    @field:JsonProperty("data") var data: List<HelloList>
)

data class HelloList (
    @field:JsonProperty("body") var body: String
)