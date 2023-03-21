import java.util.Scanner;
public class Bai3 {

    /**
     * @param args
     */
    public static void main (String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten cua ban:");
        String name = sc.nextLine();
       System.out.println("Nhap vao nam sinh cua ban:");
       int namsinh=sc.nextInt();
       int tuoi;
       tuoi = 2023 - namsinh;
       if(tuoi<16){
        System.out.println("Ban " + name +tuoi+ " tuoi o do tuoi vi thanh nien");
       }else if(tuoi>=16 && tuoi <18){
        System.out.println("Ban " + name +tuoi+  " tuoi o do tuoi truong thanh");
       }else if(tuoi>=18){
        System.out.println("Ban " + name + tuoi + " tuoi da gia");
       }

    }
}
