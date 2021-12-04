package com.java_8_training.examples.design.factory_class;

public class PayeSalary implements ProofOfIncome {

    public PayeSalary(Applicant applicant) {

    }

    @Override
    public String toString() {
        return "PAYE Salary";
    }

}
