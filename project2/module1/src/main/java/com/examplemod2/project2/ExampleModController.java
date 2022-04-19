package com.examplemod2.project2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class ExampleModController {

    @GetMapping
    public ResponseEntity<String> exampleController() {
        return ResponseEntity.ok().body("example-module1");
    }
}
