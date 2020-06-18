package com.navtech.script.ast

@groovy.transform.ToString
class Customer {

    String firstName
    String lastName
    int age
    def favBook = []

}

def customer = new Customer(firstName: "Naveen", lastName: "Jain", age: 25, favBook: ["Java", "Groovy"]);
println customer

