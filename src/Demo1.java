public class Demo1 {
    public static void main(String[] args) {
        int num = 19;
        System.out.println("Giá trị biến num " + num);
        System.out.println("OK");
        System.out.printf("Giá trị biến num = %d", num);
        int age = 21;
        String fullName = "Nguyễn Viết Đạt";
        boolean sex = true;
        System.out.println("Họ và tên: " + fullName + "Tuổi: " + age + "Giới tính: " + (sex ? "Name" : "Nam"));

        // In có định dạng
        System.out.printf("Họ và tên: %s Tuổi: %d Giới tính: %b \n", fullName, age, sex);
        System.out.printf("\t Họ tên: %s", fullName);
    }
}
