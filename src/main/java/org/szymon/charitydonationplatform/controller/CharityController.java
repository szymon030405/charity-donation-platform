package org.szymon.charitydonationplatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CharityController {

    @GetMapping("/home")
    public ModelAndView get_home() {
        ModelAndView model_and_view = new ModelAndView("home");
        return model_and_view;
    }

    @GetMapping("/donate")
    public ModelAndView get_donate() {
        ModelAndView model_and_view = new ModelAndView("donate");

    }
}
