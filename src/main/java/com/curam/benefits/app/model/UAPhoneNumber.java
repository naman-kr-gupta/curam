package com.curam.benefits.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
class UAPhoneNumber {
	
	public long phone_number_id = 0L;
	public String areaCode = "";
	public String countryCode = "";
	public String extension = "";
	public String number = "";
	public String type = "";

}
