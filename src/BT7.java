import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ứng dụng cho phép người dùng nhập vào 1 số từ 0 - 9 và hiển thị cách đọc của số đó ra màn hình");
        int num = Integer.parseInt(scanner.nextLine());

        if(0 < num && num > 9) {
            System.out.println("Số không hợp lệ");
            return;
        }

        switch(num) {
            case 0:
                System.out.println("Số Không");
                break;
            case 1:
                System.out.println("Số Một");
                break;
            case 2:
                System.out.println("Số Hai");
                break;
            case 3:
                System.out.println("Số Ba");
                break;
            case 4:
                System.out.println("Số Bốn");
                break;
            case 5:
                System.out.println("Số Năm");
                break;
            case 6:
                System.out.println("Số Sáu");
                break;
            case 7:
                System.out.println("Số Bảy");
                break;
            case 8:
                System.out.println("Số Tám");
                break;
            case 9:
                System.out.println("Số Chín");
                break;
        }
    }
}
