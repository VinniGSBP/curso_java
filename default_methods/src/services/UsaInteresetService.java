package services;

public class UsaInteresetService implements InterestService{
	
	private double interestRate;

	public UsaInteresetService(double interestRate) {
		this.interestRate = interestRate;
	}
	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
}
