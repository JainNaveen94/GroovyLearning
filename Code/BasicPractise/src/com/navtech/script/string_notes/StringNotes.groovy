package com.navtech.script.string_notes

/*
*   - Different - Different Ways to Use String in Groovy
*       This Demo will Explain You Some Importance Usage of String as Per Your Requirenment
*/

println "\n****************************************** String Declaration Demo ***********************************************"

/*
 *  1. -> String Declaration
 *          -We can Use "" or '' in Declaration of String in Groovy but not in Java (It gives Runtime Error)
 */

String s1 = "Hello Naveen !"
String s2 = 'How are You'

// Simple Declaration Example
println "\nString Concatination Result :: ${s1 + s2}"

println "\n*************************************** String Interpolation Demo ***********************************************"

/*
*   2. -> String Interpolation
*           - In Groovy We have a new Way for String Interpolation and old one is also Working.
*           - Please Note :: But the New Way is not working in Java only in Groovy
 */

String si1 = "Hello Bro !"
String si2 = "String Interpolation Demo"
String sOld = "Using Old Way"
String sNew = "Using New Way"

// Old Way String Interpolation (Work in both Java and Groovy)
println si1 + " " + si2 + " " + sOld + "."

// New Way String Interpolation (Work only in Groovy)
println "\n $si1 $si2 $sNew ."

println "\n ********************************** String Interpolation and Evaluation Special Demo *******************************************"

/*
*   2.1 -> String Interpolation and Evaluation Special Note
*           - String Interpolation and Evaluation can only be work in "" not in ''.
*           - For Example := Please refer Below Code
*/

// String Interpolation and Evaluation Example Through Double Quotes
String sid1 = "Hello Bro Naveen !"
String sid2 = "How Are You Bro ?"

println "\n String Interpolation and Evaluation Using Double Quote:: ${sid1 + sid2}"          // Interpolation Done Here

// String Interpolation and Evaluation Example Through Double Quotes
String sid11 = 'Hello Bro Naveen !'
String sid12 = 'How Are You Bro ?'

println 'String Interpolation and Evaluation Using single Quote :: ${sid11 + $sid12}'      // Interpolation Done Here

println "\n ************************** String Multiline with String Interpolation and Evaluation Demo *************************************"

/*
*   3 -> MultiLine String and String Interpolation & Evaluation
*           - Multiline String can be done through '''<String>''' or """<String>"""
*           - String Interpolation and Evaluation can be done in Multiline Using """<String>""" but not Possible through '''<String>'''
*/

// Simple Multiline String Using '''<String>''' Example
String multiStr1 = '''Hello Naveen !
How Are You Bro ?
${1+1+1} Lines'''

println "\n MultiLine String single quote Example with String Interpolation and Evaluation :: \n $multiStr1"  // Interpolation Done Here

// Simple Multiline String Using """<String>""" Example
String multiStr2 = """Hello Naveen !
How Are You Bro ?
${1+1+1} Lines"""

println "\n MultiLine String double quote Example with String Interpolation and Evaluation :: \n $multiStr2"  // Interpolation Done Here









