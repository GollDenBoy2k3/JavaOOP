import java.util.Scanner;
public class Bai5 {
    public static void main(String[]agr){
        Scanner sc = new Scanner(System.in);
       
        int tong=0;
        while(tong<100){
            System.out.println("Nhap vao mot so nguyen n:");
        int n = sc.nextInt();
            tong+=n;
          
        }
        System.out.println("Tong cua cac chu so da nhap la:"+tong);

    }
}
