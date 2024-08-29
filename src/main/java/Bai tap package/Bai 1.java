import java.util.Scanner;
class Bai1  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap so nguyen bat ky: ");
        int x = sc.nextInt();
        
        int square = x*x;
        System.out.println("Binh phuong so " + x + " la:" + square);
        
        int cube = x*x*x;
        System.out.println("Luy thua 3 cua so "+x+" la: "+ cube);
        
    //     sc.close();
    }
}