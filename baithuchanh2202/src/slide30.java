import java.util.Scanner;

public class slide30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen: ");
        int n = scanner.nextInt();
        int tong = 0;
        while (n > 0) {
            tong += n % 10;
            n /= 10;
        }
        System.out.println("Tong cac chu so cua cac chu so :" +tong);
        scanner.close();
    }
}