package com.example.passengerapp.service;

import com.example.passengerapp.model.Passenger;

import java.util.List;

public interface PassengerService {

    void addPassenger(Passenger passenger);

    Passenger getPassengerById(int id);

    List<Passenger> getAllPassengers();

    void updatePassenger(Passenger passenger);

    void deletePassenger(int id);
}
