 public class Main {
  public static void main(String[] args) {
    //Bai 1
     System.out.println("Welcome to the world of Java");
    
    //Put value in example
    Area square = new Area(3);
    System.out.println("Area of square is:" + square);

    Area rectangle = new Area(2, 10);
    System.out.println("Area of rectangle is:" + rectangle);

    //Compare m and n
    int m =100;
    int n = 200;
    
    if (m == 0){
      System.out.println("m is equal to 0");
    }

    if (m>n){
      System.out.println("m is greater than n");
    }
    else if (m<n){
      System.out.println("m is less than n");
    }
    else {
      System.out.println("m is equal to n");
    }

    if (n%2==0){
      System.out.println("n is even");
    }
    else {
      System.out.println("n is odd");
    }

    int sum = 0;
    for (int i = 1; i <= 100; i+=1){
      if (i%7==0){
        sum = i;
        System.out.println("The sum of all numbers divisible by 7 is: " + sum);
      };
    }
    
  }
 }



