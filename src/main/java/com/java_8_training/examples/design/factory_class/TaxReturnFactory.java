package com.java_8_training.examples.design.factory_class;

public class TaxReturnFactory implements ProofOfIncomeFactory {

    @Override
    public ProofOfIncome present(Applicant applicant) {
        return new TaxReturn(applicant);
    }

}
