package com.navtech.script.classes.concept

// Creating Object of a class
def tweet = new Tweet("Naveen Jain", "Just Tweet to Test Concept")

// Another way to create object of a class
/*
def tweet = new Tweet()
tweet.id = System.currentTimeMillis()
tweet.username = "Naveen Jain"
tweet.setMsg("Just Tweet to Test Concept")
tweet.setRetweet(0)
tweet.like = 0
tweet.setCreteDate(new Date())
*/

// Perform Printing Before Changes the Default Values
println tweet

// Calling its method to Modify Values
tweet.addComments("This is your First Tweet?")
tweet.likeTheTweet();
tweet.retweetIt();
tweet.likeTheTweet();

// Perform Printing After Performing Changes
println "$tweet"