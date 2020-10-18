package com.stan.kong.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/kong")
public class KongResource {

    @RequestMapping(value ="/getResource/{name}",method = RequestMethod.GET)
    public String getEcho(@PathVariable String name) {

        System.out.println("Received call "+name);

        return "SUCCESS";

    }
}
