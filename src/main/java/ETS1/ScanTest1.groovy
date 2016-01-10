package ETS1

import geb.Browser
import geb.spock.GebReportingSpec
import geb.spock.GebSpec
import org.openqa.selenium.chrome.ChromeDriver
import org.spockframework.runtime.SpockRuntime
import spock.lang.Specification

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
           //$("#username").text = 'John'
           // $("#password").text = 'Doe'

  //          $("#loginButton").click()

            assert title == "Geb - Very Groovy Browser Automation"
            println "HURRAY!!!!!!!!!!!!!!!!!!!"
// assert title == "My Application - Dashboard"

        }
///---

        //then:
        //at ScanPage
        println "ja Stepxx end"
        return true
    }

    public def StepHurray(){
        //when:
        def browser = new Browser(driver: new ChromeDriver(), baseUrl: 'http://gebish.org')

        browser.drive {
            when:
            go "/testing"
            then:
            //$("#username").text = 'John'
            assert title == "Geb - Very Groovy Browser Automation"
            println "HURRAY!!!!!!!!!!!!!!!!!!!"
        }
        //then:
        println "ja Stepxx end"
        return true
    }

}