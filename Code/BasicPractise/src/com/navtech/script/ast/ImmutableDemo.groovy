package com.navtech.script.ast

@groovy.transform.Immutable
class Employee {
    String first, last
    int age
    Date since
    Collection favItems
}
def d = new Date()
def e1 = new Employee(first:'Tom', last:'Jones', age:21, since:d, favItems:['Books', 'Games'])
def e2 = new Employee('Tom', 'Jones', 21, d, ['Books', 'Games'])
assert e1 == e2

