package com.java_8_training.examples.design.factory_class;

public class FactoryClassExampleMain {

    public static void main(String[] args) {
        final Applicant raoul = new Applicant("Dr Raoul-Gabriel Urma", 25);
        final ProofOfIncomeFactory proofOfIncomeFactory = new TaxReturnFactory();
        final MortgageApplication mortgageApplication = new MortgageApplication(raoul, proofOfIncomeFactory);

        mortgageApplication.apply();
    }

}
