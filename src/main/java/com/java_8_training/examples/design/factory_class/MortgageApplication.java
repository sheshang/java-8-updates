package com.java_8_training.examples.design.factory_class;

public class MortgageApplication {

    private final Applicant applicant;
    private final ProofOfIncomeFactory proofOfIncomeFactory;

    public MortgageApplication(final Applicant applicant, final ProofOfIncomeFactory proofOfIncomeFactory) {
        this.applicant = applicant;
        this.proofOfIncomeFactory = proofOfIncomeFactory;
    }

    public void apply() {
        if (applicant.getAge() < 18) {
            System.out.println("Mortgage DENIED: You are too young");
            return;
        }

        final ProofOfIncome proofOfIncome = proofOfIncomeFactory.present(applicant);
        System.out.println("Found proof of income: " + proofOfIncome);
    }

}
