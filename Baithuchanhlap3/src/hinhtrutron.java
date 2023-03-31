import java.util.Scanner;


public class hinhtrutron {
    
    public float Bankinh, chieucao, chuvi, dientich, thetich;
    public float Pi =3.14;
    
    public class nhapbkcc(
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap vao ban kinh hinh tru tron:");
        Bankinh = sc.nextFloat();
        System.out.println("Nhap vao chieu cao cua hinh tru tron:");
        chieucao = sc.nextFloat();
    )
    public class chuvi{
        chuvi= Bankinh * 2 * Pi;
        return chivi;
    }
    public class dientich{
        dientich = Bankinh * Bankinh * Pi;
        return dientich;
        
    }
    public class thetich{
        thetich = Pi * Bankinh * Bankinh * chieucao;
        return thetich;
    }
    
        public static void main(String[] args){

            System.out.println("chuvi cua hinh tru tron la:"+ chuvi );
            System.out.println("dientich cua hinh tru tron la:" + dientich);
            System.out.println("thetich cua hinh tru tron la:"+ thetich);
        }
    
}
