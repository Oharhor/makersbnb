package com.makers.makersbnb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@RestController
public class StaffController {
    @GetMapping("/team")
    public ModelAndView index() {
        String[] Team = new String[]{"Toby", "Katerina", "Sandy"};
        ModelAndView modelAndView = new ModelAndView("/Teampage");
        modelAndView.addObject("Team", Team);
        return modelAndView;
    }}
