package lab3;

public class CalcMulti {

    public static void main(String[] args) {

        MyCalculator calcMulti1 = new MyCalculator();
        calcMulti1.number1 = 990000;
        calcMulti1.number2 = 500;
        calcMulti1.calculatedNumber = calcMulti1.number1 * calcMulti1.number2;

        calcMulti1.printCalculation();
    }
}
