package ETS1

import geb.spock.GebReportingSpec

public class TestGroovy1 extends GebReportingSpec{
    void printX() {
        System.out.println( "x");
    }
    public def "Step1"(){
        println "TestGroovy1__Step1TEXT"
        println printX()
    }
    public void "void1"(){
        when:

        println "void1--"

        then:

        println "void1text"

    }
    public void void2(){
        when:
        println "void2--"
        then:
        println "void2text"
    }

    def void3(){
        when:
        println "void3--"
        then:
        def script = new GroovyScriptEngine( '' ).with {
            //loadScriptByName( 'target/classes/ETS1/GroovyClassTest.class/GroovyTestClass.groovy' )
            /*DEZE WERKT*/ loadScriptByName( 'src/main//java/ETS1/GroovyClassTest.groovy' )
            //DEZE WERKT loadScriptByName( 'src/main//java/ETS1/ScanPage.groovy' )
            /*DEZE WERKT*///loadScriptByName( 'src/java/ScanPage.groovy' )
            //F:\Users\E\ETScanner1\src\main\java\ETS1
            //F:\Users\E\ETScanner1\src\main\java\ETS1
        }
        this.metaClass.mixin script

        //methodx()
        //main();
        //startStep1();
        printEE();
        sleep(3000)
        println "Sleeping3000+3000"
        sleep(3000)
        //Step2();
    }
}


