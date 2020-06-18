package com.navtech.script.classes.concept

import groovy.transform.ToString

@ToString
class Tweet {

    long id
    String username
    String msg
    int retweet
    int like
    def comments = []
    Date creteDate

    Tweet() {

    }

    Tweet (String username, String msg) {
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
