package SBK.LOS;

import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;

public interface ILoanProcess {
	//All Entire Personal Info Loan Type Taken in this method
	public void sourcing(ICustomer customer) throws IOException;
	//For stage checking
	public void checkStage(String applicationNumber) throws IOException;
	//For Existing Loan Application
	public void setChecker(Validations checker);
	
	//Dependencies of Sets
	public void setLoanTypeMap(LinkedHashMap<String, String> loanType);
	public void setFraudAadharCard(HashSet<String> FraudAadharCard);
	public void setFraudPanAadharCard(HashSet<String> FraudPanCard);
	public void setFraudPhoneNumber(HashSet<String> FraudPhoneNumber);
	public void setFraudEmailId(HashSet<String> FraudEmailId);
}
