package Pom_CLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class magento_pom {

	public static WebDriver driver;

//	public By SignIn=By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");

	@FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
	private WebElement SignIn;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement enteremail;

	@FindBy(xpath = "//fieldset[@class='fieldset login']//input[@id='pass']")
	private WebElement enterpassword;

	@FindBy(xpath = "//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")
	private WebElement SignInBtn;

	@FindBy(xpath = "//span[normalize-space()='Women']")
	private WebElement Women;

	@FindBy(xpath = "//a[contains(text(),'Tops')]")
	private WebElement Tops;

	public WebElement getTops() {
		return Tops;
	}

	@FindBy(xpath = "//div[@id='option-label-size-143-item-168']")
	private WebElement Size;

	@FindBy(xpath = "//div[@id='option-label-color-93-item-60']")
	private WebElement Color;

	@FindBy(xpath = "//a[normalize-space()='Breathe-Easy Tank']")
	private WebElement Product;

	@FindBy(xpath = "//span[normalize-space()='Add to Cart']")
	private WebElement Addtocart;

	@FindBy(xpath = "//span[normalize-space()='Men']")
	private WebElement Men;

	public WebElement getMen() {
		return Men;
	}

	@FindBy(xpath = "//a[contains(text(),'Tops')]")
	private WebElement MenTops;

	public WebElement getMenTops() {
		return MenTops;
	}

	@FindBy(xpath = "//a[normalize-space()='Cassius Sparring Tank']")
	private WebElement Product1;

	public WebElement getProduct1() {
		return Product1;
	}

	@FindBy(xpath = "//div[@id='option-label-size-143-item-168']")
	private WebElement Mensize;

	public WebElement getMensize() {
		return Mensize;
	}

	@FindBy(xpath = "//div[@id='option-label-color-93-item-50']")
	private WebElement Mencolor;

	public WebElement getMencolor() {
		return Mencolor;
	}

	@FindBy(xpath = "//span[normalize-space()='Add to Cart']")
	private WebElement Menadd;

	public WebElement getMenadd() {
		return Menadd;
	}
	// a[@id='ui-id-6']//span[contains(text(),'Gear')]

	@FindBy(xpath = "//span[normalize-space()='Gear']")
	private WebElement Gear;

	public WebElement getGear() {
		return Gear;
	}

	@FindBy(xpath = "//ol[@class='items']//a[normalize-space()='Bags']")
	private WebElement Bags;

	public WebElement getBags() {
		return Bags;
	}

	@FindBy(xpath = "//a[normalize-space()='Push It Messenger Bag']")
	private WebElement Product2;

	public WebElement getProduct2() {
		return Product2;
	}
	
	@FindBy(xpath = "//button[@id='product-addtocart-button']")
	private WebElement Bagadd;

	public WebElement getBagadd() {
		return Bagadd;
	}
	
	
	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement Finalcart;

	public WebElement getFinalcart() {
		return Finalcart;
	}
	
	@FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
	private WebElement Checkout;

	public WebElement getCheckout() {
		return Checkout;
	}

	@FindBy(xpath = "//span[normalize-space()='Next']")
	private WebElement Address;

	public WebElement getAddress() {
		return Address;
	}

	@FindBy(xpath = "//span[normalize-space()='Place Order']")
	private WebElement Placeorder;

	public WebElement getPlaceorder() {
		return Placeorder;
	}
	
	
	public WebElement getSignIn() {
		return SignIn;
	}

	public WebElement getEntermail() {
		return enteremail;
	}

	public WebElement getEnterpassword() {
		return enterpassword;
	}

	public WebElement getSignInBtn() {
		return SignInBtn;
	}

	public WebElement getWomen() {
		return Women;
	}

	public WebElement getSize() {
		return Size;
	}

	public WebElement getColor() {
		return Color;
	}

	public WebElement getProduct() {
		return Product;
	}

	public WebElement getAddtocart() {
		return Addtocart;
	}


	public magento_pom(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
}





