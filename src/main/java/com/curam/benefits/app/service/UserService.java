package com.curam.benefits.app.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.curam.benefits.app.model.SPMFileUploadContents;
import com.curam.benefits.app.model.SPMVerification;
import com.curam.benefits.app.model.UAProfile;
import com.curam.benefits.app.model.UARegisteredPersonDetails;
import com.curam.benefits.app.model.UASubmittedApplication;
import com.curam.benefits.app.model.UASubmittedApplicationProgram;
import com.curam.benefits.app.model.UASubmittedApplicationStatus;

import lombok.Data;



@Service
@Data
public class UserService {

	List<SPMVerification> verificationsList = new ArrayList<>();

	Map<String,UAProfile> map=new HashMap<>();
	Map<String,UASubmittedApplication> map1=new HashMap<>();
	
	public UserService() {
		SPMVerification sv = new SPMVerification();
		sv.setVerificationId(5052827675677163520L);
		sv.setStatus("Not Submitted");//Not Verified, Cancelled
		sv.setCategory("Citizen Status Code");//Income, Employment, Expense
		sv.setRelatedPerson("amanda01");
		sv.setDueDate("05/03/2024");
		sv.setRelatedCase("3163286157018529792");
		verificationsList.add(sv);
		
		SPMVerification sv1 = new SPMVerification();
		sv1.setVerificationId(8764919668537294848L);
		sv1.setStatus("Not Submitted");//Not Verified, Cancelled
		sv1.setCategory("Income Type");//Income, Employment, Expense
		sv1.setRelatedPerson("amanda01");
		sv1.setDueDate("05/03/2024");
		sv1.setRelatedCase("3163286157018529792");
		verificationsList.add(sv1);
		
		SPMVerification sv2 = new SPMVerification();
		sv2.setVerificationId(208080376533352448L);
		sv2.setStatus("Not Submitted");//Not Verified, Cancelled
		sv2.setCategory("State Residency");//Income, Employment, Expense
		sv2.setRelatedPerson("amanda01");
		sv2.setDueDate("05/03/2024");
		sv2.setRelatedCase("3163286157018529792");
		verificationsList.add(sv2);
		
		SPMVerification sv3 = new SPMVerification();
		sv3.setVerificationId(3381429263969288192L);
		sv3.setStatus("Submitted");//Not Verified, Cancelled
		sv3.setCategory("SSNID");//Income, Employment, Expense
		sv3.setRelatedPerson("amanda01");
		sv3.setDueDate("05/03/2024");
		sv3.setRelatedCase("3163286157018529792");
		verificationsList.add(sv3);
		
		
		
		SPMVerification sv4 = new SPMVerification();
		sv4.setVerificationId(2269603105962196992L);
		sv4.setStatus("Not Submitted");//Not Verified, Cancelled
		sv4.setCategory("Citizen Status Code");//Income, Employment, Expense
		sv4.setRelatedPerson("amanda02");
		sv4.setDueDate("05/03/2024");
		sv4.setRelatedCase("8715686157018529792");
		verificationsList.add(sv4);
		
		SPMVerification sv5 = new SPMVerification();
		sv5.setVerificationId(2939513550533558272L);
		sv5.setStatus("Submitted");//Not Verified, Cancelled
		sv5.setCategory("Income Type");//Income, Employment, Expense
		sv5.setRelatedPerson("amanda02");
		sv5.setDueDate("05/03/2024");
		sv5.setRelatedCase("8715686157018529792");
		verificationsList.add(sv5);
		
		SPMVerification sv6 = new SPMVerification();
		sv6.setVerificationId(4731946202227015680L);
		sv6.setStatus("Not Submitted");//Not Verified, Cancelled
		sv6.setCategory("State Residency");//Income, Employment, Expense
		sv6.setRelatedPerson("amanda02");
		sv6.setDueDate("05/03/2024");
		sv6.setRelatedCase("8715686157018529792");
		verificationsList.add(sv6);
		
		SPMVerification sv7 = new SPMVerification();
		sv7.setVerificationId(5061271924978483200L);
		sv7.setStatus("Submitted");//Not Verified, Cancelled
		sv7.setCategory("SSNID");//Income, Employment, Expense
		sv7.setRelatedPerson("amanda02");
		sv7.setDueDate("05/03/2024");
		sv7.setRelatedCase("8715686157018529792");
		verificationsList.add(sv7);
		
		
		SPMVerification sv8 = new SPMVerification();
		sv8.setVerificationId(701787485683843072L);
		sv8.setStatus("Submitted");//Not Verified, Cancelled
		sv8.setCategory("Citizen Status Code");//Income, Employment, Expense
		sv8.setRelatedPerson("amanda03");
		sv8.setDueDate("03/01/2024");
		sv8.setRelatedCase("4523686157018529792L");
		verificationsList.add(sv8);
		
		SPMVerification sv9 = new SPMVerification();
		sv9.setVerificationId(5885430656787283968L);
		sv9.setStatus("Submitted");//Not Verified, Cancelled
		sv9.setCategory("Income Type");//Income, Employment, Expense
		sv9.setRelatedPerson("amanda03");
		sv9.setDueDate("03/01/2024");
		sv9.setRelatedCase("4523686157018529792L");
		verificationsList.add(sv9);
		
		SPMVerification sv10 = new SPMVerification();
		sv10.setVerificationId(4468485624025841664L);
		sv10.setStatus("Submitted");//Not Verified, Cancelled
		sv10.setCategory("State Residency");//Income, Employment, Expense
		sv10.setRelatedPerson("amanda03");
		sv10.setDueDate("03/01/2024");
		sv10.setRelatedCase("4523686157018529792L");
		verificationsList.add(sv10);
		
		SPMVerification sv11 = new SPMVerification();
		sv11.setVerificationId(4181381147780972544L);
		sv11.setStatus("Submitted");//Not Verified, Cancelled
		sv11.setCategory("SSNID");//Income, Employment, Expense
		sv11.setRelatedPerson("amanda03");
		sv11.setDueDate("03/01/2024");
		sv11.setRelatedCase("4523686157018529792L");
		verificationsList.add(sv11);
	}

	 @PostConstruct
	 public void createData(){

		 UAProfile profiles=new UAProfile() ;
		 UAProfile profiles1=new UAProfile() ;
		 UAProfile profiles2=new UAProfile() ;


		 profiles.person_id=3163286157018529792L;
		 profiles.dateOfBirth="1990-01-01";
		 profiles.fullName="Naman Gupta";
		 profiles.userName="amanda01";

		 UARegisteredPersonDetails ud = new UARegisteredPersonDetails();
		 ud.setEmailAddresses("ngupta1@gmail.com");
		 ud.setIdentifications(111111111L);
		 ud.setPhoneNumbers(8765373661L);
		 ud.setGender("male");
		 List<UARegisteredPersonDetails>  udrray = new ArrayList<UARegisteredPersonDetails>();
		 udrray.add(ud);
		 profiles.setRegisteredPersonDetails(udrray);
		 System.out.println("Controller");

		 profiles1.person_id=8715686157018529792L;
		 profiles1.dateOfBirth="1990-01-02";
		 profiles1.fullName="Amanda Smith";
		 profiles1.userName="amanda02";

		 UARegisteredPersonDetails ud1 = new UARegisteredPersonDetails();
		 ud1.setEmailAddresses("amanda02@gmail.com");
		 ud1.setIdentifications(222222222L);
		 ud1.setPhoneNumbers(9975373661L);
		 ud1.setGender("female");
		 List<UARegisteredPersonDetails>  udrray1 = new ArrayList<UARegisteredPersonDetails>();
		 udrray1.add(ud1);
		 profiles1.setRegisteredPersonDetails(udrray1);
		 
		 profiles2.person_id=4523686157018529792L;
		 profiles2.dateOfBirth="1990-01-02";
		 profiles2.fullName="Milan Borges";
		 profiles2.userName="amanda03";

		 UARegisteredPersonDetails ud2 = new UARegisteredPersonDetails();
		 ud2.setEmailAddresses("amanda03@gmail.com");
		 ud2.setIdentifications(333333333L);
		 ud2.setPhoneNumbers(8885373661L);
		 ud2.setGender("male");
		 List<UARegisteredPersonDetails>  udrray2 = new ArrayList<UARegisteredPersonDetails>();
		 udrray2.add(ud2);
		 profiles2.setRegisteredPersonDetails(udrray2);
		 System.out.println("Controller");
		 map.put("amanda01",profiles);
		 map.put("amanda02",profiles1);
		 map.put("amanda03",profiles2);
	 }
	 @PostConstruct
	 public void submittedApplicationData() {
		
		List< UASubmittedApplicationProgram> subAppprgm=new ArrayList<UASubmittedApplicationProgram>();
		
		 UASubmittedApplication subap=new UASubmittedApplication();
		 subap.application_id=-123980650299382L;
		 subap.submittedOn="2024-02-16T08:53:38.000+0000";
		 subap.name="Health Care Application";
		 UASubmittedApplicationStatus sts=new UASubmittedApplicationStatus();
		 sts.tableName="IntakeApplicationStatus";
		 sts.value="IAST1001";
		 sts.description="SUBMITTED";
		 subap.setStatus(sts);
		 UASubmittedApplicationProgram appPrgm=new UASubmittedApplicationProgram();
		 appPrgm.setName("Insurance Assistance");
		 appPrgm.setApplication_program_id(-2444159265201651333L);
		 appPrgm.setCase_id(-7798274453277507544L);
		 appPrgm.setBenefitAmount(2500);
		 appPrgm.setCertPeriod("12/01/2024");
		 
		 appPrgm.programStatusDetails.setHasPendingWithdrawalRequest(false);
		 appPrgm.programStatusDetails.status.setTableName("IntakeProgApplStatus");
		 appPrgm.programStatusDetails.status.setValue("IPAS1003");
		 appPrgm.programStatusDetails.status.setDescription("PROCESSED");
		 appPrgm.programStatusDetails.setWithdrawalRequestStatusMessage(null);
		 appPrgm.programStatusDetails.setCanBeWithdrawn(false);
		 
		 subAppprgm.add(appPrgm);
		 subap.setApplicationPrograms(subAppprgm);
		 
		 
			List< UASubmittedApplicationProgram> subAppprgm1=new ArrayList<UASubmittedApplicationProgram>();
			
			 UASubmittedApplication subap1=new UASubmittedApplication();
			 subap1.application_id=-88839806502993345L;
			 subap1.submittedOn="2024-02-14T05:53:38.000+0000";
			 subap1.name="Health Care Application";
			 UASubmittedApplicationStatus sts1=new UASubmittedApplicationStatus();
			 sts1.tableName="IntakeApplicationStatus";
			 sts1.value="IAST1002";
			 sts1.description="PROCESSED";
			 subap1.setStatus(sts1);
			 UASubmittedApplicationProgram appPrgm1=new UASubmittedApplicationProgram();
			 appPrgm1.setName("Medical Assistance");
			 appPrgm1.setApplication_program_id(-8654159265201651712L);
			 appPrgm1.setCase_id(-8798274453277507584L);
			 appPrgm1.setBenefitAmount(5000);
		 	 appPrgm1.setCertPeriod("12/01/2025");
			 
			 appPrgm1.programStatusDetails.setHasPendingWithdrawalRequest(false);
			 appPrgm1.programStatusDetails.status.setTableName("IntakeProgApplStatus");
			 appPrgm1.programStatusDetails.status.setValue("IPAS1003");
			 appPrgm1.programStatusDetails.status.setDescription("PROCESSED");
			 appPrgm1.programStatusDetails.setWithdrawalRequestStatusMessage("");
			 appPrgm1.programStatusDetails.setCanBeWithdrawn(false);
			 
			 subAppprgm1.add(appPrgm1);
			 subap1.setApplicationPrograms(subAppprgm1);
		 
		 
		 map1.put("amanda02",subap1);
		 
			List< UASubmittedApplicationProgram> subAppprgm2=new ArrayList<UASubmittedApplicationProgram>();
			
			 
			//UASubmittedApplicationList submittedApList =new UASubmittedApplicationList();
			 UASubmittedApplication subap2=new UASubmittedApplication();
			 subap2.application_id=-9223580650299892L;
			 subap2.submittedOn="2024-01-06T09:53:38.000+0000";
			 subap2.name="Health Care Application";
			 UASubmittedApplicationStatus sts2=new UASubmittedApplicationStatus();
			 sts2.tableName="IntakeApplicationStatus";
			 sts2.value="IAST1004";
			 sts2.description="CLOSED";
			 subap2.setStatus(sts2);
			 UASubmittedApplicationProgram appPrgm2=new UASubmittedApplicationProgram();
			 appPrgm2.setName("Insurance Affordability");
			 appPrgm2.setApplication_program_id(-8654159265201651712L);
			 appPrgm2.setCase_id(-8798274453277507584L);
			 appPrgm2.setBenefitAmount(1000);
			 appPrgm2.setCertPeriod("06/01/2025");
			 
			 appPrgm2.programStatusDetails.setHasPendingWithdrawalRequest(false);
			 appPrgm2.programStatusDetails.status.setTableName("IntakeProgApplStatus");
			 appPrgm2.programStatusDetails.status.setValue("IAST1004");
			 appPrgm2.programStatusDetails.status.setDescription("CLOSED");
			 appPrgm2.programStatusDetails.setWithdrawalRequestStatusMessage(null);
			 appPrgm2.programStatusDetails.setCanBeWithdrawn(false);
			 
			 subAppprgm2.add(appPrgm2);
			 subap2.setApplicationPrograms(subAppprgm2);
		 
		 
		 map1.put("amanda01",subap);
		 map1.put("amanda02",subap1);
		 map1.put("amanda03",subap2);
		 
	 }

	
    public UASubmittedApplication readSubmittedAppDetails( String userName) {

		 return map1.getOrDefault(userName,new UASubmittedApplication());
		
	}
    
    public UAProfile readUserProfile( String userName) {

		 return map.getOrDefault(userName,new UAProfile());
		
	}
	public List<SPMVerification> getVerifications(String userName) {
		List<SPMVerification> resverificationsList = new ArrayList<>();
		
		for(SPMVerification verification: this.verificationsList) {
			if(userName.equals(verification.getRelatedPerson()))
				resverificationsList.add(verification);
		}
		
//		if(userName.equals("amanda01") ) {
////			resverificationsList = this.verificationsList.get(0);
//		}
//		if(userName.equals("amanda02")) {
//			
//		}
//		if(userName.equals("amanda03")) {
//			
//		}
		return resverificationsList;
	}
	public void uploadFiles(String userName, Long verificationId, SPMFileUploadContents fileDetails) {
		for(SPMVerification verification: this.verificationsList) {
			if(userName.equals(verification.getRelatedPerson()) && verificationId.equals(verification.getVerificationId())) {
				verification.getProvidedFiles().add(fileDetails);
			}
		}
	}

	public List<String> getNotifications(String userName) {
		List<String> notifications = new ArrayList<>();
		if(userName.equals("amanda01") ) {
			notifications.add("Income proof received and approved");
			notifications.add("Please attach SSN proofs");
			notifications.add("Please attach Income proofs");
			notifications.add("Application received");
		}
		if(userName.equals("amanda02")) {
			notifications.add("Please attach Income proofs");
			notifications.add("Application received");
		}
		if(userName.equals("amanda03")) {
			notifications.add("Application closed");
			notifications.add("Citizen proof received and approved");
			notifications.add("Income proof received and approved");
			notifications.add("Please attach Citizen proofs");
			notifications.add("Please attach Income proofs");
			notifications.add("Application received");
		}
		return notifications;
	}
}
