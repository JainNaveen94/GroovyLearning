package com.navtech.script.operators.operator_overloading

//import groovy.transform.ToString

/*
*   Account is a User Defined Class in which there is a overload method :
*       - plus ++> to Plus to Account and create a new one.
*/

@groovy.transform.ToString
class Account {

    // Properties
    private BigDecimal amount
    private String type

    // Deposite Method to Deposite Money
    void depositeAmount(BigDecimal amount) {
        this.amount += amount
    }

    // Withdraw Method to Withdraw Money
    void withdrawAmount(BigDecimal amount) {
        if(this.amount > amount) {
            this.amount -= amount
        }
    }

    Account plus(Account other) {
        String type = "Combine Account Report : " + this.type + " And " + other.type
        return new Account(type:  type, amount: this.amount + other.amount)
    }

}

Account saving = new Account(type: "Saving", amount: 1000)
saving.depositeAmount(12000)
Account current = new Account(type: "Current",amount: 5000)
current.withdrawAmount(3000)
println "Saving Account Details :: $saving"
println "Current Account Details :: $current"

println "Combine in New Account to Get Total Amount"

//Account result = saving.plus(current)
Account result = saving + current
println "Total Account Details :: $result"
