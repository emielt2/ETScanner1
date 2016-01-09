//package ETS1

import geb.spock.GebReportingSpec

public class TestGroovy1 extends GebReportingSpec{
    void printX() {
        System.out.println( "x");
    }
    public def "Step1"(){
        println "TestGroovy1__Step1TEXT"
        println printX()
    }
    /*public void "void1"(){
        when:

        println "void1--asdfasdf"

        then:

        println "void1text"

    }
    public void void2(){
        when:
        println "void2--"
        then:
        println "void2text"
    }
*/
    def void3(){
        when:
        to ScanPage
        println "void3--"
        then:
        at ScanPage
        def script = new GroovyScriptEngine( '' ).with {
            //loadScriptByName( 'target/classes/ETS1/GroovyClassTest.class/GroovyTestClass.groovy' )
            /*DEZE WERKT*/ loadScriptByName( 'src/main//java/ETS1/GroovyClassTest.groovy' )
            //DEZE WERKT loadScriptByName( 'src/main//java/ETS1/ScanPage.groovy' )
            /*DEZE WERKT*///loadScriptByName( 'src/java/ScanPage.groovy' )
            //F:\Users\E\ETScanner1\src\main\java\ETS1
            //F:\Users\E\ETScanner1\src\main\java\ETS1
        }
        def script2 = new GroovyScriptEngine( '' ).with {
            loadScriptByName( 'src/main//java/ETS1/ScanPage.groovy' )
        }
        this.metaClass.mixin script

        //methodx()
        //main();
        //startStep1();
        script.printEE();//extends GebReportingSpec{
        script2.printEE();
        // extends Page
        sleep(3000)
        new GroovyShell().parse( new File( 'src/main//java/ETS1/ScanPage.groovy' ) ).with {
            printEE()
        }
        println "End of TestGroovy1"

        //Step2();
    }
}


