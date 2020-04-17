package com.xworkz.XworkzHoliday.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "IPL_details")
	public class IPLEntity implements Serializable {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "IPL_id")
	private int id;
	@Column(name = "Team_Name")	
	private String TeamName;
	@Column(name = "Franchice_Owner")
	private String FranchiceOwner;
	@Column(name = "Team_Captain")
	private String TeamCaptain;
	@Column(name = "place")
	private String place;
	public IPLEntity() {
	System.out.println("created \t"+this.getClass().getSimpleName());
	}
	public IPLEntity(String teamName, String franchiceOwner, String teamCaptain, String place) {
		super();
		this.TeamName = teamName;
		this.FranchiceOwner = franchiceOwner;
		this.TeamCaptain = teamCaptain;
		this.place = place;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeamName() {
		return TeamName;
	}
	public void setTeamName(String teamName) {
		TeamName = teamName;
	}
	public String getFranchiceOwner() {
		return FranchiceOwner;
	}
	public void setFranchiceOwner(String franchiceOwner) {
		FranchiceOwner = franchiceOwner;
	}
	public String getTeamCaptain() {
		return TeamCaptain;
	}
	public void setTeamCaptain(String teamCaptain) {
		TeamCaptain = teamCaptain;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "IPLEntity [id=" + id + ", TeamName=" + TeamName + ", FranchiceOwner=" + FranchiceOwner
				+ ", TeamCaptain=" + TeamCaptain + ", place=" + place + "]";
	}
}
	
	