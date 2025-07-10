package com.makers.makersbnb.controller;

import com.makers.makersbnb.model.Space;
import com.makers.makersbnb.repository.SpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StaticPageController {
    @Autowired
    SpaceRepository spaceRepository;

    @GetMapping("/")
    public ModelAndView landingpage() {
        ModelAndView modelAndView = new ModelAndView("/LandingPage");
        int nspaces = 100;
        modelAndView.addObject("nspaces", nspaces);
        int bookings = 37;
        modelAndView.addObject("bookings", bookings);
        String[] reviews = new String[] {"Awesome", "Nice", "Lush"};
        modelAndView.addObject("reviews", reviews);
        return modelAndView;


    }
    @GetMapping("/contactus")
    public ModelAndView contactus() {
        ModelAndView modelAndView = new ModelAndView("/Contactspage");
        String email =  "oharhor22@gmail.com";
        modelAndView.addObject("email", email);
        return modelAndView;

    }
    @GetMapping("/spaces")
    public ModelAndView spaces() {
        ModelAndView modelAndView = new ModelAndView("/SpacesPage");
        Iterable<Space> bookable = spaceRepository.findAll();
        modelAndView.addObject("bookable", bookable);
        return modelAndView;
    }
}


