package stepDefinitions;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Calculator;

public class Stepdefs {
	
	private Calculator calculator;
	
	@Given("I insert the numbers {string} and {string} in my calculator")
	public void insertNumbers(String number1, String number2) {
	    calculator = new Calculator();
	    calculator.setNumber1(Integer.parseInt(number1));
	    calculator.setNumber2(Integer.parseInt(number2));
	}

	@When("I click on \"add\" button")
	public void i_click_on_button() {
		calculator.sum();
	}

	@Then("my calculator displays the result {string}")
	public void checkResult(String result) {
		assertTrue(result.equals(Integer.toString(calculator.getResult())));
	}  
}







