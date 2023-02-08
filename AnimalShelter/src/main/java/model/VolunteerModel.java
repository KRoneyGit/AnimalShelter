package model;

/**
* @author Kevin Roney - karoney
* CIS 175 - Fall 2023
* Feb 7, 2023
*/
public class VolunteerModel {
	private String volunteerName;
	private double totalHours;
	private String volunteerDays;
	private double dailyHours;
	
	public VolunteerModel() {
		super();
	}
	public VolunteerModel(String name, double hours, String days) {
		this.volunteerName = name;
		this.totalHours = hours;
		this.volunteerDays = days;
		this.setDailyHours();
	}
	
	public String getVolunteerName() {
		return volunteerName;
	}
	public void setVolunteerName(String volunteerName) {
		this.volunteerName = volunteerName;
	}
	public double getTotalHours() {
		return totalHours;
	}
	public void setTotalHours(double totalHours) {
		this.totalHours = totalHours;
	}
	public String getVolunteerDays() {
		return volunteerDays;
	}
	public void setVolunteerDays(String volunteerDays) {
		this.volunteerDays = volunteerDays;
	}
	public double getDailyHours() {
		return dailyHours;
	}
	public void setDailyHours() {
		if (this.volunteerDays.equals("weekdays")) {
			this.dailyHours = this.totalHours / 5;
		}
		else if (this.volunteerDays.equals("weekend")) {
			this.dailyHours = this.totalHours / 2;
		}
		else {
			this.dailyHours = this.totalHours / 7;
		}
		this.dailyHours = Math.round(this.dailyHours * 10);
		this.dailyHours = this.dailyHours / 10;
	}
	@Override
	public String toString() {
		return "VolunteerModel [volunteerName=" + volunteerName + ", totalHours=" + totalHours + ", volunteerDays="
				+ volunteerDays + ", dailyHours=" + dailyHours + "]";
	}
	
		
}
