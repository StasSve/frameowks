package cucumber;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.PropertyLoader;

public class Annotations {
//
//    @Given("^I have open the browser$")
//    public void openBrowser() {
//        Selenide.open();
//    }

    @When("^I open a website$")
    public void goToWebsite() {
        Selenide.open(PropertyLoader.loadProperty("mainUrl"));
    }

    @Then("^Button with id (.+) should exits$")
    public void loginButton(String id) {
        if($("#"+id).isEnabled()) {
            System.out.println("Test 1 Pass");
        } else {
            System.out.println("Test 1 Fail");
        }
    }
}