/**
* Name：Lucas LU
* Date: May 17
* Description: the subclass of Club class
*/

import java.util.*;

public class AcademicClub extends Club {
   //attributes
	private String subjectCategory;
	private String clubSocialMediaLink;
	private String clubDescription;

   //constructor
	public AcademicClub(int memberCount, boolean isInPerson, ArrayList<String> meetingDate, double fees, double budget, ArrayList<ExecutiveMember> execs,
						String topic, ArrayList<GeneralMember> generalMember, TeacherSupervisor teacherSupervisor, ArrayList<Event> event, 
						String subjectCategory, String clubSocialMediaLink, String clubDescription) {
		super(memberCount, isInPerson, meetingDate, fees, budget, execs, topic, generalMember, teacherSupervisor, event);
		this.subjectCategory = subjectCategory;
		this.clubDescription = clubDescription;
		this.clubSocialMediaLink = clubSocialMediaLink;
	}

	public AcademicClub() {
		this.subjectCategory = "";
		this.clubSocialMediaLink = "";
		this.clubDescription = "";
	}

   //getters
	public String getSubjectCategory() {
		return this.subjectCategory;
	}

	public String getClubDescription() {
		return this.clubDescription;
	}

	public String getClubSocialMediaLink() {
		return this.clubSocialMediaLink;
	}

  //setters
	public void setSubjectCategory(String newCategory) {
		subjectCategory = newCategory;
	}

	public void setclubSocialMediaLink(String newLink) {
		clubSocialMediaLink = newLink;
	}

	public void setClubDescription(String newDescription) {
		clubDescription = newDescription;
	}

   //toString()
	public String toString() {
		return super.toString() + "subjectCategory: " + subjectCategory + "\nclubDescription: " + clubDescription
				+ "\nclubSocialMediaLink: " + clubSocialMediaLink;
	}
}
