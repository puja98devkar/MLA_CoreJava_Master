package com.learning.core.day2session2;

public class D02P0602 {
    public static void main(String[] args) {
        CricketRating player1 = new CricketRating("John Doe", 8.0f, 7.5f, 9.0f);
        player1.calculateAverageRating(player1.getCritic1(), player1.getCritic2(), player1.getCritic3());
        player1.display();
 
        CricketRating player2 = new CricketRating("Jane Doe", 4.0f, 3.5f, 2.0f);
        player2.calculateAverageRating(player2.getCritic1(), player2.getCritic2()); // Using the method with 2 critics
        player2.display();
 
        // Handling a player not eligible for coins
        CricketRating player3 = new CricketRating("Chris Smith", 1.0f, 1.5f, 1.8f);
        player3.calculateAverageRating(player3.getCritic1(), player3.getCritic2(), player3.getCritic3());
        player3.display();
    }
}