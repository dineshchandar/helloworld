package com.example.helloworld;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/hello")
public class HelloWorldController {

    @GetMapping("/get")
    ResponseEntity HelloWorld(){
        System.out.println("Hello World, Dinesh");
        return new ResponseEntity("Hello World, Dinesh", HttpStatus.OK);
    }

    @GetMapping("/getwithname/{name}")
    ResponseEntity getWithName(@PathVariable String name){
        System.out.println("Hello World, " + name);
        return new ResponseEntity("Hello World, " + name, HttpStatus.OK);
    }


}
