package services;

public class BrazilInteresetService implements InterestService {

	private double interestRate;

	public BrazilInteresetService(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
