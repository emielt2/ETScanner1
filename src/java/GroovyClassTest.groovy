import geb.spock.GebReportingSpec



/**
 * Created by E on 07/01/2016.
 */

public class GroovyClassTest extends GebReportingSpec{




   // def "Step1"(){
    public def "Step1"(){
        //to ScanPage
        //to GebishOrgHomePage
        when:
        println "to1"
        to ScanPage
//todo meer pagina urls enzo, meer pages
        then:
        println "at1"
       // at ScanPage
       // sleep(5000)
        println "at2"
        at CookieClickerPage
        page.printDD();
        print "ja StepBB end"
    }
}
