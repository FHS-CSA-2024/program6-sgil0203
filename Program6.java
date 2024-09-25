import java.util.Scanner;
public class Program6 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner (System.in);
    System.out.println("Enter radius: ");
    double radius = myObj.nextDouble();
    double diameter = radius * 2;
    int diameter1 = (int)(diameter * 1000);
    double diameter2 = (double)diameter1 / 1000; 
    final double pi = 3.142;
    double circumference = pi * diameter;
    int circumference1 = (int)(circumference * 1000);
    double circumference2 = (double)circumference1 / 1000;
    double area = pi * radius * radius;
    int area1 = (int)(area * 1000);
    double area2 = (double)area1 / 1000;
    System.out.println("The radius is: " + radius);
    System.out.println("The diameter is: " + diameter2);
    System.out.println("The circumference is: " +       circumference2); 
    System.out.println("The area is: " + area2);
  }
}
//Enter radius: 3.172 
//The radius is: 3.172
//The diameter is: 6.344 
//The circumference is 19.932 
//The area is 31.613

