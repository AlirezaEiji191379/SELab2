package BDD;

import SELab2.Calculator.Abstractions.ICalculatorFacade;
import SELab2.Calculator.CalculatorFacade;
import SELab2.Calculator.enums.Operator;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalculatorFacadeScenarioOutline {

    private ICalculatorFacade _calculatorFacade;
    private int number;
    private Operator operator;
    private double result;

    @Before
    public void before(){
        _calculatorFacade = new CalculatorFacade();
    }

    @Given("as input {} and {}")
    public void asInputAnd(String input, String opt) {
        number = Integer.parseInt(input);
        operator = Operator.valueOf(opt);
    }


    @When("we call Calculate in CalculatorFacade")
    public void weCallCalculateInCalculatorFacade() {
        result = _calculatorFacade.Calculate(number,operator);
    }

    @Then("we get the {}")
    public void weGetThe(String scenarioResult) {
        double expected = Double.parseDouble(scenarioResult);
        Assert.assertEquals(expected,result,2);
    }


}
