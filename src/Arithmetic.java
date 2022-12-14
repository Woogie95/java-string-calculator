import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arithmetic { // 숫자 찾기

    private static final String BLANK = " ";

    private final List<Long> numbers;

    public Arithmetic(String formula, List<String> operators) {
        this.numbers = validate(formula, operators);
    }

    private List<Long> validate(String formula, List<String> operators) {
        String tempFormula = validateBlank(formula);
        String[] tempFormulas = divideUserFormula(tempFormula);
        List<String> tempNumbers = findNumber(tempFormulas, operators);
        return validateToInt(tempNumbers);
    }

    private String validateBlank(String formula) {
        if (formula.equals(BLANK)) {
            throw new IllegalArgumentException("입력한 값이 공백입니다.");
        }
        return formula;
    }

    private String[] divideUserFormula(String formula) {
        return formula.split(BLANK);
    }

    private List<String> findNumber(String[] formulas, List<String> operators) {
        List<String> numbers = new ArrayList<>();
        for (String formula : formulas) {
            if (!operators.contains(formula)) {
                numbers.add(formula);
            }
        }
        return numbers;
    }

    private List<Long> validateToInt(List<String> tempNumbers) {
        List<Long> numbers = new ArrayList<>();
        for (String tempNumber : tempNumbers) {
            try {
                numbers.add(Long.parseLong(tempNumber));
            } catch (NumberFormatException msg) {
                throw new NumberFormatException("올바른 숫자가 입력되지 않아 형변환 하지 못하였습니다.");
            }
        }
        return numbers;
    }

    public List<Long> getNumbers() {
        return numbers;
    }

}
