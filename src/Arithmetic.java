import java.util.ArrayList;
import java.util.List;

public class Arithmetic { // 숫자만 찾기

    private static final String BLANK = " ";
    private static final String STRING_SPLIT = "";

    private final List<Integer> numbers;

    public Arithmetic(String string, List<String> symbols) {
        this.numbers = validate(string, symbols);
    }

    private List<Integer> validate(String string, List<String> symbols) {
        String tempString = validateBlank(string);
        String[] strings = split(tempString);
        List<String> tempNumbers = findNumber(strings, symbols);
        return validateToInt(tempNumbers);
    }

    private String validateBlank(String string) {
        if (string == null || string.equals(BLANK)) {
            throw new NullPointerException("입력한 값이 공백입니다.");
        }
        return string;
    }

    private String[] split(String string) {
        return string.split(STRING_SPLIT);
    }

    private List<String> findNumber(String[] strings, List<String> symbols) {
        List<String> tempNumbers = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            findSameSymbol(i, symbols, tempNumbers, strings);
        }
        return tempNumbers;
    }

    private void findSameSymbol(int initialValue, List<String> symbol, List<String> tempNumbers, String[] strings) {
        if (!symbol.contains(strings[initialValue])) {
            tempNumbers.add(strings[initialValue]);
        }
    }

    private List<Integer> validateToInt(List<String> tempNumbers) {
        List<Integer> numbers = new ArrayList<>();
        for (String tempNumber : tempNumbers) {
            try {
                numbers.add(Integer.parseInt(tempNumber));
            } catch (NumberFormatException msg) {
                throw new NumberFormatException("올바른 숫자가 입력되지 않아 형변환 하지 못하였습니다.");
            }
        }
        return numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

}
