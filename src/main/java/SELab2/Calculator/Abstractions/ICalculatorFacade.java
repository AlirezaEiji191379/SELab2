package SELab2.Calculator.Abstractions;

import SELab2.Calculator.enums.Operator;

public interface ICalculatorFacade {
    double Calculate(int number, Operator operator);
}
