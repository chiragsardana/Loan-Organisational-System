package Sardana.LoanOrganisationSystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public interface IBasicDetails {
	/*
	private String name;
	private Integer age;
	private Address address;
	private Integer phoneNumber;
	private String emailId;
	private String loanType;
	*/
	public String getName();
	public void setName(String name);
	public Integer getAge();
	public void setAge(Integer age);
	public Address getAddress();
	public void setAddress(Address address);
	public Integer getPhoneNumber();
	public void setPhoneNumber(Integer phoneNumber);
	public String getEmailId();
	public void setEmailId(String emailId);
	public String getLoanType();
	public void setLoanType(String loanType);
	public String generateApplicationNumber();
	public void displayLoanType(LinkedHashMap<String,String> hmap);
	public void createLoanTypeMap(LinkedHashMap<String, String> hmap);
}
