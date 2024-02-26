package com.curam.benefits.app.model;

import lombok.Data;

@Data
public class UAApplicationProgramStatus {
	public boolean hasPendingWithdrawalRequest = false;
	public UASubmittedApplicationStatus status=new UASubmittedApplicationStatus();
	public String withdrawalRequestStatusMessage ;
	public boolean canBeWithdrawn = false;

}
