package chain.handlers;

import chain.model.ExpenseRequest;

public abstract class Approver {

    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public void approve(ExpenseRequest request) {
        if (canApprove(request.getAmount())) {
            approveRequest(request);
        } else if (nextApprover != null) {
            nextApprover.approve(request);
        } else {
            System.out.println("Despesa recusada: nenhum aprovador possui alçada para R$ " + request.getAmount());
        }
    }

    protected abstract boolean canApprove(double amount);

    protected abstract void approveRequest(ExpenseRequest request);
}
