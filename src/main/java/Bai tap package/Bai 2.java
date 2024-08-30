import java.util.Scanner;
class Bai2 {
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Nhap so nguyen bat ky:");
    //     int x = sc.nextInt();
    //     int fac = 1;
    //     if (x <= 0){
    //         System.out.println("So nhap vao la so am. Khong tinh duoc giai thua. Vui long nhap so nguyen duong.");
    //     }
    //     else {
    //     for (int i = 1; i <= x; i++){
    //       fac *=i;};
    //     System.out.println("Giai thua cua so nguyen vua nhap la: " + fac);
    // }
    // }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = 0;
    int fac = 1;
    while (x <= 0) {
        System.out.println("Nhap so nguyen bat ky:");
        x = sc.nextInt();
    }
    for (int i = 1; i <= x; i++) {
        fac *= i;
    }
    System.out.println("Giai thua cua so nguyen vua nhap la: " + fac);
}
}