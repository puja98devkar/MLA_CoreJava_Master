package com.example.passengerapp.service;

import com.example.passengerapp.dao.PassengerDao;
import com.example.passengerapp.model.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PassengerServiceImpl implements PassengerService {

	 private final PassengerDao passengerDao;

	    @Autowired
	    public PassengerServiceImpl(@Qualifier("passengerDao") PassengerDao passengerDao) {
	        this.passengerDao = passengerDao;
	    }


    @Override
    @Transactional
    public void addPassenger(Passenger passenger) {
        passengerDao.addPassenger(passenger);
    }

    @Override
    @Transactional
    public void updatePassenger(Passenger passenger) {
        passengerDao.updatePassenger(passenger);
    }

    @Override
    @Transactional
    public Passenger getPassengerById(int id) {
        return passengerDao.getPassengerById(id);
    }

    @Override
    @Transactional
    public List<Passenger> getAllPassengers() {
        return passengerDao.getAllPassengers();
    }

    @Override
    @Transactional
    public void deletePassenger(int id) {
        passengerDao.deletePassenger(id);
    }
}
