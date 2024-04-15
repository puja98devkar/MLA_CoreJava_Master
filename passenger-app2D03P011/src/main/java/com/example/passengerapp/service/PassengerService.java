package com.example.passengerapp.service;

import com.example.passengerapp.model.Passenger;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public interface PassengerService {

    @Transactional
    void addPassenger(Passenger passenger);

    @Transactional
    void updatePassenger(Passenger passenger);

    @Transactional
    Passenger getPassengerById(int id);

    @Transactional
    List<Passenger> getAllPassengers();

    @Transactional
    void deletePassenger(int id);
}
