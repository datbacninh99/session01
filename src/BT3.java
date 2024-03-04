import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        // Nhập 1 số từ 0 - 999 và đổi ra tiếng Anh
        //     X              Y               Z
        // Hàng trăm      Hàng chục      Hàng đon vị
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Nhập số: ");
            int n = Integer.parseInt(scanner.nextLine());
            int hangTram = n / 100;
            int hangChuc = n % 100 / 10;
            int hangdonVi = n % 10;
            String chuoi = "";

            if (n >= 0 && n <= 999) {
                // Số từ 0 - 999
                System.out.println("Hàng trăm: " + hangTram);
                System.out.println("Hàng chục: " + hangChuc);
                System.out.println("Hàng đơn vị: " + hangdonVi);
                switch (hangTram) {
                    case 1: chuoi = "One hundred";
                    break;
                    case 2: chuoi = "Two hundred";
                    break;
                    case 3: chuoi = "Three hundred";
                    break;
                    case 4: chuoi = "Four hundred";
                    break;
                    case 5: chuoi = "Five hundred";
                    break;
                    case 6: chuoi = "Six hundred";
                    break;
                    case 7: chuoi = "Seven hundred";
                    break;
                    case 8: chuoi = "Eight hundred";
                    break;
                    case 9: chuoi = "Nine hundred";
                    break;
                }
                if(hangChuc >= 2){
                    switch (hangChuc) {
                        case 2:
                        chuoi += " Twenty";
                        break;
                        case 3:
                        chuoi += " Thirty";
                        break;
                        case 4:
                        chuoi += " Forty";
                        break;
                        case 5:
                        chuoi += " Fifty";
                        break;
                        case 6:
                        chuoi += " Sixty";
                        break;
                        case 7:
                        chuoi += " Seventy";
                        break;
                        case 8:
                        chuoi += " Eighty";
                        break;
                        case 9:
                        chuoi += " Ninety";
                        break;
                    }
                }
                if (hangChuc == 1) {
                    switch (hangChuc) {
                        case 0:
                            chuoi += " Ten";
                            break;
                        case 1:
                            chuoi += " Eleven";
                            break;
                        case 2:
                            chuoi += " Twelve";
                            break;
                        case 3:
                            chuoi += " Thirteen";
                            break;
                        case 4:
                            chuoi += " Forteen";
                            break;
                        case 5:
                            chuoi += " Fifteen";
                            break;
                        case 6:
                            chuoi += " Sixteen";
                            break;
                        case 7:
                            chuoi += " Seventeen";
                            break;
                        case 8:
                            chuoi += " Eighteen";
                            break;
                        case 9:
                            chuoi += " Nineteen";
                            break;
                    }
                }
                if (hangChuc != 1) {
                    switch (hangChuc) {
                        case 1:
                            chuoi += " One";
                            break;
                        case 2:
                            chuoi += " Two";
                            break;
                        case 3:
                            chuoi += " Three";
                            break;
                        case 4:
                            chuoi += " Four";
                            break;
                        case 5:
                            chuoi += " Five";
                            break;
                        case 6:
                            chuoi += " Six";
                            break;
                        case 7:
                            chuoi += " Seven";
                            break;
                        case 8:
                            chuoi += " Eight";
                            break;
                        case 9:
                            chuoi += " Nine";
                            break;
                    }
                }
                System.out.println(chuoi);
            } else {
                System.out.println("Số nằm ngoài khoảng 0 - 999");
            }
        }
    }
}