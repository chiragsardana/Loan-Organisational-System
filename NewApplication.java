package Sardana.LoanOrganisationSystem;

public class NewApplication {
	
	
	private IBasicDetails basicDetails;
	private ISomeMoreDetails someMoreDetails;
	private DedupeChecker dedupeChecker;
	private Scoring scoring;
	
	public NewApplication(IBasicDetails basicDetails, ISomeMoreDetails someMoreDetails, DedupeChecker dedupeChecker,
			Scoring scoring) {
		super();
		this.basicDetails = basicDetails;
		this.someMoreDetails = someMoreDetails;
		this.dedupeChecker = dedupeChecker;
		this.scoring = scoring;
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
}
