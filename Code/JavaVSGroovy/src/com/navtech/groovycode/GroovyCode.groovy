package com.navtech.groovycode

import groovy.transform.ToString

@ToString
class GroovyCode {

    Long id
    String firstName
    String lastName
    int age
    Date dob

    String getFullName() {
        this.firstName + " " + this.lastName
    }

    void printFullName() {
        println "FullName ::, $firstName $lastName"
    }

}
