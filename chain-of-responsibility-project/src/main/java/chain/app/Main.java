package chain.app;

import chain.handlers.Approver;
import chain.handlers.DirectorApprover;
import chain.handlers.ManagerApprover;
import chain.handlers.SupervisorApprover;
import chain.model.ExpenseRequest;

public class Main {

    public static void main(String[] args) {
        Approver supervisor = new SupervisorApprover();
        Approver manager = new ManagerApprover();
        Approver director = new DirectorApprover();

        supervisor.setNextApprover(manager);
        manager.setNextApprover(director);

        ExpenseRequest request1 = new ExpenseRequest("Compra de materiais de escritório", 750.00);
        ExpenseRequest request2 = new ExpenseRequest("Manutenção de equipamento", 3500.00);
        ExpenseRequest request3 = new ExpenseRequest("Compra de novo servidor", 15000.00);
        ExpenseRequest request4 = new ExpenseRequest("Reforma completa da empresa", 30000.00);

        supervisor.approve(request1);
        supervisor.approve(request2);
        supervisor.approve(request3);
        supervisor.approve(request4);
    }
}
