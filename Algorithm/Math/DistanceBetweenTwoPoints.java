package Algorithms.Math;

import java.awt.geom.Point2D;

//Given two points, Calculate the Distance Between Two Points using Java
public class DistanceBetweenTwoPoints {
  public static void main(String[] args) {
/*Let’s say we have two points on a plane: the first point A has the coordinates (x1, y1), and the second point B has the coordinates (x2, y2).
We want to calculate AB, the distance between the points.*/

    //Approach 1: Using Pythagoras theorem (hypotenuse)^2=Sum of squares of other two sides
    //Calculate point C, where the angle would form 90 degree
    //for eg: A (x1,y1)= (3,5), B(x2,y2)=(7,1) , C would be (x1,y2) ie: (3,1) which would become(x3,y3)
    //Distance between A and C is mod(y1-y3)=4
    //Distance between C and B is mod(x1-x3)=3
    //By pythagoras theorem, AB^2=AC^2+BC^2 => 4^2+3^2 =  16+9 =25
    //AB =square root of 25 =5

    //Math formula distance = sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1))
    double x1 = 3;
    double y1 = 4;
    double x2 = 7;
    double y2 = 1;
    System.out.println("Using formulae" +calculateDistanceBetweenPoints(x1, y1, x2, y2));

    System.out.println("Using Math.hypot() method"+calculateDistanceBetweenPointsApproach2(x1, y1, x2, y2));

    System.out.println("Using java.awt library"+calculateDistanceBetweenPointsApproach3(x1, y1, x2, y2));
  }

  //Using formulae
  private static double calculateDistanceBetweenPoints(double x1, double y1,
                                                       double x2,
                                                       double y2) {
    return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
  }

  //Using Math.hypot() method
  private static double calculateDistanceBetweenPointsApproach2(double x1,
                                                                double y1,
                                                                double x2,
                                                                double y2) {
    double ac = Math.abs(y2 - y1);
    double cb = Math.abs(x2 - x1);

    return Math.hypot(ac, cb);
  }

  //Using java.awt library
  private static double calculateDistanceBetweenPointsApproach3(double x1,
                                                                double y1,
                                                                double x2,
                                                                double y2) {
    return Point2D.distance(x1, y1, x2, y2);
  }

}
