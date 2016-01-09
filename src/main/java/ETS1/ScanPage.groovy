package ETS1

import geb.Page


//println "This is ScanPage.groovy starttext outside a method"
class ScanPage extends Page {

    static at = { title == "Geb - Very Groovy Browser Automation" }

    static content = {
        manualsMenu { module MenuModule, $("#header-content ul li", 0) }
    }
    def static printEE(){
        println "Dit is EE van ETS1\\ScanPage"
        return true
    }
}

/*
def "Say your pagename"(){
    println "This is ScanPage.groovy starttext INSIDE method"
}*/