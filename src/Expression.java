import java.util.ArrayList;
import java.util.List;

public class Expression {

    private static final String BLANK = " ";
    private static final String STRING_SPLIT = "";

    private final List<String> symbols;

    public Expression(String symbols) {
        this.symbols = validate(symbols);
    }

    private List<String> validate(String string) {
        String tempString = validateBlank(string);
        String[] strings = split(tempString);
        return findSymbol(strings);
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

    private List<String> findSymbol(String[] strings) {
        List<String> symbols = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            findPlus(i, strings[i], symbols, strings);
            findMinus(i, strings[i], symbols, strings);
            findMultiply(i, strings[i], symbols, strings);
            findDivide(i, strings[i], symbols, strings);
        }
        return symbols;
    }

    private void findPlus(int initialValue, String string, List<String> symbols, String[] strings) {
        if (string.equals(Operator.PLUS.getSymbol())) {
            symbols.add(Operator.PLUS.getSymbol());
            strings[initialValue] = STRING_SPLIT;
        }
    }

    private void findMinus(int initialValue, String string, List<String> symbols, String[] strings) {
        if (string.equals(Operator.MINUS.getSymbol())) {
            symbols.add(Operator.MINUS.getSymbol());
            strings[initialValue] = STRING_SPLIT;
        }
    }

    private void findMultiply(int initialValue, String string, List<String> symbols, String[] strings) {
        if (string.equals(Operator.MULTIPLY.getSymbol())) {
            symbols.add(Operator.MULTIPLY.getSymbol());
            strings[initialValue] = STRING_SPLIT;
        }
    }

    private void findDivide(int initialValue, String string, List<String> symbols, String[] strings) {
        if (string.equals(Operator.DIVIDE.getSymbol())) {
            symbols.add(Operator.DIVIDE.getSymbol());
            strings[initialValue] = STRING_SPLIT;
        }
    }

    public List<String> getSymbols() {
        return symbols;
    }

}
