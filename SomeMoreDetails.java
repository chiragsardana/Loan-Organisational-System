package Sardana.LoanOrganisationSystem;

import java.util.LinkedHashMap;
import java.util.Map;

public class SomeMoreDetails implements ISomeMoreDetails, IBasicDetails
{
	private String name;
	private Integer age;
	private Address address;
	private Integer phoneNumber;
	private String emailId;
	private String loanType;
	private Double income;
	private Double assets;
	private Double liability;
	private Integer aadharCardNumber;
	private String panCard;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public Double getIncome() {
		return income;
	}
	public void setIncome(Double income) {
		this.income = income;
	}
	public Double getAssets() {
		return assets;
	}
	public void setAssets(Double assets) {
		this.assets = assets;
	}
	public Double getLiability() {
		return liability;
	}
	public void setLiability(Double liability) {
		this.liability = liability;
	}
	public Integer getAadharCardNumber() {
		return aadharCardNumber;
	}
	public void setAadharCardNumber(Integer aadharCardNumber) {
		this.aadharCardNumber = aadharCardNumber;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public Double calculateActualIncome() {
		// TODO Auto-generated method stub
//		System.out.println("calculateActualIncome() method");
		return getIncome() - getLiability() + getAssets();
	}
	public String generateApplicationNumber() {
		// TODO Auto-generated method stub
		return "ApplicationNumber method";
	}
	public void createLoanTypeMap(LinkedHashMap<String, String> hmap) {
		hmap.put("##UPL", "Unsecured Personal Loans");
		hmap.put("##SPL", "Secured Personal Loans");
		hmap.put("##PDL", "Pay Day Loans");
		hmap.put("###TL", "Title Loans");
		hmap.put("##PSL", "Pawn Shop Loans");
		hmap.put("#PDAL", "Pay Day Alternative Loans");
		hmap.put("##HEL", "Home Equaity Loans");
		hmap.put("#CCCA", "Credit Card Cash Advances");
	}
	public void displayLoanType(LinkedHashMap<String, String> hmap) {
		// TODO Auto-generated method stub
		System.out.println("\nTypes of Loans");
		for(Map.Entry<String, String> map: hmap.entrySet()) {
			System.out.println(map.getKey()+"\t"+map.getValue());
		}
	}
}
