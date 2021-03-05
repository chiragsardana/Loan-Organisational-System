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
	private Integer dedupePercentage = 0;
	public Boolean checkAadharCard(String aadharCard) {
		return this.aadharCard.contains(aadharCard);
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
	public Boolean whichOneIsFalse(String aadharCard, String panCard,String phoneNumber, String emailId ) {
		Boolean checkAC = checkAadharCard(aadharCard);
		Boolean checkPC = checkPanCard(panCard);
		Boolean checkPN = checkPhoneNumber(phoneNumber);
		Boolean checkED = checkEmailId(emailId);
		if(!checkAC && !checkPC && !checkPN && !checkED) {
			return true;
		}
		
		if(checkAC == false) {
			System.out.println("Aadhar Card Found in Fraud Record");
			dedupePercentage += 25;
		}
		if(checkPC == false) {
			System.out.println("Pan Card Found in Fraud Record");
			dedupePercentage += 25;
		}
		if(checkPN == false) {
			System.out.println("PhoneNumber Found in Fraud Record");
			dedupePercentage += 25;
		}
		if(checkED == false) {
			System.out.println("Email ID Found in Fraud Record");
			dedupePercentage += 25;
		}
		return false;
	}
	public Integer getDedupePercentage() {
		return dedupePercentage;
	}
//	public void setDedupePercentage(Integer dedupePercentage) {
//		this.dedupePercentage = dedupePercentage;
//	}
}
