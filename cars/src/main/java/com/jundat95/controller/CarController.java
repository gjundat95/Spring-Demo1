package com.jundat95.controller;

import com.jundat95.model.Car;
import com.jundat95.repository.CarMongoRepository;
import com.jundat95.repository.CarSearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by tinhngo on 2/6/17.
 */

@Controller
public class CarController {

    @Autowired
    private CarMongoRepository carMongoRepository;

    @Autowired
    private CarSearchRepository carSearchRepository;

    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("carList", carMongoRepository.findAll());
        return "home";
    }

    @RequestMapping(value = "/addCar", method = RequestMethod.POST)
    public String addCar(@ModelAttribute Car car){
       carMongoRepository.save(car);
       return "redirect:home";
    }

    @RequestMapping(value = "/search")
    public String search(Model model, @RequestParam String search) {
        model.addAttribute("carList", carSearchRepository.searchCars(search));
        model.addAttribute("search", search);
        return "home";
    }
}
