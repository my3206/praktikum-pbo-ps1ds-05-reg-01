package guided;

public class circle01 {
    public static final double PI = 3.14159;

    public static double radiansToDegrees(double radians) {
        return radians * (180.0 / PI);  
    }

    public double r;

    public double area(){
        return PI * r * r;
    }

    public double circumference(){
        return 2 * PI * r;
    }
}
