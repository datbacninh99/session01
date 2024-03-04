import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ứng dụng chuyển đổi tiền tệ");
        System.out.println("VNĐ: ");
        float VND = Integer.parseInt(scanner.nextLine());
        float USD = VND / 25000;
        System.out.println("USD: " + USD);
    }
}
