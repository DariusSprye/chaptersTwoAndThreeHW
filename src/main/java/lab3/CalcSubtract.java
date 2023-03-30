package lab3;

public class CalcSubtract {

    public static void main(String[] args) {

        MyCalculator calcSub1 = new MyCalculator();
        calcSub1.number1 = 89;
        calcSub1.number2 = 42;
        calcSub1.calculatedNumber = calcSub1.number1 - calcSub1.number2;

        calcSub1.printCalculation();
    }
}
