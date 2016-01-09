package ETS1

import geb.spock.GebReportingSpec



/**
 * Created by E on 07/01/2016.
 */

public class GroovyClassTest extends GebReportingSpec{

    public void Step2(){
        when:
        println "to1"
        to ScanPage
//todo meer pagina urls enzo, meer pages
        then:
        println "at1"
        //Step1() //zou mooi zijn
        at ScanPage
        println "at2"
        at CookieClickerPage
        page.printDD();
        println "ja Step2 end"
    }


    public static void main(){
        System.out.println("MAIN()");
        //Step2();
       // GeefX();
        startStep1();
      //  when:
      //  println "main2"

    }

    void startStep1(){
        Step1();
    }


    def "Step1"(){
   // public def "Step1"(){
        //to ScanPage
        //to GebishOrgHomePage
        when:
        println "to1"
        to ScanPage
//todo meer pagina urls enzo, meer pages
        then:
        println "at1"
        at ScanPage
       // sleep(5000)
        println "at2"
        at CookieClickerPage
        page.printDD();
        println "ja Step1 end"
    }


}
/*
public String GeefX(){
    return "X";
}
*/