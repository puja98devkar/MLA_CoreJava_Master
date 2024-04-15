package com.example.passengerapp.dao;

import com.example.passengerapp.model.Passenger;

import java.util.List;



import com.example.passengerapp.model.Passenger;

import java.util.List;

public interface PassengerDao {

    List<Passenger> getAllPassengers();

    Passenger getPassengerById(int id);

    void addPassenger(Passenger passenger);

    void updatePassenger(Passenger passenger);

    void deletePassenger(int id);
}
