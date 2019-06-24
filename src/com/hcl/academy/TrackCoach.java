package com.hcl.academy;

public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Drink water while running";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
