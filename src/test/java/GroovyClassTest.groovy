import geb.spock.GebReportingSpec



/**
 * Created by E on 07/01/2016.
 */

public class GroovyClassTest extends GebReportingSpec{




   // def "Step1"(){
    def "Step1"(){
        to ScanPage
        //to GebishOrgHomePage
        when:
        to ScanPage

        then:
        print "ja Step1 end"
    }
}
