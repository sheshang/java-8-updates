package com.java_8_training.examples.design.factory_class;

public class TaxReturn implements ProofOfIncome {
    public TaxReturn(Applicant applicant) {

    }

    @Override
    public String toString() {
        return "Tax Return";
    }
}
