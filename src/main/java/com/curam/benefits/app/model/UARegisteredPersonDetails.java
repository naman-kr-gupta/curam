package com.curam.benefits.app.model;



import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UARegisteredPersonDetails {
	
	public UAAddress addresses;
	public String emailAddresses;
	public long identifications;
	public long phoneNumbers;
	public String gender;
}
