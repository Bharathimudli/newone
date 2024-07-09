package com.Step_Difinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Base_class.sample_base;
import Pom_CLASS.magento_pom;
import Runner_class.magneto_runner;
import io.cucumber.java.en.*;

public class magento_stepdif extends sample_base{
	WebDriver driver = magneto_runner.driver;

	magento_pom Mp = new magento_pom(driver);

	@Given("launch the URL and maximize")
	public void launch_the_url_and_maximize() {
		url(driver, "https://magento.softwaretestingboard.com/");
		maximize(driver);

	}

	@When("user needs sign into the Magento")
	public void user_needs_sign_into_the_magento() {

		toClick(Mp.getSignIn());
		tosendvalues(Mp.getEntermail(), "mudlibharathi@gmail.com");
		tosendvalues(Mp.getEnterpassword(), "Mudli@02");
		toClick(Mp.getSignInBtn());
	}

	@Then("User needs to  select the product")
	public void user_needs_to_select_the_product() {

		toClick(Mp.getWomen());
		toClick(Mp.getTops());
	}

	@SuppressWarnings("deprecation")
	@Then("user needs select the size and color of the product")
	public void user_needs_select_the_size_and_color_of_the_product() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor Je = (JavascriptExecutor) driver;
		Je.executeScript("window.scrollBy(0,500)", "");
		toClick(Mp.getProduct());
		toClick(Mp.getSize());
		toClick(Mp.getColor());
	}

	@SuppressWarnings("deprecation")
	@And("user needs add that prodcut in the cart and click on the checkout")
	public void user_needs_add_that_prodcut_in_the_cart_and_click_on_the_checkout() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		toClick(Mp.getAddtocart());
		Thread.sleep(3000);
		toClick(Mp.getMen());
		toClick(Mp.getMenTops());
		toClick(Mp.getProduct1());
		toClick(Mp.getMensize());
		toClick(Mp.getMencolor());
		toClick(Mp.getMenadd());
		toClick(Mp.getGear());
		toClick(Mp.getBags());
		toClick(Mp.getProduct2());
		toClick(Mp.getBagadd());
		toClick(Mp.getFinalcart());
		Thread.sleep(5000);
		toClick(Mp.getCheckout());
		Thread.sleep(5000);
	}

	@SuppressWarnings("deprecation")
	@Then("user select the delivery adress")
	public void user_select_the_delivery_adress() throws InterruptedException {
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor E = (JavascriptExecutor) driver;
		E.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		toClick(Mp.getAddress());
	}

	@Then("user has successfully purchased the product")
	public void user_has_successfully_purchased_the_product() {
		toClick(Mp.getPlaceorder());
	}
}

