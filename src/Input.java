import java.util.Scanner;

public class Input {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static String inputUserNumber() {
        System.out.println("계산할 식을 입력해주세요.");
        return SCANNER.nextLine();
    }

}
