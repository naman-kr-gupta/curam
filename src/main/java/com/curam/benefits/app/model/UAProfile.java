package com.curam.benefits.app.model;

import java.util.List;

import lombok.Data;

@Data
public class UAProfile {
	
	public long person_id ;
	public String userName;
	public String dateOfBirth;
	public String fullName;
	public String photo;
	public List<UARegisteredPersonDetails> registeredPersonDetails;
	

}
