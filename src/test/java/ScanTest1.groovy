import static org.testng.Assert.*;
import geb.spock.GebReportingSpec;

/**
 * Created by E on 07/01/2016.
 */
public class ScanTest1 {

    def "Step1"(){
        when:
        to ScanPage

        then:
        print "ja Step1 end"
    }

}