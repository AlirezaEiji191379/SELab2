package BDD;

import SELab2.Calculator.Abstractions.ICalculateOperator;
import SELab2.Calculator.ReverseCalculateOperator;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ReverseScenario {

    private ICalculateOperator _calculator;

    private int number;
    private double result;

    @Before
    public void before(){
        _calculator = new ReverseCalculateOperator();
    }

    @Given("Input as {int}")
    public void inputAs(int arg0) {
        number = arg0;
    }

    @When("I Call Calculate from ReverseCalculatorOperator")
    public void iCallCalculateFromReverseCalculator() {
        result = _calculator.Calculate(number);
    }

    @Then("I Expect {string}")
    public void iExpect(String arg0) {
        double expected = Double.parseDouble(arg0);
        Assert.assertEquals(expected, result, 2);
    }


}
