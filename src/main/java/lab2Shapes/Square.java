package lab2Shapes;

public class Square {

    public int side;

    public void calculateArea(){
        System.out.println("The area of the shape " + this.getClass() + " is " + this.side * this.side);
    }
}
