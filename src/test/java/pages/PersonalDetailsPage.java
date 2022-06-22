package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalDetailsPage {
    @FindBy(id = "personal_txtEmpFirstName")
    public WebElement FirstNameField;

    @FindBy(id = "personal_txtEmpMiddleName")
    public WebElement MiddleNameField;

    @FindBy(id = "personal_txtEmpLastName")
    public WebElement LastNameField;
}
