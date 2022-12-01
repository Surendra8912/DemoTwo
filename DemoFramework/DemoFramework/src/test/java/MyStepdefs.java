import DemoWebshop.TricentisWebshop;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyStepdefs {
    TricentisWebshop webshop=new TricentisWebshop();
    @Given("open url of the webshop")
    public void openUrlOfTheWebshop() {
        webshop.urlPage();

    }

    @And("Login to Demowebshop")
    public void loginToDemowebshop() {
        webshop.login();

    }

    @Then("Place a order")
    public void placeAOrder() throws InterruptedException {
        webshop.computer();
        webshop.Billingaddress();
        webshop.shippingAddress();
        webshop.shippingMethod();
        webshop.paymentMethod();
        webshop.paymentInformation();
        webshop.orderConfirmation();

    }
}
