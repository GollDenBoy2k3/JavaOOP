package hinhtrutron;
import java.util.Scanner;


public class hinhtrutron {
    
    public float Bankinh, chieucao, chuvi, dientich, thetich;
    public float Pi =3.14;
    
    public void nhapbk(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap vao ban kinh hinh tru tron:");
        Bankinh = sc.nextFloat();
    }
    public void nhapcc(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap vao chieu cao cua hinh tru tron:");
        chieucao = sc.nextFloat();
    }
    
    public float chuvi(){
        chuvi= Bankinh * 2 * Pi;
        return chivi;
    }
    public float dientich(){
        dientich = Bankinh * Bankinh * Pi;
        return dientich;
        
    }
    public float thetich(){
        thetich = Pi * Bankinh * Bankinh * chieucao;
        return thetich;
    }
    public void inracv(){
        System.out.println("chu vi hinh tron co ban kinh %.2f la : %.2f", Bankinh, chieucao);
    }
    public void inradt(){
        System.out.println("dien tich hinh tron co ban kinh %.2f la : %.2f", Bankinh, dientich);
    }
    public void inratt(){
        System.out.println(" hinh trothe tich co ban kinh %.2f la : %.2f", Bankinh, thetich);
    }
    
    public static void main(String[] args){
        hinhtrutron htt = new hinhtrutron();
        htt.nhapbk();
        htt.nhapcc();
        htt.chuvi();
        htt.dientich();
        htt.thetich();
        htt.inracv();
        htt.inradt();
        htt.inratt();
    }
}
