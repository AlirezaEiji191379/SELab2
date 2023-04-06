package SELab2.Calculator;

import SELab2.Calculator.Abstractions.ICalculateOperator;

public class ReverseCalculateOperator implements ICalculateOperator {

    public ReverseCalculateOperator(){
    }


    @Override
    public double Calculate(double number){
        if(number == 0)
            throw  new IllegalArgumentException("can not calculate division by zero!");
        return 1 / number;
    }
}
