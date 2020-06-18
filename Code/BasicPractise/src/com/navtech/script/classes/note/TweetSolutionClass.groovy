package com.navtech.script.classes.note

import com.navtech.script.classes.concept.Tweet
import groovy.transform.ToString

@ToString
class TweetErrorClassSolution {

    long id
    String username
    String msg
    int retweet
    int like
    def comments = []
    Date creteDate

    TweetErrorClassSolution() {

    }

    TweetErrorClassSolution(String username, String msg) {
        this.id = System.currentTimeMillis()
        this.username = username
        this.msg = msg
        this.retweet = 0
        this.like = 0
        this.creteDate = new Date()
    }

    void likeTheTweet() {
        this.like += 1;
    }

    void retweetIt() {
        this.retweet += 1;
    }

    void addComments(String comment) {
        this.comments << comment
    }

}

// Creating Object of a class
def tweet = new TweetErrorClassSolution("Naveen Jain", "Just Tweet to Test Concept")

// Perform Printing Before Changes the Default Values
println tweet

// Calling its method to Modify Values
tweet.addComments("This is your First Tweet?")
tweet.likeTheTweet();
tweet.retweetIt();
tweet.likeTheTweet();

// Perform Printing After Performing Changes
println "$tweet"