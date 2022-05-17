/**
* Name: Lucas Lu
* Date: May 17
* Description: subclass of Club class
*/

import java.util.*;

public class SportsTeam extends Club {
   //attributes
	private String sportCategory;
	private int teamNumber;
	private String teamName;
	private double playerAvgHeight;
	private String teamSupervisorName;

   //empty constructor
	public SportsTeam() {
		this.sportCategory = "";
		this.teamNumber = -1;
		this.teamName = "";
		this.playerAvgHeight = -1;
	}

	public SportsTeam(int memberCount, boolean isInPerson, ArrayList<String> meetingDate, double fees, double budget,
			ArrayList<ExecutiveMember> execs, String topic, ArrayList<GeneralMember> generalMember,
			TeacherSupervisor teacherSupervisor, ArrayList<Event> event, String sportCategory, int teamNumber,
			String teamName, double playerAvgHeight, String teamSupervisorName) {
		super(memberCount, isInPerson, meetingDate, fees, budget, execs, topic, generalMember, teacherSupervisor,
				event);
		this.sportCategory = sportCategory;
		this.teamNumber = teamNumber;
		this.teamName = teamName;
		this.playerAvgHeight = playerAvgHeight;
		this.teamSupervisorName = teamSupervisorName;
	}

   //getters
	public String getSportCategory() {
		return this.sportCategory;
	}

	public int getTeamNumber() {
		return this.teamNumber;
	}

	public String getTeamName() {
		return this.teamName;
	}

	public double getPlayerAvgHeight() {
		return this.playerAvgHeight;
	}

   //setters
	public void setSportCategory(String newCategory) {
		sportCategory = newCategory;
	}

	public void setTeamNumber(int newTeamNumber) {
		teamNumber = newTeamNumber;
	}

	public void setTeamName(String newName) {
		teamName = newName;
	}

	public void setPlayerAvgHeight(double newAvg) {
		playerAvgHeight = newAvg;
	}

   //toString()
	public String toString() {
		return super.toString() + "\nsportCategory: " + sportCategory + "\nteamNumber: " + teamNumber + "\nteamName: "
				+ teamName + "\nplayerAvgHeight: " + playerAvgHeight + "\nteamSupervisorName: " + teamSupervisorName;
	}
}
