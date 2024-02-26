package com.curam.benefits.app.model;

import lombok.Data;

@Data
public class UAAddress {

	public long address_id = 0L;
	public String address;
	public String type;
	public UAAddressDetails addressDetails = new UAAddressDetails();
   
}
