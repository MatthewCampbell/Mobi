package com.mobipaws.sqlite.model;

public class Pet {
	
	long id;
	String petName;
	String petType;
	String petGender;
	String ownerFirstName;
	String ownerLastName;
	String petAddress;
	String ownerPhone;
	String serviceType;
	String serviceStart;
	String serviceEnd;
	String comments;
	
	//constructors
	public Pet(){
		
	}
	public Pet(long id, String petName, String petType, String petGender, String ownerFirstName, String ownerLastName,
			String petAddress, String ownerPhone, String serviceType, String serviceStart, String serviceEnd, String comments){
		 
		this.id = id;
		this.petName = petName;
		this.petType = petType;
		this.petGender = petGender;
		this.ownerFirstName = ownerFirstName;
		this.ownerLastName = ownerLastName;
		this.petAddress = petAddress;
		this.ownerPhone = ownerPhone;
		this.serviceType = serviceType;
		this.serviceStart = serviceStart;
		this.serviceEnd = serviceEnd;
		this.comments = comments;
	}
	
	//set methods
	public void setId(long id){
		this.id = id;
	}
	public void setPetName(String petName){
		this.petName = petName;
	}
	public void setPetType(String petType){
		this.petType = petType;
	}
	public void setPetGender(String petGender){
		this.petGender = petGender;
	}
	public void setOwnerFirstName(String ownerFirstName){
		this.ownerFirstName = ownerFirstName;
	}
	public void setOwnerLastName(String ownerLastName){
		this.ownerLastName = ownerLastName;
	}
	public void setPetAddress(String petAddress){
		this.petAddress = petAddress;
	}
	public void setOwnerPhone(String ownerPhone){
		this.ownerPhone = ownerPhone;
	}
	public void setServiceType(String serviceType){
		this.serviceType = serviceType;
	}
	public void setServiceStart(String serviceStart){
		this.serviceStart = serviceStart;
	}
	public void setServiceEnd(String serviceEnd){
		this.serviceEnd = serviceEnd;
	}
	public void setComments(String comments){
		this.comments = comments;
	}
	
	//get methods
	public long getId(){
		return this.id;
	}
	public String getPetName(){
		return this.petName;
	}
	public String getPetType(){
		return this.petType;
	}
	public String getPetGender(){
		return this.petGender;
	}
	public String getOwnerFirstName(){
		return this.ownerFirstName;
	}
	public String getOwnerLastName(){
		return this.ownerLastName;
	}
	public String getPetAddress(){
		return this.petAddress;
	}
	public String getOwnerPhone(){
		return this.ownerPhone;
	}
	public String getServiceType(){
		return this.serviceType;
	}
	public String getServiceStart(){
		return this.serviceStart;
	}
	public String getServiceEnd(){
		return this.serviceEnd;
	}
	public String getComments(){
		return this.comments;
	}

}
