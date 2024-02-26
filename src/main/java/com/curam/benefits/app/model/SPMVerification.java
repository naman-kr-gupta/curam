package com.curam.benefits.app.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class SPMVerification {
	
	 private long verificationId = 0L;
	 public String status = "";
	 public String dueDate = "";
	 public boolean mandatory = false;
	 public String category = "";
	 public boolean clientProvided = false;
	 public final List<String> acceptedProofs = new ArrayList<>();
	 public final List<SPMFileUploadContents> providedFiles = new ArrayList<>();
	 public String relatedCase = "";
	 public String relatedPerson = "";
//	 public final List<String> requiredProofs = new ArrayList<>();
	 
	 public SPMVerification(){
		 this.acceptedProofs.add("Employment Records");
		 this.acceptedProofs.add("Driving License");
		 this.acceptedProofs.add("Copy of Social Security Card");
		 this.acceptedProofs.add("U.S. birth certificate");
		 this.acceptedProofs.add("Rent Receipt");
		 this.acceptedProofs.add("Tax records");
		 this.acceptedProofs.add("U.S Passport Card");
	 }

}
