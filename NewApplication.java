package Sardana.LoanOrganisationSystem;

public class NewApplication {
	
	
	private IBasicDetails basicDetails;
	private ISomeMoreDetails someMoreDetails;
	private DedupeChecker dedupeChecker;
	private Scoring scoring;
	private Validation validation;
	public NewApplication(IBasicDetails basicDetails, ISomeMoreDetails someMoreDetails, DedupeChecker dedupeChecker,
			Scoring scoring, Validation validation) {
		super();
		this.basicDetails = basicDetails;
		this.someMoreDetails = someMoreDetails;
		this.dedupeChecker = dedupeChecker;
		this.scoring = scoring;
		this.validation = validation;
	}
	
	
	public IBasicDetails getBasicDetails() {
		return basicDetails;
	}
	public void setBasicDetails(IBasicDetails basicDetails) {
		this.basicDetails = basicDetails;
	}
	public ISomeMoreDetails getSomeMoreDetails() {
		return someMoreDetails;
	}
	public void setSomeMoreDetails(ISomeMoreDetails someMoreDetails) {
		this.someMoreDetails = someMoreDetails;
	}
	public DedupeChecker getDedupeChecker() {
		return dedupeChecker;
	}
	public void setDedupeChecker(DedupeChecker dedupeChecker) {
		this.dedupeChecker = dedupeChecker;
	}
	public Scoring getScoring() {
		return scoring;
	}
	public void setScoring(Scoring scoring) {
		this.scoring = scoring;
	}


	public Validation getValidation() {
		return validation;
	}


	public void setValidation(Validation validation) {
		this.validation = validation;
	}
}
