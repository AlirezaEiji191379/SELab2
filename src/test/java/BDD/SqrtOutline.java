package BDD;

import SELab2.Calculator.Abstractions.ICalculateOperator;
import SELab2.Calculator.CalculatorOperator.SqrtCalculateOperator;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SqrtOutline {
    private ICalculateOperator _calculator;
    private int number;
    private double result;

    @Before
    public void before(){
        _calculator = new SqrtCalculateOperator();
    }

    @Given("integer inputs as {}")
    public void integerInputsAs(String arg0) {
        number = Integer.parseInt(arg0);
    }

    @When("we call calculate in SqrtCalculatorOperator")
    public void weCallCalculateInSqrtCalculatorOperator() {
        result = _calculator.Calculate(number);
    }

    @Then("we get results {}")
    public void weGetResults(String arg0)
    {
        double expected = Double.parseDouble(arg0);
        Assert.assertEquals(expected,result,3);
    }
}
