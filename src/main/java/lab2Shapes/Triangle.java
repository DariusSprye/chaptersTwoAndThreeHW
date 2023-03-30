package lab2Shapes;

public class Triangle {

    public int base;
    public int height;

    public void calculateArea(){
        System.out.println("The area of the shape " + this.getClass() + " is " + .5 * this.base * this.height );
    }
}
