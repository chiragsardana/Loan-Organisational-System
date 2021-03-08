package SBK.LOS;

import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {
	public static Boolean checkName(String name) {
		Pattern my_pattern = Pattern.compile("[^a-z ]", Pattern.CASE_INSENSITIVE);
		Matcher my_match = my_pattern.matcher(name);
		boolean check = my_match.find();
	    return !check;  
	}
	public static Boolean checkAge(String age) {
		Pattern my_pattern = Pattern.compile("[^0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher my_match = my_pattern.matcher(age);
		boolean check = my_match.find();
		//Here i confirmed That it is an Integer 
		if(check) {
			return false;
		}
		if(Integer.parseInt(age) < 18 || Integer.parseInt(age) > 100) {
			return false;
		}
		return true;
		
	}
	public static Boolean checkPhoneNumber(String phoneNumber) {
		if(phoneNumber.length() < 10 ) {
			return false;
		}
		Pattern my_pattern = Pattern.compile("[^0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher my_match = my_pattern.matcher(phoneNumber);
		boolean check = my_match.find();
	    return !check;
	}
	public static boolean checkEmailId(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    }
	public static Boolean checkLoanType(LinkedHashMap<String, String> hmap, String loanType) {
		if(hmap.containsKey(loanType)) {
			return true;
		}
		return false;
	}
	public static Boolean checkDuration(Integer duration) {
		if(duration <= 0) {
			return false;
		}
		return true;
	}
	public static Boolean checkAmount(Double amount) {
		if(amount <= 0.0) {
			return false;
		}
		return true;
	}
	public static Boolean checkIncome(Double income) {
		if(income <= 0.0) {
			return false;
		}
		return true;
	}
	public static Boolean checkAssets(Double assets) {
		if(assets <= 0.0) {
			return false;
		}
		return true;
	}
	public static Boolean checkLiablity(Double liablity) {
		if(liablity <= 0.0) {
			return false;
		}
		return true;
	}
	public static Boolean checkAadharNumber(String str){
        String regex = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";

        Pattern p = Pattern.compile(regex);
 
        // If the string is empty
        // return false
        if (str == null) {
            return false;
        }
 
        // Pattern class contains matcher() method
        // to find matching between given string
        // and regular expression.
        Matcher m = p.matcher(str);
 
        // Return if the string
        // matched the ReGex
        return m.matches();
    }
	public static boolean checkPanCardNumber(String panCardNo)
    {
 
        // Regex to check valid PAN Card number.
        String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
 
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
 
        // If the PAN Card number
        // is empty return false
        if (panCardNo == null) 
        {
            return false;
        }
 
        // Pattern class contains matcher() method
        // to find matching between given
        // PAN Card number using regular expression.
        Matcher m = p.matcher(panCardNo);
 
        // Return if the PAN Card number
        // matched the ReGex
        return m.matches();
    }
	public Boolean checkEducation(String education) {
		if(education.equals("UG") || education.equals("PG")) {
			return true;
		}
		return false;
	}
	public Boolean checkHouseNumber(String houseNumber) {
		for(Integer i = 0;i < houseNumber.length();i++) {
			if(!Character.isDigit(houseNumber.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	public Boolean checkStreetName(String streetName) {
		for(Integer i = 0;i < streetName.length();i++) {
			if(Character.isDigit(streetName.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	public Boolean checkCity(String city) {
		for(Integer i = 0;i < city.length();i++) {
			if(Character.isDigit(city.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	public Boolean checkState(String state) {
		for(Integer i = 0;i < state.length();i++) {
			if(Character.isDigit(state.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	public Boolean checkCountry(String country) {
		for(Integer i = 0;i < country.length();i++) {
			if(Character.isDigit(country.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str = "Chirag19CSU071@ncuindia.edu";
		System.out.println(checkEmailId(str));
		System.out.println(checkAmount(9999.0));
		System.out.println(checkAge("119"));
		System.out.println("1. UG (Under Graduate) 2. PG (Post Graduate)");
	}
}
