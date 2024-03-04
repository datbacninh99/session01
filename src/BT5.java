import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ứng dụng tính toán điểm trung bình các môn , đánh giá học lực");
        float toan;
        System.out.println("Nhập điểm Toán: ");
        toan = Integer.parseInt(scanner.nextLine());
        float ly;
        System.out.println("Nhập điểm Lý: ");
        ly = Integer.parseInt(scanner.nextLine());
        float hoa;
        System.out.println("Nhập điểm Hóa: ");
        hoa = Integer.parseInt(scanner.nextLine());
        float van;
        System.out.println("Nhập điểm Văn: ");
        van = Integer.parseInt(scanner.nextLine());
        float anh;
        System.out.println("Nhập điểm Tiếng Anh: ");
        anh = Integer.parseInt(scanner.nextLine());
        float dtb = (toan + ly + hoa + van + anh) / 5;
        System.out.println("Điểm trung bình các môn là: " + dtb);

        if(0 <= dtb && dtb < 5) {
            System.out.println("Xếp loại yếu");
        } else if(5 <= dtb && dtb < 6.5) {
            System.out.println("Xếp loại trung bình");
        } else if(6.5 <= dtb && dtb < 8) {
            System.out.println("Xếp loại khá");
        } else if(8 <= dtb && dtb < 9) {
            System.out.println("Xếp loại giỏi");
        } else if(9 <= dtb) {
            System.out.println("Xếp loại xuất sắc");
        }
    }
}