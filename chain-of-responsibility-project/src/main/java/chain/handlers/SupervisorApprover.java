package chain.handlers;

import chain.model.ExpenseRequest;

public class SupervisorApprover extends Approver {

    @Override
    protected boolean canApprove(double amount) {
        return amount <= 1000.00;
    }

    @Override
    protected void approveRequest(ExpenseRequest request) {
        System.out.println("Supervisor aprovou: " + request.getDescription() + " - R$ " + request.getAmount());
    }
}
