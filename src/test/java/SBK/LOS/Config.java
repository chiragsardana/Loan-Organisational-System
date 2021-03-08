package SBK.LOS;

import java.util.HashSet;
import java.util.LinkedHashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("SBK.LOS")
public class Config {
	@Bean
	public Address address() {
		return new Address();
	}
	@Scope("prototype")
	@Bean
	public ICustomer customer() {
		ICustomer customer = new Customer();
		customer.setAddress(address());
		return customer;
	}
	@Bean
	public ILoanProcess loanProcess() {
		ILoanProcess loanProcess = new LoanProcess();
		loanProcess.setLoanTypeMap(getLoanTypeMap());
		loanProcess.setFraudAadharCard(getFraudAadharCard());
		loanProcess.setFraudEmailId(getFraudEmailids());
		loanProcess.setFraudPanAadharCard(getFraudPanCard());
		loanProcess.setFraudPhoneNumber(getFraudPhoneNumber());
		loanProcess.setChecker(validation());
		return loanProcess;
	}
	@Bean
	public Validations validation() {
		return new Validations();
	}
	public LinkedHashMap<String, String> getLoanTypeMap() {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> hmap = new LinkedHashMap<>();
		hmap.put("##UPL", "Unsecured Personal Loans");
		hmap.put("##SPL", "Secured Personal Loans");
		hmap.put("##PDL", "Pay Day Loans");
		hmap.put("###TL", "Title Loans");
		hmap.put("##PSL", "Pawn Shop Loans");
		hmap.put("#PDAL", "Pay Day Alternative Loans");
		hmap.put("##HEL", "Home Equaity Loans");
		hmap.put("#CCCA", "Credit Card Cash Advances");
		return hmap;
	}
	public HashSet<String> getFraudAadharCard(){
		HashSet<String> hset = new HashSet<>();
		return hset;
	}
	public HashSet<String> getFraudPanCard(){
		HashSet<String> hset = new HashSet<>();
		return hset;
	}
	public HashSet<String> getFraudPhoneNumber(){
		HashSet<String> hset = new HashSet<>();
		hset.add("8684076590");
		return hset;
	}
	public HashSet<String> getFraudEmailids(){
		HashSet<String> hset = new HashSet<>();
		return hset;
	}
}
