package com.example.project1;

import com.examplemod2.project2.ExampleModController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project2/example")
public class ExampleController2 extends ExampleModController {
}
