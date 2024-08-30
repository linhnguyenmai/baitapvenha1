import java.util.Scanner;
class Bai1  {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
        
    //     System.out.println("Nhap so nguyen bat ky: ");
    //     int x = sc.nextInt();
        
    //     int square = x*x;
    //     System.out.println("Binh phuong so " + x + " la:" + square);
        
    //     int cube = x*x*x;
    //     System.out.println("Luy thua 3 cua so "+x+" la: "+ cube);
        
    //     sc.close();
    // }

// chữa bài tập về nhà
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Nhap so nguyen bat ky: ");
    int inputNumber = sc.nextInt();

    int square = (int) Math.pow(inputNumber, 2);
    System.out.println("Binh phuong so " + inputNumber + " la:" + square);

    int cube = (int) Math.pow(inputNumber, 3);
    System.out.println("Luy thua 3 cua so " + inputNumber + " la: " + cube);

     sc.close();
}
}