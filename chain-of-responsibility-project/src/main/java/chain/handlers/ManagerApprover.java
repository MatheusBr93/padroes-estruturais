package chain.handlers;

import chain.model.ExpenseRequest;

public class ManagerApprover extends Approver {

    @Override
    protected boolean canApprove(double amount) {
        return amount <= 5000.00;
    }

    @Override
    protected void approveRequest(ExpenseRequest request) {
        System.out.println("Gerente aprovou: " + request.getDescription() + " - R$ " + request.getAmount());
    }
}
