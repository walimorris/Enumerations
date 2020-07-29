package com.morris.jobs;

public enum FlightCrewJob {
    FLIGHT_ATTENDANT("Flight Attendant"),
    COPILOT("First Officer"),
    PILOT("Captain");

    private String title;

    private FlightCrewJob(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
