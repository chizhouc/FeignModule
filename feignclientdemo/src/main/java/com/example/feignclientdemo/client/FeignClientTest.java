package com.example.feignclientdemo.client;

import feign.Feign;
import feign.gson.GsonDecoder;

public class FeignClientTest {

    public static void main(String[] args) {
        FeignClient feignClient = Feign.builder()
                //.decoder(new GsonDecoder())
                .target(FeignClient.class, "http://localhost:8081/user");

        String content = feignClient.users();

        System.out.println(content);

        // Fetch and print a list of the contributors to this library.
//        List<Contributor> contributors = github.contributors("OpenFeign", "feign");
//        for (Contributor contributor : contributors) {
//            System.out.println(contributor.login + " (" + contributor.contributions + ")");
//        }

    }
}
