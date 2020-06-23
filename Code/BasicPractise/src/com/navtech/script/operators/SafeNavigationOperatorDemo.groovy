package com.navtech.script.operators

//class Person {
//    String name
//}

// Find will return null to the person object
//def person = null
def person = Person.find()
//def person = new Person()

// Printing Person Object person on console
println person

// here, safe navigation operator is used to check object is null or not before accessing is properties and value
def name = person?.name

// Printing Person Object propertie value
println "$name"

// Check that property is null or not through assertion
//assert name == null