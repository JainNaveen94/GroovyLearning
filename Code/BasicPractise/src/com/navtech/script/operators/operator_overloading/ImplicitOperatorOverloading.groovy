package com.navtech.script.operators.operator_overloading

/*
* Implicit Operator Overloading in Number Class Demo
*   - In this + or Plus Method is Overloaded Internally By Number Class To Perform Addition of two Numbers
*   - For Example :- 1 + 2 = 3 (For Better UnderStanding Please Refer Demo Below)
*/

int a = 10;
int b = 20;

def numberResult = a + b;
def numberResult1 = a.plus(b);

println "Number Result With + Operator := $numberResult";
println "Number Result with Plus Method := $numberResult1";


/*
* Implicit Operator Overloading in String Class Demo
*   - In this + or Plus Method is Overloaded Internally By String Class To Perform Concatination Of Strings
*   - For Example :- "a" + "b" = ab (For Better UnderStanding Please Refer Demo Below)
*/

String s1 = "Hello Bro Sume of 10 + 20 in String Would be ";
String s2 = '10';                                           // It will give Error in java as '' is for char not String.
String s3 = '20';

def stringResult = s1 + s2 + s3;
def stringResult1 = (s1.plus(s2)).plus(s3);

println "String Result With + Operator := $stringResult";
println "String Result with Plus Method := $stringResult1";

