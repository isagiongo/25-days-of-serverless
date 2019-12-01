package com.isagiongo.daysofserverless.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/dreidel/spin")
    public String giraDreidel() {

        List<String> values = Arrays.asList("נ", "ג", "ה", "ש");
        Random random = new Random();
        String dreidel = values.get(random.nextInt(values.size()));
        return dreidel;

    }

}
