package com.java_8_training.examples.design.factory_class;

public class PayeSalaryFactory implements ProofOfIncomeFactory {

    @Override
    public ProofOfIncome present(Applicant applicant) {
        return new PayeSalary(applicant);
    }

}
