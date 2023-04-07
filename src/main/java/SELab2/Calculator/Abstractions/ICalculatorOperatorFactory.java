package SELab2.Calculator.Abstractions;

import SELab2.Calculator.enums.Operator;

public interface ICalculatorOperatorFactory {
    ICalculateOperator CreateCalculatorOperatorByOperator(Operator operator);
}
