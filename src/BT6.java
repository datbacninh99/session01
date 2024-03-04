import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số tự nhiên và kiểm tra xem số đó có chia hết cho 3 và 5 không");
        int num = Integer.parseInt(scanner.nextLine());

        if(num % 3 == 0 && num % 5 == 0) {
            System.out.println("Chia hết cho cả 3 và 5");
        } else if(num % 3 == 0 && num % 5 != 0) {
            System.out.println("Chỉ chi hết cho 3");
        } else if(num % 3 != 0 && num % 5 == 0) {
            System.out.println("Chỉ chia hết cho 5");
        } else if(num % 3 != 0 && num % 5 != 0) {
            System.out.println("Không chia hết cho 3, cũng không chia hết cho 5");
        }
    }
}