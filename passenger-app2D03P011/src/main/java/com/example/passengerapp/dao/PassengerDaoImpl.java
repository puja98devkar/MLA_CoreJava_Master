package com.example.passengerapp.dao;

import com.example.passengerapp.model.Passenger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PassengerDaoImpl implements PassengerDao {

    private final JdbcTemplate jdbcTemplate;

    public PassengerDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addPassenger(Passenger passenger) {
        String sql = "INSERT INTO passengers (id, name, dob, phone, email) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, passenger.getId(), passenger.getName(), passenger.getDob(), passenger.getPhone(), passenger.getEmail());

        // Log the inserted passenger to the console
        System.out.println("Added Passenger: " + passenger);
    }

    @Override
    public void updatePassenger(Passenger passenger) {
        String sql = "UPDATE passengers SET name = ?, dob = ?, phone = ?, email = ? WHERE id = ?";
        jdbcTemplate.update(sql, passenger.getName(), passenger.getDob(), passenger.getPhone(), passenger.getEmail(), passenger.getId());

        // Log the updated passenger to the console
        System.out.println("Updated Passenger: " + passenger);
    }

    @Override
    public Passenger getPassengerById(int id) {
        String sql = "SELECT * FROM passengers WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new PassengerMapper());
    }

    @Override
    public List<Passenger> getAllPassengers() {
        String sql = "SELECT * FROM passengers";
        return jdbcTemplate.query(sql, new PassengerMapper());
    }

    @Override
    public void deletePassenger(int id) {
        String sql = "DELETE FROM passengers WHERE id = ?";
        jdbcTemplate.update(sql, id);

        // Log the deleted passenger ID to the console
        System.out.println("Deleted Passenger with ID: " + id);
    }

    private static class PassengerMapper implements RowMapper<Passenger> {
        @Override
        public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
            Passenger passenger = new Passenger();
            passenger.setId(rs.getInt("id"));
            passenger.setName(rs.getString("name"));
            passenger.setDob(rs.getString("dob"));
            passenger.setPhone(rs.getString("phone"));
            passenger.setEmail(rs.getString("email"));
            return passenger;
        }
    }
}
