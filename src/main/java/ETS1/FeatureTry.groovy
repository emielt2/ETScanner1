package ETS1

import geb.Browser
import geb.spock.GebReportingSpec
import geb.spock.GebSpec
import spock.lang.Shared
import spock.lang.Specification

/**
 * Created by E on 13/01/2016.
 */

class FeatureTry extends GebReportingSpec {
    @Shared obj
    @Shared obj2
    @Shared String browserx
    //@Shared Browser browser

    def setupSpec() {

    }

    def "test if myMethod returns true"() {
        expect:
        Result == true
        where:
        Result =  obj.myMethod()
    }
}