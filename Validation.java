package Sardana.LoanOrganisationSystem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


public class Validation {

	public Boolean nameValidation(String name) {
		String regexName = "\\p{Upper}(\\p{Lower}+\\s?)";
		String patternName = "(" + regexName + "){2,3}";
		
		 if (name.matches(patternName) == true) {
			System.out.println("Your name is valid ");
			System.out.println("The name is: " + name);
			return true;
			 } else {
				 System.out.println(" Invalid Name !! \n First name and last name 'first' alphabet must be in Capital and reamaining should be in small ");
				 return false;
			 }
			
	 }
	
	public void ageValidation(int age) {
		if (age < 18) {
		System.out.println("Your age is " + age + "\n You are in Underage");
		} else {
		System.out.println("Your age is Qualified!! ");
		//Some logic
		}
	}
	
	public boolean phoneNumValidation(String phoneNumber) {
		if (phoneNumber.matches("\\d{10}"))
			return true;
		
		else if (phoneNumber.matches("\\(\\d{5}\\)-\\d{3}-\\d{3}"))
			return true;
		
		 else
			 return false;
	}
	
		 public static boolean emailIDValidation(String email) {
			String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
			"[a-zA-Z0-9_+&-]+)@" +
			"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
			"A-Z]{2,7}$";
		
		 Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		
		return pat.matcher(email).matches();
	}
	
	public boolean aadharNumberValidation(String str) {
	
	 String regex = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";
	
	Pattern p = Pattern.compile(regex);
	
	if (str == null) {
		return false;
	}
	
		Matcher m = p.matcher(str);
		
		 return m.matches();
	}
	
	
	 public void pancardValidation(String pancardNumber) {
	if (pancardNumber.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}")) {
		System.out.println(" Your pancard number is :- Valid");
	} else
		System.out.println("Your pancard number is :- Invalid");
	}
	
	public void addressValidation(String houseno, String area ,String city, String country){
	
	 System.out.println(" House NO. ->"+houseno);
	
	 String regexName = "\\p{Upper}(\\p{Lower}+\\s?)";
	String patternName = "(" + regexName + "){1,2}";
	
	 if(area.matches(patternName)==true){
	// System.out.println(" Area :- "+area);
		 System.out.println("Area :-> "+area);
	}
	else
		System.out.println(" Area is invalid ");
	
	if (city.matches(patternName)==true){
		System.out.println(" City ->"+city);
	
	 }
	else
		System.out.println(" City is invalid ");
	
	if(country.matches(patternName)==true){
	System.out.println(" country ->"+country);
	
	 }
	else
		System.out.println(" Country is invalid ");
	
	//
	}
}