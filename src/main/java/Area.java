public class Area{
  private double length;
  private double height;

  //Create value for length and height
  public Area(double side){
    this.length = side;
    this.height = side;
  }

  //Create 2 values for length and height
  public Area(double length, double height){
    this.length = length;
    this.height = height;
  }

  //Calculate the area
  public double getArea(){
    return length * height;
  }

  //Present Area
@Override
  public String toString(){
    return "Area: " + getArea();
  }
}


