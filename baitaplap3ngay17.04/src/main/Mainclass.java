package main;
import shapes.Hinhtron;
import shapes.Hinhtrutron;
import shapes.Hinhchunhat;
import shapes.Hinhvuong;

public class Mainclass{
    public static void main(String[]args){
        // Hình tròn
        Hinhtron ht = new Hinhtron();
        ht.XuatTen();
        ht.Nhapbankinh();
        ht.chuvi();
        ht.dientich();
        ht.incv();
        ht.indt();
        // hình Trụ Tròn....
        Hinhtrutron htt = new Hinhtrutron();
        htt.XuatTen();
        htt.Nhapchieucao();
        htt.Tinhthetich();
        htt.intt();
        //Hình chữ Nhật..
        Hinhchunhat hcn = new Hinhchunhat();
        hcn.XuatTen();
        hcn.Nhapchieudai();
        hcn.Nhapchieurong();
        hcn.Tinhchuvi();
        hcn.incv();
        hcn.Tinhdientich();
        hcn.indt();
        // Hình vuông
        Hinhvuong hv = new Hinhvuong();
        hv.XuatTen();
        hv.Nhapcanh();
        hcn.Tinhchuvi();
        hcn.incv();
        hcn.Tinhdientich();
        hcn.indt();
        
    }
}


