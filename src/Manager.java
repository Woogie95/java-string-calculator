public class Manager {

    public void startCalculator() {

        String input = Input.input();
        Expression expression = new Expression(input); // 문자
        Arithmetic arithmetic = new Arithmetic(input, expression.getSymbols()); // 숫자

        System.out.println("입력된 숫자 : " + arithmetic.getNumbers());
        System.out.println("입력된 연산자 : " + expression.getSymbols());

        System.out.println();
        Output.printResult(expression, arithmetic);
    }

}