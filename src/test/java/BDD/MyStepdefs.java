package BDD;

import SELab2.Calculator.CalculatorOperator.AdditionCalculatorOperator;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class MyStepdefs {

    private AdditionCalculatorOperator adder;
    private int first_value;
    private int second_value;
    private int result;

    @Before
    public void before(){
        adder = new AdditionCalculatorOperator();
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
    public void twoInputValuesFirstAndSecond(int arg0, int arg1) {
        first_value = arg0;
        second_value = arg1;
    }


    @When("^I add the two values$")
    public void iAddTheTwoValues() {
        result = adder.add(first_value, second_value);
        System.out.println(result);
    }


    @Then("^I expect the result (-?\\d+)$")
    public void iExpectTheResultResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }

}
