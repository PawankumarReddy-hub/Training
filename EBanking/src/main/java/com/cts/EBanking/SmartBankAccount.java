package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.List;

public class SmartBankAccount extends BankAccount {

    public SmartBankAccount(int customerId, String name, double balance, List<String> accounts) {
        super(customerId, name, balance, accounts);
    }


	public SmartBankAccount() {
		super();
	}

	@Override
    public double calculateFixedAccount(double amount, int months) {
        if (amount < 10000 || amount > 1000000 || months <= 0 || months >= 121) {
            throw new IllegalArgumentException("Invalid amount or tenure");
        }

        double rate = 0.10;
        int n = 12;
        double t = months / 12.0;
        double maturityAmount = amount * Math.pow((1 + (rate / n)), n * t);
        
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(maturityAmount));
    }

    @Override
    public double calculateRecurringAccount(double amount, int months) {
        if (amount < 1000 || amount > 50000 || months <= 0 || months >= 61) {
            throw new IllegalArgumentException("Invalid amount or tenure");
        }

        double rate = 0.07;
        double maturityAmount = (amount * months) + (amount * (months * (months + 1) / 24.0) * (rate));

        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(maturityAmount));
    }
}
