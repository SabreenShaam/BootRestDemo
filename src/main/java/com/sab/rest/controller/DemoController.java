package com.sab.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/get")
    public  String  sample(){
        return "Sabreen Its Working Sira ayyo";
    }

}
