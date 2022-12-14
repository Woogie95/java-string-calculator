
public class Application {

    public static void main(String[] args) {
        try {
            Manager manager = new Manager();
            manager.startCalculator();
        } catch (IllegalArgumentException msg) {
            System.out.println(msg.getMessage());
        } catch (Exception msg) {
            System.out.println("예기치 못한 예외가 발생하였습니다.");
        }
    }

}
