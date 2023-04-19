package shapes;
import java.util.Scanner;
public class Hinhtron extends Hinhhoc {
    public float r;
    // dien ten cua hinh
    public Hinhtron(){
        ten="hinh tron";

    }
    //Nhap ban kinh them vao 
    public void Nhapbankinh(){
        Scanner sc= new Scanner(System.in);
        System.out.println("r=");
        r=sc.nextFloat();

    }
    //tinh chu vi
    public void chuvi(){
        cv=2*Pi*r;
    }
    //tinh dien tich
    public void dientich(){
        tt= Pi*r*r;
    }

}
