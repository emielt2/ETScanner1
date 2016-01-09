package ETS1;

import groovy.util.GroovyScriptEngine;

import static org.testng.Assert.*;


public class TestingMixinScriptTest {
    void xx(){
        def script = new GroovyScriptEngine( '.' ).with {
            loadScriptByName( 'file1.groovy' )
        }
        this.metaClass.mixin script

        method()
    }

}