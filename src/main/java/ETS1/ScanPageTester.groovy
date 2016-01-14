package ETS1


import geb.spock.GebReportingSpec
import spock.lang.Shared
import spock.lang.Stepwise

/**
 * Created by E on 14/01/2016.
 */
class ScanPageTester extends GebReportingSpec{
    def "probeer ScanPage test"(){
        when:
        println "whentext"
        //go("news.google.nl")
        to ScanPage
        then:
        at ScanPage
        //sleep(5000)
        println "thentext"
    }
}
