import geb.spock.GebReportingSpec
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Created by E on 07/01/2016.
 */
@RunWith(JUnit4)
class GroovyClassTest extends GebReportingSpec{



    @Test
    def "Step1"(){
        to GebishOrgHomePage
        when:
        to ScanPage

        then:
        print "ja Step1 end"
    }
}
