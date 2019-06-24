package com.hcl.academy;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("Inside the setter injector");
    }

    @Override
    public String getDailyWorkout() {
        return "Run 5km daily";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
