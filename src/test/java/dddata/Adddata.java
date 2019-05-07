package dddata;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class Adddata {
	public static WebDriver driver;

@Given("The user is in add customer pages")
public void the_user_is_in_add_customer_pages() {
	System.setProperty("webdriver.chrome.driver","D:\\sree\\Cucumm\\driver\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("http://demo.guru99.com/telecom/addcustomer.php");
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

//one dimensional list
/*@When("The user gives valid inputs")
public void the_user_gives_valid_inputs(DataTable dataTable) {
	List<String> cusIn =dataTable.asList(String.class);
	driver.findElement(By.xpath("//label[text()='Done']")).click();
	driver.findElement(By.id("fname")).sendKeys(cusIn.get(0));
	driver.findElement(By.id("lname")).sendKeys(cusIn.get(1));
	driver.findElement(By.id("email")).sendKeys(cusIn.get(2));
	driver.findElement(By.name("addr")).sendKeys(cusIn.get(3));
	driver.findElement(By.name("telephoneno")).sendKeys(cusIn.get(4));
}*
//two dimensional list

/*@When("The user gives valid inputs")
public void the_user_gives_valid_inputs(DataTable dataTable) {
	List<List<String>> cusIn =dataTable.asLists(String.class);
	driver.findElement(By.xpath("//label[text()='Done']")).click();
	driver.findElement(By.id("fname")).sendKeys(cusIn.get(0).get(0));
	driver.findElement(By.id("lname")).sendKeys(cusIn.get(1).get(1));
	driver.findElement(By.id("email")).sendKeys(cusIn.get(2).get(2));
	driver.findElement(By.name("addr")).sendKeys(cusIn.get(3).get(3));
	driver.findElement(By.name("telephoneno")).sendKeys(cusIn.get(4).get(4));*/

//one dimensional map
/*@When("The user gives valid inputss")
public void the_user_gives_valid_inputss(DataTable dataTable) {
    Map<String,String> cusIn = dataTable.asMap(String.class, String.class);
    driver.findElement(By.xpath("//label[text()='Done']")).click();
	driver.findElement(By.id("fname")).sendKeys(cusIn.get("fname"));
	driver.findElement(By.id("lname")).sendKeys(cusIn.get("lname"));
	driver.findElement(By.id("email")).sendKeys(cusIn.get("email"));
	driver.findElement(By.name("addr")).sendKeys(cusIn.get("address"));
	driver.findElement(By.name("telephoneno")).sendKeys(cusIn.get("phone"));
*/
//Two dimensional Map
/*@When("The user gives valid inputse")
public void the_user_gives_valid_inputse(DataTable dataTable) {
    List<Map<String,String>> cusIn =dataTable.asMaps(String.class ,String.class);
    driver.findElement(By.xpath("//label[text()='Done']")).click();
	driver.findElement(By.id("fname")).sendKeys(cusIn.get(1).get("fname"));
	driver.findElement(By.id("lname")).sendKeys(cusIn.get(1).get("lname"));
	driver.findElement(By.id("email")).sendKeys(cusIn.get(1).get("email"));
	
	driver.findElement(By.name("addr")).sendKeys(cusIn.get(0).get("address"));
	driver.findElement(By.name("telephoneno")).sendKeys(cusIn.get(0).get("phone"));
	
*/
//senario outline
@When("The user gives valid from {string},{string}sivamni{int}gmail.com{string}{double}\"")
public void the_user_gives_valid_from_sivamni_gmail_com(String string, String string2, Integer int1, String string3, Double double1) {
	driver.findElement(By.xpath("//label[text()='Done']")).click();
	driver.findElement(By.id("fname")).sendKeys("sree");
	driver.findElement(By.id("lname")).sendKeys("mani");
	driver.findElement(By.id("email")).sendKeys("sridgar@gmail.com");
	driver.findElement(By.name("addr")).sendKeys("tirunel");
	driver.findElement(By.name("telephoneno")).sendKeys("9500770944");   
}

@When("The user gives valid from {string},{string}ssremni{int}gmail.com{string}{double}\"")
public void the_user_gives_valid_from_ssremni_gmail_com(String string, String string2, Integer int1, String string3, Double double1) {
	driver.findElement(By.xpath("//label[text()='Done']")).click();
	driver.findElement(By.id("fname")).sendKeys("arthi");
	driver.findElement(By.id("lname")).sendKeys("shree");
	driver.findElement(By.id("email")).sendKeys("maniartar@gmail.com");
	driver.findElement(By.name("addr")).sendKeys("tirunerel");
	driver.findElement(By.name("telephoneno")).sendKeys("9500777944");   

}
 


@When("The click the submit button")
public void the_click_the_submit_button() {
    driver.findElement(By.name("submit")).click();
	// Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Then("The user should see the customer ID generate")
public void the_user_should_see_the_customer_ID_generate() {
	Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
    // Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
	}


}
