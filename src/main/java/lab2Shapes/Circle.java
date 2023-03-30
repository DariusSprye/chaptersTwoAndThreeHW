package lab2Shapes;

public class Circle {

    public int radius;

    public void calculateArea(){
        System.out.println("The area of the shape " + this.getClass() + " is " + Math.PI * this.radius * this.radius);
    }
}
