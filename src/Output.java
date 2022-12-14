//public class Output { // 결과값 리턴
//
//    private static final int NEXT_INDEX = 1;
//    private static final int INITIAL_INDEX = 0;
//
//    public static void printResult(Expression expression, Arithmetic arithmetic) {
//        int firstNumber = arithmetic.getNumbers().get(INITIAL_INDEX);
//        for (int i = 0; i < expression.getSymbols().size(); i++) {
//            int secondNumber = arithmetic.getNumbers().get(i + NEXT_INDEX);
//            firstNumber = calculate(i, expression, firstNumber, secondNumber);
//        }
//        System.out.println("계산한 값 : " + firstNumber);
//    }
//
//    private static int calculate(int initialValue, Expression expression, int firstNumber, int secondNumber) {
//        try {
//            if (expression.getSymbols().get(initialValue).equals(Operator.PLUS.getSymbol())) {
//                return firstNumber + secondNumber;
//            }
//            if (expression.getSymbols().get(initialValue).equals(Operator.MINUS.getSymbol())) {
//                return firstNumber - secondNumber;
//            }
//            if (expression.getSymbols().get(initialValue).equals(Operator.MULTIPLY.getSymbol())) {
//                return firstNumber * secondNumber;
//            }
//            if (expression.getSymbols().get(initialValue).equals(Operator.DIVIDE.getSymbol())) {
//                return firstNumber / secondNumber;
//            }
//        } catch (ArithmeticException arithmeticException) {
//            throw new ArithmeticException("숫자 0으로는 나눗셈을 할 수 없습니다.");
//        }
//        return firstNumber;
//    }
//
//}