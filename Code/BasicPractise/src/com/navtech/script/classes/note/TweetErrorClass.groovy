package com.navtech.script.classes.note

import groovy.transform.ToString

@ToString
class TweetErrorClass {

    long id
    String username
    String msg
    int retweet
    int like
    def comments = []
    Date creteDate

    TweetErrorClass() {

    }

    TweetErrorClass (String username, String msg) {
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
//def tweet = new TweetErrorClass("Naveen Jain", "Just Tweet to Test Concept")