package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class greenCartStep {
	@Given("Users is on greencart landing page")
	public void users_is_on_greencart_landing_page() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhim\\OneDrive\\Documents\\chromedriver-win64\\chromedriver-win64");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}

	@When("User searched with short name {string} and extracted actual name of product")
	public void user_searched_with_short_name_and_extracted_actual_name_of_product(String string) {
	    
	}

	@Then("User searched for same short name in offers page to check if product exist")
	public void user_searched_for_same_short_name_in_offers_page_to_check_if_product_exist() {
	    
	}
}
