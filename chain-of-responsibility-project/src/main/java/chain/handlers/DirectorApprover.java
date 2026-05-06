package chain.handlers;

import chain.model.ExpenseRequest;

public class DirectorApprover extends Approver {

    @Override
    protected boolean canApprove(double amount) {
        return amount <= 20000.00;
    }

    @Override
    protected void approveRequest(ExpenseRequest request) {
        System.out.println("Diretor aprovou: " + request.getDescription() + " - R$ " + request.getAmount());
    }
}
