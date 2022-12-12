public class Output { // 결과값 리턴

    private static final int NEXT_INDEX = 1;
    private static final int INITIAL_INDEX = 0;

    public static void printResult(Expression expression, Arithmetic arithmetic) {
        int firstNumber = arithmetic.getNumbers().get(INITIAL_INDEX);
        for (int i = 0; i < expression.getSymbols().size(); i++) {
            int secondNumber = arithmetic.getNumbers().get(i + NEXT_INDEX);
            firstNumber = calculate(i, expression, firstNumber, secondNumber);
        }
        System.out.println("계산한 값 : " + firstNumber);
    }

    public static int calculate(int initialValue, Expression expression, int firstNumber, int secondNumber) {
        if (expression.getSymbols().get(initialValue).equals(Operator.PLUS.getSymbol())) {
            return firstNumber + secondNumber;
        }
        if (expression.getSymbols().get(initialValue).equals(Operator.MINUS.getSymbol())) {
            return firstNumber - secondNumber;
        }
        if (expression.getSymbols().get(initialValue).equals(Operator.MULTIPLY.getSymbol())) {
            return firstNumber * secondNumber;
        }
        if (expression.getSymbols().get(initialValue).equals(Operator.DIVIDE.getSymbol())) {
            return firstNumber / secondNumber;
        }
        return firstNumber;
    }

}