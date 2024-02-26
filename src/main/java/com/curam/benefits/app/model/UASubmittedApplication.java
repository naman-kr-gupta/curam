package com.curam.benefits.app.model;


import java.util.List;

import lombok.Data;
@Data
public class UASubmittedApplication {
	public long application_id;
	public String submittedOn;
	public String name;
	public UASubmittedApplicationStatus status;
	public List<UASubmittedApplicationProgram> applicationPrograms;
	

}
