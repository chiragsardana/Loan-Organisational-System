package Sardana.LoanOrganisationSystem;

import java.util.HashSet;

/*
Bank will check about the fraud customers from their record.
Will check using aadhar, pan, phone and email : apply search here (We have to use database for this )
Check the dedupe% and give status: Reject or Accept .(Boolean Return Type) If reject specify reason.
*/
public class DedupeChecker {
	//Separate Table for Fraud Customers
	HashSet<String> aadharCard = new HashSet<>();
	HashSet<String> panCard = new HashSet<>();
	HashSet<String> phoneNumber = new HashSet<>();
	HashSet<String> emailId = new HashSet<>();
	public Boolean checkAadharCard(String aadharCard) {
		return this.aadharCard.contains(String aadharCard);
	}
	public Boolean checkPanCard(String panCard) {
		return this.panCard.contains(panCard);
	}
	public Boolean checkPhoneNumber(String phoneNumber) {
		return this.phoneNumber.contains(phoneNumber);
	}
	public Boolean checkEmailId(String emailId) {
		return this.emailId.contains(emailId);
	}
}
