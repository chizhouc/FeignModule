package com.example.feignclientdemo.client;

import feign.RequestLine;

public interface FeignClient {
    @RequestLine("GET /users")
    String users();
}
