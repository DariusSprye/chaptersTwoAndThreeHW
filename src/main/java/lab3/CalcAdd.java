package lab3;

public class CalcAdd {

    public static void main(String[] args) {
        MyCalculator calcAdd1 = new MyCalculator();
        calcAdd1.number1 = 14;
        calcAdd1.number2 = 26;
        calcAdd1.calculatedNumber = calcAdd1.number1 + calcAdd1.number2;

        calcAdd1.printCalculation();

    }

}
