import java.util.List;

public class Manager {

    public void startCalculator() {
        String formula = Input.inputUserNumber();
        List<String> formulas = Factory.findOperator(Factory.divideUserInput(formula));
        Arithmetic arithmetic = new Arithmetic(formula, formulas);
        System.out.println(arithmetic.getNumbers());

        long firstNumber = arithmetic.getNumbers().get(0); // 1
        long result = firstNumber; // 1
        for (int i = 0; i < arithmetic.getNumbers().size() - 1; i++) {
            firstNumber += arithmetic.getNumbers().get(i + 1); // 2
            System.out.println(formulas.get(i));

            if (formulas.get(i).equals((Operator.PLUS.getSymbol()))) {
                Operator.PLUS.calculate(firstNumber, result);
            } else if (formulas.get(i).equals((Operator.MINUS.getSymbol()))) {
                Operator.MINUS.calculate(firstNumber, result);
            } else if (formulas.get(i).equals((Operator.MULTIPLY.getSymbol()))) {
                Operator.MULTIPLY.calculate(firstNumber, result);
            } else if (formulas.get(i).equals((Operator.DIVIDE.getSymbol()))) {
                Operator.DIVIDE.calculate(firstNumber, result);
            }
        }
        System.out.println(firstNumber);
    }

}