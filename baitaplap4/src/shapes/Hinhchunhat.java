package shapes;
import java.util.Scanner;
public class Hinhchunhat extends Hinhhoc{
    // khai bao biến
    public float cd;
    public float cr;
    //ten của hình
    public Hinhchunhat(){
        ten = "Hình Chữ Nhật";

    }
    // Yêu cầu ng nhập vào cd,cr
    public void Nhapchieudai(){
        Scanner sc=new Scanner(System.in);
        System.out.println("cd=");
        cd=sc.nextFloat();}

    public void Nhapchieurong(){

       Scanner sc= new Scanner(System.in);
        System.out.println("cr=");
        cr=sc.nextFloat();
    }

    //tinh dien tich hình chữ nhật
    public void Tinhchuvi(){
        cv=(cd+cr)*2;
    }
    public void Tinhdientich(){
        dt= cd*cr;
    }
}
