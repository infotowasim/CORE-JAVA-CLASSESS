package com.wasim;

public class PlatinumAccount extends GoldAccount{
	
	@Override
	public void rateOfInterest() {
		System.out.println("7% PA");
	}

	public static void main(String[] args) {
		PlatinumAccount platinumAccount=new PlatinumAccount();
		platinumAccount.onlineBanking();
		platinumAccount.rateOfInterest();
	}
}
