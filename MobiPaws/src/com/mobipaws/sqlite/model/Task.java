package com.mobipaws.sqlite.model;

public class Task {
	
	long id;
	String petSitterFirstName;
	String petSitterLastName;
	String petSitterVisitDate;
	String petSitterVisitTime;
	String petSitterNotes;
	
	//constructors
	public Task(){
		
	}
	public Task(long id, String petSitterFirstName, String petSitterLastName, String petSitterVisitDate,
			String petSitterVisitTime, String petSitterNotes){
		
		this.id = id;
		this.petSitterFirstName = petSitterFirstName;
		this.petSitterLastName = petSitterLastName;
		this.petSitterVisitDate = petSitterVisitDate;
		this.petSitterVisitTime = petSitterVisitTime;
		this.petSitterNotes = petSitterNotes;
		
	}
	
	//set methods
	public void setId(long id){
		this.id = id;
	}
	public void setPetSitterFirstName(String petSitterFirstName){
		this.petSitterFirstName = petSitterFirstName;
	}
	public void setPetSitterLastName(String petSitterLastName){
		this.petSitterLastName = petSitterLastName;
	}
	public void setPetSitterVisitDate(String petSitterVisitDate){
		this.petSitterVisitDate = petSitterVisitDate;
	}
	public void setPetSitterVisitTime(String petSitterVisitTime){
		this.petSitterVisitTime = petSitterVisitTime;
	}
	public void setPetSitterNotes(String petSitterNotes){
		this.petSitterNotes = petSitterNotes;
	}
	
	//get methods
	public long getId(){
		return this.id;
	}
	public String getPetSitterFirstName(){
		return this.petSitterFirstName;
	}
	public String getPetSitterLastName(){
		return this.petSitterLastName;
	}
	public String getPetSitterNotes(){
		return this.petSitterNotes;
	}
	
	

}
