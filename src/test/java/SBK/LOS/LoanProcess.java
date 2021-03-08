/**
 * 
 */
package SBK.LOS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Random;

/**
 * @author chiragsardana
 *
 */
public class LoanProcess implements ILoanProcess {
	//To Store Loan Type 
	private LinkedHashMap<String, String> loanType = new LinkedHashMap<>();
	public void setLoanTypeMap(LinkedHashMap<String, String> loanType) {
		this.loanType = loanType;
	}
	//To Store Fraud AadharCard Record
	private HashSet<String> FraudAadharCard = new HashSet<>();
	public void setFraudAadharCard(HashSet<String> FraudAadharCard) {
		this.FraudAadharCard = FraudAadharCard;
	}
	//To Store Fraud Pan Card Record
	HashSet<String> FraudPanCard = new HashSet<>();
	public void setFraudPanAadharCard(HashSet<String> FraudPanCard) {
		this.FraudPanCard = FraudPanCard;
	}
	//To Store Fraud Phone Number Record
	HashSet<String> FraudPhoneNumber = new HashSet<>();
	public void setFraudPhoneNumber(HashSet<String> FraudPhoneNumber) {
		this.FraudPhoneNumber = FraudPhoneNumber;
	}
	//To Store Fraud Email Ids Record
	HashSet<String> FraudEmailId = new HashSet<>();
	public void setFraudEmailId(HashSet<String> FraudEmailId) {
		this.FraudEmailId = FraudEmailId;
	}
	//To Store Customers
	HashMap<String, ICustomer> customers = new HashMap<>();
	//To Validate everything
	Validations checker;
	public void setChecker(Validations checker) {
		this.checker = checker;
	}
	//To read input from user
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	//To check whether Customer is in which Stage
	private String staging;
	//To take temporary Inputs
	String temp;
	@Override
	public void sourcing(ICustomer customer) throws IOException {
		// TODO Auto-generated method stub
		staging = "Sourcing";
		customer.setStage(staging);
		/*
		private String name;
		private Integer age;
		private Address address;
		private String phoneNumber;
		private String emailId;
		private String loanType;
		*/
		
		System.out.print("Enter Name: ");
		temp = input.readLine();
		while(!checker.checkName(temp)) {
			System.out.println("Please Enter Correct Name");
			System.out.print("Enter Name: ");
			temp = input.readLine();
		}
		customer.setName(temp);
		//Age Input
		System.out.print("Enter Age: ");
		temp = input.readLine();
		while(!checker.checkAge(temp)) {
			System.out.println("Please Enter Correct Age");
			System.out.print("Enter Age: ");
			temp = input.readLine();
		}
		customer.setAge(Integer.parseInt(temp));
		//Address
		Address address = customer.getAddress();
		System.out.println("Enter Address");
		System.out.print("Enter House Number: ");
		temp = input.readLine();
		while(!checker.checkHouseNumber(temp)) {
			System.out.println("Please Enter Correct House Number");
			System.out.print("Enter House Number: ");
			temp = input.readLine();
		}
		address.setHouseNumber(temp);
		
		System.out.print("Enter Street Name: ");
		temp = input.readLine();
		while(!checker.checkStreetName(temp)) {
			System.out.println("Please Enter Correct Street Name");
			System.out.print("Enter Street Name: ");
			temp = input.readLine();
		}
		address.setStreetName(temp);
		
		System.out.print("Enter Nearest Point: ");
		temp = input.readLine();
		while(!checker.checkStreetName(temp)) {
			System.out.println("Please Enter Correct Nearest Point");
			System.out.print("Enter Nearest Point: ");
			temp = input.readLine();
		}
		address.setNearestCommonPoint(temp);
		
		System.out.print("Enter City: ");
		temp = input.readLine();
		while(!checker.checkCity(temp)) {
			System.out.println("Please Enter Correct City");
			System.out.print("Enter City: ");
			temp = input.readLine();
		}
		address.setCity(temp);
		
		System.out.print("Enter State: ");
		temp = input.readLine();
		while(!checker.checkState(temp)) {
			System.out.println("Please Enter Correct State");
			System.out.print("Enter State: ");
			temp = input.readLine();
		}
		address.setState(temp);
		
		System.out.print("Enter Country: ");
		temp = input.readLine();
		while(!checker.checkCountry(temp)) {
			System.out.println("Please Enter Correct Country");
			System.out.print("Enter Country: ");
			temp = input.readLine();
		}
		address.setCountry(temp);
		//Phone Number
		System.out.print("Enter Phone Number: ");
		temp = input.readLine();
		while(!checker.checkPhoneNumber(temp)) {
			System.out.println("Please Enter Correct Phone Number");
			System.out.print("Enter Phone Number: ");
			temp = input.readLine();
		}
		customer.setPhoneNumber(temp);
		
		//Email ID
		System.out.print("Enter Email ID: ");
		temp = input.readLine();
		while(!checker.checkEmailId(temp)) {
			System.out.println("Please Enter Correct Email Id");
			System.out.print("Enter Email ID: ");
			temp = input.readLine();
		}
		customer.setEmailId(temp);
		
		//Loan Type
		displayLoanType();
		System.out.print("Enter Loan Type: ");
		temp = input.readLine();
		while(!checker.checkLoanType(loanType,temp)) {
			System.out.println("Please Enter Correct Loan Type");
			System.out.print("Enter Loan Type: ");
			temp = input.readLine();
		}
		customer.setLoanType(temp);
		
		//Loan Amount
		System.out.print("Enter Loan Amount: ");
		temp = input.readLine();
		while(!checker.checkAmount(Double.parseDouble(temp))) {
			System.out.println("Please Enter Correct Loan Amount");
			System.out.print("Enter Loan Amount: ");
			temp = input.readLine();
		}
		customer.setAmount(Double.parseDouble(temp));
		
		//Duration
		System.out.print("Enter Loan Duration: ");
		temp = input.readLine();
		while(!checker.checkDuration(Integer.parseInt(temp))) {
			System.out.println("Please Enter Correct Loan Duration");
			System.out.print("Enter Loan Duration: ");
			temp = input.readLine();
		}
		customer.setDuration(Integer.parseInt(temp));
		
		customer.setApplicationNumber(generateApplicationNumber(customer));
		
		System.out.println("Application Number: "+customer.getApplicationNumber());
		changingStage(customer);
	}
	public void  moreData(ICustomer customer) throws IOException {
		staging = "MoreData";
		customer.setStage(staging);
		//Education Details
		System.out.println("1. UG (Under Graduate) \n2. PG (Post Graduate)");
		System.out.print("Enter Education Detail: ");
		temp = input.readLine();
		while(!checker.checkEducation(temp)) {
			System.out.println("Please Enter Correct Education Details");
			System.out.print("Enter Education Details: ");
			temp = input.readLine();
		}
		customer.setEducation(temp);
		//Aadhar Card
		System.out.print("Enter Aadhar Card Number: ");
		temp = input.readLine();
		while(!checker.checkAadharNumber(temp)) {
			System.out.println("Please Enter Correct Aadhar Card Number");
			System.out.print("Enter Aadhar Card Number: ");
			temp = input.readLine();
		}
		customer.setAadharCardNumber(temp);
		
		//Pan Card
		System.out.print("Enter Pan Card Number: ");
		temp = input.readLine();
		while(!checker.checkPanCardNumber(temp)) {
			System.out.println("Please Enter Correct Pan Card Number");
			System.out.print("Enter Pan Card Number: ");
			temp = input.readLine();
		}
		customer.setPanCard(temp);
		
		//Income
		System.out.print("Enter Income: ");
		temp = input.readLine();
		while(!checker.checkIncome(Double.parseDouble(temp))) {
			System.out.println("Please Enter Correct Income");
			System.out.print("Enter Income: ");
			temp = input.readLine();
		}
		customer.setIncome(Double.parseDouble(temp));
		
		
		//checkAssets
		System.out.print("Enter Assets: ");
		temp = input.readLine();
		while(!checker.checkAssets(Double.parseDouble(temp))) {
			System.out.println("Please Enter Correct Assets");
			System.out.print("Enter Assets: ");
			temp = input.readLine();
		}
		customer.setAssets(Double.parseDouble(temp));
		
		//checkLiablity
		System.out.print("Enter Liablity: ");
		temp = input.readLine();
		while(!checker.checkAssets(Double.parseDouble(temp))) {
			System.out.println("Please Enter Correct Liabilty");
			System.out.print("Enter Liability: ");
			temp = input.readLine();
		}
		customer.setLiability(Double.parseDouble(temp));
		
		changingStage(customer);
	}
	public void dedupeChecker(ICustomer customer) throws IOException {
		staging = "DedupeChecker";
		customer.setStage(staging);
		
		//In this Stage we Check whether the user is Fraud or not
		
		
		Boolean checker1 = FraudAadharCard.contains(customer.getAadharCardNumber());
		Boolean checker2 = FraudPanCard.contains(customer.getPanCard());
		Boolean checker3 = FraudPhoneNumber.contains(customer.getPhoneNumber());
		Boolean checker4 = FraudEmailId.contains(customer.getEmailId());
		if(checker1 == true || checker2 == true || checker3 == true || checker4 == true) {
			System.out.println("Person is in Fraud List!!!");
			if(checker1 == true) {
				System.out.println("Aadhar Card Found in Fraud List");
			}
			if(checker2 == true) {
				System.out.println("Pan Card Found in Fraud List");
			}
			if(checker3 == true) {
				System.out.println("Phone Number Found in Fraud List");
			}
			if(checker4 == true) {
				System.out.println("Email Id Found in Fraud List");
			}
			staging = "Reject";
			customer.setStage(staging);
			moveToNextStage(customer);
		}else {
			System.out.println("The Person is Genuine!!!");
			changingStage(customer);
		}
		
		
	}
	public void scoring(ICustomer customer) throws IOException {
		staging = "Scoring";
		customer.setStage(staging);
		Integer scoring = 0;
		if(customer.getEducation().equals("UG")) {
			scoring += 2;
		}else if(customer.getEducation().equals("PG")) {
			scoring += 3;
		}
		if(customer.calculateActualIncome() > 25000.0) {
			scoring += 1;
		}else if(customer.calculateActualIncome() >= 50000.0 && customer.calculateActualIncome() < 100000.0) {
			scoring += 2;
		}else if(customer.calculateActualIncome() > 100000.0) {
			scoring += 3;
		}
		if(customer.getAge() > 20 && customer.getAge() <= 40) {
			scoring += 3;
		}else if(customer.getAge() > 40 && customer.getAge() < 60) {
			scoring += 2;
		}else if(customer.getAge() > 60 && customer.getAge() < 80) {
			scoring += 1;
		}else if(customer.getAge() > 80) {
			scoring += 0;
		}
		customer.setScoring(scoring);
		System.out.println("Scoring of Customer: "+scoring);
		moveToNextStage(customer);
		
	}
	public void loanApproval(ICustomer customer) throws IOException {
		staging = "LoanApproval";
		customer.setStage(staging);
		if(customer.getScoring() >= 5) {
			System.out.println("Loan Approved!!!");
			showEmi(customer);
		}else {
			System.out.println("\n--Rejected--");
		}
	}
	public void showEmi(ICustomer customer) {
		Integer duration = customer.getDuration(); 
		Double principal = customer.getAmount();
		Double rate = customer.getRateOfInterest();
        Double emi;
        rate = rate / (12 * 100);
        emi = (principal * rate * Math.pow(1 + rate, duration)) / (Math.pow(1 + rate, duration) - 1);
        System.out.println("The Emi/Per Month: "+String.format("%.2f", emi));
	}
	//This method is for existing Loan Application
	@Override
	public void checkStage(String applicationNumber) throws IOException {
		// TODO Auto-generated method stub
		if(customers.containsKey(applicationNumber)) {
			ICustomer customer = customers.get(applicationNumber);
			staging = customer.getStage();
			System.out.println("You are in the Stage: "+staging);
			changingStage(customer);
		}else {
			System.out.println("The Application Number does not exist in the Database.");
		}
	}
	public void moveToNextStage(ICustomer customer) throws IOException {
		System.out.println("Moving to Next Stage....");
		if(staging.equals("Sourcing")) {
			moreData(customer);
		}
		if(staging.equals("MoreData")) {
			dedupeChecker(customer);
		}
		if(staging.equals("DedupeChecker")) {
			scoring(customer);
		}
		if(staging.equals("Scoring")) {
			loanApproval(customer);
		}
		if(staging.equals("Reject")) {
			System.out.println("Rejected!!!");
		}
		staging = "All Stage is Completed!!!";
	}
	
	public String generateApplicationNumber(ICustomer customer) {
		// TODO Auto-generated method stub
		Random random = new Random();
		String applicationNumber = "SBK2021"+customer.getLoanType()+customer.getPhoneNumber().substring(2,4)+
				random.nextInt();
		while(customers.containsKey(applicationNumber)) {
			applicationNumber = customer.getLoanType()+customer.getPhoneNumber().substring(2,4)+random.nextInt();
		}
		return applicationNumber;
	}
	
	public void displayLoanType() {
		// TODO Auto-generated method stub
		for(Entry<String, String> map: loanType.entrySet()) {
			System.out.println(map.getKey()+"\t"+map.getValue());
		}
	}
	public void changingStage(ICustomer customer) throws IOException {
		System.out.println("Do You Want to Move to Next Stage!!!\nType Y Otherwise\nType N");
		temp = input.readLine();
		Boolean flag = true;
		while(flag) {
			if(temp.equals("Y")) {
				flag = false;
				moveToNextStage(customer);
			}else if(temp.equals("N")){
				flag = false;
				customers.put(customer.getApplicationNumber(), customer);
				System.out.println("Exiting Staging...\n");
			}else {
				System.out.println("You Have to Enter Only Y and N");
				System.out.println("Do You Want to Move to Next Stage!!!\nType Y Otherwise\nType N");
				temp = input.readLine();
			}
		}
	}
}
