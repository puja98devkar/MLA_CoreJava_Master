package com.learning.core.day2session2;

public class CricketRating {
    private String playerName;
    private float critic1;
    private float critic2;
    private float critic3;
    private float avgRating;
    private String Coins;
 
    public CricketRating(String playerName, float critic1, float critic2, float critic3) {
        this.playerName = playerName;
        this.setCritic1(critic1);
        this.setCritic2(critic2);
        this.setCritic3(critic3);
        this.avgRating = 0.0f; // Initialize to 0.0
        this.Coins = ""; // Initialize to empty string
    }
 
    public void calculateAverageRating(float critic1, float critic2) {
        this.avgRating = (critic1 + critic2) / 2.0f;
        try {
            this.Coins = calculateCoins();
        } catch (NotEligibleException e) {
            System.out.println(e.getMessage());
        }
    }
 
    public void calculateAverageRating(float critic1, float critic2, float critic3) {
        this.avgRating = (critic1 + critic2 + critic3) / 3.0f;
        try {
            this.Coins = calculateCoins();
        } catch (NotEligibleException e) {
            System.out.println(e.getMessage());
        }
    }
 
    public String calculateCoins() throws NotEligibleException {
        if (this.avgRating >= 7) {
            return "gold coin";
        } else if (this.avgRating >= 5) {
            return "silver coin";
        } else if (this.avgRating >= 2) {
            return "copper Coin";
        } else {
            throw new NotEligibleException("Player " + this.playerName + " is not eligible for any coins.");
        }
    }
 
    public void display() {
        System.out.println("Player Name: " + this.playerName);
        System.out.println("Average Rating: " + this.avgRating);
        System.out.println("Coins: " + this.Coins);
    }

	public float getCritic1() {
		return critic1;
	}

	public void setCritic1(float critic1) {
		this.critic1 = critic1;
	}

	public float getCritic2() {
		return critic2;
	}

	public void setCritic2(float critic2) {
		this.critic2 = critic2;
	}

	public float getCritic3() {
		return critic3;
	}

	public void setCritic3(float critic3) {
		this.critic3 = critic3;
	}
}