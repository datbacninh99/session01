import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tính chu vi và diện tích của hình chữ nhật");
        int dai;
        System.out.println("Nhập chiều dài: ");
        dai = Integer.parseInt(scanner.nextLine());
        int rong;
        System.out.println("Nhập chiều rộng: ");
        rong = Integer.parseInt(scanner.nextLine());
        int chuvi = (dai + rong) * 2;
        System.out.println("Chu vi hình chữ nhật là: " + chuvi);
        int dientich = dai * rong;
        System.out.println("Diện tích hình chữ nhật là: " + dientich);
    }
}
