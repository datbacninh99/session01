import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Mời bạn nhập số từ 2 đến 8 ");
        num = Integer.parseInt(scanner.nextLine());
        switch (num){
            case 2:
                System.out.println("Hôm nay là thứ hai");
                break;
            case 3:
                System.out.println("Hôm nay là thứ ba");
                break;
            case 4:
                System.out.println("Hôm nay là thứ tư");
                break;
            case 5:
                System.out.println("Hôm nay là thứ năm");
                break;
            case 6:
                System.out.println("Hôm nay là thứ sáu");
                break;
            case 7:
                System.out.println("Hôm nay là thứ bảy");
                break;
            case 8:
                System.out.println("Hôm nay là chủ nhật");
                break;
            default:
                System.out.println("Chịu thôi không biết đâu!");
        }
    }
}
