import SELab2.Calculator.Abstractions.ICalculatorFacade;
import SELab2.Calculator.CalculatorFacade;
import SELab2.Calculator.enums.Operator;

public class Main {
    public static void main(String[] args) {
        ICalculatorFacade calculatorFacade = new CalculatorFacade();
        System.out.println(calculatorFacade.Calculate(4, Operator.rvs));
        System.out.println(calculatorFacade.Calculate(4,Operator.sqr));
    }
}
