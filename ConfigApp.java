package Sardana.LoanOrganisationSystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


//work like an xml file
@Configuration
@ComponentScan("Sardana.LoanOrganisationSystem")
//This is and optional statement
//For classes you are using Annotation
public class ConfigApp {
//	<bean id="cricketCoach" class=""></bean>
//	Annotation @Component("cricketCoach")

//	Java Config
	
//	@Bean
//	public Address address() {
//		return new Address("16/934", "Holi Nursing Home Wali Street", "Railway Gurudwara", "Sirsa", "Haryana", "India");
//	}
	@Bean
	public Address address() {
		return new Address();
	}
	@Bean
	public IBasicDetails basicDetails() {
		return new BasicDetails(address());
	}
	@Bean
	public ISomeMoreDetails someMoreDetails() {
		return new SomeMoreDetails();
	}
	@Bean
	public DedupeChecker dedupeChecker() {
		return new DedupeChecker();
	}
	@Bean
	public Scoring scoring() {
		return new Scoring();
	}
	@Bean
	public NewApplication newApplication() {
		return new NewApplication(basicDetails(), someMoreDetails(), dedupeChecker(), scoring());
	}
	@Bean 
	public ExistingApplication existingApplication() {
		return new ExistingApplication(); 
	}
}	
