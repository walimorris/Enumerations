package com.morris.jobs;

public class Main {

    public static void main(String[] args) {
		FlightCrewJob job1 = FlightCrewJob.COPILOT;
		FlightCrewJob job2 = FlightCrewJob.FLIGHT_ATTENDANT;
		FlightCrewJob job3 = FlightCrewJob.PILOT;
		FlightCrewJob[] jobs = {job1, job2, job3};

		displayJobResponsibilities(jobs);

		CrewMember answar = new CrewMember(FlightCrewJob.COPILOT, "Answar");
		CrewMember julian = new CrewMember(FlightCrewJob.PILOT, "Julian");
		CrewMember manager = getRankingMember(answar, julian);
		System.out.println(manager.getJob().getTitle() + " " + manager.getName() + " is ranking flight memeber.");
	}

	public static void displayJobResponsibilities(FlightCrewJob[] jobs) {
    	for ( FlightCrewJob job : jobs ) {
			switch (job) {
				case PILOT:
					System.out.println("Flies airplane from point A to point B");
					break;
				case COPILOT:
					System.out.println("Assist Pilot in flying from point A to point B");
					break;
				case FLIGHT_ATTENDANT:
					System.out.println("Assures passenger safty and comfort");
					break;
			}
		}

    }

    public static CrewMember getRankingMember(CrewMember member1, CrewMember member2) {
    	CrewMember manager = member1.getJob().compareTo(member2.getJob()) > 0 ? member1 : member2;
    	return manager;
	}
}
