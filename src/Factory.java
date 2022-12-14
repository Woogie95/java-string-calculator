import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Factory {

    private static final String FORMULA_SPLIT = " ";

    public static String[] divideUserInput(String formula) { // 나누고 배열에 담고 반환
        return formula.split(FORMULA_SPLIT); // 2+3*4/2
    }

    public static List<String> findOperator(String[] formulas) { // 연산자 찾아서 리스트 반환
        List<String> operators = new ArrayList<>();
        for (String formula : formulas) {
            checkOperator(formula, operators);
        }
        return operators;
    }

    public static void checkOperator(String formula, List<String> operators) {
        for (Operator operator : Operator.values()) {
            if (formula.equals(operator.getSymbol())) {
                operators.add(formula);
            }
        }
    }

}
