package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class LoginSteps {
    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() {
        System.out.println("Navigate to login page");
    }

    @And("I enter the following for Login")
    public void iEnterTheFollowingForLogin(DataTable table) {
      List<List<String>> data = table.asLists();

      //Create an ArrayList
      List<User> users = new ArrayList<User>();

//      Store all the users
        users = table.asList(User.class);

        for (User user:users) {
            System.out.println("The username is" +user.username);
            System.out.println("The password is" +user.password);
        }
        System.out.println("The value is :" + data.get(0).get(0));
        System.out.println("The value is :" + data.get(0).get(1));
    }

    @And("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("Click on login button");
    }

    @Then("I should see the userform page")
    public void i_should_see_the_userform_page() {
        System.out.println("Should see the userform page");
    }

    public static class User{
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }
}