package SBK.LOS;

import java.util.LinkedHashMap;

public interface ICustomer {
	
	//Name Of Customer
	public String getName();
	public void setName(String name);
	//Age of Customer
	public Integer getAge();
	public void setAge(Integer age);
	//Address of Customer
	public Address getAddress();
	public void setAddress(Address address);
	//Phone Number of Customer
	public String getPhoneNumber();
	public void setPhoneNumber(String phoneNumber);
	//Email Id of Customer
	public String getEmailId();
	public void setEmailId(String emailId);
	//Types of Loan
	public String getLoanType();
	public void setLoanType(String loanType);
	//Duration of Loan
	public Integer getDuration();
	public void setDuration(Integer month);
	//Amount of Loan
	public Double getAmount();
	public void setAmount(Double Amount);
	//Rate of Interest
	public Double getRateOfInterest();

//	public String generateApplicationNumber();
	
	//Education
	public String getEducation();
	public void setEducation(String education);
	//It Calculates Actual Income
	public Double calculateActualIncome();
	//Income of Customer
	public Double getIncome();
	public void setIncome(Double income);
	//Assets of Customer
	public Double getAssets();
	public void setAssets(Double assets);
	//Liability of Customer
	public Double getLiability();
	public void setLiability(Double liability);
	//AddharCard of Customer
	public String getAadharCardNumber() ;
	public void setAadharCardNumber(String aadharCardNumber) ;
	//Pan Card Of Customer
	public String getPanCard();
	public void setPanCard(String panCard);
	//Scoring of Customer
	public Integer getScoring();
	public void setScoring(Integer scoring);
	//Staging of Customer
	public String getStage();
	public void setStage(String stage);
	//Application Number
	public String getApplicationNumber();
	public void setApplicationNumber(String applicationNumber);
	
}
