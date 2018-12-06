package com.orionsson.openclosedprinciple;

public class ClaimApprovalManager {
    public void processClaim(InsuranceSurveyor insuranceSurveyor){
        if(insuranceSurveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}
