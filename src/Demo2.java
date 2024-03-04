import java.util.Calendar;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng scanner
        Scanner scanner = new Scanner(System.in);
        // Khai báo biến String lưu tên người nhập từ bàn phím
        String fullName;
        int age;
        String address;
        boolean sex;
        System.out.println("Mời bạn nhập vào họ tên ");
        fullName = scanner.nextLine();
        System.out.println("Họ và tên của bạn là " + fullName);
        System.out.println("Mời bạn nhập vào tuổi ");
        // age = scanner.nextInt();
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập vào địa chỉ ");
        address = scanner.nextLine();
        System.out.println("Mời bạn nhập vào giới tính (true(Nam)/false(Nữ)");
        sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("===THÔNG TIN CỦA BẠN===");
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Năm sinh: " + (Calendar.getInstance().get(Calendar.YEAR) - age));
        System.out.println("Giới tính: " + (sex ? "Nam" : "Nữ"));
    }
}