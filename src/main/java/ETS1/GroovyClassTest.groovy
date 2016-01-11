package ETS1

import geb.Browser
import geb.spock.GebReportingSpec
import org.junit.Test
import org.openqa.selenium.chrome.ChromeDriver
import spock.lang.Shared
import spock.lang.Stepwise
import spock.lang.Shared
import spock.lang.Stepwise

//@Stepwise
public class GroovyClassTest extends GebReportingSpec{
    int number1 =1;
    static int number2 =2;
    public class tempClass{
        void printTempClass(){
            println "This is printTempClass() text"
            when:
            println "This is printTempClass WHEN"
            then:
            println "This is printTempClass THEN"
        }
    }
public void step3(){
    /*when:
    println "This is step3 WHEN"
    then:
    println "This is step3 THEN"*/
    println "step3 Text"
}

    public void Step2(){
        when:
        println "to1"
        to ScanPage
//todo meer pagina urls enzo, meer pages
        then:
        println "at Step222"
        //Step1() //zou mooi zijn
        //at ScanPage
        println "at Step222"
        at ScanPage
        //page.printEE1();
        when:
        printEE1("Step2 van GCT");
        then:
        println "ja GroovyTestClassStep2 end"
    }
    public void Step2b(){
        when:
        println "22bb"
        to ScanPage
//todo meer pagina urls enzo, meer pages
        then:
        println "at Step222bbb"
        //Step1() //zou mooi zijn
        //at ScanPage
        println "at Step222bbb"
        at ScanPage
        //page.printEE1();
        when:
        printEE1("Step2 van GCT");
        then:
        println "ja GroovyTestClassStep2bbb end"
    }

    public static void main(){
        System.out.println("THIS IS MAIN() MAN");
        //Step2();
       // GeefX();
        //startStep1();
      //  when:
      //  println "main2"

    }

    def static startStep1(){
        //when:
        print "startStep1WHEN text"
        //to
        printEE1()
        Step1gct();
        //Step1gct("hallo");
        //GroovyClassTest.Step1gct();
        //printEE1()
        //Step1gct();
        //then:
        print "startStep1TEXT_THEN"
        return true;
    }

    //@Shared


    public void Step1gct(){
//todo hier verder. hoe callen we deze non static
        //Step1gct(){}
   // public def "Step1"(){
        //to ScanPage
        //to GebishOrgHomePage
        def browser = new Browser(driver: new ChromeDriver(), baseUrl: 'http://gebish.org')

        browser.drive {
            when:
            //print a
            println "Step1gct START"
            to ScanPage
//todo meer pagina urls enzo, meer pages
            then:
            println "at1"
             at ScanPage
            // sleep(5000)
            println "at2"
            //at CookieClickerPage2
            //page.printEE(); hoorde bij at page ScanPage
        }
        println "ja Step1gct end"
        return;
    }

    //maybe not allowed in gebpeport
    def static printEE1(String input){

        println input + " - Dit is EE van ETS1\\GroovyClassTest"

        return true
    }

/*
    public static String createX(String y) {
        println "createX text"
        return new String(y)
    }
*/
    public class X {}

  /*  public X foo1() {   when:
    println "to1"
    //to ScanPage
//todo meer pagina urls enzo, meer pages
        then:
        println "at Step222"
        //return new Step1gct()
        return new X()
    }*/
    public static X createX(GroovyClassTest y) {
        println "createX text"
        return new X(y)
    }
    public static GroovyClassTest geefObj() {
        println "geefObj text"
        return new GroovyClassTest()
    }


}

/*
public String GeefX(){
    return "X";
}
*/