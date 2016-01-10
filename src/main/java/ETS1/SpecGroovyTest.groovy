package ETS1
import spock.lang.Specification;

import geb.spock.GebReportingSpec
import geb.spock.*;
import org.junit.Test
import spock.lang.Shared
import spock.lang.Stepwise
import spock.lang.Shared
import spock.lang.Stepwise

@Stepwise
//class SpecGroovyTest extends Specification{
class SpecGroovyTest extends GebReportingSpec{
//class SpecGroovyTest extends GebSpec{

    //GebReportingSpec
public call(){
    when:
    println "Call Text"
    then:
    println "Call End"

    return

}
    public void stepSGT1(){
        /*when:
        println "This is stepSGT1 WHEN"
        then:
        println "This is stepSGT1 THEN"*/
        println "stepSGT1 Text"
    }
    public void stepSGT2(){
        /*when:
        println "This is stepSGT2 WHEN"
        then:
        println "This is stepSGT2 THEN"
        println "stepSGT2 Text"*/
        return
    }
    public void stepSGT3(){
        /*when:
        println "This is stepSGT3 WHEN"
        then:
        println "This is stepSGT3 THEN"*/
        println "stepSGT3 Text----------------------"
        assert 1==1 //dit is spock? mag wel in non static call
        //expect: //dit is geb mag niet in static call
       // 1==1
        //assert ${}
        ScanTest1 stA = new ScanTest1();
        stA.Step1()
        return
    }
}
