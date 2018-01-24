package com.service.bmi2.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-01-24T08:20:26.942Z")

@RestSchema(schemaId = "bmi2")
@RequestMapping(path = "/bmi2", produces = MediaType.APPLICATION_JSON)
public class Bmi2Impl {

    @Autowired
    private Bmi2Delegate userBmi2Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userBmi2Delegate.helloworld(name);
    }

}
