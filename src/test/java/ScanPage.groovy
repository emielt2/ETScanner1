import geb.Page


//println "This is ScanPage.groovy starttext outside a method"
class ScanPage extends Page {

    static at = { title == "Geb - Very Groovy Browser Automation" }

    static content = {
        m
    }anualsMenu { module MenuModule, $("#header-content ul li", 0) }
    }
/*
def "Say your pagename"(){
    println "This is ScanPage.groovy starttext INSIDE method"
}*/