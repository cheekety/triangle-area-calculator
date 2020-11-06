import java.util.Scanner;

public class MyTriangle {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter three sides of a triangle: ");

    while (1 == 1) {
    double x = input.nextDouble();
    double y = input.nextDouble();
    double z = input.nextDouble();

    if (isValid(x, y, z) == false)
        System.out.print("You did not enter a triangle. Try again: ");
        else
        if (isValid(x, y, z) == true){
        System.out.println("The area of the triangle is "+area(x, y, z));
        break;}
        }

}
    public static boolean isValid(double side1, double side2, double side3) {
        boolean trueFalse;
        if ((side1 + side2 > side3) || (side1 + side3 > side2) || (side2 + side3 > side1))
            trueFalse = true;
            else
                trueFalse = false;
        return trueFalse;

    }
    public static double area(double side1, double side2, double side3) {
        double area;
        double s = (side1 + side2 + side3)/2.0;
        area = Math.sqrt(s*(s - side1)*(s-side2)*(s-side3));
        return area;
    }
}