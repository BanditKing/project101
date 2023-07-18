package com.example.project101.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
    //private static String imagePath="./images/english_sentence5.png";

    @RequestMapping("/")
    String home() {
        //System.out.println("mainge :" + imagePath);
        return "";
    }
}
