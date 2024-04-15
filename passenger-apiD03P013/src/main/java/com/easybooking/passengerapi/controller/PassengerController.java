package com.easybooking.passengerapi.controller;



import com.easybooking.passengerapi.model.Passenger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/passengers")
public class PassengerController {

    private List<Passenger> passengers = new ArrayList<>();

    @GetMapping
    public String getAllPassengers(Model model) {
        model.addAttribute("passengers", passengers);
        return "passengerList";
    }

    @GetMapping("/{id}")
    public String getPassengerById(@PathVariable("id") Long id, Model model) {
        Passenger passenger = findPassengerById(id);
        if (passenger != null) {
            model.addAttribute("passenger", passenger);
        }
        return "passengerDetails";
    }

    @PostMapping
    public String addPassenger(@ModelAttribute("passenger") Passenger passenger) {
        passengers.add(passenger);
        return "redirect:/passengers";
    }

    @PostMapping("/{id}")
    public String updatePassenger(@PathVariable("id") Long id, @ModelAttribute("passenger") Passenger updatedPassenger) {
        Passenger passenger = findPassengerById(id);
        if (passenger != null) {
            passenger.setFirstName(updatedPassenger.getFirstName());
            passenger.setLastName(updatedPassenger.getLastName());
            passenger.setAge(updatedPassenger.getAge());
            passenger.setEmail(updatedPassenger.getEmail());
        }
        return "redirect:/passengers";
    }

    @GetMapping("/delete/{id}")
    public String deletePassenger(@PathVariable("id") Long id) {
        Passenger passenger = findPassengerById(id);
        if (passenger != null) {
            passengers.remove(passenger);
        }
        return "redirect:/passengers";
    }

    private Passenger findPassengerById(Long id) {
        for (Passenger p : passengers) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
}
