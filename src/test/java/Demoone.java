import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.checkbox.testbench.CheckboxElement;
import com.vaadin.flow.component.combobox.testbench.ComboBoxElement;
import com.vaadin.flow.component.html.testbench.LabelElement;
import com.vaadin.flow.component.tabs.testbench.TabElement;
import com.vaadin.flow.component.textfield.testbench.EmailFieldElement;
import com.vaadin.flow.component.textfield.testbench.TextAreaElement;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import com.vaadin.flow.component.upload.testbench.UploadElement;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.testbench.TestBenchTestCase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.io.File;

public class Demoone extends TestBenchTestCase {
    public Demoone(){

    }

        @Test
        public void getDemo1() throws InterruptedException {
            WebDriverManager.chromedriver().create();
            setDriver(new ChromeDriver());
            getDriver().get("http://localhost:8080/");
            getDriver().manage().window().maximize();
            Thread.sleep(1000);

            $(ButtonElement.class).id("Add").click();
            Thread.sleep(1000);

          /*  PanelElement panel = $(PanelElement.class)
                    .caption("Scrolling Panel").first();
            panel.scroll(123);

           */

            $(TextFieldElement.class).id("first").setValue("Phill");
            Thread.sleep(1000);

            $(TextFieldElement.class).id("last").setValue("Foden");
            Thread.sleep(1000);

            $(EmailFieldElement.class).id("e-mail").setValue("markkane009@gmail.com");
            Thread.sleep(1000);

            Actions actions=new Actions(getDriver());
            actions.sendKeys(Keys.PAGE_DOWN).build().perform();


            $(ComboBoxElement.class).first().selectByText("Phillips Van Heusen Corp.");
            Thread.sleep(1000);

            $(ComboBoxElement.class).last().selectByText("Imported lead");
            Thread.sleep(1000);

            $(ButtonElement.class).id("save").click();
            Thread.sleep(1000);

            $(TextFieldElement.class).id("filter").setValue("Foden");
            Thread.sleep(1000);

            $(CheckboxElement.class).id("checkb").click();
            Thread.sleep(1000);

            $(TextAreaElement.class).first().setValue("Rome wasn't built in a day");
            Thread.sleep(1000);

            $(UploadElement.class).id("up-load").upload(new File("/home/gowtham.devarajan@zucisystems.com/Downloads/Manoj MBA.pdf"));
            Thread.sleep(1000);

            getDriver().findElement(By.id("component")).click();

            $(TabElement.class).id("auto").click();
            Thread.sleep(1000);

            $(TabElement.class).id("testing").click();
            Thread.sleep(1000);

            $(TabElement.class).id("practise").click();
            Thread.sleep(1000);


           $(ButtonElement.class).id("result").click();
           Thread.sleep(1000);





        }

    }


