package SBK.LOS;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Customer implements ICustomer {
	
	private String name;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name  = name;
	}

	private Integer age;
	@Override
	public Integer getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	@Override
	public void setAge(Integer age) {
		// TODO Auto-generated method stub
		this.age = age;
	}

	Address address = new Address();
	@Override
	public Address getAddress() {
		// TODO Auto-generated method stub
		return address;
	}

	@Override
	public void setAddress(Address address) {
		// TODO Auto-generated method stub
		this.address = address;
	}
	private String phoneNumber;
	@Override
	public String getPhoneNumber() {
		// TODO Auto-generated method stub
		return phoneNumber;
	}

	@Override
	public void setPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		this.phoneNumber = phoneNumber;
	}
	private String emailId;
	@Override
	public String getEmailId() {
		// TODO Auto-generated method stub
		return emailId;
	}

	@Override
	public void setEmailId(String emailId) {
		// TODO Auto-generated method stub
		this.emailId = emailId;
	}
	
	private String loanType;
	@Override
	public String getLoanType() {
		// TODO Auto-generated method stub
		return loanType;
	}

	@Override
	public void setLoanType(String loanType) {
		// TODO Auto-generated method stub
		this.loanType = loanType;
	}
	private Integer duration;
	@Override
	public Integer getDuration() {
		// TODO Auto-generated method stub
		return duration;
	}

	@Override
	public void setDuration(Integer duration) {
		// TODO Auto-generated method stub
		this.duration = duration;
	}
	private Double amount;
	@Override
	public Double getAmount() {
		// TODO Auto-generated method stub
		return amount;
	}

	@Override
	public void setAmount(Double amount) {
		// TODO Auto-generated method stub
		this.amount = amount;
	}
	private Double rateOfInterest = 12.0;
	@Override
	public Double getRateOfInterest() {
		// TODO Auto-generated method stub
		return rateOfInterest;
	}	
	//It Calculated Actual Income of the Customer
	@Override
	public Double calculateActualIncome() {
		// TODO Auto-generated method stub
		return getIncome() - getLiability() + getAssets();
	}
	private Double income;
	@Override
	public Double getIncome() {
		// TODO Auto-generated method stub
		return income;
	}

	@Override
	public void setIncome(Double income) {
		// TODO Auto-generated method stub
		this.income = income;
	}
	private Double assets;
	@Override
	public Double getAssets() {
		// TODO Auto-generated method stub
		return assets;
	}

	@Override
	public void setAssets(Double assets) {
		// TODO Auto-generated method stub
		this.assets = assets;
	}
	private Double liability;
	@Override
	public Double getLiability() {
		// TODO Auto-generated method stub
		return liability;
	}

	@Override
	public void setLiability(Double liability) {
		// TODO Auto-generated method stub
		this.liability = liability;
	}
	private String aadharCardNumber;
	@Override
	public String getAadharCardNumber() {
		// TODO Auto-generated method stub
		return aadharCardNumber;
	}

	@Override
	public void setAadharCardNumber(String aadharCardNumber) {
		// TODO Auto-generated method stub
		this.aadharCardNumber = aadharCardNumber;
	}
	private String panCard;
	@Override
	public String getPanCard() {
		// TODO Auto-generated method stub
		return panCard;
	}

	@Override
	public void setPanCard(String panCard) {
		// TODO Auto-generated method stub
		this.panCard = panCard;
	}
	private String education;
	@Override
	public String getEducation() {
		// TODO Auto-generated method stub
		return education;
	}

	@Override
	public void setEducation(String education) {
		// TODO Auto-generated method stub
		this.education = education;
	}
	private Integer scoring;
	@Override
	public Integer getScoring() {
		// TODO Auto-generated method stub
		return scoring;
	}

	@Override
	public void setScoring(Integer scoring) {
		// TODO Auto-generated method stub
		this.scoring = scoring;
	}
	String stage;
	@Override
	public String getStage() {
		// TODO Auto-generated method stub
		return stage;
	}

	@Override
	public void setStage(String stage) {
		// TODO Auto-generated method stub
		this.stage = stage;
	}
	private String applicationNumber;
	@Override
	public String getApplicationNumber() {
		// TODO Auto-generated method stub
		return applicationNumber;
	}

	@Override
	public void setApplicationNumber(String applicationNumber) {
		// TODO Auto-generated method stub
		this.applicationNumber = applicationNumber;
	}

}