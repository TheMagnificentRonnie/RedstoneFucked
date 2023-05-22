package com.example.com.magron.integrators;

import io.micronaut.http.annotation.*;

@Controller("/service")
public class ServiceController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}