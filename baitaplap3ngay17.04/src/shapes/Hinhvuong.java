package shapes;
import java.util.Scanner;
public class Hinhvuong extends Hinhchunhat {
// đặt tên hình
public Hinhvuong(){
    ten = "Hình Vuông";

}
//Nhap canh
public void Nhapcanh(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap canh Hinh vuong=");
    cd=cr=sc.nextFloat();
}
}
