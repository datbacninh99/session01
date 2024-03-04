public class Demo3 {
    public static void main(String[] args) {
        int age = 66;

        // Kiểm tra tuổi nếu lớn hơn 18 thì cho xem phim không thì kết thúc chương trình
        if(age >= 18) {
            if(age > 65) {
                System.out.println("Mời bạn xem thời sự");
            } else {
                System.out.println("Mời bạn xem Ozawa");
            }
        } else if(age > 16) {
            System.out.println("Mời bạn xem Doraemon");
        } else {
            System.out.println("Xem Thơ Nguyễn");
        }
    }
}