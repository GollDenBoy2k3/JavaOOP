package shapes;
import java.util.Scanner;
public class Hinhtrutron extends Hinhtron {
    public float h;
    // tên hình 
    public Hinhtrutron(){

        ten = "Hình Trụ Tròn";

    }
    //Nhap chiều cao của hình trụ tròn 
    public void Nhapchieucao(){
        Scanner sc= new Scanner(System.in);
        System.out.println("h=");
        h=sc.nextFloat();
    }
    // tính thể tích của hình trụ tròn 
    public void Tinhthetich(){
        tt=dt*h;
    }
}
