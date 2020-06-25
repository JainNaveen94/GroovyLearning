package com.navtech.script.string_notes

/** *It will give compile time error as \ is white charcter in Groovy **/
//String folder = "D:\groovyLearing\string"

/** *one Solution is to use the \\ **/
String folder1 = "D:\\groovyLearing\\string"
String folder2 = $/D:\groovyLearing\string/$

/** *another Solution is to use the $//$ **/
println 'Folder Address Using \\ :: ' + folder1
println 'Folder Address Using $//$ "" ' + folder2

