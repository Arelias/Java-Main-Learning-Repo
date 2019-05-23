package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsCalculator {



    Statistics statistics;
    private double postPerUser, commentPerUser, commentPerPost;
    private int usersQuantity, postsQuantity, commentsQuantity;
    public double getPostPerUser() {
        return postPerUser;
    }

    public double getCommentPerUser() {
        return commentPerUser;
    }

    public double getCommentPerPost() {
        return commentPerPost;
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public int usersCount(){
        return statistics.usersNames().size();
    }
    public void calculateAdvStatistics(Statistics statistics){
        this.usersQuantity = statistics.usersNames().size();
        this.postsQuantity = statistics.postsCount();
        this.commentsQuantity = statistics.commentsCount();

        if(this.usersQuantity > 0){
            this.postPerUser = (double)this.postsQuantity / this.usersQuantity;
            this.commentPerUser = (double)this.commentsQuantity / this.usersQuantity;
        } else {
            this.postPerUser = 0;
            this.commentPerUser = 0;
        }
        if(this.postsQuantity > 0 && this.commentsQuantity > 0) {
            this.commentPerPost = (double)this.commentsQuantity / this.postsQuantity;
        } else {
            this.commentPerPost = 0;
        }
    }
    public void showStatistics(){
        System.out.println("Users " + this.usersQuantity + " Comms " + this.commentsQuantity + " Posts " + this.postsQuantity);
        System.out.println("Post/User " + this.postPerUser + " Comm/User " + this.commentPerUser + " Comm/Post " + this.commentPerPost);
        System.out.println();
    }
}
