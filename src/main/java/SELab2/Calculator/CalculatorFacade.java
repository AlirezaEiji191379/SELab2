package SELab2.Calculator;

import SELab2.Calculator.Abstractions.ICalculateOperator;
import SELab2.Calculator.Abstractions.ICalculatorFacade;
import SELab2.Calculator.Abstractions.ICalculatorOperatorFactory;
import SELab2.Calculator.Factory.CalculatorOperatorFactory;
import SELab2.Calculator.enums.Operator;

public class CalculatorFacade implements ICalculatorFacade {
    private ICalculatorOperatorFactory _calculatorOperatorFactory;
    public CalculatorFacade()
    {
        _calculatorOperatorFactory = new CalculatorOperatorFactory();
    }

    @Override
    public double Calculate(int number, Operator operator) {
        ICalculateOperator calculatorOperator = _calculatorOperatorFactory.CreateCalculatorOperatorByOperator(operator);
        return calculatorOperator.Calculate(number);
    }

}
