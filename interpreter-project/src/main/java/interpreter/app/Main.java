package interpreter.app;

import interpreter.expression.*;

public class Main {

    public static void main(String[] args) {

        Expression five = new NumberExpression(5);
        Expression three = new NumberExpression(3);
        Expression two = new NumberExpression(2);

        Expression sum = new AddExpression(five, three);
        Expression result = new SubtractExpression(sum, two);

        System.out.println("Resultado da expressão (5 + 3) - 2 = "
                + result.interpret());
    }
}
