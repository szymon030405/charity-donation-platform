package org.szymon.charitydonationplatform;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CharityController {
    private CharityService charity_service;

    public CharityController(CharityService a_charity_service) {
        this.charity_service = a_charity_service;
    }


    @GetMapping("/home")
    public ModelAndView get_home() {
        ModelAndView model_and_view = new ModelAndView("home");
        return model_and_view;
    }

    @GetMapping("/charitylist")
    public ModelAndView get_charitylist() {
        ModelAndView model_and_view = new ModelAndView("charitylist");
        List<Charity> charities = charity_service.get_charities();
        model_and_view.addObject("charities", charities);
        return model_and_view;
    }
}
