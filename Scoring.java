package Sardana.LoanOrganisationSystem;

public class Scoring {
	private Double amount;
	private Integer Age;
	private String LoanType;
	private Double Income;
	private Integer scoring;
	private Integer durationMonth;
	public Double getAmount() {
		return amount;
	}
	public Scoring() {
		scoring = 0;
	}
	public void setAmount(Double amount) {
		if(amount > 50000) {
			scoring += 2;
		}else {
			scoring += 1;
		}
		this.amount = amount;
	}
	public Boolean loanApproval() {
		if(scoring < 4) {
			return false;
		}
		return true;
	}

	public Integer getAge() {
		return Age;
	}

	public void setAge(Integer age) {
		if(age < 60) {
			scoring += 2;
		}else {
			scoring += 1;
		}
		Age = age;
	}

	public String getLoanType() {
		return LoanType;
	}

	public void setLoanType(String loanType) {
		LoanType = loanType;
	}

	public Double getIncome() {
		return Income;
	}

	public void setIncome(Double income) {
		if(income > 500000) {
			scoring += 2;
		}else {
			scoring += 1;
		}
		Income = income;
	}

	public Integer getDurationMonth() {
		return durationMonth;
	}
	public Double getEMI() {
		Integer time = getDurationMonth();
		Double principal = getAmount();
		Double rate = 20.0;
        Double emi;
        rate = rate / (12 * 100);
        time = time * 12;
        emi = (principal * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1);
        return emi;
    }
	public void setDurationMonth(Integer durationMonth) {
		this.durationMonth = durationMonth;
	}
}
