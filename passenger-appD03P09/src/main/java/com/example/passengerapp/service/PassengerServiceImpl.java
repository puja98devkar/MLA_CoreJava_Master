package com.example.passengerapp.service;

import com.example.passengerapp.dao.PassengerDao;
import com.example.passengerapp.model.Passenger;

import java.util.List;

public class PassengerServiceImpl implements PassengerService {

    private PassengerDao passengerDao;

    public PassengerServiceImpl(PassengerDao passengerDao) {
        this.passengerDao = passengerDao;
    }

    @Override
    public List<Passenger> getAllPassengers() {
        return passengerDao.getAllPassengers();
    }

    @Override
    public Passenger getPassengerById(int id) {
        return passengerDao.getPassengerById(id);
    }

    @Override
    public void addPassenger(Passenger passenger) {
        passengerDao.addPassenger(passenger);
    }

    @Override
    public void updatePassenger(Passenger passenger) {
        passengerDao.updatePassenger(passenger);
    }

    @Override
    public void deletePassenger(int id) {
        passengerDao.deletePassenger(id);
    }
}
