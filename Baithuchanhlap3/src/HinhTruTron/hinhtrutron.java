package HinhTruTron;
import java.util.Scanner;


public class hinhtrutron {
    
    public float Bankinh, chieucao, chuvi, dientich, thetich;
    public float Pi =(float) 3.14;
    
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
        return chuvi;

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
        System.out.printf("chu vi hinh tron co ban kinh %.2f la : %.2f", Bankinh, chieucao);
    }
    public void inradt(){
        System.out.printf("dien tich hinh tron co ban kinh %.2f la : %.2f", Bankinh, dientich);
    }
    public void inratt(){
        System.out.printf(" hinh trothe tich co ban kinh %.2f la : %.2f", Bankinh, thetich);
    }
    
}
