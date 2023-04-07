package SELab2.Calculator.Factory;

import SELab2.Calculator.Abstractions.ICalculateOperator;
import SELab2.Calculator.Abstractions.ICalculatorOperatorFactory;
import SELab2.Calculator.CalculatorOperator.ReverseCalculateOperator;
import SELab2.Calculator.CalculatorOperator.SqrtCalculateOperator;
import SELab2.Calculator.enums.Operator;

public class CalculatorOperatorFactory implements ICalculatorOperatorFactory {

    @Override
    public ICalculateOperator CreateCalculatorOperatorByOperator(Operator operator) {
        if(operator == Operator.rvs)
            return new ReverseCalculateOperator();
        else if(operator == Operator.sqr)
            return new SqrtCalculateOperator();
        throw new IllegalArgumentException();
    }
}
