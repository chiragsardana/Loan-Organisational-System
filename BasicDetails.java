/**
 * 
 */
package Sardana.LoanOrganisationSystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author chiragsardana
 *
 */
public class BasicDetails implements IBasicDetails {

	public BasicDetails(Address address) {
		super();
		this.address = address;
	}
	private String name;
	private Integer age;
	private Address address;
	private Integer phoneNumber;
	private String emailId;
	private String loanType;
	
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
	@Override
	public String toString() {
		return "BasicDetails [name=" + name + ", age=" + age + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", emailId=" + emailId + ", loanType=" + loanType + "]";
	}
	public String generateApplicationNumber() {
		// TODO Auto-generated method stub
		return this.loanType+this.name.substring(1,1)+"2021"+this.getPhoneNumber().toString().charAt(5)
				+this.getPhoneNumber().toString().charAt(6);
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
		for(Map.Entry<String, String> map: hmap.entrySet()) {
			System.out.println(map.getKey()+"\t"+map.getValue());
		}
	}
	
}
