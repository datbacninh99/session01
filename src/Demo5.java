import java.util.Scanner;

public class Demo5 {

    // Nhập vào 1 ký tự kiểm tra xem ký tự đó là nguyên âm hay phụ âm
    // Bước 1: Khai báo biến String
    // Bước 2: Khởi tạo đối tượng Scanner
    // Bước 3: Nhập giá trị cho biến String
    // Bước 4: switch...case

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String character;
        System.out.println("Nhập vào 1 ký tự kiểm tra xem ký tự đó là nguyên âm hay phụ âm");
        character = scanner.nextLine();
        if (character.length() != 1) {
            System.out.println("Chỉ được nhập 1 ký tự");
            return;
        }
        switch(character) {
            case "u", "e", "o", "a", "i":
                System.out.println(character + " là nguyên âm");
                break;
            default:
                System.out.println(character + " là phụ âm");
        }
    }
}