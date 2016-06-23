package com.budjb.sample

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

/**
 * This class demonstrates the issue reported in https://github.com/grails/grails-core/issues/10009.
 *
 * Unmodified, bootRun will not find the main class. If the commented line is swapped,
 * bootRun will work correctly.
 */
//class Application extends GrailsAutoConfiguration {
class Application extends ApplicationSuperClass {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }
}