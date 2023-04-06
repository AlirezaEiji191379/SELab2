package BDD;

import SELab2.Calculator.Abstractions.ICalculateOperator;
import SELab2.Calculator.SqrtCalculateOperator;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SqrtScenario {

    private ICalculateOperator _calculator;
    private int number;
    private double result;

    @Before
    public void before(){
        _calculator = new SqrtCalculateOperator();
    }

    @Given("integer input as {int}")
    public void integerInputAs(int arg0) {
        number = arg0;
    }

    @When("I Call Calculate in SqrtCalculator")
    public void iCallCalculateInSqrtCalculator() {
        result = _calculator.Calculate(number);
    }


    @Then("as output I see {string}")
    public void asOutputISee(String arg0)
    {
        double expected = Double.parseDouble(arg0);
        Assert.assertEquals(expected,result,2);
    }


}
