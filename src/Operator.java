import java.util.function.BiFunction;

public enum Operator {

    PLUS("+", Long::sum) {

    },
    MINUS("-", (firstNumber, secondNumber) -> (firstNumber - secondNumber)) {

    },
    MULTIPLY("*", (firstNumber, secondNumber) -> (firstNumber * secondNumber)) {

    },
    DIVIDE("/", (firstNumber, secondNumber) -> (firstNumber / secondNumber)) {

    };

    private final String symbol;
    private final BiFunction<Long, Long, Long> expression;

    Operator(String symbol, BiFunction<Long, Long, Long> expression) {
        this.symbol = symbol;
        this.expression = expression;
    }

    public long calculate(long firstNumber, long secondNumber) {
        return expression.apply(firstNumber, secondNumber);
    }

    public String getSymbol() {
        return symbol;
    }

}