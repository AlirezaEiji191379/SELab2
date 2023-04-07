package SELab2.Calculator.CalculatorOperator;

import SELab2.Calculator.Abstractions.ICalculateOperator;

public class SqrtCalculateOperator implements ICalculateOperator {
    @Override
    public double Calculate(double number) {
        if(number < 0){
            throw  new IllegalArgumentException("the number should be greater than 0");
        }
        return Math.sqrt(number);
    }
}
