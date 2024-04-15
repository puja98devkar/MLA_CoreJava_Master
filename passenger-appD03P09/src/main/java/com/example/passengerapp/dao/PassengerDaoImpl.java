package com.example.passengerapp.dao;

import com.example.passengerapp.model.Passenger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PassengerDaoImpl implements PassengerDao {

    private JdbcTemplate jdbcTemplate;

    public PassengerDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Passenger> getAllPassengers() {
        String sql = "SELECT * FROM Passenger";
        return jdbcTemplate.query(sql, new PassengerRowMapper());
    }

    @Override
    public Passenger getPassengerById(int id) {
        String sql = "SELECT * FROM Passenger WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new PassengerRowMapper(), id);
    }

    @Override
    public void addPassenger(Passenger passenger) {
        String sql = "INSERT INTO Passenger (id, name, dob, phone, email) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, passenger.getId(), passenger.getName(), passenger.getDob(), passenger.getPhone(), passenger.getEmail());
    }

    @Override
    public void updatePassenger(Passenger passenger) {
        String sql = "UPDATE Passenger SET name = ?, dob = ?, phone = ?, email = ? WHERE id = ?";
        jdbcTemplate.update(sql, passenger.getName(), passenger.getDob(), passenger.getPhone(), passenger.getEmail(), passenger.getId());
    }

    @Override
    public void deletePassenger(int id) {
        String sql = "DELETE FROM Passenger WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    // RowMapper for Passenger object
    private static class PassengerRowMapper implements RowMapper<Passenger> {
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
