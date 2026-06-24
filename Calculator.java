import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("=== BÀI TẬP THỰC HÀNH CÁ NHÂN SỐ 1 ===");
        System.out.println("Họ và tên sinh viên: Lê Trọng Nghĩa");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        double a = sc.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        double b = sc.nextDouble();
        
        System.out.println("Tổng hai số là: " + (a + b));
    }
}
