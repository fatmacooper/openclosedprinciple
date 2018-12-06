package com.orionsson.openclosedprinciple;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClaimApprovalManagerTest {

    @Test
    public void testProcessClaim() {
        HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
        ClaimApprovalManager claimApprovalManager1 =new ClaimApprovalManager();
        claimApprovalManager1.processClaim(healthInsuranceSurveyor);

        VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
        ClaimApprovalManager claimApprovalManager2 = new ClaimApprovalManager();
        claimApprovalManager2.processClaim(vehicleInsuranceSurveyor);
    }
}