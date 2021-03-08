package SBK.LOS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static ApplicationContext ac;
	public static ILoanProcess loanProcess;
	public static void main(String[] args) throws IOException {
		ac = new AnnotationConfigApplicationContext(SBK.LOS.Config.class);
		loanProcess = ac.getBean("loanProcess", SBK.LOS.ILoanProcess.class);
		while(mainInterface());
		((AnnotationConfigApplicationContext)ac).close();
	}
	public static Boolean mainInterface() throws IOException{
		System.out.println("Welcome to Loan Organisational System.");
		System.out.println("\n1.New Loan Apply\n2.Ex"
				+ "isting Loan Status\n3."
				+ "Exit\n\nEnter Your Option: ");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Integer yourOption = Integer.parseInt(input.readLine());
		switch(yourOption) {
		case 1: 
			ICustomer customer = ac.getBean("customer",SBK.LOS.ICustomer.class);
			loanProcess.sourcing(customer);
			break;
		case 2:
			System.out.println("Existing Loan Apply");
			System.out.print("Enter the Application Number: ");
			String applicationNumber = input.readLine();
			loanProcess.checkStage(applicationNumber);
			break;
		case 3:
			System.out.print("Exiting...");
			return false;
		default:
			System.out.println("You have entered Something Wrong Key!!!");
			mainInterface();
		}
		return true;
	}
}
