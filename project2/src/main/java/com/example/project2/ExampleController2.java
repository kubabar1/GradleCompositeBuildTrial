package com.example.project2;

import com.examplemod2.project2.ExampleModController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module1/example")
public class ExampleController2 extends ExampleModController {
}
