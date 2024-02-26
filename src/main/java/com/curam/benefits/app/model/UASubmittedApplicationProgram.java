package com.curam.benefits.app.model;



import lombok.Data;
@Data
public class UASubmittedApplicationProgram {
	public String name = "";
	public long application_program_id = 0L;
	public long case_id = 0L;
	public int benefitAmount = 0;
	public String certPeriod = "";
	public UAApplicationProgramStatus programStatusDetails = new UAApplicationProgramStatus();
}
