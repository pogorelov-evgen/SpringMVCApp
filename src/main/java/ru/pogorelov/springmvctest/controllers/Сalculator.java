package ru.pogorelov.springmvctest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Сalculator {

    @GetMapping("/calculator")
    public String getCalculator (@RequestParam (value = "a", required = false) int a,
                                 @RequestParam (value = "b", required = false) int b,
                                 @RequestParam(value = "action", required = false) String action,
                                 Model model){
        switch (action){
            case "multiplication":{
                model.addAttribute("result", a*b);
                break;}
            case "division": {
                model.addAttribute("result",a/b);
                break;}
            case "addition":{
                model.addAttribute("result",a+b);
                break;}
            case "subtraction":{
                model.addAttribute("result", a-b);
                break;}
            default: {
                model.addAttribute("result","Specify the correct mathematical operation");
            }
        }
    return "calculators/calculator";
    }
}
