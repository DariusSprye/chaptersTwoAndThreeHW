package lab3;

public class CalcDivide {

    public static void main(String[] args) {

        MyCalculator calcDivide1 = new MyCalculator();
        calcDivide1.number1 = 880000;
        calcDivide1.number2 = 2;
        calcDivide1.calculatedNumber = calcDivide1.number1 / calcDivide1.number2;

        calcDivide1.printCalculation();
    }
}
