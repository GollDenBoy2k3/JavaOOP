import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        do{
        System.out.print("Nhap vao gia tri a: ");
         a = sc.nextInt();
        if(a%2==0){
            System.out.println("a la so chan");
        }else{
            System.out.println("a la so le");
        }
    }while(a>=0);
    
}
}