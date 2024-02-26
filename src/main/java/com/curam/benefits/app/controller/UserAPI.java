package com.curam.benefits.app.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curam.benefits.app.model.SPMFileUploadContents;
import com.curam.benefits.app.model.SPMVerification;
import com.curam.benefits.app.model.UAProfile;
import com.curam.benefits.app.model.UASubmittedApplication;
import com.curam.benefits.app.service.UserService;


@RestController
@RequestMapping("/profile")
public class UserAPI {
	
	
	@Autowired
	public UserService userProfiles ;
	
	@GetMapping("/{userName}")
     public UAProfile readProfile(@PathVariable String userName) {
		System.out.println("username="+userName);
		return userProfiles.readUserProfile(userName);
	}
	
	@GetMapping("submittedApplication/{userName}")
    public UASubmittedApplication readSubAppDetails(@PathVariable String userName) {
		
		return userProfiles.readSubmittedAppDetails(userName);
	}

	@GetMapping("/verifications/{userName}")
    public List<SPMVerification> getVerifications(@PathVariable String userName) {
		return userProfiles.getVerifications(userName);
	}
	
	@PutMapping("/verifications/{userName}/{verificationId}")
    public List<SPMVerification> attachDocuments(@PathVariable String userName, @PathVariable Long verificationId, @RequestBody SPMFileUploadContents fileDetails) {
		userProfiles.uploadFiles(userName, verificationId, fileDetails);
		return userProfiles.getVerifications(userName);
	}
	
	@GetMapping("/notifications/{userName}")
    public List<String> getNotifications(@PathVariable String userName) {
		return userProfiles.getNotifications(userName);
	}
}
