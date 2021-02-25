package Sardana.LoanOrganisationSystem;

public interface ISomeMoreDetails {
	/*
	private Double income;
	private Double assets;
	private Double liability;
	private Integer aadharCardNumber;
	private String panCard;
	*/
	public Double calculateActualIncome();
	public Double getIncome();
	public void setIncome(Double income);
	public Double getAssets();
	public void setAssets(Double assets);
	public Double getLiability();
	public void setLiability(Double liability);
	public Integer getAadharCardNumber() ;
	public void setAadharCardNumber(Integer aadharCardNumber) ;
	public String getPanCard();
	public void setPanCard(String panCard);
	
}
