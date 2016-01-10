package ETS1

import geb.Browser
import geb.spock.GebReportingSpec
import geb.spock.GebSpec
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.spockframework.runtime.SpockRuntime
import spock.lang.Specification

import java.util.concurrent.TimeUnit

/**
 * Created by E on 07/01/2016.
 */
public class ScanTest1 extends GebReportingSpec{

    public def Step1(){
        //when:
        //to ScanPage
//--
        //def browser = new Browser(driver: new ChromeDriver(), baseUrl: 'http://myhost:8080/myapp')
          def browser = new Browser(driver: new ChromeDriver(), baseUrl: 'http://gebish.org')

        browser.drive {
            when:
            go "/testing"
then:
            assert title == "Geb - Very Groovy Browser Automation"
            println "HURRAY!!!!!!!!!!!!!!!!!!!"
        }
        println "ja Stepxx end"
        return true
    }
    public def StepHurray(){
        System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDownloadFolder\\chromedriver_win32\\chromedriver.exe");//todo setproperty bekijken
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("user-data-dir=Y:\\Browser_profile");
        def browser = new Browser(driver: new ChromeDriver(chromeoptions), baseUrl: 'http://gebish.org')
        browser.drive {
            when:
            browser.go("http://gebish.org")
            //go "http://gebish.org/testing"
            then:
            assert browser.title == "Geb - Very Groovy Browser Automation"
            println "HURRAY!!!!!!!!!!!!!!!!!!!2222"
            browser.quit()
        }
        println "ja Stepxx end"
        return true
    }
}