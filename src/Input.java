import java.util.Scanner;

public class Input {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static String input() {
        System.out.println("계산할 값을 입력해주세요.");
        return SCANNER.nextLine();
    }

}
