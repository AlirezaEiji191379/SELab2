package BDD;

import SELab2.Calculator.Abstractions.ICalculator;
import SELab2.Calculator.ReverseCalculator;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ReverseOutline {

    private ICalculator _calculator;

    private int number;
    private double result;

    @Before
    public void before(){
        _calculator = new ReverseCalculator();
    }

    @Given("input as {}")
    public void inputAs(String arg0) {
        number = Integer.parseInt(arg0);
    }

    @When("I Call Calculate in ReverseCalculator")
    public void iCallCalculateInReverseCalculator() {
        result = _calculator.Calculate(number);
    }

    @Then("I want {}")
    public void iWant(String arg0) {
        double expected = Double.parseDouble(arg0);
        Assert.assertEquals(expected,result,2);
    }


}
