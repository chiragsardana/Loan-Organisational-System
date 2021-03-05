package Sardana.LoanOrganisationSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	static ApplicationContext ac = new AnnotationConfigApplicationContext(Sardana.LoanOrganisationSystem.ConfigApp.class); 
	
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Welcome to Loan Organisational System.");
		
		System.out.println("\n1.New Loan Apply\n2.Ex"
				+ "isting Loan Status\n3."
				+ "Exit\n\nEnter Your Option: ");
		Integer T = Integer.parseInt(input.readLine());
		
		
    	
//    	Address address = ac.getBean("address",Address.class);
//    	
//    	System.out.println(address);
		
		switch(T) {
		case 1: 
			
			break;
		case 2:
			System.out.println("Existing Loan Apply");
			//Display Basic Details Of Loan
			//Take Uniqueu Application Number
			break;
		case 3:
			System.out.print("Exiting...");
			System.exit(0);
			break;
		default:
			System.out.println("You have entered Something Wrong Key!!!");
			main(args);
		}
		
		((AnnotationConfigApplicationContext)ac).close();
	}
	public static void newApplication() throws IOException {
		
		System.out.println("New Loan Apply");
		NewApplication newApplication = ac.getBean("newApplication",NewApplication.class);
		LinkedHashMap<String, String> hmap = new LinkedHashMap<String, String>();
		
		
//		Basic Information
		System.out.print("Enter Your Name: ");
		String name  = input.readLine();
		while(!newApplication.getValidation().nameValidation(name)) {
			System.out.print("Enter Your Name Again: ");
			name  = input.readLine();
			newApplication.getBasicDetails().setName(name);
		}
		
		System.out.print("\nEnter Your Age: ");
		newApplication.getBasicDetails().setAge(Integer.parseInt(input.readLine()));
		
		System.out.print("\nEnter Your Address: ");
		System.out.print("\nEnter Your House Number: ");
		newApplication.getBasicDetails().getAddress().setHouseNumber(input.readLine());
		System.out.print("\nEnter Your Street Name: ");
		newApplication.getBasicDetails().getAddress().setStreetName(input.readLine());
		System.out.print("\nEnter Your Nearest Common Point: ");
		newApplication.getBasicDetails().getAddress().setNearestCommonPoint(input.readLine());
		System.out.print("\nEnter Your City: ");
		newApplication.getBasicDetails().getAddress().setCity(input.readLine());
		System.out.print("\nEnter Your State: ");
		newApplication.getBasicDetails().getAddress().setState(input.readLine());
		System.out.print("\nEnter Your Country: ");
		newApplication.getBasicDetails().getAddress().setCountry(input.readLine());
		
		System.out.print("\nEnter Your Phone Number: ");
		newApplication.getBasicDetails().setPhoneNumber(Integer.parseInt(input.readLine()));
		
		System.out.print("\nEnter Your Email Id: ");
		newApplication.getBasicDetails().setEmailId(input.readLine());
		
		newApplication.getBasicDetails().createLoanTypeMap(hmap);
		newApplication.getBasicDetails().displayLoanType(hmap);
		System.out.print("\nEnter Your Loan Type: ");
		newApplication.getBasicDetails().setLoanType(input.readLine());

		System.out.println("The Unique Application Number: "+newApplication.getBasicDetails().generateApplicationNumber());
		/*
		private String houseNumber;
		private String streetName;
		private String nearestCommonPoint;
		private String city;
		private String state;
		private String Country;
		*/
		
//		Some More Details
		System.out.print("Enter Your Income: ");
		newApplication.getSomeMoreDetails().setIncome(Double.parseDouble(input.readLine()));
		System.out.print("\nEnter Your Assets: ");
		newApplication.getSomeMoreDetails().setAssets(Double.parseDouble(input.readLine()));
		System.out.print("\nEnter Your Liability: ");
		newApplication.getSomeMoreDetails().setLiability(Double.parseDouble(input.readLine()));
		System.out.print("\nEnter Your Addhar Card: ");
		newApplication.getSomeMoreDetails().setAadharCardNumber(Integer.parseInt(input.readLine()));
		System.out.print("\nEnter Your Pan Card: ");
		newApplication.getSomeMoreDetails().setPanCard(input.readLine());
		
		System.out.println("The Actual Income is: "+newApplication.getSomeMoreDetails().calculateActualIncome());
		//It returning Boolean
		newApplication.getDedupeChecker().whichOneIsFalse(newApplication.getSomeMoreDetails().getAadharCardNumber().toString(), newApplication.getSomeMoreDetails().getPanCard(), newApplication.getBasicDetails().getPhoneNumber().toString(), newApplication.getBasicDetails().getEmailId());
		//Dedupe %age
		System.out.println(newApplication.getDedupeChecker().getDedupePercentage());
		
		System.out.print("Enter the Amount: ");
		newApplication.getScoring().setAmount(Double.parseDouble(input.readLine()));
		
		System.out.print("Enter the Duration: ");
		newApplication.getScoring().setDurationMonth(Integer.parseInt(input.readLine()));
		
		
		
		newApplication.getScoring().setAge(newApplication.getBasicDetails().getAge());
		newApplication.getScoring().setIncome(newApplication.getSomeMoreDetails().calculateActualIncome());
		if(newApplication.getScoring().loanApproval()) {
			System.out.println("Loan Approved");
		}else {
			System.out.println("Loan Disaaproved");
		}
		
		System.out.println("EMI is: "+String.format("%.2f", newApplication.getScoring().getEMI())+"Duration");
		
		/*
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
		*/
	}
}
