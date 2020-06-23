package com.navtech.script.data_types

/**
 * Data Type Conversion - Implicitly and Explicitly
 * GDK Methods Also There
 */

/* Implicit Casting - coercion */

println "************************************* Implicit Casting Started Here *********************************************"
println "\n ------------------ Normal Implicit Casting --------------------------"
// Normal Implicit Casting
def number = 10
println "DataType :: $number.class"

def decimal = 10.5
println "DataType :: $decimal.class"

def str = "Naveen"
println "DataType :: $str.class"

// Implicit Casting through Operation

println " \n ------------------ Implicit Casting through Operation --------------------------"

    /**
     * 1. If either operand is a float or a double the result is a double.
     * 2. In Java if only floats are involved the result is a float
    */

    float a = 10.5
    double b = 5.0
    def resultAB = a / b
    println "Value :: $resultAB"
    println "DataType :: $resultAB.class"

    float x = 10.0
    float y = 20.0
    def resultXY = y/x
    println "Value :: $resultXY"
    println "DataType :: $resultXY.class"

    /** ---> Doubt
     * 1. If either operand is a BigInteger the result is a BigInteger
     * 2. If either operand is a Long the result is a Long
     * 3. If either operand is a Integer the result is an Integer
     */

    def deci = 10.10
    long ln = 5.5
    def result1 = deci/ln
    println "Value :: $result1"
    println "DataType :: $result1.class"

    long lng = 10
    int i = 5
    def result2 = lng/i
    println "Value :: $result2"
    println "DataType :: $result2.class"

    int i1 = 10
    short s1  = 5
    def result3 = i1/s1
    println "Value :: $result3"
    println "DataType :: $result3.class"

    /**
     * 1. If Integer and String are concatenated through + then result would always be a String Type
     */

    int i3 = 10
    String str1 = "10"
    def result4 = i3 + str1
    println "Value :: $result4"
    println "DataType :: $result4.class"

    /**
     * Double division
     */
    println("\n ------------------ Implicit Casting Double Division -------------------------")
    println "Value :: " + 5.0d - 4.1d
    println "DataType :: " + (5.0d - 4.1d).class
    println "Value :: " + 5-4.1
    println "DataType :: " + (5-4.1).class

    /**
     * Integer Division
     */
    println("\n ------------------ Implicit Casting Integer Division -------------------------")
    def intDiv = 1 / 2
    println "Value :: " + intDiv                    // this is much different than Java where we would get 0
    println "DataType :: $intDiv.class"
    println "Value :: " + 1.intdiv(2)               // this will provide same result as Java which is 0
    println "DataType :: " +  (1.intdiv(2)).class


/* Explicit Casting - Casting */

println "\n ------------------ Explicit Casting --------------------------"
def myfloat_num = (float) 10.5
println "DataType :: $myfloat_num.class"

/* Explicit Casting through GDK Methods */

println "\n ------------------ Explicit Casting Through GDK methods --------------------------"

    // conversion
    if(2 == 2.5.toInteger())
        println "DataType :: " + (2 == 2.5.toInteger()).class

    // enforced coercion
    if(2 == 2.5 as Integer)
        println "DataType :: " + (2 == 2.5 as Integer).class

    // Explicit casting
    if(2 == (int) 2.5)
        println "DataType :: " + (2 == (int) 2.5).class

    // Check it is number or not
    if(!'5.50'.isNumber())
        println "It is String not a Number"

/* Special GDK Methods -> times | upto | downto | step */

println "\n ------------------ Special GDK methods --------------------------"

    20.times {
        print '-'
    }

    1.upto(10) { num ->
        println num
    }

    10.downto(1) { num ->
        println num
    }

    0.step(1,0.1) { num ->
        println num
    }

