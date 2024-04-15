package com.example.controller;

import com.example.model.Passenger_Details;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PassengerController {

    private List<Passenger_Details> passengerList = new ArrayList<>();

    @GetMapping("/")
    public String redirectToHome() {
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("passengerList", passengerList);
        return "home";
    }

    @GetMapping("/passengerForm")
    public String showPassengerForm(Model model) {
        model.addAttribute("passenger", new Passenger_Details());
        return "passengerForm";
    }

    @PostMapping("/registerPassenger")
    public String registerPassenger(@ModelAttribute("passenger") Passenger_Details passenger, RedirectAttributes redirectAttributes) {
        // Logic to save passenger details to database
        passengerList.add(passenger);

        // Redirect to the home page after successful registration
        redirectAttributes.addFlashAttribute("successMessage", "Registration Successful!");
        return "redirect:/home";
    }
}
